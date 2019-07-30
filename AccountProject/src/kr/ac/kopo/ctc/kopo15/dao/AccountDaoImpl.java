package kr.ac.kopo.ctc.kopo15.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



import kr.ac.kopo.ctc.kopo15.domain.Account;

public class AccountDaoImpl implements AccountDao{
	
	
	@Override
	public Account create(Account account) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopo15?serverTimezone=UTC", "root", "asdf1234");
			Statement stmt = conn.createStatement();
			SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			String created = transFormat.format(new Date());
				
			stmt.execute("insert into Account (title, created) values ('" + 
					account.getTitle() + "', '" + created + "');");
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Account selectOne(int id) {
		// TODO Auto-generated method stub
		Account account = new Account();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopo15?serverTimezone=UTC", "root", "asdf1234");
			Statement stmt = conn.createStatement();
			ResultSet rset = stmt.executeQuery("select * from Account where id =" + id +";");
			
			rset.next();
			account.setId(rset.getInt(1));
			account.setTitle(rset.getString(2));
			account.setCreated(rset.getDate(3));
			
			rset.close();
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return account;
	}

	@Override
	public List<Account> selectAll() {
		List<Account> listAccount = new ArrayList<Account>();
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopo15?serverTimezone=UTC", "root", "asdf1234");
			Statement stmt = conn.createStatement();
				
			ResultSet rset = stmt.executeQuery("select * from Account;");
			
			Account account = new Account();
			while(rset.next()) {
			account.setId(rset.getInt(1));
			account.setTitle(rset.getString(2));
			account.setCreated(rset.getDate(3));
			listAccount.add(account);
			}
			
			rset.close();
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listAccount;
	}

	

	@Override
	public Account update(int id) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopo15?serverTimezone=UTC", "root", "asdf1234");
			Statement stmt = conn.createStatement();
			
				
			stmt.execute("update Account set id ="+ id + ";");
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	

	@Override
	public Account delete(int id) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopo15?serverTimezone=UTC", "root", "asdf1234");
			Statement stmt = conn.createStatement();
			
				
			stmt.execute("delete from account where id = "+ id +";");
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}