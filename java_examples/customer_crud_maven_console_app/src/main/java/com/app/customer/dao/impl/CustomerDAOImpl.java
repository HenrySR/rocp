package com.app.customer.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.customer.dao.CustomerDAO;
import com.app.customer.dbutil.MySqlConnection;
import com.app.customer.exception.BusinessException;
import com.app.customer.model.Customer;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public int addCustomer(Customer customer) throws BusinessException {
		int c=0;
		try(Connection connection=MySqlConnection.getConnection()){
			String sql="insert into customer(name,age,gender,city,contact) values(?,?,?,?,?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, customer.getName());
			preparedStatement.setInt(2, customer.getAge());
			preparedStatement.setString(3, customer.getGender());
			preparedStatement.setString(4, customer.getCity());
			preparedStatement.setLong(5, customer.getContact());
			
			c=preparedStatement.executeUpdate();
			if(c==0) {
				throw new BusinessException("Customer Registration failed... Please try again");
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //for test
			throw new BusinessException("Internal error occured... Kindly contact SYSADMIN!!!!!....");
		}
		return c;
	}

	@Override
	public int updateCustomer(int id, long contact) throws BusinessException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteCustomer(int id) throws BusinessException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Customer> getAllCustomers() throws BusinessException {
		List<Customer> customersList=new ArrayList<>();
		try(Connection connection=MySqlConnection.getConnection()){
			String sql="select id,name,gender,city,age,contact from customer";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Customer customer=new Customer();
				customer.setId(resultSet.getInt("id"));
				customer.setAge(resultSet.getInt("age"));
				customer.setContact(resultSet.getLong("contact"));
				customer.setName(resultSet.getString("name"));
				customer.setGender(resultSet.getString("gender"));
				customer.setCity(resultSet.getString("city"));
				customersList.add(customer);
			}
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //for test
			throw new BusinessException("Internal error occured... Kindly contact SYSADMIN!!!!!....");
		}
		if(customersList.size()==0) {
			throw new BusinessException("No customers as of now in the Db");
		}
		return customersList;
	}

	@Override
	public Customer getCustomerById(int id) throws BusinessException {
		Customer c = new Customer();
		try(Connection connection=MySqlConnection.getConnection()){
			String sql="select id,name,gender,city,age,contact from customer where id = ?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1,id);
			ResultSet resultSet=preparedStatement.executeQuery();	
			if(resultSet.next()) {
				c.setId(resultSet.getInt("id"));
				c.setAge(resultSet.getInt("age"));
				c.setContact(resultSet.getLong("contact"));
				c.setName(resultSet.getString("name"));
				c.setGender(resultSet.getString("gender"));
				c.setCity(resultSet.getString("city"));}
			else {
				throw new BusinessException("No customers with id "+id+" in the DB");
			}
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //for test
			throw new BusinessException("Internal error occured... Kindly contact SYSADMIN!!!!!....");
		}
//		if(customers==0) {
//			throw new BusinessException("No customers as of now in the Db");
//		}
		return c;
	}

	@Override
	public Customer getCustomerByContact(long contact) throws BusinessException {
		Customer c = new Customer();
		try(Connection connection=MySqlConnection.getConnection()){
			String sql="select id,name,gender,city,age,contact,gender from customer where contact = ?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setLong(1,contact);
			ResultSet resultSet=preparedStatement.executeQuery();	
			if(resultSet.next()) {
				c.setId(resultSet.getInt("id"));
				c.setAge(resultSet.getInt("age"));
				c.setContact(resultSet.getLong("contact"));
				c.setName(resultSet.getString("name"));
				c.setGender(resultSet.getString("gender"));
				c.setCity(resultSet.getString("city"));
			}
			else {
				throw new BusinessException("No customers with contact "+contact+" in the DB");
			}
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //for test
			throw new BusinessException("Internal error occured... Kindly contact SYSADMIN!!!!!....");
		}
		return c;
	}

	@Override
	public List<Customer> getCustomersByAge(int age) throws BusinessException {
		List<Customer> customersList=new ArrayList<>();
		try(Connection connection=MySqlConnection.getConnection()){
			String sql="select id,name,city,age,contact,gender from customer where age=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, age);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Customer customer=new Customer();
				customer.setId(resultSet.getInt("id"));
				customer.setAge(resultSet.getInt("age"));
				customer.setContact(resultSet.getLong("contact"));
				customer.setName(resultSet.getString("name"));
				customer.setGender(resultSet.getString("gender"));
				customer.setCity(resultSet.getString("city"));
				customersList.add(customer);
			}
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //for test
			throw new BusinessException("Internal error occured... Kindly contact SYSADMIN!!!!!....");
		}
		if(customersList.size()==0) {
			throw new BusinessException("No customers as of now in the Db for the age "+age);
		}
		return customersList;
	}

	@Override
	public List<Customer> getCustomersByName(String name) throws BusinessException {
		List<Customer> customersList=new ArrayList<>();
		try(Connection connection=MySqlConnection.getConnection()){
			String sql="select id,name,city,age,contact,gender from customer where name=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Customer customer=new Customer();
				customer.setId(resultSet.getInt("id"));
				customer.setAge(resultSet.getInt("age"));
				customer.setContact(resultSet.getLong("contact"));
				customer.setName(resultSet.getString("name"));
				customer.setGender(resultSet.getString("gender"));
				customer.setCity(resultSet.getString("city"));
				customersList.add(customer);
			}
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //for test
			throw new BusinessException("Internal error occured... Kindly contact SYSADMIN!!!!!....");
		}
		if(customersList.size()==0) {
			throw new BusinessException("No customers as of now in the Db for the name "+name);
		}
		return customersList;
		
	}
	

	@Override
	public List<Customer> getCustomersByCity(String city) throws BusinessException {
		List<Customer> customersList=new ArrayList<>();
		try(Connection connection=MySqlConnection.getConnection()){
			String sql="select id,name,city,age,contact,gender from customer where city=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, city);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Customer customer=new Customer();
				customer.setId(resultSet.getInt("id"));
				customer.setAge(resultSet.getInt("age"));
				customer.setContact(resultSet.getLong("contact"));
				customer.setName(resultSet.getString("name"));
				customer.setGender(resultSet.getString("gender"));
				customer.setCity(resultSet.getString("city"));
				customersList.add(customer);
			}
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //for test
			throw new BusinessException("Internal error occured... Kindly contact SYSADMIN!!!!!....");
		}
		if(customersList.size()==0) {
			throw new BusinessException("No customers as of now in the Db for the city "+city);
		}
		return customersList;
		
	}
	

	@Override
	public List<Customer> getCustomersByGender(String gender) throws BusinessException {
		List<Customer> customersList=new ArrayList<>();
		try(Connection connection=MySqlConnection.getConnection()){
			String sql="select id,name,city,age,contact from customer where gender=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, gender.toLowerCase());
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Customer customer=new Customer();
				customer.setId(resultSet.getInt("id"));
				customer.setAge(resultSet.getInt("age"));
				customer.setContact(resultSet.getLong("contact"));
				customer.setName(resultSet.getString("name"));
				customer.setGender(gender);
				customer.setCity(resultSet.getString("city"));
				customersList.add(customer);
			}
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //for test
			throw new BusinessException("Internal error occured... Kindly contact SYSADMIN!!!!!....");
		}
		if(customersList.size()==0) {
			throw new BusinessException("No customers as of now in the Db for the gender "+gender);
		}
		return customersList;
		
	}

}
