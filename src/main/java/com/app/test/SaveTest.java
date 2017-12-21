package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.app.beans.Employee;

public class SaveTest {

	public static void main(String[] args) {
		//read and print the employee i.e parent object
				ApplicationContext ctx=new ClassPathXmlApplicationContext("com/app/test/Springconfig.xml");
				
				JdbcTemplate jt=(JdbcTemplate)ctx.getBean("jtObj");
				
				String sql="INSERT INTO EMPLOYEE VALUES(?,?,?)";
				
				int count=jt.update(sql, 11,"Rohit",14.36f);
				
				System.out.println(count+" Rows inserted");
				

	}

}
