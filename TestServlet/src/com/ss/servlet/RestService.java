package com.ss.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ss.dto.User;

@WebServlet({ "/login" })
public class RestService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RestService() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		User user = new User(1, "username1", 123);

		
		String userName = request.getParameter("user");
	    Integer password = Integer.parseInt(request.getParameter("pw"));
	    
	    if(user.getUserName().equals(userName) && user.getPassword() == password) {
	    	response.setStatus(HttpServletResponse.SC_ACCEPTED);
	    } else {
	    	response.setStatus(HttpServletResponse.SC_FORBIDDEN);
	    }  

	}

}
