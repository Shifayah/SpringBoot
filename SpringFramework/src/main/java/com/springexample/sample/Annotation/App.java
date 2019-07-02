package com.springexample.sample.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
      Sim type=(Sim) context.getBean("sim");
      Mobile obj=(Mobile) context.getBean("redmiMob");
      obj.display();
      System.out.println(type);
    }
}
