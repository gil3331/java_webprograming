package kr.ac.kopo.ctc.kopo15.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GenericDaoImpl<T> implements GenericDao<T> {
	public T create(T t) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopo", "root", "1234");
			Statement stmt = conn.createStatement();

			T ret = create_overriding(stmt, t);
			
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("create");
		return null;
	}

	@Override
	public T create_overriding(Statement stmt, T t) {
		return null;
	}
}
