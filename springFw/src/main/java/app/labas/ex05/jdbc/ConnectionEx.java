package app.labas.ex05.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionEx {

	public static void main(String[] args) {
		/*
		 * 1. 데이베이스 종류
		 * 2. 데이터 베이스 위치
		 * 3. 계정
		 * 4. 사용할 데이터베이스 객체
		 * */
		String jdbc = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String uid = "SCOTT";
		String pwd = "TIGER";
		
		
		try {
			// 5)연결
			Connection conn = DriverManager.getConnection(url, uid, pwd);
			// 6)전송
			Statement stmt = conn.createStatement();
			// 7) SQL문 생성
			String sql = "select * from dept";
			// 8) SQL 실행 -> 결과를 메모리로 가져오기
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				
				System.out.println(deptno +","+dname+","+loc);
			}
			
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
