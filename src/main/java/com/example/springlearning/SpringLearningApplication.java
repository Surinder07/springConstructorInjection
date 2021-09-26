package com.example.springlearning;

import com.example.springlearning.bussiness.QuoteGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.nio.file.Path;
import java.nio.file.Paths;

//@SpringBootApplication
public class SpringLearningApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SpringLearningApplication.class, args);
        Path path = Paths.get("src/main/resources/beans.xml");// get the path of the file
        ApplicationContext context = new FileSystemXmlApplicationContext(path.toString());

        // getBean asks for the object from spring container
        //getBean by Name and type  Lion lion = context.getBean("lion", Lion.class);
        //https://www.baeldung.com/spring-getbean
        //  // can also be written as : QuoteGenerator generator = context.getBean("QuoteGenerator", "insurances)";
        QuoteGenerator generator = context.getBean("QuoteGenerator", QuoteGenerator.class);
        System.out.println(generator.getQuote());
    }

}
// spring container - its the container of all the objects
//spring container will check the FileSystemXmlApplicationContext and open the beans.xml file to create the object
// bean class - which contains getter/setter or variables

