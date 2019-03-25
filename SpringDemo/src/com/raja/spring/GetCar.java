package com.raja.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class GetCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //  BeanFactory fact=new XmlBeanFactory(new FileSystemResource("spring.xml"));
     AbstractApplicationContext c=new ClassPathXmlApplicationContext("spring.xml");
      c.registerShutdownHook();
        HatchBack hb=(HatchBack)  c.getBean("hatchback");
        Bmw b=(Bmw)c.getBean("bmw");
        Employee e=(Employee)c.getBean("emp");
        Trianglr t=(Trianglr)c.getBean("triangle1");
        Car car=(Car)c.getBean("car");
        e.setName("Kavya");
        e.setDept("Cloud");
        e.setSalary(25000);
        hb.car();
        b.car();
        e.getEmployee();
        t.getPointDraw();
        car.car();
        
	}

}
