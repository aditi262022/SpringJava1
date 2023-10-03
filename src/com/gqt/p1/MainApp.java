package com.gqt.p1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApp {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Employee e = (Employee) factory.getBean("emp1");
		Employee e2 = (Employee) factory.getBean("emp2");
		Employee e3 = (Employee) factory.getBean("emp3");
		Employee e4 = (Employee) factory.getBean("emp4");
		
		System.out.println(e.getEmpid()+"--"+e.getEmpname()+"--"+e.getEmpsalary()+"--"+e.getEmpcompany());
		System.out.println(e2.getEmpid()+"--"+e2.getEmpname()+"--"+e2.getEmpsalary()+"--"+e2.getEmpcompany());
		System.out.println(e3.getEmpid()+"--"+e3.getEmpname()+"--"+e3.getEmpsalary()+"--"+e3.getEmpcompany());
		System.out.println(e4.getEmpid()+"--"+e4.getEmpname()+"--"+e4.getEmpsalary()+"--"+e4.getEmpcompany());
		
	}
}
