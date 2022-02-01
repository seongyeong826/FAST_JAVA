package ch13.domain.userinto.dao.mysql;

import ch13.domain.userinto.UserInfo;
import ch13.domain.userinto.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert into MySQL DB userIF = " + userInfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("Update into MySQL DB userIF = " + userInfo.getUserId());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("Delete from MySQL DB userIF = " + userInfo.getUserId());
	}

}
