package kr.ac.kopo.ctc.kopo15.dao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import kr.ac.kopo.ctc.kopo15.domain.Account;
import kr.ac.kopo.ctc.kopo15.domain.AccountItem;

//public class AccountDaoTest {
//	public static void testCreate() {
//		AccountDao dao = new AccountDaoImpl();
//		Account account = new Account();
//		account.setTitle("���ο�");
//		dao.create(account);
//		
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
public class AccountDaoTest{			
//		@Test
//		public void testCreate() {
//			assertEquals(1,1);
//		}
		
		
	@Test	
public void testSelectOne(){
	AccountItemDaoImpl accountitemdaoimpl = new AccountItemDaoImpl();
	AccountItem accountItem = accountitemdaoimpl.selectOne(2);
	assertEquals("����",accountItem.getType());
}		
		
		
//System.out.println("Hello world");
}


