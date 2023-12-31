package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex08Join
 */
@WebServlet("/Ex08Join")
public class Ex08Join extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("EUC-KR");
		
		response.setCharacterEncoding("EUC-KR");
		
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String tel = request.getParameter("tel");
		String gender = request.getParameter("gender");
		String country = request.getParameter("country");
		String birthday = request.getParameter("birthday");
		String color = request.getParameter("color");
		String[] hobby = request.getParameterValues("hobby");
		String inputbox = request.getParameter("inputbox");
		
		out.println("ID : " + id);
		out.println("NAME : " + name);
		out.println("EMAIL : " + email);
		out.println("TEL : " + tel);
		out.println("GENDER : " + gender);
		out.println("COUNTRY : " + country);
		out.println("BIRTH : " + birthday);
		out.println("COLOR : " + color);
		out.print("HOBBY : ");
		for (int i = 0; i < hobby.length; i++) {
			out.print(hobby[i]);
		}
		out.println();
		out.println("TALK : " + inputbox);
	}

}
