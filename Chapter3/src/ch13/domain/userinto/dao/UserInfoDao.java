package ch13.domain.userinto.dao;

import ch13.domain.userinto.UserInfo;

public interface UserInfoDao {
	
	void insertUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
	void deleteUserInfo(UserInfo userInfo);

}
