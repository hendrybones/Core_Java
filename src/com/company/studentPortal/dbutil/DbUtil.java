package com.company.studentPortal.dbutil;

import java.sql.*;

public class DbUtil {
    private Connection connection;
    private Statement statement;
    String url = "jdbc:mysql://localhost:3306/hendryTech";
    String root = "root";
    String password = "";
    final String className="com.mysql.jdbc.Driver";
    String create="create database if not exists hendryTech";
    String user="use hendryTech";
    String table="create table if not exists student";
    public  DbUtil() throws SQLException, ClassNotFoundException {
        Class.forName(className);
        connection= DriverManager.getConnection(url, root, password);
        writeData(create);
        writeData(user);
        writeData(table);
    }
    //create database connection
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection connection=null;
        Class.forName(className);
        connection= DriverManager.getConnection(url, root, password);
        return connection;

    }
    // write data to the database
    public int writeData(String query) throws SQLException {
        statement=connection.createStatement();
        return statement.executeUpdate(query);
    }
    //select data base on query
    public ResultSet readData(String query) throws SQLException {
        statement=connection.createStatement();
        return statement.executeQuery(query);
    }
    //closes the connection
    public void closeConnections() throws SQLException {
        statement.close();
        connection.close();

    }


}
