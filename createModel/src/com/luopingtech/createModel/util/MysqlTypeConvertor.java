package com.luopingtech.createModel.util;

public class MysqlTypeConvertor implements TypeConvertor {
    private final String VARCHAR = "varchar";
    private final String CHAR = "char";
    private final String TINYINT = "tinyint";
    private final String SMALLINT = "smallint";
    private final String INT = "int";
    private final String INTEGER = "integer";
    private final String BIGINT = "bigint";
    private final String DOUBLE = "double";
    private final String FLOAT = "float";
    private final String CLOB = "clob";
    private final String BLOB = "blob";
    private final String DATE = "date";
    private final String TIME = "time";
    private final String TIMESTAMP = "timestamp";
    private final String DECIMAL = "decimal";

    @Override
    public String databaseType2JavaType(String columnType) {
        if (VARCHAR.equalsIgnoreCase(columnType) || CHAR.equalsIgnoreCase(columnType)) {
            return "String";
        }
        if (INT.equalsIgnoreCase(columnType) || TINYINT.equalsIgnoreCase(columnType)
            || SMALLINT.equalsIgnoreCase(columnType) || INTEGER.equalsIgnoreCase(columnType)) {
            return "Integer";
        }
        if (BIGINT.equalsIgnoreCase(columnType)) {
            return "Long";
        }
        if (DOUBLE.equalsIgnoreCase(columnType) || FLOAT.equalsIgnoreCase(columnType)) {
            return "Double";
        }
        if (CLOB.equalsIgnoreCase(columnType)) {
            return "java.sql.Clob";
        }
        if (BLOB.equalsIgnoreCase(columnType)) {
            return "java.sql.Blob";
        }
        if (DATE.equalsIgnoreCase(columnType)) {
            return "java.sql.Date";
        }
        if (TIME.equalsIgnoreCase(columnType)) {
            return "java.sql.Time";
        }
        if (TIMESTAMP.equalsIgnoreCase(columnType)) {
            return "java.sql.Timestamp";
        }
        if (DECIMAL.equalsIgnoreCase(columnType)) {
            return "java.math.BigDecimal";
        }
        return null;
    }

}
