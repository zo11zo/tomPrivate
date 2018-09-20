package com.luopingtech.createModel.core;

import com.luopingtech.createModel.bean.Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBManager {
    private static Configuration config;
    static{
        try {
            File file = new File("C:/Users/33540/git/tomPrivate/createModel/config/jdbc.properties");
            Properties properties = new Properties();
            properties.load(new FileInputStream(file));
            config = new Configuration();
            config.setMysqlDriver(properties.getProperty("mysql_driver"));
            config.setMysqlUrl(properties.getProperty("mysql_url"));
            config.setMysqlUsername(properties.getProperty("mysql_username"));
            config.setMysqlPassword(properties.getProperty("mysql_password"));
            config.setPoPackage(properties.getProperty("po_package"));
            config.setSrcPath(properties.getProperty("src_path"));
            config.setUsingDB(properties.getProperty("using_db"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(config.getMysqlDriver());
            connection = DriverManager.getConnection(config.getMysqlUrl(), config.getMysqlUsername(), config.getMysqlPassword());
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;
    }
    public static Configuration getConfig(){
        return config;
    }
}
