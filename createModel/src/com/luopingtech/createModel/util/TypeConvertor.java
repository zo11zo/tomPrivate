package com.luopingtech.createModel.util;

/**
 * 负责java数据类型和数据库数据类型互相转化
 */
public interface TypeConvertor {
    String databaseType2JavaType(String columnType);
}
