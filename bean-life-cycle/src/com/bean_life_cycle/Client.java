package com.bean_life_cycle;

import com.kplearn.spring_annotations.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.NativeDetector;

import java.sql.SQLException;

/*@Configuration
@ComponentScan({"com.bean_life_cycle"})*/
public class Client {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        com.bean_life_cycle.StudentDAO studentDAO = applicationContext.getBean("studentDAO", StudentDAO.class);
        studentDAO.getAllStudents();

        studentDAO.deleteStudent(4);

        ((ClassPathXmlApplicationContext)applicationContext).close(); // downcast to access close()

    }
}
