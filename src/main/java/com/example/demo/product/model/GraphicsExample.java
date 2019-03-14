package com.example.demo.product.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GraphicsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public GraphicsExample() {
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

        public Criteria andVendorIsNull() {
            addCriterion("vendor is null");
            return (Criteria) this;
        }

        public Criteria andVendorIsNotNull() {
            addCriterion("vendor is not null");
            return (Criteria) this;
        }

        public Criteria andVendorEqualTo(String value) {
            addCriterion("vendor =", value, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorNotEqualTo(String value) {
            addCriterion("vendor <>", value, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorGreaterThan(String value) {
            addCriterion("vendor >", value, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorGreaterThanOrEqualTo(String value) {
            addCriterion("vendor >=", value, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorLessThan(String value) {
            addCriterion("vendor <", value, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorLessThanOrEqualTo(String value) {
            addCriterion("vendor <=", value, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorLike(String value) {
            addCriterion("vendor like", value, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorNotLike(String value) {
            addCriterion("vendor not like", value, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorIn(List<String> values) {
            addCriterion("vendor in", values, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorNotIn(List<String> values) {
            addCriterion("vendor not in", values, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorBetween(String value1, String value2) {
            addCriterion("vendor between", value1, value2, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorNotBetween(String value1, String value2) {
            addCriterion("vendor not between", value1, value2, "vendor");
            return (Criteria) this;
        }

        public Criteria andChipIsNull() {
            addCriterion("chip is null");
            return (Criteria) this;
        }

        public Criteria andChipIsNotNull() {
            addCriterion("chip is not null");
            return (Criteria) this;
        }

        public Criteria andChipEqualTo(String value) {
            addCriterion("chip =", value, "chip");
            return (Criteria) this;
        }

        public Criteria andChipNotEqualTo(String value) {
            addCriterion("chip <>", value, "chip");
            return (Criteria) this;
        }

        public Criteria andChipGreaterThan(String value) {
            addCriterion("chip >", value, "chip");
            return (Criteria) this;
        }

        public Criteria andChipGreaterThanOrEqualTo(String value) {
            addCriterion("chip >=", value, "chip");
            return (Criteria) this;
        }

        public Criteria andChipLessThan(String value) {
            addCriterion("chip <", value, "chip");
            return (Criteria) this;
        }

        public Criteria andChipLessThanOrEqualTo(String value) {
            addCriterion("chip <=", value, "chip");
            return (Criteria) this;
        }

        public Criteria andChipLike(String value) {
            addCriterion("chip like", value, "chip");
            return (Criteria) this;
        }

        public Criteria andChipNotLike(String value) {
            addCriterion("chip not like", value, "chip");
            return (Criteria) this;
        }

        public Criteria andChipIn(List<String> values) {
            addCriterion("chip in", values, "chip");
            return (Criteria) this;
        }

        public Criteria andChipNotIn(List<String> values) {
            addCriterion("chip not in", values, "chip");
            return (Criteria) this;
        }

        public Criteria andChipBetween(String value1, String value2) {
            addCriterion("chip between", value1, value2, "chip");
            return (Criteria) this;
        }

        public Criteria andChipNotBetween(String value1, String value2) {
            addCriterion("chip not between", value1, value2, "chip");
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

        public Criteria andCodeFrequencyIsNull() {
            addCriterion("code_frequency is null");
            return (Criteria) this;
        }

        public Criteria andCodeFrequencyIsNotNull() {
            addCriterion("code_frequency is not null");
            return (Criteria) this;
        }

        public Criteria andCodeFrequencyEqualTo(String value) {
            addCriterion("code_frequency =", value, "codeFrequency");
            return (Criteria) this;
        }

        public Criteria andCodeFrequencyNotEqualTo(String value) {
            addCriterion("code_frequency <>", value, "codeFrequency");
            return (Criteria) this;
        }

        public Criteria andCodeFrequencyGreaterThan(String value) {
            addCriterion("code_frequency >", value, "codeFrequency");
            return (Criteria) this;
        }

        public Criteria andCodeFrequencyGreaterThanOrEqualTo(String value) {
            addCriterion("code_frequency >=", value, "codeFrequency");
            return (Criteria) this;
        }

        public Criteria andCodeFrequencyLessThan(String value) {
            addCriterion("code_frequency <", value, "codeFrequency");
            return (Criteria) this;
        }

        public Criteria andCodeFrequencyLessThanOrEqualTo(String value) {
            addCriterion("code_frequency <=", value, "codeFrequency");
            return (Criteria) this;
        }

        public Criteria andCodeFrequencyLike(String value) {
            addCriterion("code_frequency like", value, "codeFrequency");
            return (Criteria) this;
        }

        public Criteria andCodeFrequencyNotLike(String value) {
            addCriterion("code_frequency not like", value, "codeFrequency");
            return (Criteria) this;
        }

        public Criteria andCodeFrequencyIn(List<String> values) {
            addCriterion("code_frequency in", values, "codeFrequency");
            return (Criteria) this;
        }

        public Criteria andCodeFrequencyNotIn(List<String> values) {
            addCriterion("code_frequency not in", values, "codeFrequency");
            return (Criteria) this;
        }

        public Criteria andCodeFrequencyBetween(String value1, String value2) {
            addCriterion("code_frequency between", value1, value2, "codeFrequency");
            return (Criteria) this;
        }

        public Criteria andCodeFrequencyNotBetween(String value1, String value2) {
            addCriterion("code_frequency not between", value1, value2, "codeFrequency");
            return (Criteria) this;
        }

        public Criteria andCudaIsNull() {
            addCriterion("cuda is null");
            return (Criteria) this;
        }

        public Criteria andCudaIsNotNull() {
            addCriterion("cuda is not null");
            return (Criteria) this;
        }

        public Criteria andCudaEqualTo(String value) {
            addCriterion("cuda =", value, "cuda");
            return (Criteria) this;
        }

        public Criteria andCudaNotEqualTo(String value) {
            addCriterion("cuda <>", value, "cuda");
            return (Criteria) this;
        }

        public Criteria andCudaGreaterThan(String value) {
            addCriterion("cuda >", value, "cuda");
            return (Criteria) this;
        }

        public Criteria andCudaGreaterThanOrEqualTo(String value) {
            addCriterion("cuda >=", value, "cuda");
            return (Criteria) this;
        }

        public Criteria andCudaLessThan(String value) {
            addCriterion("cuda <", value, "cuda");
            return (Criteria) this;
        }

        public Criteria andCudaLessThanOrEqualTo(String value) {
            addCriterion("cuda <=", value, "cuda");
            return (Criteria) this;
        }

        public Criteria andCudaLike(String value) {
            addCriterion("cuda like", value, "cuda");
            return (Criteria) this;
        }

        public Criteria andCudaNotLike(String value) {
            addCriterion("cuda not like", value, "cuda");
            return (Criteria) this;
        }

        public Criteria andCudaIn(List<String> values) {
            addCriterion("cuda in", values, "cuda");
            return (Criteria) this;
        }

        public Criteria andCudaNotIn(List<String> values) {
            addCriterion("cuda not in", values, "cuda");
            return (Criteria) this;
        }

        public Criteria andCudaBetween(String value1, String value2) {
            addCriterion("cuda between", value1, value2, "cuda");
            return (Criteria) this;
        }

        public Criteria andCudaNotBetween(String value1, String value2) {
            addCriterion("cuda not between", value1, value2, "cuda");
            return (Criteria) this;
        }

        public Criteria andMemoryFrequencyIsNull() {
            addCriterion("memory_frequency is null");
            return (Criteria) this;
        }

        public Criteria andMemoryFrequencyIsNotNull() {
            addCriterion("memory_frequency is not null");
            return (Criteria) this;
        }

        public Criteria andMemoryFrequencyEqualTo(String value) {
            addCriterion("memory_frequency =", value, "memoryFrequency");
            return (Criteria) this;
        }

        public Criteria andMemoryFrequencyNotEqualTo(String value) {
            addCriterion("memory_frequency <>", value, "memoryFrequency");
            return (Criteria) this;
        }

        public Criteria andMemoryFrequencyGreaterThan(String value) {
            addCriterion("memory_frequency >", value, "memoryFrequency");
            return (Criteria) this;
        }

        public Criteria andMemoryFrequencyGreaterThanOrEqualTo(String value) {
            addCriterion("memory_frequency >=", value, "memoryFrequency");
            return (Criteria) this;
        }

        public Criteria andMemoryFrequencyLessThan(String value) {
            addCriterion("memory_frequency <", value, "memoryFrequency");
            return (Criteria) this;
        }

        public Criteria andMemoryFrequencyLessThanOrEqualTo(String value) {
            addCriterion("memory_frequency <=", value, "memoryFrequency");
            return (Criteria) this;
        }

        public Criteria andMemoryFrequencyLike(String value) {
            addCriterion("memory_frequency like", value, "memoryFrequency");
            return (Criteria) this;
        }

        public Criteria andMemoryFrequencyNotLike(String value) {
            addCriterion("memory_frequency not like", value, "memoryFrequency");
            return (Criteria) this;
        }

        public Criteria andMemoryFrequencyIn(List<String> values) {
            addCriterion("memory_frequency in", values, "memoryFrequency");
            return (Criteria) this;
        }

        public Criteria andMemoryFrequencyNotIn(List<String> values) {
            addCriterion("memory_frequency not in", values, "memoryFrequency");
            return (Criteria) this;
        }

        public Criteria andMemoryFrequencyBetween(String value1, String value2) {
            addCriterion("memory_frequency between", value1, value2, "memoryFrequency");
            return (Criteria) this;
        }

        public Criteria andMemoryFrequencyNotBetween(String value1, String value2) {
            addCriterion("memory_frequency not between", value1, value2, "memoryFrequency");
            return (Criteria) this;
        }

        public Criteria andMemoryTypeIsNull() {
            addCriterion("memory_type is null");
            return (Criteria) this;
        }

        public Criteria andMemoryTypeIsNotNull() {
            addCriterion("memory_type is not null");
            return (Criteria) this;
        }

        public Criteria andMemoryTypeEqualTo(String value) {
            addCriterion("memory_type =", value, "memoryType");
            return (Criteria) this;
        }

        public Criteria andMemoryTypeNotEqualTo(String value) {
            addCriterion("memory_type <>", value, "memoryType");
            return (Criteria) this;
        }

        public Criteria andMemoryTypeGreaterThan(String value) {
            addCriterion("memory_type >", value, "memoryType");
            return (Criteria) this;
        }

        public Criteria andMemoryTypeGreaterThanOrEqualTo(String value) {
            addCriterion("memory_type >=", value, "memoryType");
            return (Criteria) this;
        }

        public Criteria andMemoryTypeLessThan(String value) {
            addCriterion("memory_type <", value, "memoryType");
            return (Criteria) this;
        }

        public Criteria andMemoryTypeLessThanOrEqualTo(String value) {
            addCriterion("memory_type <=", value, "memoryType");
            return (Criteria) this;
        }

        public Criteria andMemoryTypeLike(String value) {
            addCriterion("memory_type like", value, "memoryType");
            return (Criteria) this;
        }

        public Criteria andMemoryTypeNotLike(String value) {
            addCriterion("memory_type not like", value, "memoryType");
            return (Criteria) this;
        }

        public Criteria andMemoryTypeIn(List<String> values) {
            addCriterion("memory_type in", values, "memoryType");
            return (Criteria) this;
        }

        public Criteria andMemoryTypeNotIn(List<String> values) {
            addCriterion("memory_type not in", values, "memoryType");
            return (Criteria) this;
        }

        public Criteria andMemoryTypeBetween(String value1, String value2) {
            addCriterion("memory_type between", value1, value2, "memoryType");
            return (Criteria) this;
        }

        public Criteria andMemoryTypeNotBetween(String value1, String value2) {
            addCriterion("memory_type not between", value1, value2, "memoryType");
            return (Criteria) this;
        }

        public Criteria andMemoryCapacityIsNull() {
            addCriterion("memory_capacity is null");
            return (Criteria) this;
        }

        public Criteria andMemoryCapacityIsNotNull() {
            addCriterion("memory_capacity is not null");
            return (Criteria) this;
        }

        public Criteria andMemoryCapacityEqualTo(String value) {
            addCriterion("memory_capacity =", value, "memoryCapacity");
            return (Criteria) this;
        }

        public Criteria andMemoryCapacityNotEqualTo(String value) {
            addCriterion("memory_capacity <>", value, "memoryCapacity");
            return (Criteria) this;
        }

        public Criteria andMemoryCapacityGreaterThan(String value) {
            addCriterion("memory_capacity >", value, "memoryCapacity");
            return (Criteria) this;
        }

        public Criteria andMemoryCapacityGreaterThanOrEqualTo(String value) {
            addCriterion("memory_capacity >=", value, "memoryCapacity");
            return (Criteria) this;
        }

        public Criteria andMemoryCapacityLessThan(String value) {
            addCriterion("memory_capacity <", value, "memoryCapacity");
            return (Criteria) this;
        }

        public Criteria andMemoryCapacityLessThanOrEqualTo(String value) {
            addCriterion("memory_capacity <=", value, "memoryCapacity");
            return (Criteria) this;
        }

        public Criteria andMemoryCapacityLike(String value) {
            addCriterion("memory_capacity like", value, "memoryCapacity");
            return (Criteria) this;
        }

        public Criteria andMemoryCapacityNotLike(String value) {
            addCriterion("memory_capacity not like", value, "memoryCapacity");
            return (Criteria) this;
        }

        public Criteria andMemoryCapacityIn(List<String> values) {
            addCriterion("memory_capacity in", values, "memoryCapacity");
            return (Criteria) this;
        }

        public Criteria andMemoryCapacityNotIn(List<String> values) {
            addCriterion("memory_capacity not in", values, "memoryCapacity");
            return (Criteria) this;
        }

        public Criteria andMemoryCapacityBetween(String value1, String value2) {
            addCriterion("memory_capacity between", value1, value2, "memoryCapacity");
            return (Criteria) this;
        }

        public Criteria andMemoryCapacityNotBetween(String value1, String value2) {
            addCriterion("memory_capacity not between", value1, value2, "memoryCapacity");
            return (Criteria) this;
        }

        public Criteria andMemoryBandwidthIsNull() {
            addCriterion("memory_bandwidth is null");
            return (Criteria) this;
        }

        public Criteria andMemoryBandwidthIsNotNull() {
            addCriterion("memory_bandwidth is not null");
            return (Criteria) this;
        }

        public Criteria andMemoryBandwidthEqualTo(String value) {
            addCriterion("memory_bandwidth =", value, "memoryBandwidth");
            return (Criteria) this;
        }

        public Criteria andMemoryBandwidthNotEqualTo(String value) {
            addCriterion("memory_bandwidth <>", value, "memoryBandwidth");
            return (Criteria) this;
        }

        public Criteria andMemoryBandwidthGreaterThan(String value) {
            addCriterion("memory_bandwidth >", value, "memoryBandwidth");
            return (Criteria) this;
        }

        public Criteria andMemoryBandwidthGreaterThanOrEqualTo(String value) {
            addCriterion("memory_bandwidth >=", value, "memoryBandwidth");
            return (Criteria) this;
        }

        public Criteria andMemoryBandwidthLessThan(String value) {
            addCriterion("memory_bandwidth <", value, "memoryBandwidth");
            return (Criteria) this;
        }

        public Criteria andMemoryBandwidthLessThanOrEqualTo(String value) {
            addCriterion("memory_bandwidth <=", value, "memoryBandwidth");
            return (Criteria) this;
        }

        public Criteria andMemoryBandwidthLike(String value) {
            addCriterion("memory_bandwidth like", value, "memoryBandwidth");
            return (Criteria) this;
        }

        public Criteria andMemoryBandwidthNotLike(String value) {
            addCriterion("memory_bandwidth not like", value, "memoryBandwidth");
            return (Criteria) this;
        }

        public Criteria andMemoryBandwidthIn(List<String> values) {
            addCriterion("memory_bandwidth in", values, "memoryBandwidth");
            return (Criteria) this;
        }

        public Criteria andMemoryBandwidthNotIn(List<String> values) {
            addCriterion("memory_bandwidth not in", values, "memoryBandwidth");
            return (Criteria) this;
        }

        public Criteria andMemoryBandwidthBetween(String value1, String value2) {
            addCriterion("memory_bandwidth between", value1, value2, "memoryBandwidth");
            return (Criteria) this;
        }

        public Criteria andMemoryBandwidthNotBetween(String value1, String value2) {
            addCriterion("memory_bandwidth not between", value1, value2, "memoryBandwidth");
            return (Criteria) this;
        }

        public Criteria andMaximumResolutionIsNull() {
            addCriterion("maximum_resolution is null");
            return (Criteria) this;
        }

        public Criteria andMaximumResolutionIsNotNull() {
            addCriterion("maximum_resolution is not null");
            return (Criteria) this;
        }

        public Criteria andMaximumResolutionEqualTo(String value) {
            addCriterion("maximum_resolution =", value, "maximumResolution");
            return (Criteria) this;
        }

        public Criteria andMaximumResolutionNotEqualTo(String value) {
            addCriterion("maximum_resolution <>", value, "maximumResolution");
            return (Criteria) this;
        }

        public Criteria andMaximumResolutionGreaterThan(String value) {
            addCriterion("maximum_resolution >", value, "maximumResolution");
            return (Criteria) this;
        }

        public Criteria andMaximumResolutionGreaterThanOrEqualTo(String value) {
            addCriterion("maximum_resolution >=", value, "maximumResolution");
            return (Criteria) this;
        }

        public Criteria andMaximumResolutionLessThan(String value) {
            addCriterion("maximum_resolution <", value, "maximumResolution");
            return (Criteria) this;
        }

        public Criteria andMaximumResolutionLessThanOrEqualTo(String value) {
            addCriterion("maximum_resolution <=", value, "maximumResolution");
            return (Criteria) this;
        }

        public Criteria andMaximumResolutionLike(String value) {
            addCriterion("maximum_resolution like", value, "maximumResolution");
            return (Criteria) this;
        }

        public Criteria andMaximumResolutionNotLike(String value) {
            addCriterion("maximum_resolution not like", value, "maximumResolution");
            return (Criteria) this;
        }

        public Criteria andMaximumResolutionIn(List<String> values) {
            addCriterion("maximum_resolution in", values, "maximumResolution");
            return (Criteria) this;
        }

        public Criteria andMaximumResolutionNotIn(List<String> values) {
            addCriterion("maximum_resolution not in", values, "maximumResolution");
            return (Criteria) this;
        }

        public Criteria andMaximumResolutionBetween(String value1, String value2) {
            addCriterion("maximum_resolution between", value1, value2, "maximumResolution");
            return (Criteria) this;
        }

        public Criteria andMaximumResolutionNotBetween(String value1, String value2) {
            addCriterion("maximum_resolution not between", value1, value2, "maximumResolution");
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

        public Criteria andIoInterfaceIsNull() {
            addCriterion("io_interface is null");
            return (Criteria) this;
        }

        public Criteria andIoInterfaceIsNotNull() {
            addCriterion("io_interface is not null");
            return (Criteria) this;
        }

        public Criteria andIoInterfaceEqualTo(String value) {
            addCriterion("io_interface =", value, "ioInterface");
            return (Criteria) this;
        }

        public Criteria andIoInterfaceNotEqualTo(String value) {
            addCriterion("io_interface <>", value, "ioInterface");
            return (Criteria) this;
        }

        public Criteria andIoInterfaceGreaterThan(String value) {
            addCriterion("io_interface >", value, "ioInterface");
            return (Criteria) this;
        }

        public Criteria andIoInterfaceGreaterThanOrEqualTo(String value) {
            addCriterion("io_interface >=", value, "ioInterface");
            return (Criteria) this;
        }

        public Criteria andIoInterfaceLessThan(String value) {
            addCriterion("io_interface <", value, "ioInterface");
            return (Criteria) this;
        }

        public Criteria andIoInterfaceLessThanOrEqualTo(String value) {
            addCriterion("io_interface <=", value, "ioInterface");
            return (Criteria) this;
        }

        public Criteria andIoInterfaceLike(String value) {
            addCriterion("io_interface like", value, "ioInterface");
            return (Criteria) this;
        }

        public Criteria andIoInterfaceNotLike(String value) {
            addCriterion("io_interface not like", value, "ioInterface");
            return (Criteria) this;
        }

        public Criteria andIoInterfaceIn(List<String> values) {
            addCriterion("io_interface in", values, "ioInterface");
            return (Criteria) this;
        }

        public Criteria andIoInterfaceNotIn(List<String> values) {
            addCriterion("io_interface not in", values, "ioInterface");
            return (Criteria) this;
        }

        public Criteria andIoInterfaceBetween(String value1, String value2) {
            addCriterion("io_interface between", value1, value2, "ioInterface");
            return (Criteria) this;
        }

        public Criteria andIoInterfaceNotBetween(String value1, String value2) {
            addCriterion("io_interface not between", value1, value2, "ioInterface");
            return (Criteria) this;
        }

        public Criteria andPowerInterfaceIsNull() {
            addCriterion("power_interface is null");
            return (Criteria) this;
        }

        public Criteria andPowerInterfaceIsNotNull() {
            addCriterion("power_interface is not null");
            return (Criteria) this;
        }

        public Criteria andPowerInterfaceEqualTo(String value) {
            addCriterion("power_interface =", value, "powerInterface");
            return (Criteria) this;
        }

        public Criteria andPowerInterfaceNotEqualTo(String value) {
            addCriterion("power_interface <>", value, "powerInterface");
            return (Criteria) this;
        }

        public Criteria andPowerInterfaceGreaterThan(String value) {
            addCriterion("power_interface >", value, "powerInterface");
            return (Criteria) this;
        }

        public Criteria andPowerInterfaceGreaterThanOrEqualTo(String value) {
            addCriterion("power_interface >=", value, "powerInterface");
            return (Criteria) this;
        }

        public Criteria andPowerInterfaceLessThan(String value) {
            addCriterion("power_interface <", value, "powerInterface");
            return (Criteria) this;
        }

        public Criteria andPowerInterfaceLessThanOrEqualTo(String value) {
            addCriterion("power_interface <=", value, "powerInterface");
            return (Criteria) this;
        }

        public Criteria andPowerInterfaceLike(String value) {
            addCriterion("power_interface like", value, "powerInterface");
            return (Criteria) this;
        }

        public Criteria andPowerInterfaceNotLike(String value) {
            addCriterion("power_interface not like", value, "powerInterface");
            return (Criteria) this;
        }

        public Criteria andPowerInterfaceIn(List<String> values) {
            addCriterion("power_interface in", values, "powerInterface");
            return (Criteria) this;
        }

        public Criteria andPowerInterfaceNotIn(List<String> values) {
            addCriterion("power_interface not in", values, "powerInterface");
            return (Criteria) this;
        }

        public Criteria andPowerInterfaceBetween(String value1, String value2) {
            addCriterion("power_interface between", value1, value2, "powerInterface");
            return (Criteria) this;
        }

        public Criteria andPowerInterfaceNotBetween(String value1, String value2) {
            addCriterion("power_interface not between", value1, value2, "powerInterface");
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