package edu.graduate.dao;

import edu.graduate.bean.Professor;
import edu.graduate.bean.ProfessorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProfessorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_professor
     *
     * @mbg.generated Tue May 21 10:16:40 CST 2019
     */
    long countByExample(ProfessorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_professor
     *
     * @mbg.generated Tue May 21 10:16:40 CST 2019
     */
    int deleteByExample(ProfessorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_professor
     *
     * @mbg.generated Tue May 21 10:16:40 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_professor
     *
     * @mbg.generated Tue May 21 10:16:40 CST 2019
     */
    int insert(Professor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_professor
     *
     * @mbg.generated Tue May 21 10:16:40 CST 2019
     */
    int insertSelective(Professor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_professor
     *
     * @mbg.generated Tue May 21 10:16:40 CST 2019
     */
    List<Professor> selectByExampleWithBLOBs(ProfessorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_professor
     *
     * @mbg.generated Tue May 21 10:16:40 CST 2019
     */
    List<Professor> selectByExample(ProfessorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_professor
     *
     * @mbg.generated Tue May 21 10:16:40 CST 2019
     */
    Professor selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_professor
     *
     * @mbg.generated Tue May 21 10:16:40 CST 2019
     */
    int updateByExampleSelective(@Param("record") Professor record, @Param("example") ProfessorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_professor
     *
     * @mbg.generated Tue May 21 10:16:40 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") Professor record, @Param("example") ProfessorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_professor
     *
     * @mbg.generated Tue May 21 10:16:40 CST 2019
     */
    int updateByExample(@Param("record") Professor record, @Param("example") ProfessorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_professor
     *
     * @mbg.generated Tue May 21 10:16:40 CST 2019
     */
    int updateByPrimaryKeySelective(Professor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_professor
     *
     * @mbg.generated Tue May 21 10:16:40 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(Professor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_professor
     *
     * @mbg.generated Tue May 21 10:16:40 CST 2019
     */
    int updateByPrimaryKey(Professor record);
    
    List<Professor> selectProfessorsByTopicKindId();
    
    Professor selectProfessorByName(String name);
    
    Professor selectKindByKindId(Integer topicKindId);
    
    List<Professor> selectProfessorByNameDim(@Param("ProfessorName")String ProfessorName);
    
    List<Professor> findAll();
    
    
}