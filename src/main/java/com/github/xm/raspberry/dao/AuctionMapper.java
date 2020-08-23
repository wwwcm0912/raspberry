package com.github.xm.raspberry.dao;

import com.github.xm.raspberry.entity.Auction;
import com.github.xm.raspberry.entity.AuctionExample;
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

public interface AuctionMapper {
    @SelectProvider(type=AuctionSqlProvider.class, method="countByExample")
    long countByExample(AuctionExample example);

    @DeleteProvider(type=AuctionSqlProvider.class, method="deleteByExample")
    int deleteByExample(AuctionExample example);

    @Delete({
        "delete from auction",
        "where auction_id = #{auctionId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer auctionId);

    @Insert({
        "insert into auction (auction_id, auction_name, ",
        "auction_start_price, auction_upset, ",
        "auction_start_time, auction_end_time, ",
        "auction_pic, auction_desc)",
        "values (#{auctionId,jdbcType=INTEGER}, #{auctionName,jdbcType=VARCHAR}, ",
        "#{auctionStartPrice,jdbcType=DECIMAL}, #{auctionUpset,jdbcType=DECIMAL}, ",
        "#{auctionStartTime,jdbcType=TIMESTAMP}, #{auctionEndTime,jdbcType=TIMESTAMP}, ",
        "#{auctionPic,jdbcType=VARCHAR}, #{auctionDesc,jdbcType=VARCHAR})"
    })
    int insert(Auction record);

    @InsertProvider(type=AuctionSqlProvider.class, method="insertSelective")
    int insertSelective(Auction record);

    @SelectProvider(type=AuctionSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="auction_id", property="auctionId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="auction_name", property="auctionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="auction_start_price", property="auctionStartPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="auction_upset", property="auctionUpset", jdbcType=JdbcType.DECIMAL),
        @Result(column="auction_start_time", property="auctionStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="auction_end_time", property="auctionEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="auction_pic", property="auctionPic", jdbcType=JdbcType.VARCHAR),
        @Result(column="auction_desc", property="auctionDesc", jdbcType=JdbcType.VARCHAR)
    })
    List<Auction> selectByExample(AuctionExample example);

    @Select({
        "select",
        "auction_id, auction_name, auction_start_price, auction_upset, auction_start_time, ",
        "auction_end_time, auction_pic, auction_desc",
        "from auction",
        "where auction_id = #{auctionId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="auction_id", property="auctionId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="auction_name", property="auctionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="auction_start_price", property="auctionStartPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="auction_upset", property="auctionUpset", jdbcType=JdbcType.DECIMAL),
        @Result(column="auction_start_time", property="auctionStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="auction_end_time", property="auctionEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="auction_pic", property="auctionPic", jdbcType=JdbcType.VARCHAR),
        @Result(column="auction_desc", property="auctionDesc", jdbcType=JdbcType.VARCHAR)
    })
    Auction selectByPrimaryKey(Integer auctionId);

    @UpdateProvider(type=AuctionSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Auction record, @Param("example") AuctionExample example);

    @UpdateProvider(type=AuctionSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Auction record, @Param("example") AuctionExample example);

    @UpdateProvider(type=AuctionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Auction record);

    @Update({
        "update auction",
        "set auction_name = #{auctionName,jdbcType=VARCHAR},",
          "auction_start_price = #{auctionStartPrice,jdbcType=DECIMAL},",
          "auction_upset = #{auctionUpset,jdbcType=DECIMAL},",
          "auction_start_time = #{auctionStartTime,jdbcType=TIMESTAMP},",
          "auction_end_time = #{auctionEndTime,jdbcType=TIMESTAMP},",
          "auction_pic = #{auctionPic,jdbcType=VARCHAR},",
          "auction_desc = #{auctionDesc,jdbcType=VARCHAR}",
        "where auction_id = #{auctionId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Auction record);
}