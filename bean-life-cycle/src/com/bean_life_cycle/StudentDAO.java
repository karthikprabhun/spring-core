package com.bean_life_cycle;

import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.*;

import jakarta.annotation.PostConstruct;


//@Component
public class StudentDAO {
    @Value("${database.uri}")
    private String url;
    @Value("${database.driver}")
    private String driver;
    @Value("${database.username}")
    private String username;
    @Value("${database.password}")

    private String password;

    private Connection connection;

    @PostConstruct
    public void init() throws SQLException, ClassNotFoundException {
        System.out.println("Method marked with annotation post construct invoked");
        createStudentDatabaseConnection();
    }

    public void createStudentDatabaseConnection() throws SQLException, ClassNotFoundException {
        Class.forName(driver);
        connection = DriverManager.getConnection(url, username, password);
    }

    @PreDestroy
    public void closeConnection() throws SQLException {
        connection.close();
        System.out.println("predestory method invoked");

    }
    // util method
    public void getAllStudents() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultset = statement.executeQuery("select * from student");

        while (resultset.next()){
            int studentId = resultset.getInt(1);
            String name = resultset.getString(2);
            System.out.println(studentId + "  "+ name);
        }

    }


    public void deleteStudent(int studentId) throws SQLException {

        Statement statement = connection.createStatement();
        statement.executeUpdate("delete from student where student_id="+studentId);
        System.out.println("Student record deleted for id "+studentId);
    }



    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
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
}
