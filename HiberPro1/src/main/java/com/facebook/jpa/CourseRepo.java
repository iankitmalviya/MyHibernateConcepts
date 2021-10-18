package com.facebook.jpa;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.facebook.bean.Course;

@Repository
public class CourseRepo {
    @Autowired
	EntityManager em;
    
    public Course findByid(long id) {
    
    return em.find(Course.class, id);
    }
    
    public List<Course> findByJpQL() {
    	
    	return em.createQuery("Select c from Course c").getResultList();
    }
    
    
}
