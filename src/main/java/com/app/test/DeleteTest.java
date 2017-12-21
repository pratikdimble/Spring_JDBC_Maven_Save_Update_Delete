package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.app.beans.Employee;

public class DeleteTest {

	public static void main(String[] args) {
		//read and print the employee i.e parent object
				ApplicationContext ctx=new ClassPathXmlApplicationContext("com/app/test/Springconfig.xml");
				
				JdbcTemplate jt=(JdbcTemplate)ctx.getBean("jtObj");
				
				String sql="DELETE FROM EMPLOYEE WHERE ID=?";
				
				int count=jt.update(sql, 11);
				
				System.out.println(count+" Rows Deleted");
				

	}

}
