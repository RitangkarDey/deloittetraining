<%@page import="abcd.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>



<body>
<% int customerId = Integer.parseInt(request.getParameter("customerId"));
String customerName = request.getParameter("customerName");
String customerAddress = request.getParameter("customerAddress");
int billAmount = Integer.parseInt(request.getParameter("billAmount"));

%>
<%
Customer customer = new Customer();
customer.setCustomerId(customerId);
customer.setCustomerName(customerName);
customer.setCustomerAddress(customerAddress);
customer.setBillAmount(billAmount);
%>

Customer ID is: <%= customer.getCustomerId() %>
Customer Name is: <%= customer.getCustomerName() %>
Customer Address is: <%= customer.getCustomerAddress()%>
Customer bill Amount is: <%= customer.getBillAmount() %>
</body>
</html>