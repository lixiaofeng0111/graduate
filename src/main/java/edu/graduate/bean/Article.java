package edu.graduate.bean;

public class Article {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column graduate_article.id
     *
     * @mbg.generated Thu Apr 18 09:50:43 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column graduate_article.name
     *
     * @mbg.generated Thu Apr 18 09:50:43 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column graduate_article.picture
     *
     * @mbg.generated Thu Apr 18 09:50:43 CST 2019
     */
    private String picture;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column graduate_article.description
     *
     * @mbg.generated Thu Apr 18 09:50:43 CST 2019
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column graduate_article.id
     *
     * @return the value of graduate_article.id
     *
     * @mbg.generated Thu Apr 18 09:50:43 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column graduate_article.id
     *
     * @param id the value for graduate_article.id
     *
     * @mbg.generated Thu Apr 18 09:50:43 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column graduate_article.name
     *
     * @return the value of graduate_article.name
     *
     * @mbg.generated Thu Apr 18 09:50:43 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column graduate_article.name
     *
     * @param name the value for graduate_article.name
     *
     * @mbg.generated Thu Apr 18 09:50:43 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column graduate_article.picture
     *
     * @return the value of graduate_article.picture
     *
     * @mbg.generated Thu Apr 18 09:50:43 CST 2019
     */
    public String getPicture() {
        return picture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column graduate_article.picture
     *
     * @param picture the value for graduate_article.picture
     *
     * @mbg.generated Thu Apr 18 09:50:43 CST 2019
     */
    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column graduate_article.description
     *
     * @return the value of graduate_article.description
     *
     * @mbg.generated Thu Apr 18 09:50:43 CST 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column graduate_article.description
     *
     * @param description the value for graduate_article.description
     *
     * @mbg.generated Thu Apr 18 09:50:43 CST 2019
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}