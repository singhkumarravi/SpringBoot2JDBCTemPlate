package com.olive.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class RecordRunner implements CommandLineRunner{
	@Autowired
	JdbcTemplate temp;
	
	@Override
	public void run(String... args) throws Exception {
		/*
		//inserted data
    	String sql="insert into person value(?,?,?,?,?)";
		int record = temp.update(sql, 40,"Rohan","Singh","Ameerpet","varanasi");
		System.out.println("No of Record Inserted :: " + record);
		*/
		
		/*
	     //	update data
		String sql="update person set address=?,city=? where id=?";
		int record=temp.update(sql,"bhadohi","Agra",10);
		System.out.println("Record Effected : " + record);
		*/
		
		
            // delete data
			String sql="delete from person where id=?";
			int record=temp.update(sql,40);
			System.out.println("Record Effected : " + record);
			
	}

}
