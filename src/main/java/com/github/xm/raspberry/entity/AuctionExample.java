package com.github.xm.raspberry.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuctionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuctionExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAuctionIdIsNull() {
            addCriterion("auction_id is null");
            return (Criteria) this;
        }

        public Criteria andAuctionIdIsNotNull() {
            addCriterion("auction_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuctionIdEqualTo(Integer value) {
            addCriterion("auction_id =", value, "auctionId");
            return (Criteria) this;
        }

        public Criteria andAuctionIdNotEqualTo(Integer value) {
            addCriterion("auction_id <>", value, "auctionId");
            return (Criteria) this;
        }

        public Criteria andAuctionIdGreaterThan(Integer value) {
            addCriterion("auction_id >", value, "auctionId");
            return (Criteria) this;
        }

        public Criteria andAuctionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("auction_id >=", value, "auctionId");
            return (Criteria) this;
        }

        public Criteria andAuctionIdLessThan(Integer value) {
            addCriterion("auction_id <", value, "auctionId");
            return (Criteria) this;
        }

        public Criteria andAuctionIdLessThanOrEqualTo(Integer value) {
            addCriterion("auction_id <=", value, "auctionId");
            return (Criteria) this;
        }

        public Criteria andAuctionIdIn(List<Integer> values) {
            addCriterion("auction_id in", values, "auctionId");
            return (Criteria) this;
        }

        public Criteria andAuctionIdNotIn(List<Integer> values) {
            addCriterion("auction_id not in", values, "auctionId");
            return (Criteria) this;
        }

        public Criteria andAuctionIdBetween(Integer value1, Integer value2) {
            addCriterion("auction_id between", value1, value2, "auctionId");
            return (Criteria) this;
        }

        public Criteria andAuctionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("auction_id not between", value1, value2, "auctionId");
            return (Criteria) this;
        }

        public Criteria andAuctionNameIsNull() {
            addCriterion("auction_name is null");
            return (Criteria) this;
        }

        public Criteria andAuctionNameIsNotNull() {
            addCriterion("auction_name is not null");
            return (Criteria) this;
        }

        public Criteria andAuctionNameEqualTo(String value) {
            addCriterion("auction_name =", value, "auctionName");
            return (Criteria) this;
        }

        public Criteria andAuctionNameNotEqualTo(String value) {
            addCriterion("auction_name <>", value, "auctionName");
            return (Criteria) this;
        }

        public Criteria andAuctionNameGreaterThan(String value) {
            addCriterion("auction_name >", value, "auctionName");
            return (Criteria) this;
        }

        public Criteria andAuctionNameGreaterThanOrEqualTo(String value) {
            addCriterion("auction_name >=", value, "auctionName");
            return (Criteria) this;
        }

        public Criteria andAuctionNameLessThan(String value) {
            addCriterion("auction_name <", value, "auctionName");
            return (Criteria) this;
        }

        public Criteria andAuctionNameLessThanOrEqualTo(String value) {
            addCriterion("auction_name <=", value, "auctionName");
            return (Criteria) this;
        }

        public Criteria andAuctionNameLike(String value) {
            addCriterion("auction_name like", value, "auctionName");
            return (Criteria) this;
        }

        public Criteria andAuctionNameNotLike(String value) {
            addCriterion("auction_name not like", value, "auctionName");
            return (Criteria) this;
        }

        public Criteria andAuctionNameIn(List<String> values) {
            addCriterion("auction_name in", values, "auctionName");
            return (Criteria) this;
        }

        public Criteria andAuctionNameNotIn(List<String> values) {
            addCriterion("auction_name not in", values, "auctionName");
            return (Criteria) this;
        }

        public Criteria andAuctionNameBetween(String value1, String value2) {
            addCriterion("auction_name between", value1, value2, "auctionName");
            return (Criteria) this;
        }

        public Criteria andAuctionNameNotBetween(String value1, String value2) {
            addCriterion("auction_name not between", value1, value2, "auctionName");
            return (Criteria) this;
        }

        public Criteria andAuctionStartPriceIsNull() {
            addCriterion("auction_start_price is null");
            return (Criteria) this;
        }

        public Criteria andAuctionStartPriceIsNotNull() {
            addCriterion("auction_start_price is not null");
            return (Criteria) this;
        }

        public Criteria andAuctionStartPriceEqualTo(BigDecimal value) {
            addCriterion("auction_start_price =", value, "auctionStartPrice");
            return (Criteria) this;
        }

        public Criteria andAuctionStartPriceNotEqualTo(BigDecimal value) {
            addCriterion("auction_start_price <>", value, "auctionStartPrice");
            return (Criteria) this;
        }

        public Criteria andAuctionStartPriceGreaterThan(BigDecimal value) {
            addCriterion("auction_start_price >", value, "auctionStartPrice");
            return (Criteria) this;
        }

        public Criteria andAuctionStartPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("auction_start_price >=", value, "auctionStartPrice");
            return (Criteria) this;
        }

        public Criteria andAuctionStartPriceLessThan(BigDecimal value) {
            addCriterion("auction_start_price <", value, "auctionStartPrice");
            return (Criteria) this;
        }

        public Criteria andAuctionStartPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("auction_start_price <=", value, "auctionStartPrice");
            return (Criteria) this;
        }

        public Criteria andAuctionStartPriceIn(List<BigDecimal> values) {
            addCriterion("auction_start_price in", values, "auctionStartPrice");
            return (Criteria) this;
        }

        public Criteria andAuctionStartPriceNotIn(List<BigDecimal> values) {
            addCriterion("auction_start_price not in", values, "auctionStartPrice");
            return (Criteria) this;
        }

        public Criteria andAuctionStartPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("auction_start_price between", value1, value2, "auctionStartPrice");
            return (Criteria) this;
        }

        public Criteria andAuctionStartPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("auction_start_price not between", value1, value2, "auctionStartPrice");
            return (Criteria) this;
        }

        public Criteria andAuctionUpsetIsNull() {
            addCriterion("auction_upset is null");
            return (Criteria) this;
        }

        public Criteria andAuctionUpsetIsNotNull() {
            addCriterion("auction_upset is not null");
            return (Criteria) this;
        }

        public Criteria andAuctionUpsetEqualTo(BigDecimal value) {
            addCriterion("auction_upset =", value, "auctionUpset");
            return (Criteria) this;
        }

        public Criteria andAuctionUpsetNotEqualTo(BigDecimal value) {
            addCriterion("auction_upset <>", value, "auctionUpset");
            return (Criteria) this;
        }

        public Criteria andAuctionUpsetGreaterThan(BigDecimal value) {
            addCriterion("auction_upset >", value, "auctionUpset");
            return (Criteria) this;
        }

        public Criteria andAuctionUpsetGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("auction_upset >=", value, "auctionUpset");
            return (Criteria) this;
        }

        public Criteria andAuctionUpsetLessThan(BigDecimal value) {
            addCriterion("auction_upset <", value, "auctionUpset");
            return (Criteria) this;
        }

        public Criteria andAuctionUpsetLessThanOrEqualTo(BigDecimal value) {
            addCriterion("auction_upset <=", value, "auctionUpset");
            return (Criteria) this;
        }

        public Criteria andAuctionUpsetIn(List<BigDecimal> values) {
            addCriterion("auction_upset in", values, "auctionUpset");
            return (Criteria) this;
        }

        public Criteria andAuctionUpsetNotIn(List<BigDecimal> values) {
            addCriterion("auction_upset not in", values, "auctionUpset");
            return (Criteria) this;
        }

        public Criteria andAuctionUpsetBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("auction_upset between", value1, value2, "auctionUpset");
            return (Criteria) this;
        }

        public Criteria andAuctionUpsetNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("auction_upset not between", value1, value2, "auctionUpset");
            return (Criteria) this;
        }

        public Criteria andAuctionStartTimeIsNull() {
            addCriterion("auction_start_time is null");
            return (Criteria) this;
        }

        public Criteria andAuctionStartTimeIsNotNull() {
            addCriterion("auction_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuctionStartTimeEqualTo(Date value) {
            addCriterion("auction_start_time =", value, "auctionStartTime");
            return (Criteria) this;
        }

        public Criteria andAuctionStartTimeNotEqualTo(Date value) {
            addCriterion("auction_start_time <>", value, "auctionStartTime");
            return (Criteria) this;
        }

        public Criteria andAuctionStartTimeGreaterThan(Date value) {
            addCriterion("auction_start_time >", value, "auctionStartTime");
            return (Criteria) this;
        }

        public Criteria andAuctionStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("auction_start_time >=", value, "auctionStartTime");
            return (Criteria) this;
        }

        public Criteria andAuctionStartTimeLessThan(Date value) {
            addCriterion("auction_start_time <", value, "auctionStartTime");
            return (Criteria) this;
        }

        public Criteria andAuctionStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("auction_start_time <=", value, "auctionStartTime");
            return (Criteria) this;
        }

        public Criteria andAuctionStartTimeIn(List<Date> values) {
            addCriterion("auction_start_time in", values, "auctionStartTime");
            return (Criteria) this;
        }

        public Criteria andAuctionStartTimeNotIn(List<Date> values) {
            addCriterion("auction_start_time not in", values, "auctionStartTime");
            return (Criteria) this;
        }

        public Criteria andAuctionStartTimeBetween(Date value1, Date value2) {
            addCriterion("auction_start_time between", value1, value2, "auctionStartTime");
            return (Criteria) this;
        }

        public Criteria andAuctionStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("auction_start_time not between", value1, value2, "auctionStartTime");
            return (Criteria) this;
        }

        public Criteria andAuctionEndTimeIsNull() {
            addCriterion("auction_end_time is null");
            return (Criteria) this;
        }

        public Criteria andAuctionEndTimeIsNotNull() {
            addCriterion("auction_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuctionEndTimeEqualTo(Date value) {
            addCriterion("auction_end_time =", value, "auctionEndTime");
            return (Criteria) this;
        }

        public Criteria andAuctionEndTimeNotEqualTo(Date value) {
            addCriterion("auction_end_time <>", value, "auctionEndTime");
            return (Criteria) this;
        }

        public Criteria andAuctionEndTimeGreaterThan(Date value) {
            addCriterion("auction_end_time >", value, "auctionEndTime");
            return (Criteria) this;
        }

        public Criteria andAuctionEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("auction_end_time >=", value, "auctionEndTime");
            return (Criteria) this;
        }

        public Criteria andAuctionEndTimeLessThan(Date value) {
            addCriterion("auction_end_time <", value, "auctionEndTime");
            return (Criteria) this;
        }

        public Criteria andAuctionEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("auction_end_time <=", value, "auctionEndTime");
            return (Criteria) this;
        }

        public Criteria andAuctionEndTimeIn(List<Date> values) {
            addCriterion("auction_end_time in", values, "auctionEndTime");
            return (Criteria) this;
        }

        public Criteria andAuctionEndTimeNotIn(List<Date> values) {
            addCriterion("auction_end_time not in", values, "auctionEndTime");
            return (Criteria) this;
        }

        public Criteria andAuctionEndTimeBetween(Date value1, Date value2) {
            addCriterion("auction_end_time between", value1, value2, "auctionEndTime");
            return (Criteria) this;
        }

        public Criteria andAuctionEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("auction_end_time not between", value1, value2, "auctionEndTime");
            return (Criteria) this;
        }

        public Criteria andAuctionPicIsNull() {
            addCriterion("auction_pic is null");
            return (Criteria) this;
        }

        public Criteria andAuctionPicIsNotNull() {
            addCriterion("auction_pic is not null");
            return (Criteria) this;
        }

        public Criteria andAuctionPicEqualTo(String value) {
            addCriterion("auction_pic =", value, "auctionPic");
            return (Criteria) this;
        }

        public Criteria andAuctionPicNotEqualTo(String value) {
            addCriterion("auction_pic <>", value, "auctionPic");
            return (Criteria) this;
        }

        public Criteria andAuctionPicGreaterThan(String value) {
            addCriterion("auction_pic >", value, "auctionPic");
            return (Criteria) this;
        }

        public Criteria andAuctionPicGreaterThanOrEqualTo(String value) {
            addCriterion("auction_pic >=", value, "auctionPic");
            return (Criteria) this;
        }

        public Criteria andAuctionPicLessThan(String value) {
            addCriterion("auction_pic <", value, "auctionPic");
            return (Criteria) this;
        }

        public Criteria andAuctionPicLessThanOrEqualTo(String value) {
            addCriterion("auction_pic <=", value, "auctionPic");
            return (Criteria) this;
        }

        public Criteria andAuctionPicLike(String value) {
            addCriterion("auction_pic like", value, "auctionPic");
            return (Criteria) this;
        }

        public Criteria andAuctionPicNotLike(String value) {
            addCriterion("auction_pic not like", value, "auctionPic");
            return (Criteria) this;
        }

        public Criteria andAuctionPicIn(List<String> values) {
            addCriterion("auction_pic in", values, "auctionPic");
            return (Criteria) this;
        }

        public Criteria andAuctionPicNotIn(List<String> values) {
            addCriterion("auction_pic not in", values, "auctionPic");
            return (Criteria) this;
        }

        public Criteria andAuctionPicBetween(String value1, String value2) {
            addCriterion("auction_pic between", value1, value2, "auctionPic");
            return (Criteria) this;
        }

        public Criteria andAuctionPicNotBetween(String value1, String value2) {
            addCriterion("auction_pic not between", value1, value2, "auctionPic");
            return (Criteria) this;
        }

        public Criteria andAuctionDescIsNull() {
            addCriterion("auction_desc is null");
            return (Criteria) this;
        }

        public Criteria andAuctionDescIsNotNull() {
            addCriterion("auction_desc is not null");
            return (Criteria) this;
        }

        public Criteria andAuctionDescEqualTo(String value) {
            addCriterion("auction_desc =", value, "auctionDesc");
            return (Criteria) this;
        }

        public Criteria andAuctionDescNotEqualTo(String value) {
            addCriterion("auction_desc <>", value, "auctionDesc");
            return (Criteria) this;
        }

        public Criteria andAuctionDescGreaterThan(String value) {
            addCriterion("auction_desc >", value, "auctionDesc");
            return (Criteria) this;
        }

        public Criteria andAuctionDescGreaterThanOrEqualTo(String value) {
            addCriterion("auction_desc >=", value, "auctionDesc");
            return (Criteria) this;
        }

        public Criteria andAuctionDescLessThan(String value) {
            addCriterion("auction_desc <", value, "auctionDesc");
            return (Criteria) this;
        }

        public Criteria andAuctionDescLessThanOrEqualTo(String value) {
            addCriterion("auction_desc <=", value, "auctionDesc");
            return (Criteria) this;
        }

        public Criteria andAuctionDescLike(String value) {
            addCriterion("auction_desc like", value, "auctionDesc");
            return (Criteria) this;
        }

        public Criteria andAuctionDescNotLike(String value) {
            addCriterion("auction_desc not like", value, "auctionDesc");
            return (Criteria) this;
        }

        public Criteria andAuctionDescIn(List<String> values) {
            addCriterion("auction_desc in", values, "auctionDesc");
            return (Criteria) this;
        }

        public Criteria andAuctionDescNotIn(List<String> values) {
            addCriterion("auction_desc not in", values, "auctionDesc");
            return (Criteria) this;
        }

        public Criteria andAuctionDescBetween(String value1, String value2) {
            addCriterion("auction_desc between", value1, value2, "auctionDesc");
            return (Criteria) this;
        }

        public Criteria andAuctionDescNotBetween(String value1, String value2) {
            addCriterion("auction_desc not between", value1, value2, "auctionDesc");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}