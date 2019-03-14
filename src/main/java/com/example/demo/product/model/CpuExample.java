package com.example.demo.product.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CpuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public CpuExample() {
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

        public Criteria andSeriesIsNull() {
            addCriterion("series is null");
            return (Criteria) this;
        }

        public Criteria andSeriesIsNotNull() {
            addCriterion("series is not null");
            return (Criteria) this;
        }

        public Criteria andSeriesEqualTo(String value) {
            addCriterion("series =", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesNotEqualTo(String value) {
            addCriterion("series <>", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesGreaterThan(String value) {
            addCriterion("series >", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesGreaterThanOrEqualTo(String value) {
            addCriterion("series >=", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesLessThan(String value) {
            addCriterion("series <", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesLessThanOrEqualTo(String value) {
            addCriterion("series <=", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesLike(String value) {
            addCriterion("series like", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesNotLike(String value) {
            addCriterion("series not like", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesIn(List<String> values) {
            addCriterion("series in", values, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesNotIn(List<String> values) {
            addCriterion("series not in", values, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesBetween(String value1, String value2) {
            addCriterion("series between", value1, value2, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesNotBetween(String value1, String value2) {
            addCriterion("series not between", value1, value2, "series");
            return (Criteria) this;
        }

        public Criteria andCraftsmanshipIsNull() {
            addCriterion("craftsmanship is null");
            return (Criteria) this;
        }

        public Criteria andCraftsmanshipIsNotNull() {
            addCriterion("craftsmanship is not null");
            return (Criteria) this;
        }

        public Criteria andCraftsmanshipEqualTo(String value) {
            addCriterion("craftsmanship =", value, "craftsmanship");
            return (Criteria) this;
        }

        public Criteria andCraftsmanshipNotEqualTo(String value) {
            addCriterion("craftsmanship <>", value, "craftsmanship");
            return (Criteria) this;
        }

        public Criteria andCraftsmanshipGreaterThan(String value) {
            addCriterion("craftsmanship >", value, "craftsmanship");
            return (Criteria) this;
        }

        public Criteria andCraftsmanshipGreaterThanOrEqualTo(String value) {
            addCriterion("craftsmanship >=", value, "craftsmanship");
            return (Criteria) this;
        }

        public Criteria andCraftsmanshipLessThan(String value) {
            addCriterion("craftsmanship <", value, "craftsmanship");
            return (Criteria) this;
        }

        public Criteria andCraftsmanshipLessThanOrEqualTo(String value) {
            addCriterion("craftsmanship <=", value, "craftsmanship");
            return (Criteria) this;
        }

        public Criteria andCraftsmanshipLike(String value) {
            addCriterion("craftsmanship like", value, "craftsmanship");
            return (Criteria) this;
        }

        public Criteria andCraftsmanshipNotLike(String value) {
            addCriterion("craftsmanship not like", value, "craftsmanship");
            return (Criteria) this;
        }

        public Criteria andCraftsmanshipIn(List<String> values) {
            addCriterion("craftsmanship in", values, "craftsmanship");
            return (Criteria) this;
        }

        public Criteria andCraftsmanshipNotIn(List<String> values) {
            addCriterion("craftsmanship not in", values, "craftsmanship");
            return (Criteria) this;
        }

        public Criteria andCraftsmanshipBetween(String value1, String value2) {
            addCriterion("craftsmanship between", value1, value2, "craftsmanship");
            return (Criteria) this;
        }

        public Criteria andCraftsmanshipNotBetween(String value1, String value2) {
            addCriterion("craftsmanship not between", value1, value2, "craftsmanship");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
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

        public Criteria andPackageSizeIsNull() {
            addCriterion("package_size is null");
            return (Criteria) this;
        }

        public Criteria andPackageSizeIsNotNull() {
            addCriterion("package_size is not null");
            return (Criteria) this;
        }

        public Criteria andPackageSizeEqualTo(String value) {
            addCriterion("package_size =", value, "packageSize");
            return (Criteria) this;
        }

        public Criteria andPackageSizeNotEqualTo(String value) {
            addCriterion("package_size <>", value, "packageSize");
            return (Criteria) this;
        }

        public Criteria andPackageSizeGreaterThan(String value) {
            addCriterion("package_size >", value, "packageSize");
            return (Criteria) this;
        }

        public Criteria andPackageSizeGreaterThanOrEqualTo(String value) {
            addCriterion("package_size >=", value, "packageSize");
            return (Criteria) this;
        }

        public Criteria andPackageSizeLessThan(String value) {
            addCriterion("package_size <", value, "packageSize");
            return (Criteria) this;
        }

        public Criteria andPackageSizeLessThanOrEqualTo(String value) {
            addCriterion("package_size <=", value, "packageSize");
            return (Criteria) this;
        }

        public Criteria andPackageSizeLike(String value) {
            addCriterion("package_size like", value, "packageSize");
            return (Criteria) this;
        }

        public Criteria andPackageSizeNotLike(String value) {
            addCriterion("package_size not like", value, "packageSize");
            return (Criteria) this;
        }

        public Criteria andPackageSizeIn(List<String> values) {
            addCriterion("package_size in", values, "packageSize");
            return (Criteria) this;
        }

        public Criteria andPackageSizeNotIn(List<String> values) {
            addCriterion("package_size not in", values, "packageSize");
            return (Criteria) this;
        }

        public Criteria andPackageSizeBetween(String value1, String value2) {
            addCriterion("package_size between", value1, value2, "packageSize");
            return (Criteria) this;
        }

        public Criteria andPackageSizeNotBetween(String value1, String value2) {
            addCriterion("package_size not between", value1, value2, "packageSize");
            return (Criteria) this;
        }

        public Criteria andCpuFrequencyIsNull() {
            addCriterion("cpu_frequency is null");
            return (Criteria) this;
        }

        public Criteria andCpuFrequencyIsNotNull() {
            addCriterion("cpu_frequency is not null");
            return (Criteria) this;
        }

        public Criteria andCpuFrequencyEqualTo(String value) {
            addCriterion("cpu_frequency =", value, "cpuFrequency");
            return (Criteria) this;
        }

        public Criteria andCpuFrequencyNotEqualTo(String value) {
            addCriterion("cpu_frequency <>", value, "cpuFrequency");
            return (Criteria) this;
        }

        public Criteria andCpuFrequencyGreaterThan(String value) {
            addCriterion("cpu_frequency >", value, "cpuFrequency");
            return (Criteria) this;
        }

        public Criteria andCpuFrequencyGreaterThanOrEqualTo(String value) {
            addCriterion("cpu_frequency >=", value, "cpuFrequency");
            return (Criteria) this;
        }

        public Criteria andCpuFrequencyLessThan(String value) {
            addCriterion("cpu_frequency <", value, "cpuFrequency");
            return (Criteria) this;
        }

        public Criteria andCpuFrequencyLessThanOrEqualTo(String value) {
            addCriterion("cpu_frequency <=", value, "cpuFrequency");
            return (Criteria) this;
        }

        public Criteria andCpuFrequencyLike(String value) {
            addCriterion("cpu_frequency like", value, "cpuFrequency");
            return (Criteria) this;
        }

        public Criteria andCpuFrequencyNotLike(String value) {
            addCriterion("cpu_frequency not like", value, "cpuFrequency");
            return (Criteria) this;
        }

        public Criteria andCpuFrequencyIn(List<String> values) {
            addCriterion("cpu_frequency in", values, "cpuFrequency");
            return (Criteria) this;
        }

        public Criteria andCpuFrequencyNotIn(List<String> values) {
            addCriterion("cpu_frequency not in", values, "cpuFrequency");
            return (Criteria) this;
        }

        public Criteria andCpuFrequencyBetween(String value1, String value2) {
            addCriterion("cpu_frequency between", value1, value2, "cpuFrequency");
            return (Criteria) this;
        }

        public Criteria andCpuFrequencyNotBetween(String value1, String value2) {
            addCriterion("cpu_frequency not between", value1, value2, "cpuFrequency");
            return (Criteria) this;
        }

        public Criteria andAccelerationFrequencyIsNull() {
            addCriterion("acceleration_frequency is null");
            return (Criteria) this;
        }

        public Criteria andAccelerationFrequencyIsNotNull() {
            addCriterion("acceleration_frequency is not null");
            return (Criteria) this;
        }

        public Criteria andAccelerationFrequencyEqualTo(String value) {
            addCriterion("acceleration_frequency =", value, "accelerationFrequency");
            return (Criteria) this;
        }

        public Criteria andAccelerationFrequencyNotEqualTo(String value) {
            addCriterion("acceleration_frequency <>", value, "accelerationFrequency");
            return (Criteria) this;
        }

        public Criteria andAccelerationFrequencyGreaterThan(String value) {
            addCriterion("acceleration_frequency >", value, "accelerationFrequency");
            return (Criteria) this;
        }

        public Criteria andAccelerationFrequencyGreaterThanOrEqualTo(String value) {
            addCriterion("acceleration_frequency >=", value, "accelerationFrequency");
            return (Criteria) this;
        }

        public Criteria andAccelerationFrequencyLessThan(String value) {
            addCriterion("acceleration_frequency <", value, "accelerationFrequency");
            return (Criteria) this;
        }

        public Criteria andAccelerationFrequencyLessThanOrEqualTo(String value) {
            addCriterion("acceleration_frequency <=", value, "accelerationFrequency");
            return (Criteria) this;
        }

        public Criteria andAccelerationFrequencyLike(String value) {
            addCriterion("acceleration_frequency like", value, "accelerationFrequency");
            return (Criteria) this;
        }

        public Criteria andAccelerationFrequencyNotLike(String value) {
            addCriterion("acceleration_frequency not like", value, "accelerationFrequency");
            return (Criteria) this;
        }

        public Criteria andAccelerationFrequencyIn(List<String> values) {
            addCriterion("acceleration_frequency in", values, "accelerationFrequency");
            return (Criteria) this;
        }

        public Criteria andAccelerationFrequencyNotIn(List<String> values) {
            addCriterion("acceleration_frequency not in", values, "accelerationFrequency");
            return (Criteria) this;
        }

        public Criteria andAccelerationFrequencyBetween(String value1, String value2) {
            addCriterion("acceleration_frequency between", value1, value2, "accelerationFrequency");
            return (Criteria) this;
        }

        public Criteria andAccelerationFrequencyNotBetween(String value1, String value2) {
            addCriterion("acceleration_frequency not between", value1, value2, "accelerationFrequency");
            return (Criteria) this;
        }

        public Criteria andCoreNumberIsNull() {
            addCriterion("core_number is null");
            return (Criteria) this;
        }

        public Criteria andCoreNumberIsNotNull() {
            addCriterion("core_number is not null");
            return (Criteria) this;
        }

        public Criteria andCoreNumberEqualTo(String value) {
            addCriterion("core_number =", value, "coreNumber");
            return (Criteria) this;
        }

        public Criteria andCoreNumberNotEqualTo(String value) {
            addCriterion("core_number <>", value, "coreNumber");
            return (Criteria) this;
        }

        public Criteria andCoreNumberGreaterThan(String value) {
            addCriterion("core_number >", value, "coreNumber");
            return (Criteria) this;
        }

        public Criteria andCoreNumberGreaterThanOrEqualTo(String value) {
            addCriterion("core_number >=", value, "coreNumber");
            return (Criteria) this;
        }

        public Criteria andCoreNumberLessThan(String value) {
            addCriterion("core_number <", value, "coreNumber");
            return (Criteria) this;
        }

        public Criteria andCoreNumberLessThanOrEqualTo(String value) {
            addCriterion("core_number <=", value, "coreNumber");
            return (Criteria) this;
        }

        public Criteria andCoreNumberLike(String value) {
            addCriterion("core_number like", value, "coreNumber");
            return (Criteria) this;
        }

        public Criteria andCoreNumberNotLike(String value) {
            addCriterion("core_number not like", value, "coreNumber");
            return (Criteria) this;
        }

        public Criteria andCoreNumberIn(List<String> values) {
            addCriterion("core_number in", values, "coreNumber");
            return (Criteria) this;
        }

        public Criteria andCoreNumberNotIn(List<String> values) {
            addCriterion("core_number not in", values, "coreNumber");
            return (Criteria) this;
        }

        public Criteria andCoreNumberBetween(String value1, String value2) {
            addCriterion("core_number between", value1, value2, "coreNumber");
            return (Criteria) this;
        }

        public Criteria andCoreNumberNotBetween(String value1, String value2) {
            addCriterion("core_number not between", value1, value2, "coreNumber");
            return (Criteria) this;
        }

        public Criteria andThreadNumberIsNull() {
            addCriterion("thread_number is null");
            return (Criteria) this;
        }

        public Criteria andThreadNumberIsNotNull() {
            addCriterion("thread_number is not null");
            return (Criteria) this;
        }

        public Criteria andThreadNumberEqualTo(String value) {
            addCriterion("thread_number =", value, "threadNumber");
            return (Criteria) this;
        }

        public Criteria andThreadNumberNotEqualTo(String value) {
            addCriterion("thread_number <>", value, "threadNumber");
            return (Criteria) this;
        }

        public Criteria andThreadNumberGreaterThan(String value) {
            addCriterion("thread_number >", value, "threadNumber");
            return (Criteria) this;
        }

        public Criteria andThreadNumberGreaterThanOrEqualTo(String value) {
            addCriterion("thread_number >=", value, "threadNumber");
            return (Criteria) this;
        }

        public Criteria andThreadNumberLessThan(String value) {
            addCriterion("thread_number <", value, "threadNumber");
            return (Criteria) this;
        }

        public Criteria andThreadNumberLessThanOrEqualTo(String value) {
            addCriterion("thread_number <=", value, "threadNumber");
            return (Criteria) this;
        }

        public Criteria andThreadNumberLike(String value) {
            addCriterion("thread_number like", value, "threadNumber");
            return (Criteria) this;
        }

        public Criteria andThreadNumberNotLike(String value) {
            addCriterion("thread_number not like", value, "threadNumber");
            return (Criteria) this;
        }

        public Criteria andThreadNumberIn(List<String> values) {
            addCriterion("thread_number in", values, "threadNumber");
            return (Criteria) this;
        }

        public Criteria andThreadNumberNotIn(List<String> values) {
            addCriterion("thread_number not in", values, "threadNumber");
            return (Criteria) this;
        }

        public Criteria andThreadNumberBetween(String value1, String value2) {
            addCriterion("thread_number between", value1, value2, "threadNumber");
            return (Criteria) this;
        }

        public Criteria andThreadNumberNotBetween(String value1, String value2) {
            addCriterion("thread_number not between", value1, value2, "threadNumber");
            return (Criteria) this;
        }

        public Criteria andThirdCacheIsNull() {
            addCriterion("third_cache is null");
            return (Criteria) this;
        }

        public Criteria andThirdCacheIsNotNull() {
            addCriterion("third_cache is not null");
            return (Criteria) this;
        }

        public Criteria andThirdCacheEqualTo(String value) {
            addCriterion("third_cache =", value, "thirdCache");
            return (Criteria) this;
        }

        public Criteria andThirdCacheNotEqualTo(String value) {
            addCriterion("third_cache <>", value, "thirdCache");
            return (Criteria) this;
        }

        public Criteria andThirdCacheGreaterThan(String value) {
            addCriterion("third_cache >", value, "thirdCache");
            return (Criteria) this;
        }

        public Criteria andThirdCacheGreaterThanOrEqualTo(String value) {
            addCriterion("third_cache >=", value, "thirdCache");
            return (Criteria) this;
        }

        public Criteria andThirdCacheLessThan(String value) {
            addCriterion("third_cache <", value, "thirdCache");
            return (Criteria) this;
        }

        public Criteria andThirdCacheLessThanOrEqualTo(String value) {
            addCriterion("third_cache <=", value, "thirdCache");
            return (Criteria) this;
        }

        public Criteria andThirdCacheLike(String value) {
            addCriterion("third_cache like", value, "thirdCache");
            return (Criteria) this;
        }

        public Criteria andThirdCacheNotLike(String value) {
            addCriterion("third_cache not like", value, "thirdCache");
            return (Criteria) this;
        }

        public Criteria andThirdCacheIn(List<String> values) {
            addCriterion("third_cache in", values, "thirdCache");
            return (Criteria) this;
        }

        public Criteria andThirdCacheNotIn(List<String> values) {
            addCriterion("third_cache not in", values, "thirdCache");
            return (Criteria) this;
        }

        public Criteria andThirdCacheBetween(String value1, String value2) {
            addCriterion("third_cache between", value1, value2, "thirdCache");
            return (Criteria) this;
        }

        public Criteria andThirdCacheNotBetween(String value1, String value2) {
            addCriterion("third_cache not between", value1, value2, "thirdCache");
            return (Criteria) this;
        }

        public Criteria andBusSpecificationIsNull() {
            addCriterion("bus_specification is null");
            return (Criteria) this;
        }

        public Criteria andBusSpecificationIsNotNull() {
            addCriterion("bus_specification is not null");
            return (Criteria) this;
        }

        public Criteria andBusSpecificationEqualTo(String value) {
            addCriterion("bus_specification =", value, "busSpecification");
            return (Criteria) this;
        }

        public Criteria andBusSpecificationNotEqualTo(String value) {
            addCriterion("bus_specification <>", value, "busSpecification");
            return (Criteria) this;
        }

        public Criteria andBusSpecificationGreaterThan(String value) {
            addCriterion("bus_specification >", value, "busSpecification");
            return (Criteria) this;
        }

        public Criteria andBusSpecificationGreaterThanOrEqualTo(String value) {
            addCriterion("bus_specification >=", value, "busSpecification");
            return (Criteria) this;
        }

        public Criteria andBusSpecificationLessThan(String value) {
            addCriterion("bus_specification <", value, "busSpecification");
            return (Criteria) this;
        }

        public Criteria andBusSpecificationLessThanOrEqualTo(String value) {
            addCriterion("bus_specification <=", value, "busSpecification");
            return (Criteria) this;
        }

        public Criteria andBusSpecificationLike(String value) {
            addCriterion("bus_specification like", value, "busSpecification");
            return (Criteria) this;
        }

        public Criteria andBusSpecificationNotLike(String value) {
            addCriterion("bus_specification not like", value, "busSpecification");
            return (Criteria) this;
        }

        public Criteria andBusSpecificationIn(List<String> values) {
            addCriterion("bus_specification in", values, "busSpecification");
            return (Criteria) this;
        }

        public Criteria andBusSpecificationNotIn(List<String> values) {
            addCriterion("bus_specification not in", values, "busSpecification");
            return (Criteria) this;
        }

        public Criteria andBusSpecificationBetween(String value1, String value2) {
            addCriterion("bus_specification between", value1, value2, "busSpecification");
            return (Criteria) this;
        }

        public Criteria andBusSpecificationNotBetween(String value1, String value2) {
            addCriterion("bus_specification not between", value1, value2, "busSpecification");
            return (Criteria) this;
        }

        public Criteria andThermalPowerIsNull() {
            addCriterion("thermal_power is null");
            return (Criteria) this;
        }

        public Criteria andThermalPowerIsNotNull() {
            addCriterion("thermal_power is not null");
            return (Criteria) this;
        }

        public Criteria andThermalPowerEqualTo(String value) {
            addCriterion("thermal_power =", value, "thermalPower");
            return (Criteria) this;
        }

        public Criteria andThermalPowerNotEqualTo(String value) {
            addCriterion("thermal_power <>", value, "thermalPower");
            return (Criteria) this;
        }

        public Criteria andThermalPowerGreaterThan(String value) {
            addCriterion("thermal_power >", value, "thermalPower");
            return (Criteria) this;
        }

        public Criteria andThermalPowerGreaterThanOrEqualTo(String value) {
            addCriterion("thermal_power >=", value, "thermalPower");
            return (Criteria) this;
        }

        public Criteria andThermalPowerLessThan(String value) {
            addCriterion("thermal_power <", value, "thermalPower");
            return (Criteria) this;
        }

        public Criteria andThermalPowerLessThanOrEqualTo(String value) {
            addCriterion("thermal_power <=", value, "thermalPower");
            return (Criteria) this;
        }

        public Criteria andThermalPowerLike(String value) {
            addCriterion("thermal_power like", value, "thermalPower");
            return (Criteria) this;
        }

        public Criteria andThermalPowerNotLike(String value) {
            addCriterion("thermal_power not like", value, "thermalPower");
            return (Criteria) this;
        }

        public Criteria andThermalPowerIn(List<String> values) {
            addCriterion("thermal_power in", values, "thermalPower");
            return (Criteria) this;
        }

        public Criteria andThermalPowerNotIn(List<String> values) {
            addCriterion("thermal_power not in", values, "thermalPower");
            return (Criteria) this;
        }

        public Criteria andThermalPowerBetween(String value1, String value2) {
            addCriterion("thermal_power between", value1, value2, "thermalPower");
            return (Criteria) this;
        }

        public Criteria andThermalPowerNotBetween(String value1, String value2) {
            addCriterion("thermal_power not between", value1, value2, "thermalPower");
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