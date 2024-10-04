package com.kplearn.spring_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Client {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Student student1 = applicationContext.getBean("student1",Student.class);
        student1.display();

        System.out.println("Get bean JDBC Connection");
        JDBCConnection connection = applicationContext.getBean("jdbcConnection", JDBCConnection.class);
        System.out.println(connection.toString());
        connection.getJDBCConnection();


    }
}
