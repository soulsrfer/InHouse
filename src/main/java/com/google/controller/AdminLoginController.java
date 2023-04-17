package com.google.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.config.AdminCredentials;
import com.google.validation.AdminValidation;

@WebServlet("/AdminLoginController")
public class AdminLoginController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		System.out.println(username);
		System.out.println(password);
		
		AdminCredentials credentials = new AdminCredentials();
		
		AdminValidation adminValidation = new AdminValidation();
		
		String adminUsername = credentials.getAdminUsername();
		String adminPassword = credentials.getAdminPassword();
		
		
		RequestDispatcher rd = null;
		boolean isError = false;
		if(adminValidation.isEmpty(username, password)) {
			isError = true;
			String emptyField = "Please Enter username & password!";
			request.setAttribute("emptyField", emptyField);
		}else if (adminValidation.isMatch(username, password) == false) {
			isError = true;
			String usernameError = "Invalid Username or Password";
			request.setAttribute("credentialsError", usernameError);
		}
		
		if(isError) {
			rd = request.getRequestDispatcher("adminLogin.jsp");
		}else {
			rd = request.getRequestDispatcher("adminDashboard.jsp");
		}
		rd.forward(request, response);
	}
}
