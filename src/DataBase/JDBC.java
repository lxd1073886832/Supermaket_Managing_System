package DataBase;

import java.sql.*;


import GUI.*;

public  class JDBC 
{
	
	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	private String sql;
	private String url = "jdbc:mysql://localhost:3306/���й���ϵͳ?"
            + "user=root&password=891524&useUnicode=true&characterEncoding=UTF8";
	public JDBC()throws Exception{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			stmt = conn.createStatement();
		}catch(SQLException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public  void Select(String s, String t){
		try{sql = "select "+s+"from "+t;
		rs = stmt.executeQuery(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
		public  void Login(String user, String passward,String table){
			try{sql = "select ID ,Passward from "+ table;
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				if(user.equals(rs.getString(1))&&passward.equals(rs.getString(2))){
					switch(table){
					case "����Ա": new Administrator();break;
					case "�������Ա": new AreaAdmin();break;
					case "����Ա": new casher();break;
					case "����Ա": new transfer();break;
					case "��Ա": new VIP();break;
					case "�ο�": new tourist();break;
					}
				}
			}
			}catch(SQLException e){
				e.printStackTrace();
			}catch(Exception e){
				e.printStackTrace();
			}
	}

}
