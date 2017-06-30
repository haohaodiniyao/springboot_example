package com.example.demo.entity;

/**
 * 分区信息
 * Created by yaokai on 2017/6/27.
 */
public class PartitionInfo {
    private String part;
    private String expr;
    private String descr;
    private String rows;

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public String getExpr() {
        return expr;
    }

    public void setExpr(String expr) {
        this.expr = expr;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getRows() {
        return rows;
    }

    public void setRows(String rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "PartitionInfo{" +
                "part='" + part + '\'' +
                ", expr='" + expr + '\'' +
                ", descr='" + descr + '\'' +
                ", rows='" + rows + '\'' +
                '}';
    }
}
