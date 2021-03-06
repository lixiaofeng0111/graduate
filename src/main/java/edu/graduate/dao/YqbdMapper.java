package edu.graduate.dao;

import edu.graduate.bean.Yqbd;
import edu.graduate.bean.YqbdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YqbdMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_yqbd
     *
     * @mbg.generated Sat May 18 22:51:34 CST 2019
     */
    long countByExample(YqbdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_yqbd
     *
     * @mbg.generated Sat May 18 22:51:34 CST 2019
     */
    int deleteByExample(YqbdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_yqbd
     *
     * @mbg.generated Sat May 18 22:51:34 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_yqbd
     *
     * @mbg.generated Sat May 18 22:51:34 CST 2019
     */
    int insert(Yqbd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_yqbd
     *
     * @mbg.generated Sat May 18 22:51:34 CST 2019
     */
    int insertSelective(Yqbd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_yqbd
     *
     * @mbg.generated Sat May 18 22:51:34 CST 2019
     */
    List<Yqbd> selectByExampleWithBLOBs(YqbdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_yqbd
     *
     * @mbg.generated Sat May 18 22:51:34 CST 2019
     */
    List<Yqbd> selectByExample(YqbdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_yqbd
     *
     * @mbg.generated Sat May 18 22:51:34 CST 2019
     */
    Yqbd selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_yqbd
     *
     * @mbg.generated Sat May 18 22:51:34 CST 2019
     */
    int updateByExampleSelective(@Param("record") Yqbd record, @Param("example") YqbdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_yqbd
     *
     * @mbg.generated Sat May 18 22:51:34 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") Yqbd record, @Param("example") YqbdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_yqbd
     *
     * @mbg.generated Sat May 18 22:51:34 CST 2019
     */
    int updateByExample(@Param("record") Yqbd record, @Param("example") YqbdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_yqbd
     *
     * @mbg.generated Sat May 18 22:51:34 CST 2019
     */
    int updateByPrimaryKeySelective(Yqbd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_yqbd
     *
     * @mbg.generated Sat May 18 22:51:34 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(Yqbd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_yqbd
     *
     * @mbg.generated Sat May 18 22:51:34 CST 2019
     */
    int updateByPrimaryKey(Yqbd record);
    
    Yqbd selectByName(String name);
}