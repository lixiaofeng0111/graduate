package edu.graduate.bean;

import java.util.Date;

public class Topic {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column graduate_topic.id
     *
     * @mbg.generated Fri May 03 14:26:15 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column graduate_topic.name
     *
     * @mbg.generated Fri May 03 14:26:15 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column graduate_topic.datetime
     *
     * @mbg.generated Fri May 03 14:26:15 CST 2019
     */
    private Date datetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column graduate_topic.kind_id
     *
     * @mbg.generated Fri May 03 14:26:15 CST 2019
     */
    private Long kindId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column graduate_topic.content
     *
     * @mbg.generated Fri May 03 14:26:15 CST 2019
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column graduate_topic.id
     *
     * @return the value of graduate_topic.id
     *
     * @mbg.generated Fri May 03 14:26:15 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column graduate_topic.id
     *
     * @param id the value for graduate_topic.id
     *
     * @mbg.generated Fri May 03 14:26:15 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column graduate_topic.name
     *
     * @return the value of graduate_topic.name
     *
     * @mbg.generated Fri May 03 14:26:15 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column graduate_topic.name
     *
     * @param name the value for graduate_topic.name
     *
     * @mbg.generated Fri May 03 14:26:15 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column graduate_topic.datetime
     *
     * @return the value of graduate_topic.datetime
     *
     * @mbg.generated Fri May 03 14:26:15 CST 2019
     */
    public Date getDatetime() {
        return datetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column graduate_topic.datetime
     *
     * @param datetime the value for graduate_topic.datetime
     *
     * @mbg.generated Fri May 03 14:26:15 CST 2019
     */
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column graduate_topic.kind_id
     *
     * @return the value of graduate_topic.kind_id
     *
     * @mbg.generated Fri May 03 14:26:15 CST 2019
     */
    public Long getKindId() {
        return kindId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column graduate_topic.kind_id
     *
     * @param kindId the value for graduate_topic.kind_id
     *
     * @mbg.generated Fri May 03 14:26:15 CST 2019
     */
    public void setKindId(Long kindId) {
        this.kindId = kindId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column graduate_topic.content
     *
     * @return the value of graduate_topic.content
     *
     * @mbg.generated Fri May 03 14:26:15 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column graduate_topic.content
     *
     * @param content the value for graduate_topic.content
     *
     * @mbg.generated Fri May 03 14:26:15 CST 2019
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

	
    
}