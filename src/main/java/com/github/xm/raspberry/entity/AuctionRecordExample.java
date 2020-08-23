package com.github.xm.raspberry.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuctionRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuctionRecordExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
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

        public Criteria andAuctionTimeIsNull() {
            addCriterion("auction_time is null");
            return (Criteria) this;
        }

        public Criteria andAuctionTimeIsNotNull() {
            addCriterion("auction_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuctionTimeEqualTo(Date value) {
            addCriterion("auction_time =", value, "auctionTime");
            return (Criteria) this;
        }

        public Criteria andAuctionTimeNotEqualTo(Date value) {
            addCriterion("auction_time <>", value, "auctionTime");
            return (Criteria) this;
        }

        public Criteria andAuctionTimeGreaterThan(Date value) {
            addCriterion("auction_time >", value, "auctionTime");
            return (Criteria) this;
        }

        public Criteria andAuctionTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("auction_time >=", value, "auctionTime");
            return (Criteria) this;
        }

        public Criteria andAuctionTimeLessThan(Date value) {
            addCriterion("auction_time <", value, "auctionTime");
            return (Criteria) this;
        }

        public Criteria andAuctionTimeLessThanOrEqualTo(Date value) {
            addCriterion("auction_time <=", value, "auctionTime");
            return (Criteria) this;
        }

        public Criteria andAuctionTimeIn(List<Date> values) {
            addCriterion("auction_time in", values, "auctionTime");
            return (Criteria) this;
        }

        public Criteria andAuctionTimeNotIn(List<Date> values) {
            addCriterion("auction_time not in", values, "auctionTime");
            return (Criteria) this;
        }

        public Criteria andAuctionTimeBetween(Date value1, Date value2) {
            addCriterion("auction_time between", value1, value2, "auctionTime");
            return (Criteria) this;
        }

        public Criteria andAuctionTimeNotBetween(Date value1, Date value2) {
            addCriterion("auction_time not between", value1, value2, "auctionTime");
            return (Criteria) this;
        }

        public Criteria andAuctionPriceIsNull() {
            addCriterion("auction_price is null");
            return (Criteria) this;
        }

        public Criteria andAuctionPriceIsNotNull() {
            addCriterion("auction_price is not null");
            return (Criteria) this;
        }

        public Criteria andAuctionPriceEqualTo(BigDecimal value) {
            addCriterion("auction_price =", value, "auctionPrice");
            return (Criteria) this;
        }

        public Criteria andAuctionPriceNotEqualTo(BigDecimal value) {
            addCriterion("auction_price <>", value, "auctionPrice");
            return (Criteria) this;
        }

        public Criteria andAuctionPriceGreaterThan(BigDecimal value) {
            addCriterion("auction_price >", value, "auctionPrice");
            return (Criteria) this;
        }

        public Criteria andAuctionPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("auction_price >=", value, "auctionPrice");
            return (Criteria) this;
        }

        public Criteria andAuctionPriceLessThan(BigDecimal value) {
            addCriterion("auction_price <", value, "auctionPrice");
            return (Criteria) this;
        }

        public Criteria andAuctionPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("auction_price <=", value, "auctionPrice");
            return (Criteria) this;
        }

        public Criteria andAuctionPriceIn(List<BigDecimal> values) {
            addCriterion("auction_price in", values, "auctionPrice");
            return (Criteria) this;
        }

        public Criteria andAuctionPriceNotIn(List<BigDecimal> values) {
            addCriterion("auction_price not in", values, "auctionPrice");
            return (Criteria) this;
        }

        public Criteria andAuctionPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("auction_price between", value1, value2, "auctionPrice");
            return (Criteria) this;
        }

        public Criteria andAuctionPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("auction_price not between", value1, value2, "auctionPrice");
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