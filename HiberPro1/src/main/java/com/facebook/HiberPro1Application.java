package com.facebook;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.facebook.bean.Person;
import com.facebook.jdbc.PersonJdbcDao;
import com.facebook.jpa.CourseRepo;
import com.facebook.jpa.PersonJpaRepo;

@SpringBootApplication
public class HiberPro1Application implements CommandLineRunner {
private Logger logger=LoggerFactory.getLogger(this.getClass());

//	@Autowired
//	PersonJdbcDao dao;

@Autowired
PersonJpaRepo personRepo;

@Autowired
CourseRepo cRepo;

	public static void main(String[] args) {
		SpringApplication.run(HiberPro1Application.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//logger.info("\All users----{}",dao.findAll());
		//logger.info("\n All users----{}",personRepo.findById(1001));
		//logger.info("\n This user is inserted or updated----{}",personRepo.update(new Person(1005,"Harshita sharma","bhatinda",new Date())));
		logger.info("\n The course you want is here ->->->-{}",cRepo.findByid(10001));
		logger.info("\n The courses from JPQL -:-:-:-{}",cRepo.findByJpQL());
		
	}

}
