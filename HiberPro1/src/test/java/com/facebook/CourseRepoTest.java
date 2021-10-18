package com.facebook;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.facebook.bean.Course;
import com.facebook.jpa.CourseRepo;

@SpringBootTest
class CourseRepoTest {
Logger logr=LoggerFactory.getLogger(CourseRepoTest.class);

@Autowired
CourseRepo repo;

	@Test
	void contextLoads() {
		Course c=repo.findByid(10001);
		assertEquals("Algorithm and DSA", c.getName());
		logr.info(c.getName());

}
	
}