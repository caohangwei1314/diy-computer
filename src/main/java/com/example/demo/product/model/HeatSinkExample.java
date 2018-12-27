package com.example.demo.product.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HeatSinkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public HeatSinkExample() {
        oredCriteria = new ArrayList<Criteria>();
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andPkIdIsNull() {
            addCriterion("pk_id is null");
            return (Criteria) this;
        }

        public Criteria andPkIdIsNotNull() {
            addCriterion("pk_id is not null");
            return (Criteria) this;
        }

        public Criteria andPkIdEqualTo(Long value) {
            addCriterion("pk_id =", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdNotEqualTo(Long value) {
            addCriterion("pk_id <>", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdGreaterThan(Long value) {
            addCriterion("pk_id >", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pk_id >=", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdLessThan(Long value) {
            addCriterion("pk_id <", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdLessThanOrEqualTo(Long value) {
            addCriterion("pk_id <=", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdIn(List<Long> values) {
            addCriterion("pk_id in", values, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdNotIn(List<Long> values) {
            addCriterion("pk_id not in", values, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdBetween(Long value1, Long value2) {
            addCriterion("pk_id between", value1, value2, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdNotBetween(Long value1, Long value2) {
            addCriterion("pk_id not between", value1, value2, "pkId");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNull() {
            addCriterion("class_id is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("class_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(Long value) {
            addCriterion("class_id =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(Long value) {
            addCriterion("class_id <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(Long value) {
            addCriterion("class_id >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(Long value) {
            addCriterion("class_id >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(Long value) {
            addCriterion("class_id <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(Long value) {
            addCriterion("class_id <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<Long> values) {
            addCriterion("class_id in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<Long> values) {
            addCriterion("class_id not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(Long value1, Long value2) {
            addCriterion("class_id between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(Long value1, Long value2) {
            addCriterion("class_id not between", value1, value2, "classId");
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

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andMothedIsNull() {
            addCriterion("mothed is null");
            return (Criteria) this;
        }

        public Criteria andMothedIsNotNull() {
            addCriterion("mothed is not null");
            return (Criteria) this;
        }

        public Criteria andMothedEqualTo(String value) {
            addCriterion("mothed =", value, "mothed");
            return (Criteria) this;
        }

        public Criteria andMothedNotEqualTo(String value) {
            addCriterion("mothed <>", value, "mothed");
            return (Criteria) this;
        }

        public Criteria andMothedGreaterThan(String value) {
            addCriterion("mothed >", value, "mothed");
            return (Criteria) this;
        }

        public Criteria andMothedGreaterThanOrEqualTo(String value) {
            addCriterion("mothed >=", value, "mothed");
            return (Criteria) this;
        }

        public Criteria andMothedLessThan(String value) {
            addCriterion("mothed <", value, "mothed");
            return (Criteria) this;
        }

        public Criteria andMothedLessThanOrEqualTo(String value) {
            addCriterion("mothed <=", value, "mothed");
            return (Criteria) this;
        }

        public Criteria andMothedLike(String value) {
            addCriterion("mothed like", value, "mothed");
            return (Criteria) this;
        }

        public Criteria andMothedNotLike(String value) {
            addCriterion("mothed not like", value, "mothed");
            return (Criteria) this;
        }

        public Criteria andMothedIn(List<String> values) {
            addCriterion("mothed in", values, "mothed");
            return (Criteria) this;
        }

        public Criteria andMothedNotIn(List<String> values) {
            addCriterion("mothed not in", values, "mothed");
            return (Criteria) this;
        }

        public Criteria andMothedBetween(String value1, String value2) {
            addCriterion("mothed between", value1, value2, "mothed");
            return (Criteria) this;
        }

        public Criteria andMothedNotBetween(String value1, String value2) {
            addCriterion("mothed not between", value1, value2, "mothed");
            return (Criteria) this;
        }

        public Criteria andScopeIsNull() {
            addCriterion("scope is null");
            return (Criteria) this;
        }

        public Criteria andScopeIsNotNull() {
            addCriterion("scope is not null");
            return (Criteria) this;
        }

        public Criteria andScopeEqualTo(String value) {
            addCriterion("scope =", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotEqualTo(String value) {
            addCriterion("scope <>", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeGreaterThan(String value) {
            addCriterion("scope >", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeGreaterThanOrEqualTo(String value) {
            addCriterion("scope >=", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLessThan(String value) {
            addCriterion("scope <", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLessThanOrEqualTo(String value) {
            addCriterion("scope <=", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLike(String value) {
            addCriterion("scope like", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotLike(String value) {
            addCriterion("scope not like", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeIn(List<String> values) {
            addCriterion("scope in", values, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotIn(List<String> values) {
            addCriterion("scope not in", values, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeBetween(String value1, String value2) {
            addCriterion("scope between", value1, value2, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotBetween(String value1, String value2) {
            addCriterion("scope not between", value1, value2, "scope");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(String value) {
            addCriterion("size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(String value) {
            addCriterion("size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(String value) {
            addCriterion("size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(String value) {
            addCriterion("size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(String value) {
            addCriterion("size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(String value) {
            addCriterion("size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLike(String value) {
            addCriterion("size like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotLike(String value) {
            addCriterion("size not like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<String> values) {
            addCriterion("size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<String> values) {
            addCriterion("size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(String value1, String value2) {
            addCriterion("size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(String value1, String value2) {
            addCriterion("size not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(String value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(String value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(String value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(String value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(String value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(String value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLike(String value) {
            addCriterion("weight like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotLike(String value) {
            addCriterion("weight not like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<String> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<String> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(String value1, String value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(String value1, String value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNull() {
            addCriterion("temperature is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNotNull() {
            addCriterion("temperature is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureEqualTo(String value) {
            addCriterion("temperature =", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotEqualTo(String value) {
            addCriterion("temperature <>", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThan(String value) {
            addCriterion("temperature >", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThanOrEqualTo(String value) {
            addCriterion("temperature >=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThan(String value) {
            addCriterion("temperature <", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThanOrEqualTo(String value) {
            addCriterion("temperature <=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLike(String value) {
            addCriterion("temperature like", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotLike(String value) {
            addCriterion("temperature not like", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureIn(List<String> values) {
            addCriterion("temperature in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotIn(List<String> values) {
            addCriterion("temperature not in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureBetween(String value1, String value2) {
            addCriterion("temperature between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotBetween(String value1, String value2) {
            addCriterion("temperature not between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andPowerParameterIsNull() {
            addCriterion("power_parameter is null");
            return (Criteria) this;
        }

        public Criteria andPowerParameterIsNotNull() {
            addCriterion("power_parameter is not null");
            return (Criteria) this;
        }

        public Criteria andPowerParameterEqualTo(String value) {
            addCriterion("power_parameter =", value, "powerParameter");
            return (Criteria) this;
        }

        public Criteria andPowerParameterNotEqualTo(String value) {
            addCriterion("power_parameter <>", value, "powerParameter");
            return (Criteria) this;
        }

        public Criteria andPowerParameterGreaterThan(String value) {
            addCriterion("power_parameter >", value, "powerParameter");
            return (Criteria) this;
        }

        public Criteria andPowerParameterGreaterThanOrEqualTo(String value) {
            addCriterion("power_parameter >=", value, "powerParameter");
            return (Criteria) this;
        }

        public Criteria andPowerParameterLessThan(String value) {
            addCriterion("power_parameter <", value, "powerParameter");
            return (Criteria) this;
        }

        public Criteria andPowerParameterLessThanOrEqualTo(String value) {
            addCriterion("power_parameter <=", value, "powerParameter");
            return (Criteria) this;
        }

        public Criteria andPowerParameterLike(String value) {
            addCriterion("power_parameter like", value, "powerParameter");
            return (Criteria) this;
        }

        public Criteria andPowerParameterNotLike(String value) {
            addCriterion("power_parameter not like", value, "powerParameter");
            return (Criteria) this;
        }

        public Criteria andPowerParameterIn(List<String> values) {
            addCriterion("power_parameter in", values, "powerParameter");
            return (Criteria) this;
        }

        public Criteria andPowerParameterNotIn(List<String> values) {
            addCriterion("power_parameter not in", values, "powerParameter");
            return (Criteria) this;
        }

        public Criteria andPowerParameterBetween(String value1, String value2) {
            addCriterion("power_parameter between", value1, value2, "powerParameter");
            return (Criteria) this;
        }

        public Criteria andPowerParameterNotBetween(String value1, String value2) {
            addCriterion("power_parameter not between", value1, value2, "powerParameter");
            return (Criteria) this;
        }

        public Criteria andInputPowerIsNull() {
            addCriterion("input_power is null");
            return (Criteria) this;
        }

        public Criteria andInputPowerIsNotNull() {
            addCriterion("input_power is not null");
            return (Criteria) this;
        }

        public Criteria andInputPowerEqualTo(String value) {
            addCriterion("input_power =", value, "inputPower");
            return (Criteria) this;
        }

        public Criteria andInputPowerNotEqualTo(String value) {
            addCriterion("input_power <>", value, "inputPower");
            return (Criteria) this;
        }

        public Criteria andInputPowerGreaterThan(String value) {
            addCriterion("input_power >", value, "inputPower");
            return (Criteria) this;
        }

        public Criteria andInputPowerGreaterThanOrEqualTo(String value) {
            addCriterion("input_power >=", value, "inputPower");
            return (Criteria) this;
        }

        public Criteria andInputPowerLessThan(String value) {
            addCriterion("input_power <", value, "inputPower");
            return (Criteria) this;
        }

        public Criteria andInputPowerLessThanOrEqualTo(String value) {
            addCriterion("input_power <=", value, "inputPower");
            return (Criteria) this;
        }

        public Criteria andInputPowerLike(String value) {
            addCriterion("input_power like", value, "inputPower");
            return (Criteria) this;
        }

        public Criteria andInputPowerNotLike(String value) {
            addCriterion("input_power not like", value, "inputPower");
            return (Criteria) this;
        }

        public Criteria andInputPowerIn(List<String> values) {
            addCriterion("input_power in", values, "inputPower");
            return (Criteria) this;
        }

        public Criteria andInputPowerNotIn(List<String> values) {
            addCriterion("input_power not in", values, "inputPower");
            return (Criteria) this;
        }

        public Criteria andInputPowerBetween(String value1, String value2) {
            addCriterion("input_power between", value1, value2, "inputPower");
            return (Criteria) this;
        }

        public Criteria andInputPowerNotBetween(String value1, String value2) {
            addCriterion("input_power not between", value1, value2, "inputPower");
            return (Criteria) this;
        }

        public Criteria andLifeIsNull() {
            addCriterion("life is null");
            return (Criteria) this;
        }

        public Criteria andLifeIsNotNull() {
            addCriterion("life is not null");
            return (Criteria) this;
        }

        public Criteria andLifeEqualTo(String value) {
            addCriterion("life =", value, "life");
            return (Criteria) this;
        }

        public Criteria andLifeNotEqualTo(String value) {
            addCriterion("life <>", value, "life");
            return (Criteria) this;
        }

        public Criteria andLifeGreaterThan(String value) {
            addCriterion("life >", value, "life");
            return (Criteria) this;
        }

        public Criteria andLifeGreaterThanOrEqualTo(String value) {
            addCriterion("life >=", value, "life");
            return (Criteria) this;
        }

        public Criteria andLifeLessThan(String value) {
            addCriterion("life <", value, "life");
            return (Criteria) this;
        }

        public Criteria andLifeLessThanOrEqualTo(String value) {
            addCriterion("life <=", value, "life");
            return (Criteria) this;
        }

        public Criteria andLifeLike(String value) {
            addCriterion("life like", value, "life");
            return (Criteria) this;
        }

        public Criteria andLifeNotLike(String value) {
            addCriterion("life not like", value, "life");
            return (Criteria) this;
        }

        public Criteria andLifeIn(List<String> values) {
            addCriterion("life in", values, "life");
            return (Criteria) this;
        }

        public Criteria andLifeNotIn(List<String> values) {
            addCriterion("life not in", values, "life");
            return (Criteria) this;
        }

        public Criteria andLifeBetween(String value1, String value2) {
            addCriterion("life between", value1, value2, "life");
            return (Criteria) this;
        }

        public Criteria andLifeNotBetween(String value1, String value2) {
            addCriterion("life not between", value1, value2, "life");
            return (Criteria) this;
        }

        public Criteria andFanSizeIsNull() {
            addCriterion("fan_size is null");
            return (Criteria) this;
        }

        public Criteria andFanSizeIsNotNull() {
            addCriterion("fan_size is not null");
            return (Criteria) this;
        }

        public Criteria andFanSizeEqualTo(String value) {
            addCriterion("fan_size =", value, "fanSize");
            return (Criteria) this;
        }

        public Criteria andFanSizeNotEqualTo(String value) {
            addCriterion("fan_size <>", value, "fanSize");
            return (Criteria) this;
        }

        public Criteria andFanSizeGreaterThan(String value) {
            addCriterion("fan_size >", value, "fanSize");
            return (Criteria) this;
        }

        public Criteria andFanSizeGreaterThanOrEqualTo(String value) {
            addCriterion("fan_size >=", value, "fanSize");
            return (Criteria) this;
        }

        public Criteria andFanSizeLessThan(String value) {
            addCriterion("fan_size <", value, "fanSize");
            return (Criteria) this;
        }

        public Criteria andFanSizeLessThanOrEqualTo(String value) {
            addCriterion("fan_size <=", value, "fanSize");
            return (Criteria) this;
        }

        public Criteria andFanSizeLike(String value) {
            addCriterion("fan_size like", value, "fanSize");
            return (Criteria) this;
        }

        public Criteria andFanSizeNotLike(String value) {
            addCriterion("fan_size not like", value, "fanSize");
            return (Criteria) this;
        }

        public Criteria andFanSizeIn(List<String> values) {
            addCriterion("fan_size in", values, "fanSize");
            return (Criteria) this;
        }

        public Criteria andFanSizeNotIn(List<String> values) {
            addCriterion("fan_size not in", values, "fanSize");
            return (Criteria) this;
        }

        public Criteria andFanSizeBetween(String value1, String value2) {
            addCriterion("fan_size between", value1, value2, "fanSize");
            return (Criteria) this;
        }

        public Criteria andFanSizeNotBetween(String value1, String value2) {
            addCriterion("fan_size not between", value1, value2, "fanSize");
            return (Criteria) this;
        }

        public Criteria andBearingTypeIsNull() {
            addCriterion("bearing_type is null");
            return (Criteria) this;
        }

        public Criteria andBearingTypeIsNotNull() {
            addCriterion("bearing_type is not null");
            return (Criteria) this;
        }

        public Criteria andBearingTypeEqualTo(String value) {
            addCriterion("bearing_type =", value, "bearingType");
            return (Criteria) this;
        }

        public Criteria andBearingTypeNotEqualTo(String value) {
            addCriterion("bearing_type <>", value, "bearingType");
            return (Criteria) this;
        }

        public Criteria andBearingTypeGreaterThan(String value) {
            addCriterion("bearing_type >", value, "bearingType");
            return (Criteria) this;
        }

        public Criteria andBearingTypeGreaterThanOrEqualTo(String value) {
            addCriterion("bearing_type >=", value, "bearingType");
            return (Criteria) this;
        }

        public Criteria andBearingTypeLessThan(String value) {
            addCriterion("bearing_type <", value, "bearingType");
            return (Criteria) this;
        }

        public Criteria andBearingTypeLessThanOrEqualTo(String value) {
            addCriterion("bearing_type <=", value, "bearingType");
            return (Criteria) this;
        }

        public Criteria andBearingTypeLike(String value) {
            addCriterion("bearing_type like", value, "bearingType");
            return (Criteria) this;
        }

        public Criteria andBearingTypeNotLike(String value) {
            addCriterion("bearing_type not like", value, "bearingType");
            return (Criteria) this;
        }

        public Criteria andBearingTypeIn(List<String> values) {
            addCriterion("bearing_type in", values, "bearingType");
            return (Criteria) this;
        }

        public Criteria andBearingTypeNotIn(List<String> values) {
            addCriterion("bearing_type not in", values, "bearingType");
            return (Criteria) this;
        }

        public Criteria andBearingTypeBetween(String value1, String value2) {
            addCriterion("bearing_type between", value1, value2, "bearingType");
            return (Criteria) this;
        }

        public Criteria andBearingTypeNotBetween(String value1, String value2) {
            addCriterion("bearing_type not between", value1, value2, "bearingType");
            return (Criteria) this;
        }

        public Criteria andMaxRevolutionIsNull() {
            addCriterion("max_revolution is null");
            return (Criteria) this;
        }

        public Criteria andMaxRevolutionIsNotNull() {
            addCriterion("max_revolution is not null");
            return (Criteria) this;
        }

        public Criteria andMaxRevolutionEqualTo(String value) {
            addCriterion("max_revolution =", value, "maxRevolution");
            return (Criteria) this;
        }

        public Criteria andMaxRevolutionNotEqualTo(String value) {
            addCriterion("max_revolution <>", value, "maxRevolution");
            return (Criteria) this;
        }

        public Criteria andMaxRevolutionGreaterThan(String value) {
            addCriterion("max_revolution >", value, "maxRevolution");
            return (Criteria) this;
        }

        public Criteria andMaxRevolutionGreaterThanOrEqualTo(String value) {
            addCriterion("max_revolution >=", value, "maxRevolution");
            return (Criteria) this;
        }

        public Criteria andMaxRevolutionLessThan(String value) {
            addCriterion("max_revolution <", value, "maxRevolution");
            return (Criteria) this;
        }

        public Criteria andMaxRevolutionLessThanOrEqualTo(String value) {
            addCriterion("max_revolution <=", value, "maxRevolution");
            return (Criteria) this;
        }

        public Criteria andMaxRevolutionLike(String value) {
            addCriterion("max_revolution like", value, "maxRevolution");
            return (Criteria) this;
        }

        public Criteria andMaxRevolutionNotLike(String value) {
            addCriterion("max_revolution not like", value, "maxRevolution");
            return (Criteria) this;
        }

        public Criteria andMaxRevolutionIn(List<String> values) {
            addCriterion("max_revolution in", values, "maxRevolution");
            return (Criteria) this;
        }

        public Criteria andMaxRevolutionNotIn(List<String> values) {
            addCriterion("max_revolution not in", values, "maxRevolution");
            return (Criteria) this;
        }

        public Criteria andMaxRevolutionBetween(String value1, String value2) {
            addCriterion("max_revolution between", value1, value2, "maxRevolution");
            return (Criteria) this;
        }

        public Criteria andMaxRevolutionNotBetween(String value1, String value2) {
            addCriterion("max_revolution not between", value1, value2, "maxRevolution");
            return (Criteria) this;
        }

        public Criteria andRevolutionDescriptionIsNull() {
            addCriterion("revolution_description is null");
            return (Criteria) this;
        }

        public Criteria andRevolutionDescriptionIsNotNull() {
            addCriterion("revolution_description is not null");
            return (Criteria) this;
        }

        public Criteria andRevolutionDescriptionEqualTo(String value) {
            addCriterion("revolution_description =", value, "revolutionDescription");
            return (Criteria) this;
        }

        public Criteria andRevolutionDescriptionNotEqualTo(String value) {
            addCriterion("revolution_description <>", value, "revolutionDescription");
            return (Criteria) this;
        }

        public Criteria andRevolutionDescriptionGreaterThan(String value) {
            addCriterion("revolution_description >", value, "revolutionDescription");
            return (Criteria) this;
        }

        public Criteria andRevolutionDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("revolution_description >=", value, "revolutionDescription");
            return (Criteria) this;
        }

        public Criteria andRevolutionDescriptionLessThan(String value) {
            addCriterion("revolution_description <", value, "revolutionDescription");
            return (Criteria) this;
        }

        public Criteria andRevolutionDescriptionLessThanOrEqualTo(String value) {
            addCriterion("revolution_description <=", value, "revolutionDescription");
            return (Criteria) this;
        }

        public Criteria andRevolutionDescriptionLike(String value) {
            addCriterion("revolution_description like", value, "revolutionDescription");
            return (Criteria) this;
        }

        public Criteria andRevolutionDescriptionNotLike(String value) {
            addCriterion("revolution_description not like", value, "revolutionDescription");
            return (Criteria) this;
        }

        public Criteria andRevolutionDescriptionIn(List<String> values) {
            addCriterion("revolution_description in", values, "revolutionDescription");
            return (Criteria) this;
        }

        public Criteria andRevolutionDescriptionNotIn(List<String> values) {
            addCriterion("revolution_description not in", values, "revolutionDescription");
            return (Criteria) this;
        }

        public Criteria andRevolutionDescriptionBetween(String value1, String value2) {
            addCriterion("revolution_description between", value1, value2, "revolutionDescription");
            return (Criteria) this;
        }

        public Criteria andRevolutionDescriptionNotBetween(String value1, String value2) {
            addCriterion("revolution_description not between", value1, value2, "revolutionDescription");
            return (Criteria) this;
        }

        public Criteria andMaxVolumeIsNull() {
            addCriterion("max_volume is null");
            return (Criteria) this;
        }

        public Criteria andMaxVolumeIsNotNull() {
            addCriterion("max_volume is not null");
            return (Criteria) this;
        }

        public Criteria andMaxVolumeEqualTo(String value) {
            addCriterion("max_volume =", value, "maxVolume");
            return (Criteria) this;
        }

        public Criteria andMaxVolumeNotEqualTo(String value) {
            addCriterion("max_volume <>", value, "maxVolume");
            return (Criteria) this;
        }

        public Criteria andMaxVolumeGreaterThan(String value) {
            addCriterion("max_volume >", value, "maxVolume");
            return (Criteria) this;
        }

        public Criteria andMaxVolumeGreaterThanOrEqualTo(String value) {
            addCriterion("max_volume >=", value, "maxVolume");
            return (Criteria) this;
        }

        public Criteria andMaxVolumeLessThan(String value) {
            addCriterion("max_volume <", value, "maxVolume");
            return (Criteria) this;
        }

        public Criteria andMaxVolumeLessThanOrEqualTo(String value) {
            addCriterion("max_volume <=", value, "maxVolume");
            return (Criteria) this;
        }

        public Criteria andMaxVolumeLike(String value) {
            addCriterion("max_volume like", value, "maxVolume");
            return (Criteria) this;
        }

        public Criteria andMaxVolumeNotLike(String value) {
            addCriterion("max_volume not like", value, "maxVolume");
            return (Criteria) this;
        }

        public Criteria andMaxVolumeIn(List<String> values) {
            addCriterion("max_volume in", values, "maxVolume");
            return (Criteria) this;
        }

        public Criteria andMaxVolumeNotIn(List<String> values) {
            addCriterion("max_volume not in", values, "maxVolume");
            return (Criteria) this;
        }

        public Criteria andMaxVolumeBetween(String value1, String value2) {
            addCriterion("max_volume between", value1, value2, "maxVolume");
            return (Criteria) this;
        }

        public Criteria andMaxVolumeNotBetween(String value1, String value2) {
            addCriterion("max_volume not between", value1, value2, "maxVolume");
            return (Criteria) this;
        }

        public Criteria andWindPressureIsNull() {
            addCriterion("wind_pressure is null");
            return (Criteria) this;
        }

        public Criteria andWindPressureIsNotNull() {
            addCriterion("wind_pressure is not null");
            return (Criteria) this;
        }

        public Criteria andWindPressureEqualTo(String value) {
            addCriterion("wind_pressure =", value, "windPressure");
            return (Criteria) this;
        }

        public Criteria andWindPressureNotEqualTo(String value) {
            addCriterion("wind_pressure <>", value, "windPressure");
            return (Criteria) this;
        }

        public Criteria andWindPressureGreaterThan(String value) {
            addCriterion("wind_pressure >", value, "windPressure");
            return (Criteria) this;
        }

        public Criteria andWindPressureGreaterThanOrEqualTo(String value) {
            addCriterion("wind_pressure >=", value, "windPressure");
            return (Criteria) this;
        }

        public Criteria andWindPressureLessThan(String value) {
            addCriterion("wind_pressure <", value, "windPressure");
            return (Criteria) this;
        }

        public Criteria andWindPressureLessThanOrEqualTo(String value) {
            addCriterion("wind_pressure <=", value, "windPressure");
            return (Criteria) this;
        }

        public Criteria andWindPressureLike(String value) {
            addCriterion("wind_pressure like", value, "windPressure");
            return (Criteria) this;
        }

        public Criteria andWindPressureNotLike(String value) {
            addCriterion("wind_pressure not like", value, "windPressure");
            return (Criteria) this;
        }

        public Criteria andWindPressureIn(List<String> values) {
            addCriterion("wind_pressure in", values, "windPressure");
            return (Criteria) this;
        }

        public Criteria andWindPressureNotIn(List<String> values) {
            addCriterion("wind_pressure not in", values, "windPressure");
            return (Criteria) this;
        }

        public Criteria andWindPressureBetween(String value1, String value2) {
            addCriterion("wind_pressure between", value1, value2, "windPressure");
            return (Criteria) this;
        }

        public Criteria andWindPressureNotBetween(String value1, String value2) {
            addCriterion("wind_pressure not between", value1, value2, "windPressure");
            return (Criteria) this;
        }

        public Criteria andNoiseIsNull() {
            addCriterion("noise is null");
            return (Criteria) this;
        }

        public Criteria andNoiseIsNotNull() {
            addCriterion("noise is not null");
            return (Criteria) this;
        }

        public Criteria andNoiseEqualTo(String value) {
            addCriterion("noise =", value, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseNotEqualTo(String value) {
            addCriterion("noise <>", value, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseGreaterThan(String value) {
            addCriterion("noise >", value, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseGreaterThanOrEqualTo(String value) {
            addCriterion("noise >=", value, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseLessThan(String value) {
            addCriterion("noise <", value, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseLessThanOrEqualTo(String value) {
            addCriterion("noise <=", value, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseLike(String value) {
            addCriterion("noise like", value, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseNotLike(String value) {
            addCriterion("noise not like", value, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseIn(List<String> values) {
            addCriterion("noise in", values, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseNotIn(List<String> values) {
            addCriterion("noise not in", values, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseBetween(String value1, String value2) {
            addCriterion("noise between", value1, value2, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseNotBetween(String value1, String value2) {
            addCriterion("noise not between", value1, value2, "noise");
            return (Criteria) this;
        }

        public Criteria andHeatPipesIsNull() {
            addCriterion("heat_pipes is null");
            return (Criteria) this;
        }

        public Criteria andHeatPipesIsNotNull() {
            addCriterion("heat_pipes is not null");
            return (Criteria) this;
        }

        public Criteria andHeatPipesEqualTo(String value) {
            addCriterion("heat_pipes =", value, "heatPipes");
            return (Criteria) this;
        }

        public Criteria andHeatPipesNotEqualTo(String value) {
            addCriterion("heat_pipes <>", value, "heatPipes");
            return (Criteria) this;
        }

        public Criteria andHeatPipesGreaterThan(String value) {
            addCriterion("heat_pipes >", value, "heatPipes");
            return (Criteria) this;
        }

        public Criteria andHeatPipesGreaterThanOrEqualTo(String value) {
            addCriterion("heat_pipes >=", value, "heatPipes");
            return (Criteria) this;
        }

        public Criteria andHeatPipesLessThan(String value) {
            addCriterion("heat_pipes <", value, "heatPipes");
            return (Criteria) this;
        }

        public Criteria andHeatPipesLessThanOrEqualTo(String value) {
            addCriterion("heat_pipes <=", value, "heatPipes");
            return (Criteria) this;
        }

        public Criteria andHeatPipesLike(String value) {
            addCriterion("heat_pipes like", value, "heatPipes");
            return (Criteria) this;
        }

        public Criteria andHeatPipesNotLike(String value) {
            addCriterion("heat_pipes not like", value, "heatPipes");
            return (Criteria) this;
        }

        public Criteria andHeatPipesIn(List<String> values) {
            addCriterion("heat_pipes in", values, "heatPipes");
            return (Criteria) this;
        }

        public Criteria andHeatPipesNotIn(List<String> values) {
            addCriterion("heat_pipes not in", values, "heatPipes");
            return (Criteria) this;
        }

        public Criteria andHeatPipesBetween(String value1, String value2) {
            addCriterion("heat_pipes between", value1, value2, "heatPipes");
            return (Criteria) this;
        }

        public Criteria andHeatPipesNotBetween(String value1, String value2) {
            addCriterion("heat_pipes not between", value1, value2, "heatPipes");
            return (Criteria) this;
        }

        public Criteria andPipesMaterialIsNull() {
            addCriterion("pipes_material is null");
            return (Criteria) this;
        }

        public Criteria andPipesMaterialIsNotNull() {
            addCriterion("pipes_material is not null");
            return (Criteria) this;
        }

        public Criteria andPipesMaterialEqualTo(String value) {
            addCriterion("pipes_material =", value, "pipesMaterial");
            return (Criteria) this;
        }

        public Criteria andPipesMaterialNotEqualTo(String value) {
            addCriterion("pipes_material <>", value, "pipesMaterial");
            return (Criteria) this;
        }

        public Criteria andPipesMaterialGreaterThan(String value) {
            addCriterion("pipes_material >", value, "pipesMaterial");
            return (Criteria) this;
        }

        public Criteria andPipesMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("pipes_material >=", value, "pipesMaterial");
            return (Criteria) this;
        }

        public Criteria andPipesMaterialLessThan(String value) {
            addCriterion("pipes_material <", value, "pipesMaterial");
            return (Criteria) this;
        }

        public Criteria andPipesMaterialLessThanOrEqualTo(String value) {
            addCriterion("pipes_material <=", value, "pipesMaterial");
            return (Criteria) this;
        }

        public Criteria andPipesMaterialLike(String value) {
            addCriterion("pipes_material like", value, "pipesMaterial");
            return (Criteria) this;
        }

        public Criteria andPipesMaterialNotLike(String value) {
            addCriterion("pipes_material not like", value, "pipesMaterial");
            return (Criteria) this;
        }

        public Criteria andPipesMaterialIn(List<String> values) {
            addCriterion("pipes_material in", values, "pipesMaterial");
            return (Criteria) this;
        }

        public Criteria andPipesMaterialNotIn(List<String> values) {
            addCriterion("pipes_material not in", values, "pipesMaterial");
            return (Criteria) this;
        }

        public Criteria andPipesMaterialBetween(String value1, String value2) {
            addCriterion("pipes_material between", value1, value2, "pipesMaterial");
            return (Criteria) this;
        }

        public Criteria andPipesMaterialNotBetween(String value1, String value2) {
            addCriterion("pipes_material not between", value1, value2, "pipesMaterial");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }
    }

    /**
     */
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