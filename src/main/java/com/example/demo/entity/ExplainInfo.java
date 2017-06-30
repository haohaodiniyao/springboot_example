package com.example.demo.entity;

/**
 * Created by yaokai on 2017/6/29.
 */
public class ExplainInfo {
    private int id;
    private String select_type;
    private String table;
    private String partitions;
    private String type;
    private String possible_keys;
    private String key;
    private int key_len;
    private String ref;
    private int rows;
    private int filtered;
    private String extra;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSelect_type() {
        return select_type;
    }

    public void setSelect_type(String select_type) {
        this.select_type = select_type;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getPartitions() {
        return partitions;
    }

    public void setPartitions(String partitions) {
        this.partitions = partitions;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPossible_keys() {
        return possible_keys;
    }

    public void setPossible_keys(String possible_keys) {
        this.possible_keys = possible_keys;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getKey_len() {
        return key_len;
    }

    public void setKey_len(int key_len) {
        this.key_len = key_len;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getFiltered() {
        return filtered;
    }

    public void setFiltered(int filtered) {
        this.filtered = filtered;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    @Override
    public String toString() {
        return "ExplainInfo{" +
                "id=" + id +
                ", select_type='" + select_type + '\'' +
                ", table='" + table + '\'' +
                ", partitions='" + partitions + '\'' +
                ", type='" + type + '\'' +
                ", possible_keys='" + possible_keys + '\'' +
                ", key='" + key + '\'' +
                ", key_len=" + key_len +
                ", ref='" + ref + '\'' +
                ", rows=" + rows +
                ", filtered=" + filtered +
                ", extra='" + extra + '\'' +
                '}';
    }
}
