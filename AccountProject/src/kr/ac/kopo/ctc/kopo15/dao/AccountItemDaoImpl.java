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
import kr.ac.kopo.ctc.kopo15.domain.AccountItem;

public class AccountItemDaoImpl implements AccountItemDao{
	@Override
	public AccountItem create(AccountItem accountitem) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc", "root", "asdf1234");
			Statement stmt = conn.createStatement();
			SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			String created = transFormat.format(new Date());
			
				
			stmt.execute("insert into Account (title, created, view, account_id) values ('" + 
					accountitem.getTitle() + "', '" + created +"', '"+ accountitem.getView() +"', '"+accountitem.getAccount().getId()+"');");
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
	public AccountItem selectOne(int id) {
		// TODO Auto-generated method stub
		AccountItem accountitem = new AccountItem();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopo15?serverTimezone=UTC", "root", "asdf1234");
			Statement stmt = conn.createStatement();
			ResultSet rset = stmt.executeQuery("select * from AccountItem where id = " + id +";");
			Account account = new Account();
			
			rset.next();
			accountitem.setId(rset.getInt(1));
			accountitem.setTitle(rset.getString(2));
			accountitem.setVariation(rset.getInt(3));
			accountitem.setBalance(rset.getInt(4));
			accountitem.setType(rset.getString(5));
			accountitem.setCreated(rset.getDate(6));
			account.setId(rset.getInt(7));
			AccountDao accountDao = new AccountDaoImpl();
			account = accountDao.selectOne(rset.getInt(7));
			account.setTitle(account.getTitle());
			account.setCreated(account.getCreated());
			accountitem.setAccount(account);
					
			rset.close();
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return accountitem;
	}

	@Override
	public List<AccountItem> selectAll() {
		List<AccountItem> listAccountItem = new ArrayList<AccountItem>();
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc", "root", "asdf1234");
			Statement stmt = conn.createStatement();
			
			ResultSet rset = stmt.executeQuery("select * from AccountItem;");
			Account account = new Account();
			AccountItem accountitem = new AccountItem();
			
			while(rset.next()) {
			accountitem.setId(rset.getInt(1));
			accountitem.setTitle(rset.getString(2));
			accountitem.setCreated(rset.getDate(3));
			accountitem.setView(rset.getInt(4));
			account.setId(rset.getInt(5));
			AccountDao accountDao = new AccountDaoImpl();
			account = accountDao.selectOne(rset.getInt(5));
			account.setTitle(account.getTitle());
			account.setCreated(account.getCreated());
			accountitem.setAccount(account);
			listAccountItem.add(accountitem);
			}
						
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listAccountItem;
	}

	
	@Override
	public AccountItem update(int id) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc", "root", "asdf1234");
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
	public AccountItem delete(int id) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc", "root", "asdf1234");
			Statement stmt = conn.createStatement();

			stmt.execute("delete from account where id = value;");
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
