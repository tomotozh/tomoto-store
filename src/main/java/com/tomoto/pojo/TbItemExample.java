package com.tomoto.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbItemExample() {
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

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Integer value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Integer value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Integer value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Integer value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Integer> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Integer> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Integer value1, Integer value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemTitleIsNull() {
            addCriterion("item_title is null");
            return (Criteria) this;
        }

        public Criteria andItemTitleIsNotNull() {
            addCriterion("item_title is not null");
            return (Criteria) this;
        }

        public Criteria andItemTitleEqualTo(String value) {
            addCriterion("item_title =", value, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleNotEqualTo(String value) {
            addCriterion("item_title <>", value, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleGreaterThan(String value) {
            addCriterion("item_title >", value, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleGreaterThanOrEqualTo(String value) {
            addCriterion("item_title >=", value, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleLessThan(String value) {
            addCriterion("item_title <", value, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleLessThanOrEqualTo(String value) {
            addCriterion("item_title <=", value, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleLike(String value) {
            addCriterion("item_title like", value, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleNotLike(String value) {
            addCriterion("item_title not like", value, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleIn(List<String> values) {
            addCriterion("item_title in", values, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleNotIn(List<String> values) {
            addCriterion("item_title not in", values, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleBetween(String value1, String value2) {
            addCriterion("item_title between", value1, value2, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleNotBetween(String value1, String value2) {
            addCriterion("item_title not between", value1, value2, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemDescIsNull() {
            addCriterion("item_desc is null");
            return (Criteria) this;
        }

        public Criteria andItemDescIsNotNull() {
            addCriterion("item_desc is not null");
            return (Criteria) this;
        }

        public Criteria andItemDescEqualTo(String value) {
            addCriterion("item_desc =", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotEqualTo(String value) {
            addCriterion("item_desc <>", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescGreaterThan(String value) {
            addCriterion("item_desc >", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescGreaterThanOrEqualTo(String value) {
            addCriterion("item_desc >=", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescLessThan(String value) {
            addCriterion("item_desc <", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescLessThanOrEqualTo(String value) {
            addCriterion("item_desc <=", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescLike(String value) {
            addCriterion("item_desc like", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotLike(String value) {
            addCriterion("item_desc not like", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescIn(List<String> values) {
            addCriterion("item_desc in", values, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotIn(List<String> values) {
            addCriterion("item_desc not in", values, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescBetween(String value1, String value2) {
            addCriterion("item_desc between", value1, value2, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotBetween(String value1, String value2) {
            addCriterion("item_desc not between", value1, value2, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemCatogeryIsNull() {
            addCriterion("item_catogery is null");
            return (Criteria) this;
        }

        public Criteria andItemCatogeryIsNotNull() {
            addCriterion("item_catogery is not null");
            return (Criteria) this;
        }

        public Criteria andItemCatogeryEqualTo(String value) {
            addCriterion("item_catogery =", value, "itemCatogery");
            return (Criteria) this;
        }

        public Criteria andItemCatogeryNotEqualTo(String value) {
            addCriterion("item_catogery <>", value, "itemCatogery");
            return (Criteria) this;
        }

        public Criteria andItemCatogeryGreaterThan(String value) {
            addCriterion("item_catogery >", value, "itemCatogery");
            return (Criteria) this;
        }

        public Criteria andItemCatogeryGreaterThanOrEqualTo(String value) {
            addCriterion("item_catogery >=", value, "itemCatogery");
            return (Criteria) this;
        }

        public Criteria andItemCatogeryLessThan(String value) {
            addCriterion("item_catogery <", value, "itemCatogery");
            return (Criteria) this;
        }

        public Criteria andItemCatogeryLessThanOrEqualTo(String value) {
            addCriterion("item_catogery <=", value, "itemCatogery");
            return (Criteria) this;
        }

        public Criteria andItemCatogeryLike(String value) {
            addCriterion("item_catogery like", value, "itemCatogery");
            return (Criteria) this;
        }

        public Criteria andItemCatogeryNotLike(String value) {
            addCriterion("item_catogery not like", value, "itemCatogery");
            return (Criteria) this;
        }

        public Criteria andItemCatogeryIn(List<String> values) {
            addCriterion("item_catogery in", values, "itemCatogery");
            return (Criteria) this;
        }

        public Criteria andItemCatogeryNotIn(List<String> values) {
            addCriterion("item_catogery not in", values, "itemCatogery");
            return (Criteria) this;
        }

        public Criteria andItemCatogeryBetween(String value1, String value2) {
            addCriterion("item_catogery between", value1, value2, "itemCatogery");
            return (Criteria) this;
        }

        public Criteria andItemCatogeryNotBetween(String value1, String value2) {
            addCriterion("item_catogery not between", value1, value2, "itemCatogery");
            return (Criteria) this;
        }

        public Criteria andItemPressIsNull() {
            addCriterion("item_press is null");
            return (Criteria) this;
        }

        public Criteria andItemPressIsNotNull() {
            addCriterion("item_press is not null");
            return (Criteria) this;
        }

        public Criteria andItemPressEqualTo(String value) {
            addCriterion("item_press =", value, "itemPress");
            return (Criteria) this;
        }

        public Criteria andItemPressNotEqualTo(String value) {
            addCriterion("item_press <>", value, "itemPress");
            return (Criteria) this;
        }

        public Criteria andItemPressGreaterThan(String value) {
            addCriterion("item_press >", value, "itemPress");
            return (Criteria) this;
        }

        public Criteria andItemPressGreaterThanOrEqualTo(String value) {
            addCriterion("item_press >=", value, "itemPress");
            return (Criteria) this;
        }

        public Criteria andItemPressLessThan(String value) {
            addCriterion("item_press <", value, "itemPress");
            return (Criteria) this;
        }

        public Criteria andItemPressLessThanOrEqualTo(String value) {
            addCriterion("item_press <=", value, "itemPress");
            return (Criteria) this;
        }

        public Criteria andItemPressLike(String value) {
            addCriterion("item_press like", value, "itemPress");
            return (Criteria) this;
        }

        public Criteria andItemPressNotLike(String value) {
            addCriterion("item_press not like", value, "itemPress");
            return (Criteria) this;
        }

        public Criteria andItemPressIn(List<String> values) {
            addCriterion("item_press in", values, "itemPress");
            return (Criteria) this;
        }

        public Criteria andItemPressNotIn(List<String> values) {
            addCriterion("item_press not in", values, "itemPress");
            return (Criteria) this;
        }

        public Criteria andItemPressBetween(String value1, String value2) {
            addCriterion("item_press between", value1, value2, "itemPress");
            return (Criteria) this;
        }

        public Criteria andItemPressNotBetween(String value1, String value2) {
            addCriterion("item_press not between", value1, value2, "itemPress");
            return (Criteria) this;
        }

        public Criteria andItemPriceIsNull() {
            addCriterion("item_price is null");
            return (Criteria) this;
        }

        public Criteria andItemPriceIsNotNull() {
            addCriterion("item_price is not null");
            return (Criteria) this;
        }

        public Criteria andItemPriceEqualTo(String value) {
            addCriterion("item_price =", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceNotEqualTo(String value) {
            addCriterion("item_price <>", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceGreaterThan(String value) {
            addCriterion("item_price >", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceGreaterThanOrEqualTo(String value) {
            addCriterion("item_price >=", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceLessThan(String value) {
            addCriterion("item_price <", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceLessThanOrEqualTo(String value) {
            addCriterion("item_price <=", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceLike(String value) {
            addCriterion("item_price like", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceNotLike(String value) {
            addCriterion("item_price not like", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceIn(List<String> values) {
            addCriterion("item_price in", values, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceNotIn(List<String> values) {
            addCriterion("item_price not in", values, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceBetween(String value1, String value2) {
            addCriterion("item_price between", value1, value2, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceNotBetween(String value1, String value2) {
            addCriterion("item_price not between", value1, value2, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPackIsNull() {
            addCriterion("item_pack is null");
            return (Criteria) this;
        }

        public Criteria andItemPackIsNotNull() {
            addCriterion("item_pack is not null");
            return (Criteria) this;
        }

        public Criteria andItemPackEqualTo(String value) {
            addCriterion("item_pack =", value, "itemPack");
            return (Criteria) this;
        }

        public Criteria andItemPackNotEqualTo(String value) {
            addCriterion("item_pack <>", value, "itemPack");
            return (Criteria) this;
        }

        public Criteria andItemPackGreaterThan(String value) {
            addCriterion("item_pack >", value, "itemPack");
            return (Criteria) this;
        }

        public Criteria andItemPackGreaterThanOrEqualTo(String value) {
            addCriterion("item_pack >=", value, "itemPack");
            return (Criteria) this;
        }

        public Criteria andItemPackLessThan(String value) {
            addCriterion("item_pack <", value, "itemPack");
            return (Criteria) this;
        }

        public Criteria andItemPackLessThanOrEqualTo(String value) {
            addCriterion("item_pack <=", value, "itemPack");
            return (Criteria) this;
        }

        public Criteria andItemPackLike(String value) {
            addCriterion("item_pack like", value, "itemPack");
            return (Criteria) this;
        }

        public Criteria andItemPackNotLike(String value) {
            addCriterion("item_pack not like", value, "itemPack");
            return (Criteria) this;
        }

        public Criteria andItemPackIn(List<String> values) {
            addCriterion("item_pack in", values, "itemPack");
            return (Criteria) this;
        }

        public Criteria andItemPackNotIn(List<String> values) {
            addCriterion("item_pack not in", values, "itemPack");
            return (Criteria) this;
        }

        public Criteria andItemPackBetween(String value1, String value2) {
            addCriterion("item_pack between", value1, value2, "itemPack");
            return (Criteria) this;
        }

        public Criteria andItemPackNotBetween(String value1, String value2) {
            addCriterion("item_pack not between", value1, value2, "itemPack");
            return (Criteria) this;
        }

        public Criteria andItemDateIsNull() {
            addCriterion("item_date is null");
            return (Criteria) this;
        }

        public Criteria andItemDateIsNotNull() {
            addCriterion("item_date is not null");
            return (Criteria) this;
        }

        public Criteria andItemDateEqualTo(Double value) {
            addCriterion("item_date =", value, "itemDate");
            return (Criteria) this;
        }

        public Criteria andItemDateNotEqualTo(Double value) {
            addCriterion("item_date <>", value, "itemDate");
            return (Criteria) this;
        }

        public Criteria andItemDateGreaterThan(Double value) {
            addCriterion("item_date >", value, "itemDate");
            return (Criteria) this;
        }

        public Criteria andItemDateGreaterThanOrEqualTo(Double value) {
            addCriterion("item_date >=", value, "itemDate");
            return (Criteria) this;
        }

        public Criteria andItemDateLessThan(Double value) {
            addCriterion("item_date <", value, "itemDate");
            return (Criteria) this;
        }

        public Criteria andItemDateLessThanOrEqualTo(Double value) {
            addCriterion("item_date <=", value, "itemDate");
            return (Criteria) this;
        }

        public Criteria andItemDateIn(List<Double> values) {
            addCriterion("item_date in", values, "itemDate");
            return (Criteria) this;
        }

        public Criteria andItemDateNotIn(List<Double> values) {
            addCriterion("item_date not in", values, "itemDate");
            return (Criteria) this;
        }

        public Criteria andItemDateBetween(Double value1, Double value2) {
            addCriterion("item_date between", value1, value2, "itemDate");
            return (Criteria) this;
        }

        public Criteria andItemDateNotBetween(Double value1, Double value2) {
            addCriterion("item_date not between", value1, value2, "itemDate");
            return (Criteria) this;
        }

        public Criteria andItemGradeIsNull() {
            addCriterion("item_grade is null");
            return (Criteria) this;
        }

        public Criteria andItemGradeIsNotNull() {
            addCriterion("item_grade is not null");
            return (Criteria) this;
        }

        public Criteria andItemGradeEqualTo(Integer value) {
            addCriterion("item_grade =", value, "itemGrade");
            return (Criteria) this;
        }

        public Criteria andItemGradeNotEqualTo(Integer value) {
            addCriterion("item_grade <>", value, "itemGrade");
            return (Criteria) this;
        }

        public Criteria andItemGradeGreaterThan(Integer value) {
            addCriterion("item_grade >", value, "itemGrade");
            return (Criteria) this;
        }

        public Criteria andItemGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_grade >=", value, "itemGrade");
            return (Criteria) this;
        }

        public Criteria andItemGradeLessThan(Integer value) {
            addCriterion("item_grade <", value, "itemGrade");
            return (Criteria) this;
        }

        public Criteria andItemGradeLessThanOrEqualTo(Integer value) {
            addCriterion("item_grade <=", value, "itemGrade");
            return (Criteria) this;
        }

        public Criteria andItemGradeIn(List<Integer> values) {
            addCriterion("item_grade in", values, "itemGrade");
            return (Criteria) this;
        }

        public Criteria andItemGradeNotIn(List<Integer> values) {
            addCriterion("item_grade not in", values, "itemGrade");
            return (Criteria) this;
        }

        public Criteria andItemGradeBetween(Integer value1, Integer value2) {
            addCriterion("item_grade between", value1, value2, "itemGrade");
            return (Criteria) this;
        }

        public Criteria andItemGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("item_grade not between", value1, value2, "itemGrade");
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