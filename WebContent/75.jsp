<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <html>
    <body>
        <center> 
        
        
        
        
        
        
        <%

		  try {
		      Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序   
		      //Class.forName("org.gjt.mm.mysql.Driver");
		     System.out.println("Success loading Mysql Driver!");
		    }
		    catch (Exception e) {
		      System.out.print("Error loading Mysql Driver!");
		      e.printStackTrace();
		    }
		    try {
		    	System.out.println("192.168.122.75:3306");
		      Connection connect = DriverManager.getConnection(
		          "jdbc:mysql://192.168.122.75:3306/abc","admin","osv");
		           //连接URL为   jdbc:mysql//服务器地址/数据库名  ，后面的2个参数分别是登陆用户名和密码

		      System.out.println("Success connect Mysql server!");
		      Statement stmt = connect.createStatement();
		      ResultSet rs = stmt.executeQuery("select * from test");
		                                                              //user 为你表的名称
		      System.out.println("Opened database successfully");
		                                                              
		      while (rs.next()) {
		          System.out.println(rs.getLong(1) + "--->" +rs.getString(2));
		        }
		    }
		    catch (Exception e) {
		      System.out.print("get data error!");
		      e.printStackTrace();
		    }
   
        
        %>
        
        
        
        
        
            Now time is: <%=new java.util.Date()%> 
        </center>
    </body>
</html>