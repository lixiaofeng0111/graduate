package edu.graduate.bean;

public class Manager {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column graduate_manager.id
     *
     * @mbg.generated Tue May 21 15:54:08 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column graduate_manager.name
     *
     * @mbg.generated Tue May 21 15:54:08 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column graduate_manager.password
     *
     * @mbg.generated Tue May 21 15:54:08 CST 2019
     */
    private String password;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column graduate_manager.id
     *
     * @return the value of graduate_manager.id
     *
     * @mbg.generated Tue May 21 15:54:08 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column graduate_manager.id
     *
     * @param id the value for graduate_manager.id
     *
     * @mbg.generated Tue May 21 15:54:08 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column graduate_manager.name
     *
     * @return the value of graduate_manager.name
     *
     * @mbg.generated Tue May 21 15:54:08 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column graduate_manager.name
     *
     * @param name the value for graduate_manager.name
     *
     * @mbg.generated Tue May 21 15:54:08 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column graduate_manager.password
     *
     * @return the value of graduate_manager.password
     *
     * @mbg.generated Tue May 21 15:54:08 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column graduate_manager.password
     *
     * @param password the value for graduate_manager.password
     *
     * @mbg.generated Tue May 21 15:54:08 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
    
}