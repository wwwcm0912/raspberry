package com.github.xm.raspberry.dao;

import com.github.xm.raspberry.entity.AuctionUser;
import com.github.xm.raspberry.entity.AuctionUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface AuctionUserMapper {
    @SelectProvider(type=AuctionUserSqlProvider.class, method="countByExample")
    long countByExample(AuctionUserExample example);

    @DeleteProvider(type=AuctionUserSqlProvider.class, method="deleteByExample")
    int deleteByExample(AuctionUserExample example);

    @Delete({
        "delete from auction_user",
        "where user_id = #{userId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer userId);

    @Insert({
        "insert into auction_user (user_id, user_name, ",
        "user_password, user_card_no, ",
        "user_tel, user_address, ",
        "user_post_number, user_is_admin, ",
        "user_question, user_answer)",
        "values (#{userId,jdbcType=INTEGER}, #{userName,jdbcType=VARCHAR}, ",
        "#{userPassword,jdbcType=VARCHAR}, #{userCardNo,jdbcType=VARCHAR}, ",
        "#{userTel,jdbcType=VARCHAR}, #{userAddress,jdbcType=VARCHAR}, ",
        "#{userPostNumber,jdbcType=VARCHAR}, #{userIsAdmin,jdbcType=INTEGER}, ",
        "#{userQuestion,jdbcType=VARCHAR}, #{userAnswer,jdbcType=VARCHAR})"
    })
    int insert(AuctionUser record);

    @InsertProvider(type=AuctionUserSqlProvider.class, method="insertSelective")
    int insertSelective(AuctionUser record);

    @SelectProvider(type=AuctionUserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_password", property="userPassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_card_no", property="userCardNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_tel", property="userTel", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_address", property="userAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_post_number", property="userPostNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_is_admin", property="userIsAdmin", jdbcType=JdbcType.INTEGER),
        @Result(column="user_question", property="userQuestion", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_answer", property="userAnswer", jdbcType=JdbcType.VARCHAR)
    })
    List<AuctionUser> selectByExample(AuctionUserExample example);

    @Select({
        "select",
        "user_id, user_name, user_password, user_card_no, user_tel, user_address, user_post_number, ",
        "user_is_admin, user_question, user_answer",
        "from auction_user",
        "where user_id = #{userId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_password", property="userPassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_card_no", property="userCardNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_tel", property="userTel", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_address", property="userAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_post_number", property="userPostNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_is_admin", property="userIsAdmin", jdbcType=JdbcType.INTEGER),
        @Result(column="user_question", property="userQuestion", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_answer", property="userAnswer", jdbcType=JdbcType.VARCHAR)
    })
    AuctionUser selectByPrimaryKey(Integer userId);

    @UpdateProvider(type=AuctionUserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") AuctionUser record, @Param("example") AuctionUserExample example);

    @UpdateProvider(type=AuctionUserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") AuctionUser record, @Param("example") AuctionUserExample example);

    @UpdateProvider(type=AuctionUserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(AuctionUser record);

    @Update({
        "update auction_user",
        "set user_name = #{userName,jdbcType=VARCHAR},",
          "user_password = #{userPassword,jdbcType=VARCHAR},",
          "user_card_no = #{userCardNo,jdbcType=VARCHAR},",
          "user_tel = #{userTel,jdbcType=VARCHAR},",
          "user_address = #{userAddress,jdbcType=VARCHAR},",
          "user_post_number = #{userPostNumber,jdbcType=VARCHAR},",
          "user_is_admin = #{userIsAdmin,jdbcType=INTEGER},",
          "user_question = #{userQuestion,jdbcType=VARCHAR},",
          "user_answer = #{userAnswer,jdbcType=VARCHAR}",
        "where user_id = #{userId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(AuctionUser record);
}