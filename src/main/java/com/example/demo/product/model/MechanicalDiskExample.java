package com.example.demo.product.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MechanicalDiskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public MechanicalDiskExample() {
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

        public Criteria andAppropriateTypeIsNull() {
            addCriterion("appropriate_type is null");
            return (Criteria) this;
        }

        public Criteria andAppropriateTypeIsNotNull() {
            addCriterion("appropriate_type is not null");
            return (Criteria) this;
        }

        public Criteria andAppropriateTypeEqualTo(String value) {
            addCriterion("appropriate_type =", value, "appropriateType");
            return (Criteria) this;
        }

        public Criteria andAppropriateTypeNotEqualTo(String value) {
            addCriterion("appropriate_type <>", value, "appropriateType");
            return (Criteria) this;
        }

        public Criteria andAppropriateTypeGreaterThan(String value) {
            addCriterion("appropriate_type >", value, "appropriateType");
            return (Criteria) this;
        }

        public Criteria andAppropriateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("appropriate_type >=", value, "appropriateType");
            return (Criteria) this;
        }

        public Criteria andAppropriateTypeLessThan(String value) {
            addCriterion("appropriate_type <", value, "appropriateType");
            return (Criteria) this;
        }

        public Criteria andAppropriateTypeLessThanOrEqualTo(String value) {
            addCriterion("appropriate_type <=", value, "appropriateType");
            return (Criteria) this;
        }

        public Criteria andAppropriateTypeLike(String value) {
            addCriterion("appropriate_type like", value, "appropriateType");
            return (Criteria) this;
        }

        public Criteria andAppropriateTypeNotLike(String value) {
            addCriterion("appropriate_type not like", value, "appropriateType");
            return (Criteria) this;
        }

        public Criteria andAppropriateTypeIn(List<String> values) {
            addCriterion("appropriate_type in", values, "appropriateType");
            return (Criteria) this;
        }

        public Criteria andAppropriateTypeNotIn(List<String> values) {
            addCriterion("appropriate_type not in", values, "appropriateType");
            return (Criteria) this;
        }

        public Criteria andAppropriateTypeBetween(String value1, String value2) {
            addCriterion("appropriate_type between", value1, value2, "appropriateType");
            return (Criteria) this;
        }

        public Criteria andAppropriateTypeNotBetween(String value1, String value2) {
            addCriterion("appropriate_type not between", value1, value2, "appropriateType");
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

        public Criteria andCapacityIsNull() {
            addCriterion("capacity is null");
            return (Criteria) this;
        }

        public Criteria andCapacityIsNotNull() {
            addCriterion("capacity is not null");
            return (Criteria) this;
        }

        public Criteria andCapacityEqualTo(String value) {
            addCriterion("capacity =", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotEqualTo(String value) {
            addCriterion("capacity <>", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityGreaterThan(String value) {
            addCriterion("capacity >", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityGreaterThanOrEqualTo(String value) {
            addCriterion("capacity >=", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityLessThan(String value) {
            addCriterion("capacity <", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityLessThanOrEqualTo(String value) {
            addCriterion("capacity <=", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityLike(String value) {
            addCriterion("capacity like", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotLike(String value) {
            addCriterion("capacity not like", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityIn(List<String> values) {
            addCriterion("capacity in", values, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotIn(List<String> values) {
            addCriterion("capacity not in", values, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityBetween(String value1, String value2) {
            addCriterion("capacity between", value1, value2, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotBetween(String value1, String value2) {
            addCriterion("capacity not between", value1, value2, "capacity");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andSingleCapacityIsNull() {
            addCriterion("single_capacity is null");
            return (Criteria) this;
        }

        public Criteria andSingleCapacityIsNotNull() {
            addCriterion("single_capacity is not null");
            return (Criteria) this;
        }

        public Criteria andSingleCapacityEqualTo(String value) {
            addCriterion("single_capacity =", value, "singleCapacity");
            return (Criteria) this;
        }

        public Criteria andSingleCapacityNotEqualTo(String value) {
            addCriterion("single_capacity <>", value, "singleCapacity");
            return (Criteria) this;
        }

        public Criteria andSingleCapacityGreaterThan(String value) {
            addCriterion("single_capacity >", value, "singleCapacity");
            return (Criteria) this;
        }

        public Criteria andSingleCapacityGreaterThanOrEqualTo(String value) {
            addCriterion("single_capacity >=", value, "singleCapacity");
            return (Criteria) this;
        }

        public Criteria andSingleCapacityLessThan(String value) {
            addCriterion("single_capacity <", value, "singleCapacity");
            return (Criteria) this;
        }

        public Criteria andSingleCapacityLessThanOrEqualTo(String value) {
            addCriterion("single_capacity <=", value, "singleCapacity");
            return (Criteria) this;
        }

        public Criteria andSingleCapacityLike(String value) {
            addCriterion("single_capacity like", value, "singleCapacity");
            return (Criteria) this;
        }

        public Criteria andSingleCapacityNotLike(String value) {
            addCriterion("single_capacity not like", value, "singleCapacity");
            return (Criteria) this;
        }

        public Criteria andSingleCapacityIn(List<String> values) {
            addCriterion("single_capacity in", values, "singleCapacity");
            return (Criteria) this;
        }

        public Criteria andSingleCapacityNotIn(List<String> values) {
            addCriterion("single_capacity not in", values, "singleCapacity");
            return (Criteria) this;
        }

        public Criteria andSingleCapacityBetween(String value1, String value2) {
            addCriterion("single_capacity between", value1, value2, "singleCapacity");
            return (Criteria) this;
        }

        public Criteria andSingleCapacityNotBetween(String value1, String value2) {
            addCriterion("single_capacity not between", value1, value2, "singleCapacity");
            return (Criteria) this;
        }

        public Criteria andCacheIsNull() {
            addCriterion("cache is null");
            return (Criteria) this;
        }

        public Criteria andCacheIsNotNull() {
            addCriterion("cache is not null");
            return (Criteria) this;
        }

        public Criteria andCacheEqualTo(String value) {
            addCriterion("cache =", value, "cache");
            return (Criteria) this;
        }

        public Criteria andCacheNotEqualTo(String value) {
            addCriterion("cache <>", value, "cache");
            return (Criteria) this;
        }

        public Criteria andCacheGreaterThan(String value) {
            addCriterion("cache >", value, "cache");
            return (Criteria) this;
        }

        public Criteria andCacheGreaterThanOrEqualTo(String value) {
            addCriterion("cache >=", value, "cache");
            return (Criteria) this;
        }

        public Criteria andCacheLessThan(String value) {
            addCriterion("cache <", value, "cache");
            return (Criteria) this;
        }

        public Criteria andCacheLessThanOrEqualTo(String value) {
            addCriterion("cache <=", value, "cache");
            return (Criteria) this;
        }

        public Criteria andCacheLike(String value) {
            addCriterion("cache like", value, "cache");
            return (Criteria) this;
        }

        public Criteria andCacheNotLike(String value) {
            addCriterion("cache not like", value, "cache");
            return (Criteria) this;
        }

        public Criteria andCacheIn(List<String> values) {
            addCriterion("cache in", values, "cache");
            return (Criteria) this;
        }

        public Criteria andCacheNotIn(List<String> values) {
            addCriterion("cache not in", values, "cache");
            return (Criteria) this;
        }

        public Criteria andCacheBetween(String value1, String value2) {
            addCriterion("cache between", value1, value2, "cache");
            return (Criteria) this;
        }

        public Criteria andCacheNotBetween(String value1, String value2) {
            addCriterion("cache not between", value1, value2, "cache");
            return (Criteria) this;
        }

        public Criteria andRotatingSpeedIsNull() {
            addCriterion("rotating_speed is null");
            return (Criteria) this;
        }

        public Criteria andRotatingSpeedIsNotNull() {
            addCriterion("rotating_speed is not null");
            return (Criteria) this;
        }

        public Criteria andRotatingSpeedEqualTo(String value) {
            addCriterion("rotating_speed =", value, "rotatingSpeed");
            return (Criteria) this;
        }

        public Criteria andRotatingSpeedNotEqualTo(String value) {
            addCriterion("rotating_speed <>", value, "rotatingSpeed");
            return (Criteria) this;
        }

        public Criteria andRotatingSpeedGreaterThan(String value) {
            addCriterion("rotating_speed >", value, "rotatingSpeed");
            return (Criteria) this;
        }

        public Criteria andRotatingSpeedGreaterThanOrEqualTo(String value) {
            addCriterion("rotating_speed >=", value, "rotatingSpeed");
            return (Criteria) this;
        }

        public Criteria andRotatingSpeedLessThan(String value) {
            addCriterion("rotating_speed <", value, "rotatingSpeed");
            return (Criteria) this;
        }

        public Criteria andRotatingSpeedLessThanOrEqualTo(String value) {
            addCriterion("rotating_speed <=", value, "rotatingSpeed");
            return (Criteria) this;
        }

        public Criteria andRotatingSpeedLike(String value) {
            addCriterion("rotating_speed like", value, "rotatingSpeed");
            return (Criteria) this;
        }

        public Criteria andRotatingSpeedNotLike(String value) {
            addCriterion("rotating_speed not like", value, "rotatingSpeed");
            return (Criteria) this;
        }

        public Criteria andRotatingSpeedIn(List<String> values) {
            addCriterion("rotating_speed in", values, "rotatingSpeed");
            return (Criteria) this;
        }

        public Criteria andRotatingSpeedNotIn(List<String> values) {
            addCriterion("rotating_speed not in", values, "rotatingSpeed");
            return (Criteria) this;
        }

        public Criteria andRotatingSpeedBetween(String value1, String value2) {
            addCriterion("rotating_speed between", value1, value2, "rotatingSpeed");
            return (Criteria) this;
        }

        public Criteria andRotatingSpeedNotBetween(String value1, String value2) {
            addCriterion("rotating_speed not between", value1, value2, "rotatingSpeed");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeIsNull() {
            addCriterion("interface_type is null");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeIsNotNull() {
            addCriterion("interface_type is not null");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeEqualTo(String value) {
            addCriterion("interface_type =", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeNotEqualTo(String value) {
            addCriterion("interface_type <>", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeGreaterThan(String value) {
            addCriterion("interface_type >", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("interface_type >=", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeLessThan(String value) {
            addCriterion("interface_type <", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeLessThanOrEqualTo(String value) {
            addCriterion("interface_type <=", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeLike(String value) {
            addCriterion("interface_type like", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeNotLike(String value) {
            addCriterion("interface_type not like", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeIn(List<String> values) {
            addCriterion("interface_type in", values, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeNotIn(List<String> values) {
            addCriterion("interface_type not in", values, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeBetween(String value1, String value2) {
            addCriterion("interface_type between", value1, value2, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeNotBetween(String value1, String value2) {
            addCriterion("interface_type not between", value1, value2, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceSpeedIsNull() {
            addCriterion("interface_speed is null");
            return (Criteria) this;
        }

        public Criteria andInterfaceSpeedIsNotNull() {
            addCriterion("interface_speed is not null");
            return (Criteria) this;
        }

        public Criteria andInterfaceSpeedEqualTo(String value) {
            addCriterion("interface_speed =", value, "interfaceSpeed");
            return (Criteria) this;
        }

        public Criteria andInterfaceSpeedNotEqualTo(String value) {
            addCriterion("interface_speed <>", value, "interfaceSpeed");
            return (Criteria) this;
        }

        public Criteria andInterfaceSpeedGreaterThan(String value) {
            addCriterion("interface_speed >", value, "interfaceSpeed");
            return (Criteria) this;
        }

        public Criteria andInterfaceSpeedGreaterThanOrEqualTo(String value) {
            addCriterion("interface_speed >=", value, "interfaceSpeed");
            return (Criteria) this;
        }

        public Criteria andInterfaceSpeedLessThan(String value) {
            addCriterion("interface_speed <", value, "interfaceSpeed");
            return (Criteria) this;
        }

        public Criteria andInterfaceSpeedLessThanOrEqualTo(String value) {
            addCriterion("interface_speed <=", value, "interfaceSpeed");
            return (Criteria) this;
        }

        public Criteria andInterfaceSpeedLike(String value) {
            addCriterion("interface_speed like", value, "interfaceSpeed");
            return (Criteria) this;
        }

        public Criteria andInterfaceSpeedNotLike(String value) {
            addCriterion("interface_speed not like", value, "interfaceSpeed");
            return (Criteria) this;
        }

        public Criteria andInterfaceSpeedIn(List<String> values) {
            addCriterion("interface_speed in", values, "interfaceSpeed");
            return (Criteria) this;
        }

        public Criteria andInterfaceSpeedNotIn(List<String> values) {
            addCriterion("interface_speed not in", values, "interfaceSpeed");
            return (Criteria) this;
        }

        public Criteria andInterfaceSpeedBetween(String value1, String value2) {
            addCriterion("interface_speed between", value1, value2, "interfaceSpeed");
            return (Criteria) this;
        }

        public Criteria andInterfaceSpeedNotBetween(String value1, String value2) {
            addCriterion("interface_speed not between", value1, value2, "interfaceSpeed");
            return (Criteria) this;
        }

        public Criteria andExternalRateIsNull() {
            addCriterion("external_rate is null");
            return (Criteria) this;
        }

        public Criteria andExternalRateIsNotNull() {
            addCriterion("external_rate is not null");
            return (Criteria) this;
        }

        public Criteria andExternalRateEqualTo(String value) {
            addCriterion("external_rate =", value, "externalRate");
            return (Criteria) this;
        }

        public Criteria andExternalRateNotEqualTo(String value) {
            addCriterion("external_rate <>", value, "externalRate");
            return (Criteria) this;
        }

        public Criteria andExternalRateGreaterThan(String value) {
            addCriterion("external_rate >", value, "externalRate");
            return (Criteria) this;
        }

        public Criteria andExternalRateGreaterThanOrEqualTo(String value) {
            addCriterion("external_rate >=", value, "externalRate");
            return (Criteria) this;
        }

        public Criteria andExternalRateLessThan(String value) {
            addCriterion("external_rate <", value, "externalRate");
            return (Criteria) this;
        }

        public Criteria andExternalRateLessThanOrEqualTo(String value) {
            addCriterion("external_rate <=", value, "externalRate");
            return (Criteria) this;
        }

        public Criteria andExternalRateLike(String value) {
            addCriterion("external_rate like", value, "externalRate");
            return (Criteria) this;
        }

        public Criteria andExternalRateNotLike(String value) {
            addCriterion("external_rate not like", value, "externalRate");
            return (Criteria) this;
        }

        public Criteria andExternalRateIn(List<String> values) {
            addCriterion("external_rate in", values, "externalRate");
            return (Criteria) this;
        }

        public Criteria andExternalRateNotIn(List<String> values) {
            addCriterion("external_rate not in", values, "externalRate");
            return (Criteria) this;
        }

        public Criteria andExternalRateBetween(String value1, String value2) {
            addCriterion("external_rate between", value1, value2, "externalRate");
            return (Criteria) this;
        }

        public Criteria andExternalRateNotBetween(String value1, String value2) {
            addCriterion("external_rate not between", value1, value2, "externalRate");
            return (Criteria) this;
        }

        public Criteria andPowerIsNull() {
            addCriterion("power is null");
            return (Criteria) this;
        }

        public Criteria andPowerIsNotNull() {
            addCriterion("power is not null");
            return (Criteria) this;
        }

        public Criteria andPowerEqualTo(String value) {
            addCriterion("power =", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotEqualTo(String value) {
            addCriterion("power <>", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThan(String value) {
            addCriterion("power >", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThanOrEqualTo(String value) {
            addCriterion("power >=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThan(String value) {
            addCriterion("power <", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThanOrEqualTo(String value) {
            addCriterion("power <=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLike(String value) {
            addCriterion("power like", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotLike(String value) {
            addCriterion("power not like", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerIn(List<String> values) {
            addCriterion("power in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotIn(List<String> values) {
            addCriterion("power not in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerBetween(String value1, String value2) {
            addCriterion("power between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotBetween(String value1, String value2) {
            addCriterion("power not between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andNoiseyIsNull() {
            addCriterion("noisey is null");
            return (Criteria) this;
        }

        public Criteria andNoiseyIsNotNull() {
            addCriterion("noisey is not null");
            return (Criteria) this;
        }

        public Criteria andNoiseyEqualTo(String value) {
            addCriterion("noisey =", value, "noisey");
            return (Criteria) this;
        }

        public Criteria andNoiseyNotEqualTo(String value) {
            addCriterion("noisey <>", value, "noisey");
            return (Criteria) this;
        }

        public Criteria andNoiseyGreaterThan(String value) {
            addCriterion("noisey >", value, "noisey");
            return (Criteria) this;
        }

        public Criteria andNoiseyGreaterThanOrEqualTo(String value) {
            addCriterion("noisey >=", value, "noisey");
            return (Criteria) this;
        }

        public Criteria andNoiseyLessThan(String value) {
            addCriterion("noisey <", value, "noisey");
            return (Criteria) this;
        }

        public Criteria andNoiseyLessThanOrEqualTo(String value) {
            addCriterion("noisey <=", value, "noisey");
            return (Criteria) this;
        }

        public Criteria andNoiseyLike(String value) {
            addCriterion("noisey like", value, "noisey");
            return (Criteria) this;
        }

        public Criteria andNoiseyNotLike(String value) {
            addCriterion("noisey not like", value, "noisey");
            return (Criteria) this;
        }

        public Criteria andNoiseyIn(List<String> values) {
            addCriterion("noisey in", values, "noisey");
            return (Criteria) this;
        }

        public Criteria andNoiseyNotIn(List<String> values) {
            addCriterion("noisey not in", values, "noisey");
            return (Criteria) this;
        }

        public Criteria andNoiseyBetween(String value1, String value2) {
            addCriterion("noisey between", value1, value2, "noisey");
            return (Criteria) this;
        }

        public Criteria andNoiseyNotBetween(String value1, String value2) {
            addCriterion("noisey not between", value1, value2, "noisey");
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