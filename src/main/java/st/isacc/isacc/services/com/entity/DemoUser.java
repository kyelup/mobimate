package st.isacc.isacc.services.com.entity;

import java.io.Serializable;

public class DemoUser implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5145978530582594589L;

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String userName;
	private String password;

}
