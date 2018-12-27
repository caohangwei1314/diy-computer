package com.example.demo.product.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MotherboardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public MotherboardExample() {
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

        public Criteria andIntegratedChipIsNull() {
            addCriterion("integrated_chip is null");
            return (Criteria) this;
        }

        public Criteria andIntegratedChipIsNotNull() {
            addCriterion("integrated_chip is not null");
            return (Criteria) this;
        }

        public Criteria andIntegratedChipEqualTo(String value) {
            addCriterion("integrated_chip =", value, "integratedChip");
            return (Criteria) this;
        }

        public Criteria andIntegratedChipNotEqualTo(String value) {
            addCriterion("integrated_chip <>", value, "integratedChip");
            return (Criteria) this;
        }

        public Criteria andIntegratedChipGreaterThan(String value) {
            addCriterion("integrated_chip >", value, "integratedChip");
            return (Criteria) this;
        }

        public Criteria andIntegratedChipGreaterThanOrEqualTo(String value) {
            addCriterion("integrated_chip >=", value, "integratedChip");
            return (Criteria) this;
        }

        public Criteria andIntegratedChipLessThan(String value) {
            addCriterion("integrated_chip <", value, "integratedChip");
            return (Criteria) this;
        }

        public Criteria andIntegratedChipLessThanOrEqualTo(String value) {
            addCriterion("integrated_chip <=", value, "integratedChip");
            return (Criteria) this;
        }

        public Criteria andIntegratedChipLike(String value) {
            addCriterion("integrated_chip like", value, "integratedChip");
            return (Criteria) this;
        }

        public Criteria andIntegratedChipNotLike(String value) {
            addCriterion("integrated_chip not like", value, "integratedChip");
            return (Criteria) this;
        }

        public Criteria andIntegratedChipIn(List<String> values) {
            addCriterion("integrated_chip in", values, "integratedChip");
            return (Criteria) this;
        }

        public Criteria andIntegratedChipNotIn(List<String> values) {
            addCriterion("integrated_chip not in", values, "integratedChip");
            return (Criteria) this;
        }

        public Criteria andIntegratedChipBetween(String value1, String value2) {
            addCriterion("integrated_chip between", value1, value2, "integratedChip");
            return (Criteria) this;
        }

        public Criteria andIntegratedChipNotBetween(String value1, String value2) {
            addCriterion("integrated_chip not between", value1, value2, "integratedChip");
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

        public Criteria andMainChipsetIsNull() {
            addCriterion("main_chipset is null");
            return (Criteria) this;
        }

        public Criteria andMainChipsetIsNotNull() {
            addCriterion("main_chipset is not null");
            return (Criteria) this;
        }

        public Criteria andMainChipsetEqualTo(String value) {
            addCriterion("main_chipset =", value, "mainChipset");
            return (Criteria) this;
        }

        public Criteria andMainChipsetNotEqualTo(String value) {
            addCriterion("main_chipset <>", value, "mainChipset");
            return (Criteria) this;
        }

        public Criteria andMainChipsetGreaterThan(String value) {
            addCriterion("main_chipset >", value, "mainChipset");
            return (Criteria) this;
        }

        public Criteria andMainChipsetGreaterThanOrEqualTo(String value) {
            addCriterion("main_chipset >=", value, "mainChipset");
            return (Criteria) this;
        }

        public Criteria andMainChipsetLessThan(String value) {
            addCriterion("main_chipset <", value, "mainChipset");
            return (Criteria) this;
        }

        public Criteria andMainChipsetLessThanOrEqualTo(String value) {
            addCriterion("main_chipset <=", value, "mainChipset");
            return (Criteria) this;
        }

        public Criteria andMainChipsetLike(String value) {
            addCriterion("main_chipset like", value, "mainChipset");
            return (Criteria) this;
        }

        public Criteria andMainChipsetNotLike(String value) {
            addCriterion("main_chipset not like", value, "mainChipset");
            return (Criteria) this;
        }

        public Criteria andMainChipsetIn(List<String> values) {
            addCriterion("main_chipset in", values, "mainChipset");
            return (Criteria) this;
        }

        public Criteria andMainChipsetNotIn(List<String> values) {
            addCriterion("main_chipset not in", values, "mainChipset");
            return (Criteria) this;
        }

        public Criteria andMainChipsetBetween(String value1, String value2) {
            addCriterion("main_chipset between", value1, value2, "mainChipset");
            return (Criteria) this;
        }

        public Criteria andMainChipsetNotBetween(String value1, String value2) {
            addCriterion("main_chipset not between", value1, value2, "mainChipset");
            return (Criteria) this;
        }

        public Criteria andDisplayChipIsNull() {
            addCriterion("display_chip is null");
            return (Criteria) this;
        }

        public Criteria andDisplayChipIsNotNull() {
            addCriterion("display_chip is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayChipEqualTo(String value) {
            addCriterion("display_chip =", value, "displayChip");
            return (Criteria) this;
        }

        public Criteria andDisplayChipNotEqualTo(String value) {
            addCriterion("display_chip <>", value, "displayChip");
            return (Criteria) this;
        }

        public Criteria andDisplayChipGreaterThan(String value) {
            addCriterion("display_chip >", value, "displayChip");
            return (Criteria) this;
        }

        public Criteria andDisplayChipGreaterThanOrEqualTo(String value) {
            addCriterion("display_chip >=", value, "displayChip");
            return (Criteria) this;
        }

        public Criteria andDisplayChipLessThan(String value) {
            addCriterion("display_chip <", value, "displayChip");
            return (Criteria) this;
        }

        public Criteria andDisplayChipLessThanOrEqualTo(String value) {
            addCriterion("display_chip <=", value, "displayChip");
            return (Criteria) this;
        }

        public Criteria andDisplayChipLike(String value) {
            addCriterion("display_chip like", value, "displayChip");
            return (Criteria) this;
        }

        public Criteria andDisplayChipNotLike(String value) {
            addCriterion("display_chip not like", value, "displayChip");
            return (Criteria) this;
        }

        public Criteria andDisplayChipIn(List<String> values) {
            addCriterion("display_chip in", values, "displayChip");
            return (Criteria) this;
        }

        public Criteria andDisplayChipNotIn(List<String> values) {
            addCriterion("display_chip not in", values, "displayChip");
            return (Criteria) this;
        }

        public Criteria andDisplayChipBetween(String value1, String value2) {
            addCriterion("display_chip between", value1, value2, "displayChip");
            return (Criteria) this;
        }

        public Criteria andDisplayChipNotBetween(String value1, String value2) {
            addCriterion("display_chip not between", value1, value2, "displayChip");
            return (Criteria) this;
        }

        public Criteria andAudioChipIsNull() {
            addCriterion("audio_chip is null");
            return (Criteria) this;
        }

        public Criteria andAudioChipIsNotNull() {
            addCriterion("audio_chip is not null");
            return (Criteria) this;
        }

        public Criteria andAudioChipEqualTo(String value) {
            addCriterion("audio_chip =", value, "audioChip");
            return (Criteria) this;
        }

        public Criteria andAudioChipNotEqualTo(String value) {
            addCriterion("audio_chip <>", value, "audioChip");
            return (Criteria) this;
        }

        public Criteria andAudioChipGreaterThan(String value) {
            addCriterion("audio_chip >", value, "audioChip");
            return (Criteria) this;
        }

        public Criteria andAudioChipGreaterThanOrEqualTo(String value) {
            addCriterion("audio_chip >=", value, "audioChip");
            return (Criteria) this;
        }

        public Criteria andAudioChipLessThan(String value) {
            addCriterion("audio_chip <", value, "audioChip");
            return (Criteria) this;
        }

        public Criteria andAudioChipLessThanOrEqualTo(String value) {
            addCriterion("audio_chip <=", value, "audioChip");
            return (Criteria) this;
        }

        public Criteria andAudioChipLike(String value) {
            addCriterion("audio_chip like", value, "audioChip");
            return (Criteria) this;
        }

        public Criteria andAudioChipNotLike(String value) {
            addCriterion("audio_chip not like", value, "audioChip");
            return (Criteria) this;
        }

        public Criteria andAudioChipIn(List<String> values) {
            addCriterion("audio_chip in", values, "audioChip");
            return (Criteria) this;
        }

        public Criteria andAudioChipNotIn(List<String> values) {
            addCriterion("audio_chip not in", values, "audioChip");
            return (Criteria) this;
        }

        public Criteria andAudioChipBetween(String value1, String value2) {
            addCriterion("audio_chip between", value1, value2, "audioChip");
            return (Criteria) this;
        }

        public Criteria andAudioChipNotBetween(String value1, String value2) {
            addCriterion("audio_chip not between", value1, value2, "audioChip");
            return (Criteria) this;
        }

        public Criteria andNicChipIsNull() {
            addCriterion("nic_chip is null");
            return (Criteria) this;
        }

        public Criteria andNicChipIsNotNull() {
            addCriterion("nic_chip is not null");
            return (Criteria) this;
        }

        public Criteria andNicChipEqualTo(String value) {
            addCriterion("nic_chip =", value, "nicChip");
            return (Criteria) this;
        }

        public Criteria andNicChipNotEqualTo(String value) {
            addCriterion("nic_chip <>", value, "nicChip");
            return (Criteria) this;
        }

        public Criteria andNicChipGreaterThan(String value) {
            addCriterion("nic_chip >", value, "nicChip");
            return (Criteria) this;
        }

        public Criteria andNicChipGreaterThanOrEqualTo(String value) {
            addCriterion("nic_chip >=", value, "nicChip");
            return (Criteria) this;
        }

        public Criteria andNicChipLessThan(String value) {
            addCriterion("nic_chip <", value, "nicChip");
            return (Criteria) this;
        }

        public Criteria andNicChipLessThanOrEqualTo(String value) {
            addCriterion("nic_chip <=", value, "nicChip");
            return (Criteria) this;
        }

        public Criteria andNicChipLike(String value) {
            addCriterion("nic_chip like", value, "nicChip");
            return (Criteria) this;
        }

        public Criteria andNicChipNotLike(String value) {
            addCriterion("nic_chip not like", value, "nicChip");
            return (Criteria) this;
        }

        public Criteria andNicChipIn(List<String> values) {
            addCriterion("nic_chip in", values, "nicChip");
            return (Criteria) this;
        }

        public Criteria andNicChipNotIn(List<String> values) {
            addCriterion("nic_chip not in", values, "nicChip");
            return (Criteria) this;
        }

        public Criteria andNicChipBetween(String value1, String value2) {
            addCriterion("nic_chip between", value1, value2, "nicChip");
            return (Criteria) this;
        }

        public Criteria andNicChipNotBetween(String value1, String value2) {
            addCriterion("nic_chip not between", value1, value2, "nicChip");
            return (Criteria) this;
        }

        public Criteria andCpuTypeIsNull() {
            addCriterion("cpu_type is null");
            return (Criteria) this;
        }

        public Criteria andCpuTypeIsNotNull() {
            addCriterion("cpu_type is not null");
            return (Criteria) this;
        }

        public Criteria andCpuTypeEqualTo(String value) {
            addCriterion("cpu_type =", value, "cpuType");
            return (Criteria) this;
        }

        public Criteria andCpuTypeNotEqualTo(String value) {
            addCriterion("cpu_type <>", value, "cpuType");
            return (Criteria) this;
        }

        public Criteria andCpuTypeGreaterThan(String value) {
            addCriterion("cpu_type >", value, "cpuType");
            return (Criteria) this;
        }

        public Criteria andCpuTypeGreaterThanOrEqualTo(String value) {
            addCriterion("cpu_type >=", value, "cpuType");
            return (Criteria) this;
        }

        public Criteria andCpuTypeLessThan(String value) {
            addCriterion("cpu_type <", value, "cpuType");
            return (Criteria) this;
        }

        public Criteria andCpuTypeLessThanOrEqualTo(String value) {
            addCriterion("cpu_type <=", value, "cpuType");
            return (Criteria) this;
        }

        public Criteria andCpuTypeLike(String value) {
            addCriterion("cpu_type like", value, "cpuType");
            return (Criteria) this;
        }

        public Criteria andCpuTypeNotLike(String value) {
            addCriterion("cpu_type not like", value, "cpuType");
            return (Criteria) this;
        }

        public Criteria andCpuTypeIn(List<String> values) {
            addCriterion("cpu_type in", values, "cpuType");
            return (Criteria) this;
        }

        public Criteria andCpuTypeNotIn(List<String> values) {
            addCriterion("cpu_type not in", values, "cpuType");
            return (Criteria) this;
        }

        public Criteria andCpuTypeBetween(String value1, String value2) {
            addCriterion("cpu_type between", value1, value2, "cpuType");
            return (Criteria) this;
        }

        public Criteria andCpuTypeNotBetween(String value1, String value2) {
            addCriterion("cpu_type not between", value1, value2, "cpuType");
            return (Criteria) this;
        }

        public Criteria andCpuSocketIsNull() {
            addCriterion("cpu_socket is null");
            return (Criteria) this;
        }

        public Criteria andCpuSocketIsNotNull() {
            addCriterion("cpu_socket is not null");
            return (Criteria) this;
        }

        public Criteria andCpuSocketEqualTo(String value) {
            addCriterion("cpu_socket =", value, "cpuSocket");
            return (Criteria) this;
        }

        public Criteria andCpuSocketNotEqualTo(String value) {
            addCriterion("cpu_socket <>", value, "cpuSocket");
            return (Criteria) this;
        }

        public Criteria andCpuSocketGreaterThan(String value) {
            addCriterion("cpu_socket >", value, "cpuSocket");
            return (Criteria) this;
        }

        public Criteria andCpuSocketGreaterThanOrEqualTo(String value) {
            addCriterion("cpu_socket >=", value, "cpuSocket");
            return (Criteria) this;
        }

        public Criteria andCpuSocketLessThan(String value) {
            addCriterion("cpu_socket <", value, "cpuSocket");
            return (Criteria) this;
        }

        public Criteria andCpuSocketLessThanOrEqualTo(String value) {
            addCriterion("cpu_socket <=", value, "cpuSocket");
            return (Criteria) this;
        }

        public Criteria andCpuSocketLike(String value) {
            addCriterion("cpu_socket like", value, "cpuSocket");
            return (Criteria) this;
        }

        public Criteria andCpuSocketNotLike(String value) {
            addCriterion("cpu_socket not like", value, "cpuSocket");
            return (Criteria) this;
        }

        public Criteria andCpuSocketIn(List<String> values) {
            addCriterion("cpu_socket in", values, "cpuSocket");
            return (Criteria) this;
        }

        public Criteria andCpuSocketNotIn(List<String> values) {
            addCriterion("cpu_socket not in", values, "cpuSocket");
            return (Criteria) this;
        }

        public Criteria andCpuSocketBetween(String value1, String value2) {
            addCriterion("cpu_socket between", value1, value2, "cpuSocket");
            return (Criteria) this;
        }

        public Criteria andCpuSocketNotBetween(String value1, String value2) {
            addCriterion("cpu_socket not between", value1, value2, "cpuSocket");
            return (Criteria) this;
        }

        public Criteria andRamTypeIsNull() {
            addCriterion("ram_type is null");
            return (Criteria) this;
        }

        public Criteria andRamTypeIsNotNull() {
            addCriterion("ram_type is not null");
            return (Criteria) this;
        }

        public Criteria andRamTypeEqualTo(String value) {
            addCriterion("ram_type =", value, "ramType");
            return (Criteria) this;
        }

        public Criteria andRamTypeNotEqualTo(String value) {
            addCriterion("ram_type <>", value, "ramType");
            return (Criteria) this;
        }

        public Criteria andRamTypeGreaterThan(String value) {
            addCriterion("ram_type >", value, "ramType");
            return (Criteria) this;
        }

        public Criteria andRamTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ram_type >=", value, "ramType");
            return (Criteria) this;
        }

        public Criteria andRamTypeLessThan(String value) {
            addCriterion("ram_type <", value, "ramType");
            return (Criteria) this;
        }

        public Criteria andRamTypeLessThanOrEqualTo(String value) {
            addCriterion("ram_type <=", value, "ramType");
            return (Criteria) this;
        }

        public Criteria andRamTypeLike(String value) {
            addCriterion("ram_type like", value, "ramType");
            return (Criteria) this;
        }

        public Criteria andRamTypeNotLike(String value) {
            addCriterion("ram_type not like", value, "ramType");
            return (Criteria) this;
        }

        public Criteria andRamTypeIn(List<String> values) {
            addCriterion("ram_type in", values, "ramType");
            return (Criteria) this;
        }

        public Criteria andRamTypeNotIn(List<String> values) {
            addCriterion("ram_type not in", values, "ramType");
            return (Criteria) this;
        }

        public Criteria andRamTypeBetween(String value1, String value2) {
            addCriterion("ram_type between", value1, value2, "ramType");
            return (Criteria) this;
        }

        public Criteria andRamTypeNotBetween(String value1, String value2) {
            addCriterion("ram_type not between", value1, value2, "ramType");
            return (Criteria) this;
        }

        public Criteria andMaxRamIsNull() {
            addCriterion("max_ram is null");
            return (Criteria) this;
        }

        public Criteria andMaxRamIsNotNull() {
            addCriterion("max_ram is not null");
            return (Criteria) this;
        }

        public Criteria andMaxRamEqualTo(String value) {
            addCriterion("max_ram =", value, "maxRam");
            return (Criteria) this;
        }

        public Criteria andMaxRamNotEqualTo(String value) {
            addCriterion("max_ram <>", value, "maxRam");
            return (Criteria) this;
        }

        public Criteria andMaxRamGreaterThan(String value) {
            addCriterion("max_ram >", value, "maxRam");
            return (Criteria) this;
        }

        public Criteria andMaxRamGreaterThanOrEqualTo(String value) {
            addCriterion("max_ram >=", value, "maxRam");
            return (Criteria) this;
        }

        public Criteria andMaxRamLessThan(String value) {
            addCriterion("max_ram <", value, "maxRam");
            return (Criteria) this;
        }

        public Criteria andMaxRamLessThanOrEqualTo(String value) {
            addCriterion("max_ram <=", value, "maxRam");
            return (Criteria) this;
        }

        public Criteria andMaxRamLike(String value) {
            addCriterion("max_ram like", value, "maxRam");
            return (Criteria) this;
        }

        public Criteria andMaxRamNotLike(String value) {
            addCriterion("max_ram not like", value, "maxRam");
            return (Criteria) this;
        }

        public Criteria andMaxRamIn(List<String> values) {
            addCriterion("max_ram in", values, "maxRam");
            return (Criteria) this;
        }

        public Criteria andMaxRamNotIn(List<String> values) {
            addCriterion("max_ram not in", values, "maxRam");
            return (Criteria) this;
        }

        public Criteria andMaxRamBetween(String value1, String value2) {
            addCriterion("max_ram between", value1, value2, "maxRam");
            return (Criteria) this;
        }

        public Criteria andMaxRamNotBetween(String value1, String value2) {
            addCriterion("max_ram not between", value1, value2, "maxRam");
            return (Criteria) this;
        }

        public Criteria andRamDescriptionIsNull() {
            addCriterion("ram_description is null");
            return (Criteria) this;
        }

        public Criteria andRamDescriptionIsNotNull() {
            addCriterion("ram_description is not null");
            return (Criteria) this;
        }

        public Criteria andRamDescriptionEqualTo(String value) {
            addCriterion("ram_description =", value, "ramDescription");
            return (Criteria) this;
        }

        public Criteria andRamDescriptionNotEqualTo(String value) {
            addCriterion("ram_description <>", value, "ramDescription");
            return (Criteria) this;
        }

        public Criteria andRamDescriptionGreaterThan(String value) {
            addCriterion("ram_description >", value, "ramDescription");
            return (Criteria) this;
        }

        public Criteria andRamDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("ram_description >=", value, "ramDescription");
            return (Criteria) this;
        }

        public Criteria andRamDescriptionLessThan(String value) {
            addCriterion("ram_description <", value, "ramDescription");
            return (Criteria) this;
        }

        public Criteria andRamDescriptionLessThanOrEqualTo(String value) {
            addCriterion("ram_description <=", value, "ramDescription");
            return (Criteria) this;
        }

        public Criteria andRamDescriptionLike(String value) {
            addCriterion("ram_description like", value, "ramDescription");
            return (Criteria) this;
        }

        public Criteria andRamDescriptionNotLike(String value) {
            addCriterion("ram_description not like", value, "ramDescription");
            return (Criteria) this;
        }

        public Criteria andRamDescriptionIn(List<String> values) {
            addCriterion("ram_description in", values, "ramDescription");
            return (Criteria) this;
        }

        public Criteria andRamDescriptionNotIn(List<String> values) {
            addCriterion("ram_description not in", values, "ramDescription");
            return (Criteria) this;
        }

        public Criteria andRamDescriptionBetween(String value1, String value2) {
            addCriterion("ram_description between", value1, value2, "ramDescription");
            return (Criteria) this;
        }

        public Criteria andRamDescriptionNotBetween(String value1, String value2) {
            addCriterion("ram_description not between", value1, value2, "ramDescription");
            return (Criteria) this;
        }

        public Criteria andPciEIsNull() {
            addCriterion("pci_e is null");
            return (Criteria) this;
        }

        public Criteria andPciEIsNotNull() {
            addCriterion("pci_e is not null");
            return (Criteria) this;
        }

        public Criteria andPciEEqualTo(String value) {
            addCriterion("pci_e =", value, "pciE");
            return (Criteria) this;
        }

        public Criteria andPciENotEqualTo(String value) {
            addCriterion("pci_e <>", value, "pciE");
            return (Criteria) this;
        }

        public Criteria andPciEGreaterThan(String value) {
            addCriterion("pci_e >", value, "pciE");
            return (Criteria) this;
        }

        public Criteria andPciEGreaterThanOrEqualTo(String value) {
            addCriterion("pci_e >=", value, "pciE");
            return (Criteria) this;
        }

        public Criteria andPciELessThan(String value) {
            addCriterion("pci_e <", value, "pciE");
            return (Criteria) this;
        }

        public Criteria andPciELessThanOrEqualTo(String value) {
            addCriterion("pci_e <=", value, "pciE");
            return (Criteria) this;
        }

        public Criteria andPciELike(String value) {
            addCriterion("pci_e like", value, "pciE");
            return (Criteria) this;
        }

        public Criteria andPciENotLike(String value) {
            addCriterion("pci_e not like", value, "pciE");
            return (Criteria) this;
        }

        public Criteria andPciEIn(List<String> values) {
            addCriterion("pci_e in", values, "pciE");
            return (Criteria) this;
        }

        public Criteria andPciENotIn(List<String> values) {
            addCriterion("pci_e not in", values, "pciE");
            return (Criteria) this;
        }

        public Criteria andPciEBetween(String value1, String value2) {
            addCriterion("pci_e between", value1, value2, "pciE");
            return (Criteria) this;
        }

        public Criteria andPciENotBetween(String value1, String value2) {
            addCriterion("pci_e not between", value1, value2, "pciE");
            return (Criteria) this;
        }

        public Criteria andPciESocketIsNull() {
            addCriterion("pci_e_socket is null");
            return (Criteria) this;
        }

        public Criteria andPciESocketIsNotNull() {
            addCriterion("pci_e_socket is not null");
            return (Criteria) this;
        }

        public Criteria andPciESocketEqualTo(String value) {
            addCriterion("pci_e_socket =", value, "pciESocket");
            return (Criteria) this;
        }

        public Criteria andPciESocketNotEqualTo(String value) {
            addCriterion("pci_e_socket <>", value, "pciESocket");
            return (Criteria) this;
        }

        public Criteria andPciESocketGreaterThan(String value) {
            addCriterion("pci_e_socket >", value, "pciESocket");
            return (Criteria) this;
        }

        public Criteria andPciESocketGreaterThanOrEqualTo(String value) {
            addCriterion("pci_e_socket >=", value, "pciESocket");
            return (Criteria) this;
        }

        public Criteria andPciESocketLessThan(String value) {
            addCriterion("pci_e_socket <", value, "pciESocket");
            return (Criteria) this;
        }

        public Criteria andPciESocketLessThanOrEqualTo(String value) {
            addCriterion("pci_e_socket <=", value, "pciESocket");
            return (Criteria) this;
        }

        public Criteria andPciESocketLike(String value) {
            addCriterion("pci_e_socket like", value, "pciESocket");
            return (Criteria) this;
        }

        public Criteria andPciESocketNotLike(String value) {
            addCriterion("pci_e_socket not like", value, "pciESocket");
            return (Criteria) this;
        }

        public Criteria andPciESocketIn(List<String> values) {
            addCriterion("pci_e_socket in", values, "pciESocket");
            return (Criteria) this;
        }

        public Criteria andPciESocketNotIn(List<String> values) {
            addCriterion("pci_e_socket not in", values, "pciESocket");
            return (Criteria) this;
        }

        public Criteria andPciESocketBetween(String value1, String value2) {
            addCriterion("pci_e_socket between", value1, value2, "pciESocket");
            return (Criteria) this;
        }

        public Criteria andPciESocketNotBetween(String value1, String value2) {
            addCriterion("pci_e_socket not between", value1, value2, "pciESocket");
            return (Criteria) this;
        }

        public Criteria andStorageInterfaceIsNull() {
            addCriterion("storage_interface is null");
            return (Criteria) this;
        }

        public Criteria andStorageInterfaceIsNotNull() {
            addCriterion("storage_interface is not null");
            return (Criteria) this;
        }

        public Criteria andStorageInterfaceEqualTo(String value) {
            addCriterion("storage_interface =", value, "storageInterface");
            return (Criteria) this;
        }

        public Criteria andStorageInterfaceNotEqualTo(String value) {
            addCriterion("storage_interface <>", value, "storageInterface");
            return (Criteria) this;
        }

        public Criteria andStorageInterfaceGreaterThan(String value) {
            addCriterion("storage_interface >", value, "storageInterface");
            return (Criteria) this;
        }

        public Criteria andStorageInterfaceGreaterThanOrEqualTo(String value) {
            addCriterion("storage_interface >=", value, "storageInterface");
            return (Criteria) this;
        }

        public Criteria andStorageInterfaceLessThan(String value) {
            addCriterion("storage_interface <", value, "storageInterface");
            return (Criteria) this;
        }

        public Criteria andStorageInterfaceLessThanOrEqualTo(String value) {
            addCriterion("storage_interface <=", value, "storageInterface");
            return (Criteria) this;
        }

        public Criteria andStorageInterfaceLike(String value) {
            addCriterion("storage_interface like", value, "storageInterface");
            return (Criteria) this;
        }

        public Criteria andStorageInterfaceNotLike(String value) {
            addCriterion("storage_interface not like", value, "storageInterface");
            return (Criteria) this;
        }

        public Criteria andStorageInterfaceIn(List<String> values) {
            addCriterion("storage_interface in", values, "storageInterface");
            return (Criteria) this;
        }

        public Criteria andStorageInterfaceNotIn(List<String> values) {
            addCriterion("storage_interface not in", values, "storageInterface");
            return (Criteria) this;
        }

        public Criteria andStorageInterfaceBetween(String value1, String value2) {
            addCriterion("storage_interface between", value1, value2, "storageInterface");
            return (Criteria) this;
        }

        public Criteria andStorageInterfaceNotBetween(String value1, String value2) {
            addCriterion("storage_interface not between", value1, value2, "storageInterface");
            return (Criteria) this;
        }

        public Criteria andUsbIsNull() {
            addCriterion("usb is null");
            return (Criteria) this;
        }

        public Criteria andUsbIsNotNull() {
            addCriterion("usb is not null");
            return (Criteria) this;
        }

        public Criteria andUsbEqualTo(String value) {
            addCriterion("usb =", value, "usb");
            return (Criteria) this;
        }

        public Criteria andUsbNotEqualTo(String value) {
            addCriterion("usb <>", value, "usb");
            return (Criteria) this;
        }

        public Criteria andUsbGreaterThan(String value) {
            addCriterion("usb >", value, "usb");
            return (Criteria) this;
        }

        public Criteria andUsbGreaterThanOrEqualTo(String value) {
            addCriterion("usb >=", value, "usb");
            return (Criteria) this;
        }

        public Criteria andUsbLessThan(String value) {
            addCriterion("usb <", value, "usb");
            return (Criteria) this;
        }

        public Criteria andUsbLessThanOrEqualTo(String value) {
            addCriterion("usb <=", value, "usb");
            return (Criteria) this;
        }

        public Criteria andUsbLike(String value) {
            addCriterion("usb like", value, "usb");
            return (Criteria) this;
        }

        public Criteria andUsbNotLike(String value) {
            addCriterion("usb not like", value, "usb");
            return (Criteria) this;
        }

        public Criteria andUsbIn(List<String> values) {
            addCriterion("usb in", values, "usb");
            return (Criteria) this;
        }

        public Criteria andUsbNotIn(List<String> values) {
            addCriterion("usb not in", values, "usb");
            return (Criteria) this;
        }

        public Criteria andUsbBetween(String value1, String value2) {
            addCriterion("usb between", value1, value2, "usb");
            return (Criteria) this;
        }

        public Criteria andUsbNotBetween(String value1, String value2) {
            addCriterion("usb not between", value1, value2, "usb");
            return (Criteria) this;
        }

        public Criteria andVideoIsNull() {
            addCriterion("video is null");
            return (Criteria) this;
        }

        public Criteria andVideoIsNotNull() {
            addCriterion("video is not null");
            return (Criteria) this;
        }

        public Criteria andVideoEqualTo(String value) {
            addCriterion("video =", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotEqualTo(String value) {
            addCriterion("video <>", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoGreaterThan(String value) {
            addCriterion("video >", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoGreaterThanOrEqualTo(String value) {
            addCriterion("video >=", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoLessThan(String value) {
            addCriterion("video <", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoLessThanOrEqualTo(String value) {
            addCriterion("video <=", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoLike(String value) {
            addCriterion("video like", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotLike(String value) {
            addCriterion("video not like", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoIn(List<String> values) {
            addCriterion("video in", values, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotIn(List<String> values) {
            addCriterion("video not in", values, "video");
            return (Criteria) this;
        }

        public Criteria andVideoBetween(String value1, String value2) {
            addCriterion("video between", value1, value2, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotBetween(String value1, String value2) {
            addCriterion("video not between", value1, value2, "video");
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

        public Criteria andOtherIsNull() {
            addCriterion("other is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("other is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(String value) {
            addCriterion("other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(String value) {
            addCriterion("other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(String value) {
            addCriterion("other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(String value) {
            addCriterion("other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(String value) {
            addCriterion("other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(String value) {
            addCriterion("other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLike(String value) {
            addCriterion("other like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotLike(String value) {
            addCriterion("other not like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<String> values) {
            addCriterion("other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<String> values) {
            addCriterion("other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(String value1, String value2) {
            addCriterion("other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(String value1, String value2) {
            addCriterion("other not between", value1, value2, "other");
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

        public Criteria andShapeIsNull() {
            addCriterion("shape is null");
            return (Criteria) this;
        }

        public Criteria andShapeIsNotNull() {
            addCriterion("shape is not null");
            return (Criteria) this;
        }

        public Criteria andShapeEqualTo(String value) {
            addCriterion("shape =", value, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeNotEqualTo(String value) {
            addCriterion("shape <>", value, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeGreaterThan(String value) {
            addCriterion("shape >", value, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeGreaterThanOrEqualTo(String value) {
            addCriterion("shape >=", value, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeLessThan(String value) {
            addCriterion("shape <", value, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeLessThanOrEqualTo(String value) {
            addCriterion("shape <=", value, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeLike(String value) {
            addCriterion("shape like", value, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeNotLike(String value) {
            addCriterion("shape not like", value, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeIn(List<String> values) {
            addCriterion("shape in", values, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeNotIn(List<String> values) {
            addCriterion("shape not in", values, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeBetween(String value1, String value2) {
            addCriterion("shape between", value1, value2, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeNotBetween(String value1, String value2) {
            addCriterion("shape not between", value1, value2, "shape");
            return (Criteria) this;
        }

        public Criteria andBiosIsNull() {
            addCriterion("bios is null");
            return (Criteria) this;
        }

        public Criteria andBiosIsNotNull() {
            addCriterion("bios is not null");
            return (Criteria) this;
        }

        public Criteria andBiosEqualTo(String value) {
            addCriterion("bios =", value, "bios");
            return (Criteria) this;
        }

        public Criteria andBiosNotEqualTo(String value) {
            addCriterion("bios <>", value, "bios");
            return (Criteria) this;
        }

        public Criteria andBiosGreaterThan(String value) {
            addCriterion("bios >", value, "bios");
            return (Criteria) this;
        }

        public Criteria andBiosGreaterThanOrEqualTo(String value) {
            addCriterion("bios >=", value, "bios");
            return (Criteria) this;
        }

        public Criteria andBiosLessThan(String value) {
            addCriterion("bios <", value, "bios");
            return (Criteria) this;
        }

        public Criteria andBiosLessThanOrEqualTo(String value) {
            addCriterion("bios <=", value, "bios");
            return (Criteria) this;
        }

        public Criteria andBiosLike(String value) {
            addCriterion("bios like", value, "bios");
            return (Criteria) this;
        }

        public Criteria andBiosNotLike(String value) {
            addCriterion("bios not like", value, "bios");
            return (Criteria) this;
        }

        public Criteria andBiosIn(List<String> values) {
            addCriterion("bios in", values, "bios");
            return (Criteria) this;
        }

        public Criteria andBiosNotIn(List<String> values) {
            addCriterion("bios not in", values, "bios");
            return (Criteria) this;
        }

        public Criteria andBiosBetween(String value1, String value2) {
            addCriterion("bios between", value1, value2, "bios");
            return (Criteria) this;
        }

        public Criteria andBiosNotBetween(String value1, String value2) {
            addCriterion("bios not between", value1, value2, "bios");
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