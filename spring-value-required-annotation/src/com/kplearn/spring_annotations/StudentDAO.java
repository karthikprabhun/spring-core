package com.kplearn.spring_annotations;

import org.springframework.beans.factory.annotation.Value;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentDAO {

    private String username;
    private String password;
    private String uri;
    private String driver;

    public StudentDAO(@Value("${database.username}") String username, @Value("${database.password}") String password, @Value("${database.uri}") String uri, @Value("${database.driver}") String driver) {
        this.username = username;
        this.password = password;
        this.uri = uri;
        this.driver = driver;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "JDBCConnection{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", uri='" + uri + '\'' +
                ", driver='" + driver + '\'' +
                '}';
    }

    public Connection getJDBCConnection() throws ClassNotFoundException, SQLException {

        Class.forName(driver);
       // Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(uri, username, password);
        System.out.println("Connection Successful" + connection);
        return connection;

    }

}
