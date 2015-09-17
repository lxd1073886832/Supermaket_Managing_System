package DataBase;

import java.sql.*;

public class JDBCDemo {
	public static void main(String[] args)throws Exception{
		Connection conn = null;
		String sql;
		 String url = "jdbc:mysql://localhost:3306/���й���ϵͳ?"
	                + "user=root&password=891524&useUnicode=true&characterEncoding=UTF8";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
//	System.out.println("�ɹ�����MySQL������");
			conn = DriverManager.getConnection(url);
			Statement stmt = conn.createStatement();
			sql = "select * from ��Ա";
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("ID\t����\t����\t�绰����\tסַ");
			while(rs.next())
				System.out.println(rs.getString(1)+"\t"+ rs.getString(2)+"\t"+ rs.getString(3)+"\t"+ rs.getString(4)+"\t"+ rs.getString(5));
		}catch(SQLException e){
			System.out.println("SQL��������");
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			conn.close();
		}
		
	}

}
