package com.google.validation;

import com.google.config.AdminCredentials;

public class AdminValidation {
	
	AdminCredentials aCredential = new AdminCredentials();
	
	String adminUserName = aCredential.getAdminUsername();
	String adminPassword = aCredential.getAdminPassword();
	
	public static boolean isEmpty(String username, String password) {
		boolean isEmpty = false;
		if(username == null || username.trim().length() == 0) {
			return isEmpty = true;
		}else if(password == null || password.trim().length() == 0) {
			return isEmpty = true;
		}else {
			return isEmpty;
		}
	}
	
	
	
	public boolean isMatch(String username, String password) {
		boolean isMatch = false;
		if(adminUserName.equals(username)) {
			return isMatch = true;
		}else if(adminUserName.equals(password)) {
			return isMatch = true;
		}else {
			return isMatch;
		}
	}
	
	
	
}
