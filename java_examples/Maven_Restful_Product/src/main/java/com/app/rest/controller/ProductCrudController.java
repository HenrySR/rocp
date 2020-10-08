package com.app.rest.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.model.Product;
import com.google.gson.Gson;

/**
 * Servlet implementation class ProductCrudController
 */
public class ProductCrudController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static Map<Integer, Product> productMap=new LinkedHashMap<>();
	private static int count;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductCrudController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();

		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		Gson gson = new Gson();

		int id = Integer.parseInt(request.getParameter("id"));

		if(productMap.containsKey(id)) {

			out.print(gson.toJson(productMap.get(id)));
		}
		else {
			
			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
			out.print("No product found with id =" +id);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		Gson gson = new Gson();
		Product product=gson.fromJson(request.getReader(), Product.class);
		product.setId(count++);
		PrintWriter out=response.getWriter();
		productMap.put(product.getId(), product);
		out.print(gson.toJson(product));

	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		Gson gson = new Gson();
		Product product = gson.fromJson(request.getReader(), Product.class);
		PrintWriter out=response.getWriter();
		if(productMap.containsKey(product.getId())) {
			productMap.put(product.getId(), product);
			out.print(gson.toJson(product));
		}
		else {
			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
			out.print("No product found to be updated with id = "+product.getId());
		}
		
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		Gson gson = new Gson();
		int id = Integer.parseInt(request.getParameter("id"));
		PrintWriter out=response.getWriter();
		if(productMap.containsKey(id)) {
			//out.print(gson.toJson(productMap.get(id)));
			productMap.remove(id);
			response.setStatus(HttpServletResponse.SC_NO_CONTENT);
		}
		else {
			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
			out.print("No product found with id =" +id);
		}
	}

}
