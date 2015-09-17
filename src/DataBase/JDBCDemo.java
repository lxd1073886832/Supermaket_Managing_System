package DataBase;

import java.sql.*;

public class JDBCDemo {
	public static void main(String[] args)throws Exception{
		Connection conn = null;
		String sql;
		 String url = "jdbc:mysql://localhost:3306/超市管理系统?"
	                + "user=root&password=891524&useUnicode=true&characterEncoding=UTF8";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
//	System.out.println("成功加载MySQL驱动！");
			conn = DriverManager.getConnection(url);
			Statement stmt = conn.createStatement();
			sql = "select * from 会员";
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("ID\t姓名\t密码\t电话号码\t住址");
			while(rs.next())
				System.out.println(rs.getString(1)+"\t"+ rs.getString(2)+"\t"+ rs.getString(3)+"\t"+ rs.getString(4)+"\t"+ rs.getString(5));
		}catch(SQLException e){
			System.out.println("SQL操作错误");
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			conn.close();
		}
		
	}

}
