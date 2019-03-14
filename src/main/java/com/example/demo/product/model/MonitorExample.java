package com.example.demo.product.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MonitorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public MonitorExample() {
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

        public Criteria andProductTypeIsNull() {
            addCriterion("product_type is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNotNull() {
            addCriterion("product_type is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeEqualTo(String value) {
            addCriterion("product_type =", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotEqualTo(String value) {
            addCriterion("product_type <>", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThan(String value) {
            addCriterion("product_type >", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThanOrEqualTo(String value) {
            addCriterion("product_type >=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThan(String value) {
            addCriterion("product_type <", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThanOrEqualTo(String value) {
            addCriterion("product_type <=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLike(String value) {
            addCriterion("product_type like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotLike(String value) {
            addCriterion("product_type not like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIn(List<String> values) {
            addCriterion("product_type in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotIn(List<String> values) {
            addCriterion("product_type not in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeBetween(String value1, String value2) {
            addCriterion("product_type between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotBetween(String value1, String value2) {
            addCriterion("product_type not between", value1, value2, "productType");
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

        public Criteria andOptimalResolutionIsNull() {
            addCriterion("optimal_resolution is null");
            return (Criteria) this;
        }

        public Criteria andOptimalResolutionIsNotNull() {
            addCriterion("optimal_resolution is not null");
            return (Criteria) this;
        }

        public Criteria andOptimalResolutionEqualTo(String value) {
            addCriterion("optimal_resolution =", value, "optimalResolution");
            return (Criteria) this;
        }

        public Criteria andOptimalResolutionNotEqualTo(String value) {
            addCriterion("optimal_resolution <>", value, "optimalResolution");
            return (Criteria) this;
        }

        public Criteria andOptimalResolutionGreaterThan(String value) {
            addCriterion("optimal_resolution >", value, "optimalResolution");
            return (Criteria) this;
        }

        public Criteria andOptimalResolutionGreaterThanOrEqualTo(String value) {
            addCriterion("optimal_resolution >=", value, "optimalResolution");
            return (Criteria) this;
        }

        public Criteria andOptimalResolutionLessThan(String value) {
            addCriterion("optimal_resolution <", value, "optimalResolution");
            return (Criteria) this;
        }

        public Criteria andOptimalResolutionLessThanOrEqualTo(String value) {
            addCriterion("optimal_resolution <=", value, "optimalResolution");
            return (Criteria) this;
        }

        public Criteria andOptimalResolutionLike(String value) {
            addCriterion("optimal_resolution like", value, "optimalResolution");
            return (Criteria) this;
        }

        public Criteria andOptimalResolutionNotLike(String value) {
            addCriterion("optimal_resolution not like", value, "optimalResolution");
            return (Criteria) this;
        }

        public Criteria andOptimalResolutionIn(List<String> values) {
            addCriterion("optimal_resolution in", values, "optimalResolution");
            return (Criteria) this;
        }

        public Criteria andOptimalResolutionNotIn(List<String> values) {
            addCriterion("optimal_resolution not in", values, "optimalResolution");
            return (Criteria) this;
        }

        public Criteria andOptimalResolutionBetween(String value1, String value2) {
            addCriterion("optimal_resolution between", value1, value2, "optimalResolution");
            return (Criteria) this;
        }

        public Criteria andOptimalResolutionNotBetween(String value1, String value2) {
            addCriterion("optimal_resolution not between", value1, value2, "optimalResolution");
            return (Criteria) this;
        }

        public Criteria andRatioIsNull() {
            addCriterion("ratio is null");
            return (Criteria) this;
        }

        public Criteria andRatioIsNotNull() {
            addCriterion("ratio is not null");
            return (Criteria) this;
        }

        public Criteria andRatioEqualTo(String value) {
            addCriterion("ratio =", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioNotEqualTo(String value) {
            addCriterion("ratio <>", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioGreaterThan(String value) {
            addCriterion("ratio >", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioGreaterThanOrEqualTo(String value) {
            addCriterion("ratio >=", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioLessThan(String value) {
            addCriterion("ratio <", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioLessThanOrEqualTo(String value) {
            addCriterion("ratio <=", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioLike(String value) {
            addCriterion("ratio like", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioNotLike(String value) {
            addCriterion("ratio not like", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioIn(List<String> values) {
            addCriterion("ratio in", values, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioNotIn(List<String> values) {
            addCriterion("ratio not in", values, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioBetween(String value1, String value2) {
            addCriterion("ratio between", value1, value2, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioNotBetween(String value1, String value2) {
            addCriterion("ratio not between", value1, value2, "ratio");
            return (Criteria) this;
        }

        public Criteria andHdIsNull() {
            addCriterion("hd is null");
            return (Criteria) this;
        }

        public Criteria andHdIsNotNull() {
            addCriterion("hd is not null");
            return (Criteria) this;
        }

        public Criteria andHdEqualTo(String value) {
            addCriterion("hd =", value, "hd");
            return (Criteria) this;
        }

        public Criteria andHdNotEqualTo(String value) {
            addCriterion("hd <>", value, "hd");
            return (Criteria) this;
        }

        public Criteria andHdGreaterThan(String value) {
            addCriterion("hd >", value, "hd");
            return (Criteria) this;
        }

        public Criteria andHdGreaterThanOrEqualTo(String value) {
            addCriterion("hd >=", value, "hd");
            return (Criteria) this;
        }

        public Criteria andHdLessThan(String value) {
            addCriterion("hd <", value, "hd");
            return (Criteria) this;
        }

        public Criteria andHdLessThanOrEqualTo(String value) {
            addCriterion("hd <=", value, "hd");
            return (Criteria) this;
        }

        public Criteria andHdLike(String value) {
            addCriterion("hd like", value, "hd");
            return (Criteria) this;
        }

        public Criteria andHdNotLike(String value) {
            addCriterion("hd not like", value, "hd");
            return (Criteria) this;
        }

        public Criteria andHdIn(List<String> values) {
            addCriterion("hd in", values, "hd");
            return (Criteria) this;
        }

        public Criteria andHdNotIn(List<String> values) {
            addCriterion("hd not in", values, "hd");
            return (Criteria) this;
        }

        public Criteria andHdBetween(String value1, String value2) {
            addCriterion("hd between", value1, value2, "hd");
            return (Criteria) this;
        }

        public Criteria andHdNotBetween(String value1, String value2) {
            addCriterion("hd not between", value1, value2, "hd");
            return (Criteria) this;
        }

        public Criteria andPanelTypeIsNull() {
            addCriterion("panel_type is null");
            return (Criteria) this;
        }

        public Criteria andPanelTypeIsNotNull() {
            addCriterion("panel_type is not null");
            return (Criteria) this;
        }

        public Criteria andPanelTypeEqualTo(String value) {
            addCriterion("panel_type =", value, "panelType");
            return (Criteria) this;
        }

        public Criteria andPanelTypeNotEqualTo(String value) {
            addCriterion("panel_type <>", value, "panelType");
            return (Criteria) this;
        }

        public Criteria andPanelTypeGreaterThan(String value) {
            addCriterion("panel_type >", value, "panelType");
            return (Criteria) this;
        }

        public Criteria andPanelTypeGreaterThanOrEqualTo(String value) {
            addCriterion("panel_type >=", value, "panelType");
            return (Criteria) this;
        }

        public Criteria andPanelTypeLessThan(String value) {
            addCriterion("panel_type <", value, "panelType");
            return (Criteria) this;
        }

        public Criteria andPanelTypeLessThanOrEqualTo(String value) {
            addCriterion("panel_type <=", value, "panelType");
            return (Criteria) this;
        }

        public Criteria andPanelTypeLike(String value) {
            addCriterion("panel_type like", value, "panelType");
            return (Criteria) this;
        }

        public Criteria andPanelTypeNotLike(String value) {
            addCriterion("panel_type not like", value, "panelType");
            return (Criteria) this;
        }

        public Criteria andPanelTypeIn(List<String> values) {
            addCriterion("panel_type in", values, "panelType");
            return (Criteria) this;
        }

        public Criteria andPanelTypeNotIn(List<String> values) {
            addCriterion("panel_type not in", values, "panelType");
            return (Criteria) this;
        }

        public Criteria andPanelTypeBetween(String value1, String value2) {
            addCriterion("panel_type between", value1, value2, "panelType");
            return (Criteria) this;
        }

        public Criteria andPanelTypeNotBetween(String value1, String value2) {
            addCriterion("panel_type not between", value1, value2, "panelType");
            return (Criteria) this;
        }

        public Criteria andBacklightTypeIsNull() {
            addCriterion("backlight_type is null");
            return (Criteria) this;
        }

        public Criteria andBacklightTypeIsNotNull() {
            addCriterion("backlight_type is not null");
            return (Criteria) this;
        }

        public Criteria andBacklightTypeEqualTo(String value) {
            addCriterion("backlight_type =", value, "backlightType");
            return (Criteria) this;
        }

        public Criteria andBacklightTypeNotEqualTo(String value) {
            addCriterion("backlight_type <>", value, "backlightType");
            return (Criteria) this;
        }

        public Criteria andBacklightTypeGreaterThan(String value) {
            addCriterion("backlight_type >", value, "backlightType");
            return (Criteria) this;
        }

        public Criteria andBacklightTypeGreaterThanOrEqualTo(String value) {
            addCriterion("backlight_type >=", value, "backlightType");
            return (Criteria) this;
        }

        public Criteria andBacklightTypeLessThan(String value) {
            addCriterion("backlight_type <", value, "backlightType");
            return (Criteria) this;
        }

        public Criteria andBacklightTypeLessThanOrEqualTo(String value) {
            addCriterion("backlight_type <=", value, "backlightType");
            return (Criteria) this;
        }

        public Criteria andBacklightTypeLike(String value) {
            addCriterion("backlight_type like", value, "backlightType");
            return (Criteria) this;
        }

        public Criteria andBacklightTypeNotLike(String value) {
            addCriterion("backlight_type not like", value, "backlightType");
            return (Criteria) this;
        }

        public Criteria andBacklightTypeIn(List<String> values) {
            addCriterion("backlight_type in", values, "backlightType");
            return (Criteria) this;
        }

        public Criteria andBacklightTypeNotIn(List<String> values) {
            addCriterion("backlight_type not in", values, "backlightType");
            return (Criteria) this;
        }

        public Criteria andBacklightTypeBetween(String value1, String value2) {
            addCriterion("backlight_type between", value1, value2, "backlightType");
            return (Criteria) this;
        }

        public Criteria andBacklightTypeNotBetween(String value1, String value2) {
            addCriterion("backlight_type not between", value1, value2, "backlightType");
            return (Criteria) this;
        }

        public Criteria andDynamicContrastIsNull() {
            addCriterion("dynamic_contrast is null");
            return (Criteria) this;
        }

        public Criteria andDynamicContrastIsNotNull() {
            addCriterion("dynamic_contrast is not null");
            return (Criteria) this;
        }

        public Criteria andDynamicContrastEqualTo(String value) {
            addCriterion("dynamic_contrast =", value, "dynamicContrast");
            return (Criteria) this;
        }

        public Criteria andDynamicContrastNotEqualTo(String value) {
            addCriterion("dynamic_contrast <>", value, "dynamicContrast");
            return (Criteria) this;
        }

        public Criteria andDynamicContrastGreaterThan(String value) {
            addCriterion("dynamic_contrast >", value, "dynamicContrast");
            return (Criteria) this;
        }

        public Criteria andDynamicContrastGreaterThanOrEqualTo(String value) {
            addCriterion("dynamic_contrast >=", value, "dynamicContrast");
            return (Criteria) this;
        }

        public Criteria andDynamicContrastLessThan(String value) {
            addCriterion("dynamic_contrast <", value, "dynamicContrast");
            return (Criteria) this;
        }

        public Criteria andDynamicContrastLessThanOrEqualTo(String value) {
            addCriterion("dynamic_contrast <=", value, "dynamicContrast");
            return (Criteria) this;
        }

        public Criteria andDynamicContrastLike(String value) {
            addCriterion("dynamic_contrast like", value, "dynamicContrast");
            return (Criteria) this;
        }

        public Criteria andDynamicContrastNotLike(String value) {
            addCriterion("dynamic_contrast not like", value, "dynamicContrast");
            return (Criteria) this;
        }

        public Criteria andDynamicContrastIn(List<String> values) {
            addCriterion("dynamic_contrast in", values, "dynamicContrast");
            return (Criteria) this;
        }

        public Criteria andDynamicContrastNotIn(List<String> values) {
            addCriterion("dynamic_contrast not in", values, "dynamicContrast");
            return (Criteria) this;
        }

        public Criteria andDynamicContrastBetween(String value1, String value2) {
            addCriterion("dynamic_contrast between", value1, value2, "dynamicContrast");
            return (Criteria) this;
        }

        public Criteria andDynamicContrastNotBetween(String value1, String value2) {
            addCriterion("dynamic_contrast not between", value1, value2, "dynamicContrast");
            return (Criteria) this;
        }

        public Criteria andStaticContrastIsNull() {
            addCriterion("static_contrast is null");
            return (Criteria) this;
        }

        public Criteria andStaticContrastIsNotNull() {
            addCriterion("static_contrast is not null");
            return (Criteria) this;
        }

        public Criteria andStaticContrastEqualTo(String value) {
            addCriterion("static_contrast =", value, "staticContrast");
            return (Criteria) this;
        }

        public Criteria andStaticContrastNotEqualTo(String value) {
            addCriterion("static_contrast <>", value, "staticContrast");
            return (Criteria) this;
        }

        public Criteria andStaticContrastGreaterThan(String value) {
            addCriterion("static_contrast >", value, "staticContrast");
            return (Criteria) this;
        }

        public Criteria andStaticContrastGreaterThanOrEqualTo(String value) {
            addCriterion("static_contrast >=", value, "staticContrast");
            return (Criteria) this;
        }

        public Criteria andStaticContrastLessThan(String value) {
            addCriterion("static_contrast <", value, "staticContrast");
            return (Criteria) this;
        }

        public Criteria andStaticContrastLessThanOrEqualTo(String value) {
            addCriterion("static_contrast <=", value, "staticContrast");
            return (Criteria) this;
        }

        public Criteria andStaticContrastLike(String value) {
            addCriterion("static_contrast like", value, "staticContrast");
            return (Criteria) this;
        }

        public Criteria andStaticContrastNotLike(String value) {
            addCriterion("static_contrast not like", value, "staticContrast");
            return (Criteria) this;
        }

        public Criteria andStaticContrastIn(List<String> values) {
            addCriterion("static_contrast in", values, "staticContrast");
            return (Criteria) this;
        }

        public Criteria andStaticContrastNotIn(List<String> values) {
            addCriterion("static_contrast not in", values, "staticContrast");
            return (Criteria) this;
        }

        public Criteria andStaticContrastBetween(String value1, String value2) {
            addCriterion("static_contrast between", value1, value2, "staticContrast");
            return (Criteria) this;
        }

        public Criteria andStaticContrastNotBetween(String value1, String value2) {
            addCriterion("static_contrast not between", value1, value2, "staticContrast");
            return (Criteria) this;
        }

        public Criteria andResponseTimeIsNull() {
            addCriterion("response_time is null");
            return (Criteria) this;
        }

        public Criteria andResponseTimeIsNotNull() {
            addCriterion("response_time is not null");
            return (Criteria) this;
        }

        public Criteria andResponseTimeEqualTo(String value) {
            addCriterion("response_time =", value, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeNotEqualTo(String value) {
            addCriterion("response_time <>", value, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeGreaterThan(String value) {
            addCriterion("response_time >", value, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeGreaterThanOrEqualTo(String value) {
            addCriterion("response_time >=", value, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeLessThan(String value) {
            addCriterion("response_time <", value, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeLessThanOrEqualTo(String value) {
            addCriterion("response_time <=", value, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeLike(String value) {
            addCriterion("response_time like", value, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeNotLike(String value) {
            addCriterion("response_time not like", value, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeIn(List<String> values) {
            addCriterion("response_time in", values, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeNotIn(List<String> values) {
            addCriterion("response_time not in", values, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeBetween(String value1, String value2) {
            addCriterion("response_time between", value1, value2, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeNotBetween(String value1, String value2) {
            addCriterion("response_time not between", value1, value2, "responseTime");
            return (Criteria) this;
        }

        public Criteria andPointDistanceIsNull() {
            addCriterion("point_distance is null");
            return (Criteria) this;
        }

        public Criteria andPointDistanceIsNotNull() {
            addCriterion("point_distance is not null");
            return (Criteria) this;
        }

        public Criteria andPointDistanceEqualTo(String value) {
            addCriterion("point_distance =", value, "pointDistance");
            return (Criteria) this;
        }

        public Criteria andPointDistanceNotEqualTo(String value) {
            addCriterion("point_distance <>", value, "pointDistance");
            return (Criteria) this;
        }

        public Criteria andPointDistanceGreaterThan(String value) {
            addCriterion("point_distance >", value, "pointDistance");
            return (Criteria) this;
        }

        public Criteria andPointDistanceGreaterThanOrEqualTo(String value) {
            addCriterion("point_distance >=", value, "pointDistance");
            return (Criteria) this;
        }

        public Criteria andPointDistanceLessThan(String value) {
            addCriterion("point_distance <", value, "pointDistance");
            return (Criteria) this;
        }

        public Criteria andPointDistanceLessThanOrEqualTo(String value) {
            addCriterion("point_distance <=", value, "pointDistance");
            return (Criteria) this;
        }

        public Criteria andPointDistanceLike(String value) {
            addCriterion("point_distance like", value, "pointDistance");
            return (Criteria) this;
        }

        public Criteria andPointDistanceNotLike(String value) {
            addCriterion("point_distance not like", value, "pointDistance");
            return (Criteria) this;
        }

        public Criteria andPointDistanceIn(List<String> values) {
            addCriterion("point_distance in", values, "pointDistance");
            return (Criteria) this;
        }

        public Criteria andPointDistanceNotIn(List<String> values) {
            addCriterion("point_distance not in", values, "pointDistance");
            return (Criteria) this;
        }

        public Criteria andPointDistanceBetween(String value1, String value2) {
            addCriterion("point_distance between", value1, value2, "pointDistance");
            return (Criteria) this;
        }

        public Criteria andPointDistanceNotBetween(String value1, String value2) {
            addCriterion("point_distance not between", value1, value2, "pointDistance");
            return (Criteria) this;
        }

        public Criteria andBrightnessIsNull() {
            addCriterion("brightness is null");
            return (Criteria) this;
        }

        public Criteria andBrightnessIsNotNull() {
            addCriterion("brightness is not null");
            return (Criteria) this;
        }

        public Criteria andBrightnessEqualTo(String value) {
            addCriterion("brightness =", value, "brightness");
            return (Criteria) this;
        }

        public Criteria andBrightnessNotEqualTo(String value) {
            addCriterion("brightness <>", value, "brightness");
            return (Criteria) this;
        }

        public Criteria andBrightnessGreaterThan(String value) {
            addCriterion("brightness >", value, "brightness");
            return (Criteria) this;
        }

        public Criteria andBrightnessGreaterThanOrEqualTo(String value) {
            addCriterion("brightness >=", value, "brightness");
            return (Criteria) this;
        }

        public Criteria andBrightnessLessThan(String value) {
            addCriterion("brightness <", value, "brightness");
            return (Criteria) this;
        }

        public Criteria andBrightnessLessThanOrEqualTo(String value) {
            addCriterion("brightness <=", value, "brightness");
            return (Criteria) this;
        }

        public Criteria andBrightnessLike(String value) {
            addCriterion("brightness like", value, "brightness");
            return (Criteria) this;
        }

        public Criteria andBrightnessNotLike(String value) {
            addCriterion("brightness not like", value, "brightness");
            return (Criteria) this;
        }

        public Criteria andBrightnessIn(List<String> values) {
            addCriterion("brightness in", values, "brightness");
            return (Criteria) this;
        }

        public Criteria andBrightnessNotIn(List<String> values) {
            addCriterion("brightness not in", values, "brightness");
            return (Criteria) this;
        }

        public Criteria andBrightnessBetween(String value1, String value2) {
            addCriterion("brightness between", value1, value2, "brightness");
            return (Criteria) this;
        }

        public Criteria andBrightnessNotBetween(String value1, String value2) {
            addCriterion("brightness not between", value1, value2, "brightness");
            return (Criteria) this;
        }

        public Criteria andVisibleAreaIsNull() {
            addCriterion("visible_area is null");
            return (Criteria) this;
        }

        public Criteria andVisibleAreaIsNotNull() {
            addCriterion("visible_area is not null");
            return (Criteria) this;
        }

        public Criteria andVisibleAreaEqualTo(String value) {
            addCriterion("visible_area =", value, "visibleArea");
            return (Criteria) this;
        }

        public Criteria andVisibleAreaNotEqualTo(String value) {
            addCriterion("visible_area <>", value, "visibleArea");
            return (Criteria) this;
        }

        public Criteria andVisibleAreaGreaterThan(String value) {
            addCriterion("visible_area >", value, "visibleArea");
            return (Criteria) this;
        }

        public Criteria andVisibleAreaGreaterThanOrEqualTo(String value) {
            addCriterion("visible_area >=", value, "visibleArea");
            return (Criteria) this;
        }

        public Criteria andVisibleAreaLessThan(String value) {
            addCriterion("visible_area <", value, "visibleArea");
            return (Criteria) this;
        }

        public Criteria andVisibleAreaLessThanOrEqualTo(String value) {
            addCriterion("visible_area <=", value, "visibleArea");
            return (Criteria) this;
        }

        public Criteria andVisibleAreaLike(String value) {
            addCriterion("visible_area like", value, "visibleArea");
            return (Criteria) this;
        }

        public Criteria andVisibleAreaNotLike(String value) {
            addCriterion("visible_area not like", value, "visibleArea");
            return (Criteria) this;
        }

        public Criteria andVisibleAreaIn(List<String> values) {
            addCriterion("visible_area in", values, "visibleArea");
            return (Criteria) this;
        }

        public Criteria andVisibleAreaNotIn(List<String> values) {
            addCriterion("visible_area not in", values, "visibleArea");
            return (Criteria) this;
        }

        public Criteria andVisibleAreaBetween(String value1, String value2) {
            addCriterion("visible_area between", value1, value2, "visibleArea");
            return (Criteria) this;
        }

        public Criteria andVisibleAreaNotBetween(String value1, String value2) {
            addCriterion("visible_area not between", value1, value2, "visibleArea");
            return (Criteria) this;
        }

        public Criteria andVisibleAngleIsNull() {
            addCriterion("visible_angle is null");
            return (Criteria) this;
        }

        public Criteria andVisibleAngleIsNotNull() {
            addCriterion("visible_angle is not null");
            return (Criteria) this;
        }

        public Criteria andVisibleAngleEqualTo(String value) {
            addCriterion("visible_angle =", value, "visibleAngle");
            return (Criteria) this;
        }

        public Criteria andVisibleAngleNotEqualTo(String value) {
            addCriterion("visible_angle <>", value, "visibleAngle");
            return (Criteria) this;
        }

        public Criteria andVisibleAngleGreaterThan(String value) {
            addCriterion("visible_angle >", value, "visibleAngle");
            return (Criteria) this;
        }

        public Criteria andVisibleAngleGreaterThanOrEqualTo(String value) {
            addCriterion("visible_angle >=", value, "visibleAngle");
            return (Criteria) this;
        }

        public Criteria andVisibleAngleLessThan(String value) {
            addCriterion("visible_angle <", value, "visibleAngle");
            return (Criteria) this;
        }

        public Criteria andVisibleAngleLessThanOrEqualTo(String value) {
            addCriterion("visible_angle <=", value, "visibleAngle");
            return (Criteria) this;
        }

        public Criteria andVisibleAngleLike(String value) {
            addCriterion("visible_angle like", value, "visibleAngle");
            return (Criteria) this;
        }

        public Criteria andVisibleAngleNotLike(String value) {
            addCriterion("visible_angle not like", value, "visibleAngle");
            return (Criteria) this;
        }

        public Criteria andVisibleAngleIn(List<String> values) {
            addCriterion("visible_angle in", values, "visibleAngle");
            return (Criteria) this;
        }

        public Criteria andVisibleAngleNotIn(List<String> values) {
            addCriterion("visible_angle not in", values, "visibleAngle");
            return (Criteria) this;
        }

        public Criteria andVisibleAngleBetween(String value1, String value2) {
            addCriterion("visible_angle between", value1, value2, "visibleAngle");
            return (Criteria) this;
        }

        public Criteria andVisibleAngleNotBetween(String value1, String value2) {
            addCriterion("visible_angle not between", value1, value2, "visibleAngle");
            return (Criteria) this;
        }

        public Criteria andDisplayColorIsNull() {
            addCriterion("display_color is null");
            return (Criteria) this;
        }

        public Criteria andDisplayColorIsNotNull() {
            addCriterion("display_color is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayColorEqualTo(String value) {
            addCriterion("display_color =", value, "displayColor");
            return (Criteria) this;
        }

        public Criteria andDisplayColorNotEqualTo(String value) {
            addCriterion("display_color <>", value, "displayColor");
            return (Criteria) this;
        }

        public Criteria andDisplayColorGreaterThan(String value) {
            addCriterion("display_color >", value, "displayColor");
            return (Criteria) this;
        }

        public Criteria andDisplayColorGreaterThanOrEqualTo(String value) {
            addCriterion("display_color >=", value, "displayColor");
            return (Criteria) this;
        }

        public Criteria andDisplayColorLessThan(String value) {
            addCriterion("display_color <", value, "displayColor");
            return (Criteria) this;
        }

        public Criteria andDisplayColorLessThanOrEqualTo(String value) {
            addCriterion("display_color <=", value, "displayColor");
            return (Criteria) this;
        }

        public Criteria andDisplayColorLike(String value) {
            addCriterion("display_color like", value, "displayColor");
            return (Criteria) this;
        }

        public Criteria andDisplayColorNotLike(String value) {
            addCriterion("display_color not like", value, "displayColor");
            return (Criteria) this;
        }

        public Criteria andDisplayColorIn(List<String> values) {
            addCriterion("display_color in", values, "displayColor");
            return (Criteria) this;
        }

        public Criteria andDisplayColorNotIn(List<String> values) {
            addCriterion("display_color not in", values, "displayColor");
            return (Criteria) this;
        }

        public Criteria andDisplayColorBetween(String value1, String value2) {
            addCriterion("display_color between", value1, value2, "displayColor");
            return (Criteria) this;
        }

        public Criteria andDisplayColorNotBetween(String value1, String value2) {
            addCriterion("display_color not between", value1, value2, "displayColor");
            return (Criteria) this;
        }

        public Criteria andScanningIsNull() {
            addCriterion("scanning is null");
            return (Criteria) this;
        }

        public Criteria andScanningIsNotNull() {
            addCriterion("scanning is not null");
            return (Criteria) this;
        }

        public Criteria andScanningEqualTo(String value) {
            addCriterion("scanning =", value, "scanning");
            return (Criteria) this;
        }

        public Criteria andScanningNotEqualTo(String value) {
            addCriterion("scanning <>", value, "scanning");
            return (Criteria) this;
        }

        public Criteria andScanningGreaterThan(String value) {
            addCriterion("scanning >", value, "scanning");
            return (Criteria) this;
        }

        public Criteria andScanningGreaterThanOrEqualTo(String value) {
            addCriterion("scanning >=", value, "scanning");
            return (Criteria) this;
        }

        public Criteria andScanningLessThan(String value) {
            addCriterion("scanning <", value, "scanning");
            return (Criteria) this;
        }

        public Criteria andScanningLessThanOrEqualTo(String value) {
            addCriterion("scanning <=", value, "scanning");
            return (Criteria) this;
        }

        public Criteria andScanningLike(String value) {
            addCriterion("scanning like", value, "scanning");
            return (Criteria) this;
        }

        public Criteria andScanningNotLike(String value) {
            addCriterion("scanning not like", value, "scanning");
            return (Criteria) this;
        }

        public Criteria andScanningIn(List<String> values) {
            addCriterion("scanning in", values, "scanning");
            return (Criteria) this;
        }

        public Criteria andScanningNotIn(List<String> values) {
            addCriterion("scanning not in", values, "scanning");
            return (Criteria) this;
        }

        public Criteria andScanningBetween(String value1, String value2) {
            addCriterion("scanning between", value1, value2, "scanning");
            return (Criteria) this;
        }

        public Criteria andScanningNotBetween(String value1, String value2) {
            addCriterion("scanning not between", value1, value2, "scanning");
            return (Criteria) this;
        }

        public Criteria andRefreshRateIsNull() {
            addCriterion("refresh_rate is null");
            return (Criteria) this;
        }

        public Criteria andRefreshRateIsNotNull() {
            addCriterion("refresh_rate is not null");
            return (Criteria) this;
        }

        public Criteria andRefreshRateEqualTo(String value) {
            addCriterion("refresh_rate =", value, "refreshRate");
            return (Criteria) this;
        }

        public Criteria andRefreshRateNotEqualTo(String value) {
            addCriterion("refresh_rate <>", value, "refreshRate");
            return (Criteria) this;
        }

        public Criteria andRefreshRateGreaterThan(String value) {
            addCriterion("refresh_rate >", value, "refreshRate");
            return (Criteria) this;
        }

        public Criteria andRefreshRateGreaterThanOrEqualTo(String value) {
            addCriterion("refresh_rate >=", value, "refreshRate");
            return (Criteria) this;
        }

        public Criteria andRefreshRateLessThan(String value) {
            addCriterion("refresh_rate <", value, "refreshRate");
            return (Criteria) this;
        }

        public Criteria andRefreshRateLessThanOrEqualTo(String value) {
            addCriterion("refresh_rate <=", value, "refreshRate");
            return (Criteria) this;
        }

        public Criteria andRefreshRateLike(String value) {
            addCriterion("refresh_rate like", value, "refreshRate");
            return (Criteria) this;
        }

        public Criteria andRefreshRateNotLike(String value) {
            addCriterion("refresh_rate not like", value, "refreshRate");
            return (Criteria) this;
        }

        public Criteria andRefreshRateIn(List<String> values) {
            addCriterion("refresh_rate in", values, "refreshRate");
            return (Criteria) this;
        }

        public Criteria andRefreshRateNotIn(List<String> values) {
            addCriterion("refresh_rate not in", values, "refreshRate");
            return (Criteria) this;
        }

        public Criteria andRefreshRateBetween(String value1, String value2) {
            addCriterion("refresh_rate between", value1, value2, "refreshRate");
            return (Criteria) this;
        }

        public Criteria andRefreshRateNotBetween(String value1, String value2) {
            addCriterion("refresh_rate not between", value1, value2, "refreshRate");
            return (Criteria) this;
        }

        public Criteria andVideoInterfaceIsNull() {
            addCriterion("video_interface is null");
            return (Criteria) this;
        }

        public Criteria andVideoInterfaceIsNotNull() {
            addCriterion("video_interface is not null");
            return (Criteria) this;
        }

        public Criteria andVideoInterfaceEqualTo(String value) {
            addCriterion("video_interface =", value, "videoInterface");
            return (Criteria) this;
        }

        public Criteria andVideoInterfaceNotEqualTo(String value) {
            addCriterion("video_interface <>", value, "videoInterface");
            return (Criteria) this;
        }

        public Criteria andVideoInterfaceGreaterThan(String value) {
            addCriterion("video_interface >", value, "videoInterface");
            return (Criteria) this;
        }

        public Criteria andVideoInterfaceGreaterThanOrEqualTo(String value) {
            addCriterion("video_interface >=", value, "videoInterface");
            return (Criteria) this;
        }

        public Criteria andVideoInterfaceLessThan(String value) {
            addCriterion("video_interface <", value, "videoInterface");
            return (Criteria) this;
        }

        public Criteria andVideoInterfaceLessThanOrEqualTo(String value) {
            addCriterion("video_interface <=", value, "videoInterface");
            return (Criteria) this;
        }

        public Criteria andVideoInterfaceLike(String value) {
            addCriterion("video_interface like", value, "videoInterface");
            return (Criteria) this;
        }

        public Criteria andVideoInterfaceNotLike(String value) {
            addCriterion("video_interface not like", value, "videoInterface");
            return (Criteria) this;
        }

        public Criteria andVideoInterfaceIn(List<String> values) {
            addCriterion("video_interface in", values, "videoInterface");
            return (Criteria) this;
        }

        public Criteria andVideoInterfaceNotIn(List<String> values) {
            addCriterion("video_interface not in", values, "videoInterface");
            return (Criteria) this;
        }

        public Criteria andVideoInterfaceBetween(String value1, String value2) {
            addCriterion("video_interface between", value1, value2, "videoInterface");
            return (Criteria) this;
        }

        public Criteria andVideoInterfaceNotBetween(String value1, String value2) {
            addCriterion("video_interface not between", value1, value2, "videoInterface");
            return (Criteria) this;
        }

        public Criteria andOtherInterfaceIsNull() {
            addCriterion("other_interface is null");
            return (Criteria) this;
        }

        public Criteria andOtherInterfaceIsNotNull() {
            addCriterion("other_interface is not null");
            return (Criteria) this;
        }

        public Criteria andOtherInterfaceEqualTo(String value) {
            addCriterion("other_interface =", value, "otherInterface");
            return (Criteria) this;
        }

        public Criteria andOtherInterfaceNotEqualTo(String value) {
            addCriterion("other_interface <>", value, "otherInterface");
            return (Criteria) this;
        }

        public Criteria andOtherInterfaceGreaterThan(String value) {
            addCriterion("other_interface >", value, "otherInterface");
            return (Criteria) this;
        }

        public Criteria andOtherInterfaceGreaterThanOrEqualTo(String value) {
            addCriterion("other_interface >=", value, "otherInterface");
            return (Criteria) this;
        }

        public Criteria andOtherInterfaceLessThan(String value) {
            addCriterion("other_interface <", value, "otherInterface");
            return (Criteria) this;
        }

        public Criteria andOtherInterfaceLessThanOrEqualTo(String value) {
            addCriterion("other_interface <=", value, "otherInterface");
            return (Criteria) this;
        }

        public Criteria andOtherInterfaceLike(String value) {
            addCriterion("other_interface like", value, "otherInterface");
            return (Criteria) this;
        }

        public Criteria andOtherInterfaceNotLike(String value) {
            addCriterion("other_interface not like", value, "otherInterface");
            return (Criteria) this;
        }

        public Criteria andOtherInterfaceIn(List<String> values) {
            addCriterion("other_interface in", values, "otherInterface");
            return (Criteria) this;
        }

        public Criteria andOtherInterfaceNotIn(List<String> values) {
            addCriterion("other_interface not in", values, "otherInterface");
            return (Criteria) this;
        }

        public Criteria andOtherInterfaceBetween(String value1, String value2) {
            addCriterion("other_interface between", value1, value2, "otherInterface");
            return (Criteria) this;
        }

        public Criteria andOtherInterfaceNotBetween(String value1, String value2) {
            addCriterion("other_interface not between", value1, value2, "otherInterface");
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