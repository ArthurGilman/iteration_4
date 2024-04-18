package com.dragonco.iteration_4.beans;


import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Course {

    private final String nameCourse;

    public Course(@Value("${course.name}") String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    @PreDestroy
    public void notifyUsersAboutEnd() {
        System.out.println("Sending emails about end of course");
    }
}
