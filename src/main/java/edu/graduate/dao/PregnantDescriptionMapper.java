package edu.graduate.dao;

import edu.graduate.bean.PregnantDescription;
import edu.graduate.bean.PregnantDescriptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PregnantDescriptionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_pregnantdescription
     *
     * @mbg.generated Sun May 19 23:00:42 CST 2019
     */
    long countByExample(PregnantDescriptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_pregnantdescription
     *
     * @mbg.generated Sun May 19 23:00:42 CST 2019
     */
    int deleteByExample(PregnantDescriptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_pregnantdescription
     *
     * @mbg.generated Sun May 19 23:00:42 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_pregnantdescription
     *
     * @mbg.generated Sun May 19 23:00:42 CST 2019
     */
    int insert(PregnantDescription record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_pregnantdescription
     *
     * @mbg.generated Sun May 19 23:00:42 CST 2019
     */
    int insertSelective(PregnantDescription record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_pregnantdescription
     *
     * @mbg.generated Sun May 19 23:00:42 CST 2019
     */
    List<PregnantDescription> selectByExampleWithBLOBs(PregnantDescriptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_pregnantdescription
     *
     * @mbg.generated Sun May 19 23:00:42 CST 2019
     */
    List<PregnantDescription> selectByExample(PregnantDescriptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_pregnantdescription
     *
     * @mbg.generated Sun May 19 23:00:42 CST 2019
     */
    PregnantDescription selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_pregnantdescription
     *
     * @mbg.generated Sun May 19 23:00:42 CST 2019
     */
    int updateByExampleSelective(@Param("record") PregnantDescription record, @Param("example") PregnantDescriptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_pregnantdescription
     *
     * @mbg.generated Sun May 19 23:00:42 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") PregnantDescription record, @Param("example") PregnantDescriptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_pregnantdescription
     *
     * @mbg.generated Sun May 19 23:00:42 CST 2019
     */
    int updateByExample(@Param("record") PregnantDescription record, @Param("example") PregnantDescriptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_pregnantdescription
     *
     * @mbg.generated Sun May 19 23:00:42 CST 2019
     */
    int updateByPrimaryKeySelective(PregnantDescription record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_pregnantdescription
     *
     * @mbg.generated Sun May 19 23:00:42 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(PregnantDescription record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_pregnantdescription
     *
     * @mbg.generated Sun May 19 23:00:42 CST 2019
     */
    int updateByPrimaryKey(PregnantDescription record);
    
    PregnantDescription selectByTime(String time);
}