package kr.ac.kopo.ctc.kopo15.dao;

import java.util.List;

import kr.ac.kopo.ctc.kopo15.domain.Account;

public interface AccountDao {
		//c
		Account create(Account account);
		
		//r
		Account selectOne(int id);
		List<Account>  selectAll();
		
		
		//select하는 방법은 많음
		//u
		Account update(int id);
		
		//d
		Account delete(int id);
		
		
}
