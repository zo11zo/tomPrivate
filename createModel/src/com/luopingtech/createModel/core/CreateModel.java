package com.luopingtech.createModel.core;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CreateModel {
    public static void main(String[] args) throws IOException, SQLException {
        Connection connection = DBManager.getConnection();
        DatabaseMetaData metaData = connection.getMetaData();
        ResultSet tables = metaData.getTables(null, "%", "%", new String[]{"TABLE"});
        while(tables.next()){
            System.out.println(tables.getString(1));
        }
        
        
    }
}
