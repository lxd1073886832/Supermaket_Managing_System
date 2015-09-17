package DataBase;

import java.sql.*;


import GUI.*;

public  class JDBC 
{
	
	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	private String sql;
	private String url = "jdbc:mysql://localhost:3306/超市管理系统?"
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
					case "管理员": new Administrator();break;
					case "区域管理员": new AreaAdmin();break;
					case "销售员": new casher();break;
					case "货运员": new transfer();break;
					case "会员": new VIP();break;
					case "游客": new tourist();break;
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
