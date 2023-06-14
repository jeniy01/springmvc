package kr.co.tjoeun.beans;

public class UserInfoBean {
	private String UserName;
	private String UserId;
	private String UserPw;
	private String UserPostcode;
	private String userAddress1;
	private String userAddress2;
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getUserPw() {
		return UserPw;
	}
	public void setUserPw(String userPw) {
		UserPw = userPw;
	}
	public String getUserPostcode() {
		return UserPostcode;
	}
	public void setUserPostcode(String userPostcode) {
		UserPostcode = userPostcode;
	}
	public String getUserAddress1() {
		return userAddress1;
	}
	public void setUserAddress1(String userAddress1) {
		this.userAddress1 = userAddress1;
	}
	public String getUserAddress2() {
		return userAddress2;
	}
	public void setUserAddress2(String userAddress2) {
		this.userAddress2 = userAddress2;
	}
}
