package ch13.domain.userinto.dao.oracle;

import ch13.domain.userinto.UserInfo;
import ch13.domain.userinto.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert into ORACLE DB userIF = " + userInfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("Update into ORACLE DB userIF = " + userInfo.getUserId());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("Delete from ORACLE DB userIF = " + userInfo.getUserId());
	}


}
