package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.app.beans.Employee;

public class UpdateTest {

	public static void main(String[] args) {
		//read and print the employee i.e parent object
				ApplicationContext ctx=new ClassPathXmlApplicationContext("com/app/test/Springconfig.xml");
				
				JdbcTemplate jt=(JdbcTemplate)ctx.getBean("jtObj");
				
				String sql="UPDATE EMPLOYEE SET NAME=?,SALARY=? WHERE ID=?";
				
				int count=jt.update(sql,"SHUBHAM",16.78f,11);
				
				System.out.println(count+" Rows Updated");
				

	}

}
