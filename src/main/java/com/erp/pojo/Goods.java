package com.erp.pojo;

import java.math.BigDecimal;

public class Goods {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.uuid
     *
     * @mbg.generated Thu Mar 05 14:54:39 CST 2020
     */
    private Integer uuid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.name
     *
     * @mbg.generated Thu Mar 05 14:54:39 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.origin
     *
     * @mbg.generated Thu Mar 05 14:54:39 CST 2020
     */
    private String origin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.producer
     *
     * @mbg.generated Thu Mar 05 14:54:39 CST 2020
     */
    private String producer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.unit
     *
     * @mbg.generated Thu Mar 05 14:54:39 CST 2020
     */
    private String unit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.in_price
     *
     * @mbg.generated Thu Mar 05 14:54:39 CST 2020
     */
    private BigDecimal inPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.out_price
     *
     * @mbg.generated Thu Mar 05 14:54:39 CST 2020
     */
    private BigDecimal outPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.goods_type_id
     *
     * @mbg.generated Thu Mar 05 14:54:39 CST 2020
     */
    private Integer goodsTypeId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.uuid
     *
     * @return the value of goods.uuid
     *
     * @mbg.generated Thu Mar 05 14:54:39 CST 2020
     */
    public Integer getUuid() {
        return uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.uuid
     *
     * @param uuid the value for goods.uuid
     *
     * @mbg.generated Thu Mar 05 14:54:39 CST 2020
     */
    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.name
     *
     * @return the value of goods.name
     *
     * @mbg.generated Thu Mar 05 14:54:39 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.name
     *
     * @param name the value for goods.name
     *
     * @mbg.generated Thu Mar 05 14:54:39 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.origin
     *
     * @return the value of goods.origin
     *
     * @mbg.generated Thu Mar 05 14:54:39 CST 2020
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.origin
     *
     * @param origin the value for goods.origin
     *
     * @mbg.generated Thu Mar 05 14:54:39 CST 2020
     */
    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.producer
     *
     * @return the value of goods.producer
     *
     * @mbg.generated Thu Mar 05 14:54:39 CST 2020
     */
    public String getProducer() {
        return producer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.producer
     *
     * @param producer the value for goods.producer
     *
     * @mbg.generated Thu Mar 05 14:54:39 CST 2020
     */
    public void setProducer(String producer) {
        this.producer = producer == null ? null : producer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.unit
     *
     * @return the value of goods.unit
     *
     * @mbg.generated Thu Mar 05 14:54:39 CST 2020
     */
    public String getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.unit
     *
     * @param unit the value for goods.unit
     *
     * @mbg.generated Thu Mar 05 14:54:39 CST 2020
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.in_price
     *
     * @return the value of goods.in_price
     *
     * @mbg.generated Thu Mar 05 14:54:39 CST 2020
     */
    public BigDecimal getInPrice() {
        return inPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.in_price
     *
     * @param inPrice the value for goods.in_price
     *
     * @mbg.generated Thu Mar 05 14:54:39 CST 2020
     */
    public void setInPrice(BigDecimal inPrice) {
        this.inPrice = inPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.out_price
     *
     * @return the value of goods.out_price
     *
     * @mbg.generated Thu Mar 05 14:54:39 CST 2020
     */
    public BigDecimal getOutPrice() {
        return outPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.out_price
     *
     * @param outPrice the value for goods.out_price
     *
     * @mbg.generated Thu Mar 05 14:54:39 CST 2020
     */
    public void setOutPrice(BigDecimal outPrice) {
        this.outPrice = outPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.goods_type_id
     *
     * @return the value of goods.goods_type_id
     *
     * @mbg.generated Thu Mar 05 14:54:39 CST 2020
     */
    public Integer getGoodsTypeId() {
        return goodsTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.goods_type_id
     *
     * @param goodsTypeId the value for goods.goods_type_id
     *
     * @mbg.generated Thu Mar 05 14:54:39 CST 2020
     */
    public void setGoodsTypeId(Integer goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "uuid=" + uuid +
                ", name='" + name + '\'' +
                ", origin='" + origin + '\'' +
                ", producer='" + producer + '\'' +
                ", unit='" + unit + '\'' +
                ", inPrice=" + inPrice +
                ", outPrice=" + outPrice +
                ", goodsTypeId=" + goodsTypeId +
                '}';
    }
}