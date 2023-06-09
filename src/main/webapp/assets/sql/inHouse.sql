create database inHouse;

use inHouse;

CREATE TABLE ROLE (
   ID INT NOT NULL AUTO_INCREMENT,
   NAME VARCHAR(25) NOT NULL,
    PRIMARY KEY (ID) 
);


CREATE TABLE RESOURCE (
	ID INT  PRIMARY KEY NOT null auto_increment,
	FIRST_NAME VARCHAR(25)  NOT NULL,
	LAST_NAME VARCHAR(25) NOT NULL,
    EMAIL VARCHAR(55) NOT NULL,
    CONTACT_NO VARCHAR(10) NOT NULL UNIQUE,  
    GENDER VARCHAR(10) NOT NULL,
    QUALIFICATION VARCHAR(25),
    EXPERIENCE INT(10),
    RESUME_URI VARCHAR(255),
    ROLE_ID INT(25),
	FOREIGN KEY (ROLE_ID) REFERENCES ROLE(ID) 
);

CREATE TABLE ADDRESS
(
	ID INT NOT NULL PRIMARY KEY auto_increment,
	ADDRESS VARCHAR(80) NOT NULL,	
	CITY VARCHAR(25) NOT NULL,
	STATE VARCHAR(25) NOT NULL,
	PINCODE INT NOT NULL,
    RESOURCE_ID INT NOT NULL,
    FOREIGN KEY(RESOURCE_ID) REFERENCES RESOURCE(ID)
);

CREATE TABLE LANGUAGE 
(
	ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	LANGUAGE VARCHAR(25) NOT NULL
);

CREATE TABLE TECHNOLOGY
(
	ID INT NOT NULL PRIMARY KEY auto_increment,
	TECHNOLOGY VARCHAR(25) NOT NULL
);

CREATE TABLE `DATABASE`
(
	ID INT NOT NULL PRIMARY KEY auto_increment,
	DATA_NAME VARCHAR(25) NOT NULL
);

CREATE TABLE USER_TECH
(
	ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	RESOURCE_ID INT NOT NULL,
    	TECH_ID INT NOT NULL,
	FOREIGN KEY(RESOURCE_ID) REFERENCES RESOURCE(ID),
	FOREIGN KEY(TECH_ID) REFERENCES TECHNOLOGY(ID)
);

CREATE TABLE USER_LANG
(
	ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	RESOURCE_ID INT NOT NULL,
	LANG_ID INT NOT NULL,
    FOREIGN KEY(RESOURCE_ID) REFERENCES RESOURCE(ID),
    FOREIGN KEY(LANG_ID) REFERENCES LANGUAGE(ID)
);

CREATE  TABLE USER_DATA
(
	ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	RESOURCE_ID INT NOT NULL,
	DATA_ID INT NOT NULL,
    FOREIGN KEY(RESOURCE_ID) REFERENCES RESOURCE(ID),
    FOREIGN KEY(DATA_ID) REFERENCES `DATABASE`(ID)
);


