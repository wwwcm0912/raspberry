package com.github.xm.raspberry.dao;

import com.github.xm.raspberry.entity.Auction;
import com.github.xm.raspberry.entity.AuctionExample.Criteria;
import com.github.xm.raspberry.entity.AuctionExample.Criterion;
import com.github.xm.raspberry.entity.AuctionExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class AuctionSqlProvider {
    public String countByExample(AuctionExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("auction");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(AuctionExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("auction");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Auction record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("auction");
        
        if (record.getAuctionId() != null) {
            sql.VALUES("auction_id", "#{auctionId,jdbcType=INTEGER}");
        }
        
        if (record.getAuctionName() != null) {
            sql.VALUES("auction_name", "#{auctionName,jdbcType=VARCHAR}");
        }
        
        if (record.getAuctionStartPrice() != null) {
            sql.VALUES("auction_start_price", "#{auctionStartPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getAuctionUpset() != null) {
            sql.VALUES("auction_upset", "#{auctionUpset,jdbcType=DECIMAL}");
        }
        
        if (record.getAuctionStartTime() != null) {
            sql.VALUES("auction_start_time", "#{auctionStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAuctionEndTime() != null) {
            sql.VALUES("auction_end_time", "#{auctionEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAuctionPic() != null) {
            sql.VALUES("auction_pic", "#{auctionPic,jdbcType=VARCHAR}");
        }
        
        if (record.getAuctionDesc() != null) {
            sql.VALUES("auction_desc", "#{auctionDesc,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(AuctionExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("auction_id");
        } else {
            sql.SELECT("auction_id");
        }
        sql.SELECT("auction_name");
        sql.SELECT("auction_start_price");
        sql.SELECT("auction_upset");
        sql.SELECT("auction_start_time");
        sql.SELECT("auction_end_time");
        sql.SELECT("auction_pic");
        sql.SELECT("auction_desc");
        sql.FROM("auction");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Auction record = (Auction) parameter.get("record");
        AuctionExample example = (AuctionExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("auction");
        
        if (record.getAuctionId() != null) {
            sql.SET("auction_id = #{record.auctionId,jdbcType=INTEGER}");
        }
        
        if (record.getAuctionName() != null) {
            sql.SET("auction_name = #{record.auctionName,jdbcType=VARCHAR}");
        }
        
        if (record.getAuctionStartPrice() != null) {
            sql.SET("auction_start_price = #{record.auctionStartPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getAuctionUpset() != null) {
            sql.SET("auction_upset = #{record.auctionUpset,jdbcType=DECIMAL}");
        }
        
        if (record.getAuctionStartTime() != null) {
            sql.SET("auction_start_time = #{record.auctionStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAuctionEndTime() != null) {
            sql.SET("auction_end_time = #{record.auctionEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAuctionPic() != null) {
            sql.SET("auction_pic = #{record.auctionPic,jdbcType=VARCHAR}");
        }
        
        if (record.getAuctionDesc() != null) {
            sql.SET("auction_desc = #{record.auctionDesc,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("auction");
        
        sql.SET("auction_id = #{record.auctionId,jdbcType=INTEGER}");
        sql.SET("auction_name = #{record.auctionName,jdbcType=VARCHAR}");
        sql.SET("auction_start_price = #{record.auctionStartPrice,jdbcType=DECIMAL}");
        sql.SET("auction_upset = #{record.auctionUpset,jdbcType=DECIMAL}");
        sql.SET("auction_start_time = #{record.auctionStartTime,jdbcType=TIMESTAMP}");
        sql.SET("auction_end_time = #{record.auctionEndTime,jdbcType=TIMESTAMP}");
        sql.SET("auction_pic = #{record.auctionPic,jdbcType=VARCHAR}");
        sql.SET("auction_desc = #{record.auctionDesc,jdbcType=VARCHAR}");
        
        AuctionExample example = (AuctionExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Auction record) {
        SQL sql = new SQL();
        sql.UPDATE("auction");
        
        if (record.getAuctionName() != null) {
            sql.SET("auction_name = #{auctionName,jdbcType=VARCHAR}");
        }
        
        if (record.getAuctionStartPrice() != null) {
            sql.SET("auction_start_price = #{auctionStartPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getAuctionUpset() != null) {
            sql.SET("auction_upset = #{auctionUpset,jdbcType=DECIMAL}");
        }
        
        if (record.getAuctionStartTime() != null) {
            sql.SET("auction_start_time = #{auctionStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAuctionEndTime() != null) {
            sql.SET("auction_end_time = #{auctionEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAuctionPic() != null) {
            sql.SET("auction_pic = #{auctionPic,jdbcType=VARCHAR}");
        }
        
        if (record.getAuctionDesc() != null) {
            sql.SET("auction_desc = #{auctionDesc,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("auction_id = #{auctionId,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, AuctionExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}