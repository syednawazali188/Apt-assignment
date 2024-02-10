package com.example.aptcoder;

import com.example.aptcoder.Course;
import com.example.aptcoder.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/get")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @PostMapping("/create")
    public Course createCourse(@RequestBody CourseDto courseDto) {
        return courseService.createCourse(courseDto);
    }

    @PutMapping("/update/{id}")
    public Course updateCourse(@PathVariable Long id, @RequestBody CourseDto courseDto) {
        return courseService.updateCourse(id, courseDto);
}
}