package edu.graduate.dao;

import edu.graduate.bean.Topic;
import edu.graduate.bean.TopicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TopicMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_topic
     *
     * @mbg.generated Sun May 19 09:23:05 CST 2019
     */
    long countByExample(TopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_topic
     *
     * @mbg.generated Sun May 19 09:23:05 CST 2019
     */
    int deleteByExample(TopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_topic
     *
     * @mbg.generated Sun May 19 09:23:05 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_topic
     *
     * @mbg.generated Sun May 19 09:23:05 CST 2019
     */
    int insert(Topic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_topic
     *
     * @mbg.generated Sun May 19 09:23:05 CST 2019
     */
    int insertSelective(Topic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_topic
     *
     * @mbg.generated Sun May 19 09:23:05 CST 2019
     */
    List<Topic> selectByExampleWithBLOBs(TopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_topic
     *
     * @mbg.generated Sun May 19 09:23:05 CST 2019
     */
    List<Topic> selectByExample(TopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_topic
     *
     * @mbg.generated Sun May 19 09:23:05 CST 2019
     */
    Topic selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_topic
     *
     * @mbg.generated Sun May 19 09:23:05 CST 2019
     */
    int updateByExampleSelective(@Param("record") Topic record, @Param("example") TopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_topic
     *
     * @mbg.generated Sun May 19 09:23:05 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") Topic record, @Param("example") TopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_topic
     *
     * @mbg.generated Sun May 19 09:23:05 CST 2019
     */
    int updateByExample(@Param("record") Topic record, @Param("example") TopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_topic
     *
     * @mbg.generated Sun May 19 09:23:05 CST 2019
     */
    int updateByPrimaryKeySelective(Topic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_topic
     *
     * @mbg.generated Sun May 19 09:23:05 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(Topic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_topic
     *
     * @mbg.generated Sun May 19 09:23:05 CST 2019
     */
    int updateByPrimaryKey(Topic record);


	List<Topic> findTopicByDate(String topic);

	Topic findTopicByName(Topic topic);
}