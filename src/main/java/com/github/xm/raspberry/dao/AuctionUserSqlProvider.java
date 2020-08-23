package com.github.xm.raspberry.dao;

import com.github.xm.raspberry.entity.AuctionUser;
import com.github.xm.raspberry.entity.AuctionUserExample.Criteria;
import com.github.xm.raspberry.entity.AuctionUserExample.Criterion;
import com.github.xm.raspberry.entity.AuctionUserExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class AuctionUserSqlProvider {
    public String countByExample(AuctionUserExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("auction_user");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(AuctionUserExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("auction_user");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(AuctionUser record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("auction_user");
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getUserName() != null) {
            sql.VALUES("user_name", "#{userName,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPassword() != null) {
            sql.VALUES("user_password", "#{userPassword,jdbcType=VARCHAR}");
        }
        
        if (record.getUserCardNo() != null) {
            sql.VALUES("user_card_no", "#{userCardNo,jdbcType=VARCHAR}");
        }
        
        if (record.getUserTel() != null) {
            sql.VALUES("user_tel", "#{userTel,jdbcType=VARCHAR}");
        }
        
        if (record.getUserAddress() != null) {
            sql.VALUES("user_address", "#{userAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPostNumber() != null) {
            sql.VALUES("user_post_number", "#{userPostNumber,jdbcType=VARCHAR}");
        }
        
        if (record.getUserIsAdmin() != null) {
            sql.VALUES("user_is_admin", "#{userIsAdmin,jdbcType=INTEGER}");
        }
        
        if (record.getUserQuestion() != null) {
            sql.VALUES("user_question", "#{userQuestion,jdbcType=VARCHAR}");
        }
        
        if (record.getUserAnswer() != null) {
            sql.VALUES("user_answer", "#{userAnswer,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(AuctionUserExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("user_id");
        } else {
            sql.SELECT("user_id");
        }
        sql.SELECT("user_name");
        sql.SELECT("user_password");
        sql.SELECT("user_card_no");
        sql.SELECT("user_tel");
        sql.SELECT("user_address");
        sql.SELECT("user_post_number");
        sql.SELECT("user_is_admin");
        sql.SELECT("user_question");
        sql.SELECT("user_answer");
        sql.FROM("auction_user");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        AuctionUser record = (AuctionUser) parameter.get("record");
        AuctionUserExample example = (AuctionUserExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("auction_user");
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{record.userId,jdbcType=INTEGER}");
        }
        
        if (record.getUserName() != null) {
            sql.SET("user_name = #{record.userName,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPassword() != null) {
            sql.SET("user_password = #{record.userPassword,jdbcType=VARCHAR}");
        }
        
        if (record.getUserCardNo() != null) {
            sql.SET("user_card_no = #{record.userCardNo,jdbcType=VARCHAR}");
        }
        
        if (record.getUserTel() != null) {
            sql.SET("user_tel = #{record.userTel,jdbcType=VARCHAR}");
        }
        
        if (record.getUserAddress() != null) {
            sql.SET("user_address = #{record.userAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPostNumber() != null) {
            sql.SET("user_post_number = #{record.userPostNumber,jdbcType=VARCHAR}");
        }
        
        if (record.getUserIsAdmin() != null) {
            sql.SET("user_is_admin = #{record.userIsAdmin,jdbcType=INTEGER}");
        }
        
        if (record.getUserQuestion() != null) {
            sql.SET("user_question = #{record.userQuestion,jdbcType=VARCHAR}");
        }
        
        if (record.getUserAnswer() != null) {
            sql.SET("user_answer = #{record.userAnswer,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("auction_user");
        
        sql.SET("user_id = #{record.userId,jdbcType=INTEGER}");
        sql.SET("user_name = #{record.userName,jdbcType=VARCHAR}");
        sql.SET("user_password = #{record.userPassword,jdbcType=VARCHAR}");
        sql.SET("user_card_no = #{record.userCardNo,jdbcType=VARCHAR}");
        sql.SET("user_tel = #{record.userTel,jdbcType=VARCHAR}");
        sql.SET("user_address = #{record.userAddress,jdbcType=VARCHAR}");
        sql.SET("user_post_number = #{record.userPostNumber,jdbcType=VARCHAR}");
        sql.SET("user_is_admin = #{record.userIsAdmin,jdbcType=INTEGER}");
        sql.SET("user_question = #{record.userQuestion,jdbcType=VARCHAR}");
        sql.SET("user_answer = #{record.userAnswer,jdbcType=VARCHAR}");
        
        AuctionUserExample example = (AuctionUserExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(AuctionUser record) {
        SQL sql = new SQL();
        sql.UPDATE("auction_user");
        
        if (record.getUserName() != null) {
            sql.SET("user_name = #{userName,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPassword() != null) {
            sql.SET("user_password = #{userPassword,jdbcType=VARCHAR}");
        }
        
        if (record.getUserCardNo() != null) {
            sql.SET("user_card_no = #{userCardNo,jdbcType=VARCHAR}");
        }
        
        if (record.getUserTel() != null) {
            sql.SET("user_tel = #{userTel,jdbcType=VARCHAR}");
        }
        
        if (record.getUserAddress() != null) {
            sql.SET("user_address = #{userAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPostNumber() != null) {
            sql.SET("user_post_number = #{userPostNumber,jdbcType=VARCHAR}");
        }
        
        if (record.getUserIsAdmin() != null) {
            sql.SET("user_is_admin = #{userIsAdmin,jdbcType=INTEGER}");
        }
        
        if (record.getUserQuestion() != null) {
            sql.SET("user_question = #{userQuestion,jdbcType=VARCHAR}");
        }
        
        if (record.getUserAnswer() != null) {
            sql.SET("user_answer = #{userAnswer,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("user_id = #{userId,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, AuctionUserExample example, boolean includeExamplePhrase) {
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