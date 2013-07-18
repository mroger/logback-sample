package br.com.mroger.simple;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	final Logger LOGGER = LoggerFactory.getLogger(SimpleServlet.class);

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		LOGGER.warn("Mensagem WARN gerada.");
		
		LOGGER.info("Mensagem INFO gerada.");
		
		LOGGER.debug("Mensagem DEBUG gerada.");
		
		PrintWriter out = response.getWriter();
	    out.println("Hello World!");
	}
}
