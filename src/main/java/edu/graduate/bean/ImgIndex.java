package edu.graduate.bean;

public class ImgIndex {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column graduate_imgindex.id
     *
     * @mbg.generated Fri May 03 14:26:15 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column graduate_imgindex.imgPath
     *
     * @mbg.generated Fri May 03 14:26:15 CST 2019
     */
    private String imgpath;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column graduate_imgindex.id
     *
     * @return the value of graduate_imgindex.id
     *
     * @mbg.generated Fri May 03 14:26:15 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column graduate_imgindex.id
     *
     * @param id the value for graduate_imgindex.id
     *
     * @mbg.generated Fri May 03 14:26:15 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column graduate_imgindex.imgPath
     *
     * @return the value of graduate_imgindex.imgPath
     *
     * @mbg.generated Fri May 03 14:26:15 CST 2019
     */
    public String getImgpath() {
        return imgpath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column graduate_imgindex.imgPath
     *
     * @param imgpath the value for graduate_imgindex.imgPath
     *
     * @mbg.generated Fri May 03 14:26:15 CST 2019
     */
    public void setImgpath(String imgpath) {
        this.imgpath = imgpath == null ? null : imgpath.trim();
    }
}