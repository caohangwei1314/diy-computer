package com.example.demo.product.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public RamExample() {
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

        public Criteria andRamFrequencyIsNull() {
            addCriterion("ram_frequency is null");
            return (Criteria) this;
        }

        public Criteria andRamFrequencyIsNotNull() {
            addCriterion("ram_frequency is not null");
            return (Criteria) this;
        }

        public Criteria andRamFrequencyEqualTo(String value) {
            addCriterion("ram_frequency =", value, "ramFrequency");
            return (Criteria) this;
        }

        public Criteria andRamFrequencyNotEqualTo(String value) {
            addCriterion("ram_frequency <>", value, "ramFrequency");
            return (Criteria) this;
        }

        public Criteria andRamFrequencyGreaterThan(String value) {
            addCriterion("ram_frequency >", value, "ramFrequency");
            return (Criteria) this;
        }

        public Criteria andRamFrequencyGreaterThanOrEqualTo(String value) {
            addCriterion("ram_frequency >=", value, "ramFrequency");
            return (Criteria) this;
        }

        public Criteria andRamFrequencyLessThan(String value) {
            addCriterion("ram_frequency <", value, "ramFrequency");
            return (Criteria) this;
        }

        public Criteria andRamFrequencyLessThanOrEqualTo(String value) {
            addCriterion("ram_frequency <=", value, "ramFrequency");
            return (Criteria) this;
        }

        public Criteria andRamFrequencyLike(String value) {
            addCriterion("ram_frequency like", value, "ramFrequency");
            return (Criteria) this;
        }

        public Criteria andRamFrequencyNotLike(String value) {
            addCriterion("ram_frequency not like", value, "ramFrequency");
            return (Criteria) this;
        }

        public Criteria andRamFrequencyIn(List<String> values) {
            addCriterion("ram_frequency in", values, "ramFrequency");
            return (Criteria) this;
        }

        public Criteria andRamFrequencyNotIn(List<String> values) {
            addCriterion("ram_frequency not in", values, "ramFrequency");
            return (Criteria) this;
        }

        public Criteria andRamFrequencyBetween(String value1, String value2) {
            addCriterion("ram_frequency between", value1, value2, "ramFrequency");
            return (Criteria) this;
        }

        public Criteria andRamFrequencyNotBetween(String value1, String value2) {
            addCriterion("ram_frequency not between", value1, value2, "ramFrequency");
            return (Criteria) this;
        }

        public Criteria andStitchesIsNull() {
            addCriterion("stitches is null");
            return (Criteria) this;
        }

        public Criteria andStitchesIsNotNull() {
            addCriterion("stitches is not null");
            return (Criteria) this;
        }

        public Criteria andStitchesEqualTo(String value) {
            addCriterion("stitches =", value, "stitches");
            return (Criteria) this;
        }

        public Criteria andStitchesNotEqualTo(String value) {
            addCriterion("stitches <>", value, "stitches");
            return (Criteria) this;
        }

        public Criteria andStitchesGreaterThan(String value) {
            addCriterion("stitches >", value, "stitches");
            return (Criteria) this;
        }

        public Criteria andStitchesGreaterThanOrEqualTo(String value) {
            addCriterion("stitches >=", value, "stitches");
            return (Criteria) this;
        }

        public Criteria andStitchesLessThan(String value) {
            addCriterion("stitches <", value, "stitches");
            return (Criteria) this;
        }

        public Criteria andStitchesLessThanOrEqualTo(String value) {
            addCriterion("stitches <=", value, "stitches");
            return (Criteria) this;
        }

        public Criteria andStitchesLike(String value) {
            addCriterion("stitches like", value, "stitches");
            return (Criteria) this;
        }

        public Criteria andStitchesNotLike(String value) {
            addCriterion("stitches not like", value, "stitches");
            return (Criteria) this;
        }

        public Criteria andStitchesIn(List<String> values) {
            addCriterion("stitches in", values, "stitches");
            return (Criteria) this;
        }

        public Criteria andStitchesNotIn(List<String> values) {
            addCriterion("stitches not in", values, "stitches");
            return (Criteria) this;
        }

        public Criteria andStitchesBetween(String value1, String value2) {
            addCriterion("stitches between", value1, value2, "stitches");
            return (Criteria) this;
        }

        public Criteria andStitchesNotBetween(String value1, String value2) {
            addCriterion("stitches not between", value1, value2, "stitches");
            return (Criteria) this;
        }

        public Criteria andSlotTypeIsNull() {
            addCriterion("slot_type is null");
            return (Criteria) this;
        }

        public Criteria andSlotTypeIsNotNull() {
            addCriterion("slot_type is not null");
            return (Criteria) this;
        }

        public Criteria andSlotTypeEqualTo(String value) {
            addCriterion("slot_type =", value, "slotType");
            return (Criteria) this;
        }

        public Criteria andSlotTypeNotEqualTo(String value) {
            addCriterion("slot_type <>", value, "slotType");
            return (Criteria) this;
        }

        public Criteria andSlotTypeGreaterThan(String value) {
            addCriterion("slot_type >", value, "slotType");
            return (Criteria) this;
        }

        public Criteria andSlotTypeGreaterThanOrEqualTo(String value) {
            addCriterion("slot_type >=", value, "slotType");
            return (Criteria) this;
        }

        public Criteria andSlotTypeLessThan(String value) {
            addCriterion("slot_type <", value, "slotType");
            return (Criteria) this;
        }

        public Criteria andSlotTypeLessThanOrEqualTo(String value) {
            addCriterion("slot_type <=", value, "slotType");
            return (Criteria) this;
        }

        public Criteria andSlotTypeLike(String value) {
            addCriterion("slot_type like", value, "slotType");
            return (Criteria) this;
        }

        public Criteria andSlotTypeNotLike(String value) {
            addCriterion("slot_type not like", value, "slotType");
            return (Criteria) this;
        }

        public Criteria andSlotTypeIn(List<String> values) {
            addCriterion("slot_type in", values, "slotType");
            return (Criteria) this;
        }

        public Criteria andSlotTypeNotIn(List<String> values) {
            addCriterion("slot_type not in", values, "slotType");
            return (Criteria) this;
        }

        public Criteria andSlotTypeBetween(String value1, String value2) {
            addCriterion("slot_type between", value1, value2, "slotType");
            return (Criteria) this;
        }

        public Criteria andSlotTypeNotBetween(String value1, String value2) {
            addCriterion("slot_type not between", value1, value2, "slotType");
            return (Criteria) this;
        }

        public Criteria andClIsNull() {
            addCriterion("cl is null");
            return (Criteria) this;
        }

        public Criteria andClIsNotNull() {
            addCriterion("cl is not null");
            return (Criteria) this;
        }

        public Criteria andClEqualTo(String value) {
            addCriterion("cl =", value, "cl");
            return (Criteria) this;
        }

        public Criteria andClNotEqualTo(String value) {
            addCriterion("cl <>", value, "cl");
            return (Criteria) this;
        }

        public Criteria andClGreaterThan(String value) {
            addCriterion("cl >", value, "cl");
            return (Criteria) this;
        }

        public Criteria andClGreaterThanOrEqualTo(String value) {
            addCriterion("cl >=", value, "cl");
            return (Criteria) this;
        }

        public Criteria andClLessThan(String value) {
            addCriterion("cl <", value, "cl");
            return (Criteria) this;
        }

        public Criteria andClLessThanOrEqualTo(String value) {
            addCriterion("cl <=", value, "cl");
            return (Criteria) this;
        }

        public Criteria andClLike(String value) {
            addCriterion("cl like", value, "cl");
            return (Criteria) this;
        }

        public Criteria andClNotLike(String value) {
            addCriterion("cl not like", value, "cl");
            return (Criteria) this;
        }

        public Criteria andClIn(List<String> values) {
            addCriterion("cl in", values, "cl");
            return (Criteria) this;
        }

        public Criteria andClNotIn(List<String> values) {
            addCriterion("cl not in", values, "cl");
            return (Criteria) this;
        }

        public Criteria andClBetween(String value1, String value2) {
            addCriterion("cl between", value1, value2, "cl");
            return (Criteria) this;
        }

        public Criteria andClNotBetween(String value1, String value2) {
            addCriterion("cl not between", value1, value2, "cl");
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