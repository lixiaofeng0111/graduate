package edu.graduate.bean;

public class Nutrition {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column graduate_nutrition.id
     *
     * @mbg.generated Fri Apr 12 20:03:16 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column graduate_nutrition.name
     *
     * @mbg.generated Fri Apr 12 20:03:16 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column graduate_nutrition.desc
     *
     * @mbg.generated Fri Apr 12 20:03:16 CST 2019
     */
    private String desc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column graduate_nutrition.id
     *
     * @return the value of graduate_nutrition.id
     *
     * @mbg.generated Fri Apr 12 20:03:16 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column graduate_nutrition.id
     *
     * @param id the value for graduate_nutrition.id
     *
     * @mbg.generated Fri Apr 12 20:03:16 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column graduate_nutrition.name
     *
     * @return the value of graduate_nutrition.name
     *
     * @mbg.generated Fri Apr 12 20:03:16 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column graduate_nutrition.name
     *
     * @param name the value for graduate_nutrition.name
     *
     * @mbg.generated Fri Apr 12 20:03:16 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column graduate_nutrition.desc
     *
     * @return the value of graduate_nutrition.desc
     *
     * @mbg.generated Fri Apr 12 20:03:16 CST 2019
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column graduate_nutrition.desc
     *
     * @param desc the value for graduate_nutrition.desc
     *
     * @mbg.generated Fri Apr 12 20:03:16 CST 2019
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}