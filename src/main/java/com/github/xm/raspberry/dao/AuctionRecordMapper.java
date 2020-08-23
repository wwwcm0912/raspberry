package com.github.xm.raspberry.dao;

import com.github.xm.raspberry.entity.AuctionRecord;
import com.github.xm.raspberry.entity.AuctionRecordExample;
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

public interface AuctionRecordMapper {
    @SelectProvider(type=AuctionRecordSqlProvider.class, method="countByExample")
    long countByExample(AuctionRecordExample example);

    @DeleteProvider(type=AuctionRecordSqlProvider.class, method="deleteByExample")
    int deleteByExample(AuctionRecordExample example);

    @Delete({
        "delete from auction_record",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into auction_record (id, user_id, ",
        "auction_id, auction_time, ",
        "auction_price)",
        "values (#{id,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{auctionId,jdbcType=INTEGER}, #{auctionTime,jdbcType=TIMESTAMP}, ",
        "#{auctionPrice,jdbcType=DECIMAL})"
    })
    int insert(AuctionRecord record);

    @InsertProvider(type=AuctionRecordSqlProvider.class, method="insertSelective")
    int insertSelective(AuctionRecord record);

    @SelectProvider(type=AuctionRecordSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="auction_id", property="auctionId", jdbcType=JdbcType.INTEGER),
        @Result(column="auction_time", property="auctionTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="auction_price", property="auctionPrice", jdbcType=JdbcType.DECIMAL)
    })
    List<AuctionRecord> selectByExample(AuctionRecordExample example);

    @Select({
        "select",
        "id, user_id, auction_id, auction_time, auction_price",
        "from auction_record",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="auction_id", property="auctionId", jdbcType=JdbcType.INTEGER),
        @Result(column="auction_time", property="auctionTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="auction_price", property="auctionPrice", jdbcType=JdbcType.DECIMAL)
    })
    AuctionRecord selectByPrimaryKey(Integer id);

    @UpdateProvider(type=AuctionRecordSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") AuctionRecord record, @Param("example") AuctionRecordExample example);

    @UpdateProvider(type=AuctionRecordSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") AuctionRecord record, @Param("example") AuctionRecordExample example);

    @UpdateProvider(type=AuctionRecordSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(AuctionRecord record);

    @Update({
        "update auction_record",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "auction_id = #{auctionId,jdbcType=INTEGER},",
          "auction_time = #{auctionTime,jdbcType=TIMESTAMP},",
          "auction_price = #{auctionPrice,jdbcType=DECIMAL}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(AuctionRecord record);
}