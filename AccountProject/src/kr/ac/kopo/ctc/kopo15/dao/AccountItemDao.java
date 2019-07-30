package kr.ac.kopo.ctc.kopo15.dao;

import java.util.List;

import kr.ac.kopo.ctc.kopo15.domain.AccountItem;

public interface AccountItemDao {
	//c
			AccountItem create(AccountItem accountitem);
			
			//r
			AccountItem selectOne(int id);
			List<AccountItem>  selectAll();
			
			
			//select하는 방법은 많음
			//u
			AccountItem update(int id);
			
			//d
			AccountItem delete(int id);
			
}
