package edu.graduate.dao;

import edu.graduate.bean.ImgIndexButtom;
import edu.graduate.bean.ImgIndexButtomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImgIndexButtomMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_imgindex_buttom
     *
     * @mbg.generated Tue May 07 20:37:04 CST 2019
     */
    long countByExample(ImgIndexButtomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_imgindex_buttom
     *
     * @mbg.generated Tue May 07 20:37:04 CST 2019
     */
    int deleteByExample(ImgIndexButtomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_imgindex_buttom
     *
     * @mbg.generated Tue May 07 20:37:04 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_imgindex_buttom
     *
     * @mbg.generated Tue May 07 20:37:04 CST 2019
     */
    int insert(ImgIndexButtom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_imgindex_buttom
     *
     * @mbg.generated Tue May 07 20:37:04 CST 2019
     */
    int insertSelective(ImgIndexButtom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_imgindex_buttom
     *
     * @mbg.generated Tue May 07 20:37:04 CST 2019
     */
    List<ImgIndexButtom> selectByExampleWithBLOBs(ImgIndexButtomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_imgindex_buttom
     *
     * @mbg.generated Tue May 07 20:37:04 CST 2019
     */
    List<ImgIndexButtom> selectByExample(ImgIndexButtomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_imgindex_buttom
     *
     * @mbg.generated Tue May 07 20:37:04 CST 2019
     */
    ImgIndexButtom selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_imgindex_buttom
     *
     * @mbg.generated Tue May 07 20:37:04 CST 2019
     */
    int updateByExampleSelective(@Param("record") ImgIndexButtom record, @Param("example") ImgIndexButtomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_imgindex_buttom
     *
     * @mbg.generated Tue May 07 20:37:04 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") ImgIndexButtom record, @Param("example") ImgIndexButtomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_imgindex_buttom
     *
     * @mbg.generated Tue May 07 20:37:04 CST 2019
     */
    int updateByExample(@Param("record") ImgIndexButtom record, @Param("example") ImgIndexButtomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_imgindex_buttom
     *
     * @mbg.generated Tue May 07 20:37:04 CST 2019
     */
    int updateByPrimaryKeySelective(ImgIndexButtom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_imgindex_buttom
     *
     * @mbg.generated Tue May 07 20:37:04 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(ImgIndexButtom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_imgindex_buttom
     *
     * @mbg.generated Tue May 07 20:37:04 CST 2019
     */
    int updateByPrimaryKey(ImgIndexButtom record);
}