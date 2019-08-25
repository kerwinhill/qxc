package com.qxc.pojo;

public class SpiritCode {
    private Integer id;

    private Integer code;

    private String color;

    private String shengxiao;

    private String jmsht;

    private Integer year;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getShengxiao() {
        return shengxiao;
    }

    public void setShengxiao(String shengxiao) {
        this.shengxiao = shengxiao == null ? null : shengxiao.trim();
    }

    public String getJmsht() {
        return jmsht;
    }

    public void setJmsht(String jmsht) {
        this.jmsht = jmsht == null ? null : jmsht.trim();
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}