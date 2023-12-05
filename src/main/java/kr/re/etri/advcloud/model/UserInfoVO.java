package kr.re.etri.advcloud.model;

import kr.re.etri.advcloud.common.base.BaseSearch;

@SuppressWarnings("serial")
public class UserInfoVO extends BaseSearch {
	
	private String id;
	private String password;
	private String name;
	private String email;
	private String tel_no;
	private String register_date;
	private int manage_vehicle_count = -1;
	private int manage_edge_count = -1;
	private String auth_code;
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the tel_no
	 */
	public String getTel_no() {
		return tel_no;
	}

	/**
	 * @param tel_no the tel_no to set
	 */
	public void setTel_no(String tel_no) {
		this.tel_no = tel_no;
	}

	/**
	 * @return the register_date
	 */
	public String getRegister_date() {
		return register_date;
	}

	/**
	 * @param register_date the register_date to set
	 */
	public void setRegister_date(String register_date) {
		this.register_date = register_date;
	}

	/**
	 * @return the manage_vehicle_count
	 */
	public int getManage_vehicle_count() {
		return manage_vehicle_count;
	}

	/**
	 * @param manage_vehicle_count the manage_vehicle_count to set
	 */
	public void setManage_vehicle_count(int manage_vehicle_count) {
		this.manage_vehicle_count = manage_vehicle_count;
	}

	/**
	 * @return the manage_edge_count
	 */
	public int getManage_edge_count() {
		return manage_edge_count;
	}

	/**
	 * @param manage_edge_count the manage_edge_count to set
	 */
	public void setManage_edge_count(int manage_edge_count) {
		this.manage_edge_count = manage_edge_count;
	}

	/**
	 * @return the auth_code
	 */
	public String getAuth_code() {
		return auth_code;
	}

	/**
	 * @param auth_code the auth_code to set
	 */
	public void setAuth_code(String auth_code) {
		this.auth_code = auth_code;
	}
	
}
