package edu.graduate.bean;

public class PregnantAnalysis {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column graduate_pregnantanalysis.id
     *
     * @mbg.generated Sun May 19 10:30:56 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column graduate_pregnantanalysis.name
     *
     * @mbg.generated Sun May 19 10:30:56 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column graduate_pregnantanalysis.kind_id
     *
     * @mbg.generated Sun May 19 10:30:56 CST 2019
     */
    private Long kindId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column graduate_pregnantanalysis.description
     *
     * @mbg.generated Sun May 19 10:30:56 CST 2019
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column graduate_pregnantanalysis.id
     *
     * @return the value of graduate_pregnantanalysis.id
     *
     * @mbg.generated Sun May 19 10:30:56 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column graduate_pregnantanalysis.id
     *
     * @param id the value for graduate_pregnantanalysis.id
     *
     * @mbg.generated Sun May 19 10:30:56 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column graduate_pregnantanalysis.name
     *
     * @return the value of graduate_pregnantanalysis.name
     *
     * @mbg.generated Sun May 19 10:30:56 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column graduate_pregnantanalysis.name
     *
     * @param name the value for graduate_pregnantanalysis.name
     *
     * @mbg.generated Sun May 19 10:30:56 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column graduate_pregnantanalysis.kind_id
     *
     * @return the value of graduate_pregnantanalysis.kind_id
     *
     * @mbg.generated Sun May 19 10:30:56 CST 2019
     */
    public Long getKindId() {
        return kindId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column graduate_pregnantanalysis.kind_id
     *
     * @param kindId the value for graduate_pregnantanalysis.kind_id
     *
     * @mbg.generated Sun May 19 10:30:56 CST 2019
     */
    public void setKindId(Long kindId) {
        this.kindId = kindId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column graduate_pregnantanalysis.description
     *
     * @return the value of graduate_pregnantanalysis.description
     *
     * @mbg.generated Sun May 19 10:30:56 CST 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column graduate_pregnantanalysis.description
     *
     * @param description the value for graduate_pregnantanalysis.description
     *
     * @mbg.generated Sun May 19 10:30:56 CST 2019
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}