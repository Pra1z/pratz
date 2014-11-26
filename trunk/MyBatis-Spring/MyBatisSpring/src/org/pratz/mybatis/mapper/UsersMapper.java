package org.pratz.mybatis.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.pratz.mybatis.model.Users;
import org.pratz.mybatis.model.UsersExample;

public interface UsersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.USERS
     *
     * @mbggenerated Tue Nov 25 16:23:06 ICT 2014
     */
    int countByExample(UsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.USERS
     *
     * @mbggenerated Tue Nov 25 16:23:06 ICT 2014
     */
    int deleteByExample(UsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.USERS
     *
     * @mbggenerated Tue Nov 25 16:23:06 ICT 2014
     */
    int deleteByPrimaryKey(String username);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.USERS
     *
     * @mbggenerated Tue Nov 25 16:23:06 ICT 2014
     */
    int insert(Users record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.USERS
     *
     * @mbggenerated Tue Nov 25 16:23:06 ICT 2014
     */
    int insertSelective(Users record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.USERS
     *
     * @mbggenerated Tue Nov 25 16:23:06 ICT 2014
     */
    List<Users> selectByExample(UsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.USERS
     *
     * @mbggenerated Tue Nov 25 16:23:06 ICT 2014
     */
    Users selectByPrimaryKey(String username);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.USERS
     *
     * @mbggenerated Tue Nov 25 16:23:06 ICT 2014
     */
    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.USERS
     *
     * @mbggenerated Tue Nov 25 16:23:06 ICT 2014
     */
    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.USERS
     *
     * @mbggenerated Tue Nov 25 16:23:06 ICT 2014
     */
    int updateByPrimaryKeySelective(Users record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.USERS
     *
     * @mbggenerated Tue Nov 25 16:23:06 ICT 2014
     */
    int updateByPrimaryKey(Users record);
}