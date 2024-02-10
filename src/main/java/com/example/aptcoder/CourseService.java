package com.example.aptcoder;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    private List<Course> courses = new ArrayList<>();
    private Long nextId = 1L;

    public List<Course> getAllCourses() {
        return courses;
    }

    public Course createCourse(CourseDto courseDto) {
        Course course = new Course();
        course.setId(nextId++);
        course.setName(courseDto.getName());
        course.setSubject(courseDto.getSubject());
        course.setChapters(courseDto.getChapters());
        course.setType(courseDto.getType());
        course.setLearnMode(courseDto.getLearnMode());

        courses.add(course);

        return course;
    }

    public Course updateCourse(Long id, CourseDto courseDTO) {
        for (Course existingCourse : courses) {
            if (existingCourse.getId().equals(id)) {
                existingCourse.setName(courseDTO.getName());
                existingCourse.setSubject(courseDTO.getSubject());
                existingCourse.setChapters(courseDTO.getChapters());
                existingCourse.setType(courseDTO.getType());
                existingCourse.setLearnMode(courseDTO.getLearnMode());
                return existingCourse;
            }
        }
        throw new RuntimeException("Course not found with id:"+id);
}
}