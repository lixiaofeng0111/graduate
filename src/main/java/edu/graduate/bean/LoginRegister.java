package edu.graduate.bean;

public class LoginRegister {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column graduate_loginregister.id
     *
     * @mbg.generated Thu Apr 18 09:50:43 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column graduate_loginregister.username
     *
     * @mbg.generated Thu Apr 18 09:50:43 CST 2019
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column graduate_loginregister.password
     *
     * @mbg.generated Thu Apr 18 09:50:43 CST 2019
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column graduate_loginregister.age
     *
     * @mbg.generated Thu Apr 18 09:50:43 CST 2019
     */
    private Integer age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column graduate_loginregister.sex
     *
     * @mbg.generated Thu Apr 18 09:50:43 CST 2019
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column graduate_loginregister.address
     *
     * @mbg.generated Thu Apr 18 09:50:43 CST 2019
     */
    private String address;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column graduate_loginregister.id
     *
     * @return the value of graduate_loginregister.id
     *
     * @mbg.generated Thu Apr 18 09:50:43 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column graduate_loginregister.id
     *
     * @param id the value for graduate_loginregister.id
     *
     * @mbg.generated Thu Apr 18 09:50:43 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column graduate_loginregister.username
     *
     * @return the value of graduate_loginregister.username
     *
     * @mbg.generated Thu Apr 18 09:50:43 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column graduate_loginregister.username
     *
     * @param username the value for graduate_loginregister.username
     *
     * @mbg.generated Thu Apr 18 09:50:43 CST 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column graduate_loginregister.password
     *
     * @return the value of graduate_loginregister.password
     *
     * @mbg.generated Thu Apr 18 09:50:43 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column graduate_loginregister.password
     *
     * @param password the value for graduate_loginregister.password
     *
     * @mbg.generated Thu Apr 18 09:50:43 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column graduate_loginregister.age
     *
     * @return the value of graduate_loginregister.age
     *
     * @mbg.generated Thu Apr 18 09:50:43 CST 2019
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column graduate_loginregister.age
     *
     * @param age the value for graduate_loginregister.age
     *
     * @mbg.generated Thu Apr 18 09:50:43 CST 2019
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column graduate_loginregister.sex
     *
     * @return the value of graduate_loginregister.sex
     *
     * @mbg.generated Thu Apr 18 09:50:43 CST 2019
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column graduate_loginregister.sex
     *
     * @param sex the value for graduate_loginregister.sex
     *
     * @mbg.generated Thu Apr 18 09:50:43 CST 2019
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column graduate_loginregister.address
     *
     * @return the value of graduate_loginregister.address
     *
     * @mbg.generated Thu Apr 18 09:50:43 CST 2019
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column graduate_loginregister.address
     *
     * @param address the value for graduate_loginregister.address
     *
     * @mbg.generated Thu Apr 18 09:50:43 CST 2019
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

	@Override
	public String toString() {
		return "LoginRegister [id=" + id + ", username=" + username + ", password=" + password + ", age=" + age
				+ ", sex=" + sex + ", address=" + address + "]";
	}
    
}