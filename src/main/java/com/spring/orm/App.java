package com.spring.orm;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	StudentDao studentDao = context.getBean("studentDao", StudentDao.class);  
        Student student = new Student(223, "Hello", "Rahul");
    	int r = studentDao.insert(student);
    	System.out.println("dome "+r);
    }
}
