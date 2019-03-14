package com.example.demo.product.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SsdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public SsdExample() {
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

        public Criteria andPositioningIsNull() {
            addCriterion("positioning is null");
            return (Criteria) this;
        }

        public Criteria andPositioningIsNotNull() {
            addCriterion("positioning is not null");
            return (Criteria) this;
        }

        public Criteria andPositioningEqualTo(String value) {
            addCriterion("positioning =", value, "positioning");
            return (Criteria) this;
        }

        public Criteria andPositioningNotEqualTo(String value) {
            addCriterion("positioning <>", value, "positioning");
            return (Criteria) this;
        }

        public Criteria andPositioningGreaterThan(String value) {
            addCriterion("positioning >", value, "positioning");
            return (Criteria) this;
        }

        public Criteria andPositioningGreaterThanOrEqualTo(String value) {
            addCriterion("positioning >=", value, "positioning");
            return (Criteria) this;
        }

        public Criteria andPositioningLessThan(String value) {
            addCriterion("positioning <", value, "positioning");
            return (Criteria) this;
        }

        public Criteria andPositioningLessThanOrEqualTo(String value) {
            addCriterion("positioning <=", value, "positioning");
            return (Criteria) this;
        }

        public Criteria andPositioningLike(String value) {
            addCriterion("positioning like", value, "positioning");
            return (Criteria) this;
        }

        public Criteria andPositioningNotLike(String value) {
            addCriterion("positioning not like", value, "positioning");
            return (Criteria) this;
        }

        public Criteria andPositioningIn(List<String> values) {
            addCriterion("positioning in", values, "positioning");
            return (Criteria) this;
        }

        public Criteria andPositioningNotIn(List<String> values) {
            addCriterion("positioning not in", values, "positioning");
            return (Criteria) this;
        }

        public Criteria andPositioningBetween(String value1, String value2) {
            addCriterion("positioning between", value1, value2, "positioning");
            return (Criteria) this;
        }

        public Criteria andPositioningNotBetween(String value1, String value2) {
            addCriterion("positioning not between", value1, value2, "positioning");
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

        public Criteria andArchitectureIsNull() {
            addCriterion("architecture is null");
            return (Criteria) this;
        }

        public Criteria andArchitectureIsNotNull() {
            addCriterion("architecture is not null");
            return (Criteria) this;
        }

        public Criteria andArchitectureEqualTo(String value) {
            addCriterion("architecture =", value, "architecture");
            return (Criteria) this;
        }

        public Criteria andArchitectureNotEqualTo(String value) {
            addCriterion("architecture <>", value, "architecture");
            return (Criteria) this;
        }

        public Criteria andArchitectureGreaterThan(String value) {
            addCriterion("architecture >", value, "architecture");
            return (Criteria) this;
        }

        public Criteria andArchitectureGreaterThanOrEqualTo(String value) {
            addCriterion("architecture >=", value, "architecture");
            return (Criteria) this;
        }

        public Criteria andArchitectureLessThan(String value) {
            addCriterion("architecture <", value, "architecture");
            return (Criteria) this;
        }

        public Criteria andArchitectureLessThanOrEqualTo(String value) {
            addCriterion("architecture <=", value, "architecture");
            return (Criteria) this;
        }

        public Criteria andArchitectureLike(String value) {
            addCriterion("architecture like", value, "architecture");
            return (Criteria) this;
        }

        public Criteria andArchitectureNotLike(String value) {
            addCriterion("architecture not like", value, "architecture");
            return (Criteria) this;
        }

        public Criteria andArchitectureIn(List<String> values) {
            addCriterion("architecture in", values, "architecture");
            return (Criteria) this;
        }

        public Criteria andArchitectureNotIn(List<String> values) {
            addCriterion("architecture not in", values, "architecture");
            return (Criteria) this;
        }

        public Criteria andArchitectureBetween(String value1, String value2) {
            addCriterion("architecture between", value1, value2, "architecture");
            return (Criteria) this;
        }

        public Criteria andArchitectureNotBetween(String value1, String value2) {
            addCriterion("architecture not between", value1, value2, "architecture");
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

        public Criteria andMasterChipIsNull() {
            addCriterion("master_chip is null");
            return (Criteria) this;
        }

        public Criteria andMasterChipIsNotNull() {
            addCriterion("master_chip is not null");
            return (Criteria) this;
        }

        public Criteria andMasterChipEqualTo(String value) {
            addCriterion("master_chip =", value, "masterChip");
            return (Criteria) this;
        }

        public Criteria andMasterChipNotEqualTo(String value) {
            addCriterion("master_chip <>", value, "masterChip");
            return (Criteria) this;
        }

        public Criteria andMasterChipGreaterThan(String value) {
            addCriterion("master_chip >", value, "masterChip");
            return (Criteria) this;
        }

        public Criteria andMasterChipGreaterThanOrEqualTo(String value) {
            addCriterion("master_chip >=", value, "masterChip");
            return (Criteria) this;
        }

        public Criteria andMasterChipLessThan(String value) {
            addCriterion("master_chip <", value, "masterChip");
            return (Criteria) this;
        }

        public Criteria andMasterChipLessThanOrEqualTo(String value) {
            addCriterion("master_chip <=", value, "masterChip");
            return (Criteria) this;
        }

        public Criteria andMasterChipLike(String value) {
            addCriterion("master_chip like", value, "masterChip");
            return (Criteria) this;
        }

        public Criteria andMasterChipNotLike(String value) {
            addCriterion("master_chip not like", value, "masterChip");
            return (Criteria) this;
        }

        public Criteria andMasterChipIn(List<String> values) {
            addCriterion("master_chip in", values, "masterChip");
            return (Criteria) this;
        }

        public Criteria andMasterChipNotIn(List<String> values) {
            addCriterion("master_chip not in", values, "masterChip");
            return (Criteria) this;
        }

        public Criteria andMasterChipBetween(String value1, String value2) {
            addCriterion("master_chip between", value1, value2, "masterChip");
            return (Criteria) this;
        }

        public Criteria andMasterChipNotBetween(String value1, String value2) {
            addCriterion("master_chip not between", value1, value2, "masterChip");
            return (Criteria) this;
        }

        public Criteria andRwSpeedIsNull() {
            addCriterion("rw_speed is null");
            return (Criteria) this;
        }

        public Criteria andRwSpeedIsNotNull() {
            addCriterion("rw_speed is not null");
            return (Criteria) this;
        }

        public Criteria andRwSpeedEqualTo(String value) {
            addCriterion("rw_speed =", value, "rwSpeed");
            return (Criteria) this;
        }

        public Criteria andRwSpeedNotEqualTo(String value) {
            addCriterion("rw_speed <>", value, "rwSpeed");
            return (Criteria) this;
        }

        public Criteria andRwSpeedGreaterThan(String value) {
            addCriterion("rw_speed >", value, "rwSpeed");
            return (Criteria) this;
        }

        public Criteria andRwSpeedGreaterThanOrEqualTo(String value) {
            addCriterion("rw_speed >=", value, "rwSpeed");
            return (Criteria) this;
        }

        public Criteria andRwSpeedLessThan(String value) {
            addCriterion("rw_speed <", value, "rwSpeed");
            return (Criteria) this;
        }

        public Criteria andRwSpeedLessThanOrEqualTo(String value) {
            addCriterion("rw_speed <=", value, "rwSpeed");
            return (Criteria) this;
        }

        public Criteria andRwSpeedLike(String value) {
            addCriterion("rw_speed like", value, "rwSpeed");
            return (Criteria) this;
        }

        public Criteria andRwSpeedNotLike(String value) {
            addCriterion("rw_speed not like", value, "rwSpeed");
            return (Criteria) this;
        }

        public Criteria andRwSpeedIn(List<String> values) {
            addCriterion("rw_speed in", values, "rwSpeed");
            return (Criteria) this;
        }

        public Criteria andRwSpeedNotIn(List<String> values) {
            addCriterion("rw_speed not in", values, "rwSpeed");
            return (Criteria) this;
        }

        public Criteria andRwSpeedBetween(String value1, String value2) {
            addCriterion("rw_speed between", value1, value2, "rwSpeed");
            return (Criteria) this;
        }

        public Criteria andRwSpeedNotBetween(String value1, String value2) {
            addCriterion("rw_speed not between", value1, value2, "rwSpeed");
            return (Criteria) this;
        }

        public Criteria andWriteSpeedIsNull() {
            addCriterion("write_speed is null");
            return (Criteria) this;
        }

        public Criteria andWriteSpeedIsNotNull() {
            addCriterion("write_speed is not null");
            return (Criteria) this;
        }

        public Criteria andWriteSpeedEqualTo(String value) {
            addCriterion("write_speed =", value, "writeSpeed");
            return (Criteria) this;
        }

        public Criteria andWriteSpeedNotEqualTo(String value) {
            addCriterion("write_speed <>", value, "writeSpeed");
            return (Criteria) this;
        }

        public Criteria andWriteSpeedGreaterThan(String value) {
            addCriterion("write_speed >", value, "writeSpeed");
            return (Criteria) this;
        }

        public Criteria andWriteSpeedGreaterThanOrEqualTo(String value) {
            addCriterion("write_speed >=", value, "writeSpeed");
            return (Criteria) this;
        }

        public Criteria andWriteSpeedLessThan(String value) {
            addCriterion("write_speed <", value, "writeSpeed");
            return (Criteria) this;
        }

        public Criteria andWriteSpeedLessThanOrEqualTo(String value) {
            addCriterion("write_speed <=", value, "writeSpeed");
            return (Criteria) this;
        }

        public Criteria andWriteSpeedLike(String value) {
            addCriterion("write_speed like", value, "writeSpeed");
            return (Criteria) this;
        }

        public Criteria andWriteSpeedNotLike(String value) {
            addCriterion("write_speed not like", value, "writeSpeed");
            return (Criteria) this;
        }

        public Criteria andWriteSpeedIn(List<String> values) {
            addCriterion("write_speed in", values, "writeSpeed");
            return (Criteria) this;
        }

        public Criteria andWriteSpeedNotIn(List<String> values) {
            addCriterion("write_speed not in", values, "writeSpeed");
            return (Criteria) this;
        }

        public Criteria andWriteSpeedBetween(String value1, String value2) {
            addCriterion("write_speed between", value1, value2, "writeSpeed");
            return (Criteria) this;
        }

        public Criteria andWriteSpeedNotBetween(String value1, String value2) {
            addCriterion("write_speed not between", value1, value2, "writeSpeed");
            return (Criteria) this;
        }

        public Criteria andIopsReadIsNull() {
            addCriterion("iops_read is null");
            return (Criteria) this;
        }

        public Criteria andIopsReadIsNotNull() {
            addCriterion("iops_read is not null");
            return (Criteria) this;
        }

        public Criteria andIopsReadEqualTo(String value) {
            addCriterion("iops_read =", value, "iopsRead");
            return (Criteria) this;
        }

        public Criteria andIopsReadNotEqualTo(String value) {
            addCriterion("iops_read <>", value, "iopsRead");
            return (Criteria) this;
        }

        public Criteria andIopsReadGreaterThan(String value) {
            addCriterion("iops_read >", value, "iopsRead");
            return (Criteria) this;
        }

        public Criteria andIopsReadGreaterThanOrEqualTo(String value) {
            addCriterion("iops_read >=", value, "iopsRead");
            return (Criteria) this;
        }

        public Criteria andIopsReadLessThan(String value) {
            addCriterion("iops_read <", value, "iopsRead");
            return (Criteria) this;
        }

        public Criteria andIopsReadLessThanOrEqualTo(String value) {
            addCriterion("iops_read <=", value, "iopsRead");
            return (Criteria) this;
        }

        public Criteria andIopsReadLike(String value) {
            addCriterion("iops_read like", value, "iopsRead");
            return (Criteria) this;
        }

        public Criteria andIopsReadNotLike(String value) {
            addCriterion("iops_read not like", value, "iopsRead");
            return (Criteria) this;
        }

        public Criteria andIopsReadIn(List<String> values) {
            addCriterion("iops_read in", values, "iopsRead");
            return (Criteria) this;
        }

        public Criteria andIopsReadNotIn(List<String> values) {
            addCriterion("iops_read not in", values, "iopsRead");
            return (Criteria) this;
        }

        public Criteria andIopsReadBetween(String value1, String value2) {
            addCriterion("iops_read between", value1, value2, "iopsRead");
            return (Criteria) this;
        }

        public Criteria andIopsReadNotBetween(String value1, String value2) {
            addCriterion("iops_read not between", value1, value2, "iopsRead");
            return (Criteria) this;
        }

        public Criteria andIopsWriteIsNull() {
            addCriterion("iops_write is null");
            return (Criteria) this;
        }

        public Criteria andIopsWriteIsNotNull() {
            addCriterion("iops_write is not null");
            return (Criteria) this;
        }

        public Criteria andIopsWriteEqualTo(String value) {
            addCriterion("iops_write =", value, "iopsWrite");
            return (Criteria) this;
        }

        public Criteria andIopsWriteNotEqualTo(String value) {
            addCriterion("iops_write <>", value, "iopsWrite");
            return (Criteria) this;
        }

        public Criteria andIopsWriteGreaterThan(String value) {
            addCriterion("iops_write >", value, "iopsWrite");
            return (Criteria) this;
        }

        public Criteria andIopsWriteGreaterThanOrEqualTo(String value) {
            addCriterion("iops_write >=", value, "iopsWrite");
            return (Criteria) this;
        }

        public Criteria andIopsWriteLessThan(String value) {
            addCriterion("iops_write <", value, "iopsWrite");
            return (Criteria) this;
        }

        public Criteria andIopsWriteLessThanOrEqualTo(String value) {
            addCriterion("iops_write <=", value, "iopsWrite");
            return (Criteria) this;
        }

        public Criteria andIopsWriteLike(String value) {
            addCriterion("iops_write like", value, "iopsWrite");
            return (Criteria) this;
        }

        public Criteria andIopsWriteNotLike(String value) {
            addCriterion("iops_write not like", value, "iopsWrite");
            return (Criteria) this;
        }

        public Criteria andIopsWriteIn(List<String> values) {
            addCriterion("iops_write in", values, "iopsWrite");
            return (Criteria) this;
        }

        public Criteria andIopsWriteNotIn(List<String> values) {
            addCriterion("iops_write not in", values, "iopsWrite");
            return (Criteria) this;
        }

        public Criteria andIopsWriteBetween(String value1, String value2) {
            addCriterion("iops_write between", value1, value2, "iopsWrite");
            return (Criteria) this;
        }

        public Criteria andIopsWriteNotBetween(String value1, String value2) {
            addCriterion("iops_write not between", value1, value2, "iopsWrite");
            return (Criteria) this;
        }

        public Criteria andConsumptionIsNull() {
            addCriterion("consumption is null");
            return (Criteria) this;
        }

        public Criteria andConsumptionIsNotNull() {
            addCriterion("consumption is not null");
            return (Criteria) this;
        }

        public Criteria andConsumptionEqualTo(String value) {
            addCriterion("consumption =", value, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionNotEqualTo(String value) {
            addCriterion("consumption <>", value, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionGreaterThan(String value) {
            addCriterion("consumption >", value, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionGreaterThanOrEqualTo(String value) {
            addCriterion("consumption >=", value, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionLessThan(String value) {
            addCriterion("consumption <", value, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionLessThanOrEqualTo(String value) {
            addCriterion("consumption <=", value, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionLike(String value) {
            addCriterion("consumption like", value, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionNotLike(String value) {
            addCriterion("consumption not like", value, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionIn(List<String> values) {
            addCriterion("consumption in", values, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionNotIn(List<String> values) {
            addCriterion("consumption not in", values, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionBetween(String value1, String value2) {
            addCriterion("consumption between", value1, value2, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionNotBetween(String value1, String value2) {
            addCriterion("consumption not between", value1, value2, "consumption");
            return (Criteria) this;
        }

        public Criteria andTroubleFreeIsNull() {
            addCriterion("trouble_free is null");
            return (Criteria) this;
        }

        public Criteria andTroubleFreeIsNotNull() {
            addCriterion("trouble_free is not null");
            return (Criteria) this;
        }

        public Criteria andTroubleFreeEqualTo(String value) {
            addCriterion("trouble_free =", value, "troubleFree");
            return (Criteria) this;
        }

        public Criteria andTroubleFreeNotEqualTo(String value) {
            addCriterion("trouble_free <>", value, "troubleFree");
            return (Criteria) this;
        }

        public Criteria andTroubleFreeGreaterThan(String value) {
            addCriterion("trouble_free >", value, "troubleFree");
            return (Criteria) this;
        }

        public Criteria andTroubleFreeGreaterThanOrEqualTo(String value) {
            addCriterion("trouble_free >=", value, "troubleFree");
            return (Criteria) this;
        }

        public Criteria andTroubleFreeLessThan(String value) {
            addCriterion("trouble_free <", value, "troubleFree");
            return (Criteria) this;
        }

        public Criteria andTroubleFreeLessThanOrEqualTo(String value) {
            addCriterion("trouble_free <=", value, "troubleFree");
            return (Criteria) this;
        }

        public Criteria andTroubleFreeLike(String value) {
            addCriterion("trouble_free like", value, "troubleFree");
            return (Criteria) this;
        }

        public Criteria andTroubleFreeNotLike(String value) {
            addCriterion("trouble_free not like", value, "troubleFree");
            return (Criteria) this;
        }

        public Criteria andTroubleFreeIn(List<String> values) {
            addCriterion("trouble_free in", values, "troubleFree");
            return (Criteria) this;
        }

        public Criteria andTroubleFreeNotIn(List<String> values) {
            addCriterion("trouble_free not in", values, "troubleFree");
            return (Criteria) this;
        }

        public Criteria andTroubleFreeBetween(String value1, String value2) {
            addCriterion("trouble_free between", value1, value2, "troubleFree");
            return (Criteria) this;
        }

        public Criteria andTroubleFreeNotBetween(String value1, String value2) {
            addCriterion("trouble_free not between", value1, value2, "troubleFree");
            return (Criteria) this;
        }

        public Criteria andSystemRequireIsNull() {
            addCriterion("system_require is null");
            return (Criteria) this;
        }

        public Criteria andSystemRequireIsNotNull() {
            addCriterion("system_require is not null");
            return (Criteria) this;
        }

        public Criteria andSystemRequireEqualTo(String value) {
            addCriterion("system_require =", value, "systemRequire");
            return (Criteria) this;
        }

        public Criteria andSystemRequireNotEqualTo(String value) {
            addCriterion("system_require <>", value, "systemRequire");
            return (Criteria) this;
        }

        public Criteria andSystemRequireGreaterThan(String value) {
            addCriterion("system_require >", value, "systemRequire");
            return (Criteria) this;
        }

        public Criteria andSystemRequireGreaterThanOrEqualTo(String value) {
            addCriterion("system_require >=", value, "systemRequire");
            return (Criteria) this;
        }

        public Criteria andSystemRequireLessThan(String value) {
            addCriterion("system_require <", value, "systemRequire");
            return (Criteria) this;
        }

        public Criteria andSystemRequireLessThanOrEqualTo(String value) {
            addCriterion("system_require <=", value, "systemRequire");
            return (Criteria) this;
        }

        public Criteria andSystemRequireLike(String value) {
            addCriterion("system_require like", value, "systemRequire");
            return (Criteria) this;
        }

        public Criteria andSystemRequireNotLike(String value) {
            addCriterion("system_require not like", value, "systemRequire");
            return (Criteria) this;
        }

        public Criteria andSystemRequireIn(List<String> values) {
            addCriterion("system_require in", values, "systemRequire");
            return (Criteria) this;
        }

        public Criteria andSystemRequireNotIn(List<String> values) {
            addCriterion("system_require not in", values, "systemRequire");
            return (Criteria) this;
        }

        public Criteria andSystemRequireBetween(String value1, String value2) {
            addCriterion("system_require between", value1, value2, "systemRequire");
            return (Criteria) this;
        }

        public Criteria andSystemRequireNotBetween(String value1, String value2) {
            addCriterion("system_require not between", value1, value2, "systemRequire");
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