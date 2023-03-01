package com.Task.courses.coursescontroller;

import com.Task.courses.coursesmodel.Courses;
import com.Task.courses.coursesservice.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/TaskApplication")
public class CourseController {
    private CoursesService coursesService;
    @Autowired
    public CourseController(CoursesService service)
    {
        this.coursesService=service;
    }
    @RequestMapping(value="/courses/save", method = RequestMethod.POST)
    public String saveCourses(@RequestBody Courses payload)
    {
        return coursesService.saveCourses(payload);
    }
    @RequestMapping(value = "/courses", method = RequestMethod.GET)
    public List<Courses> coursesList() {
        return coursesService.getCoursesList();
    }
    @GetMapping("/courses/{id}")
    public Courses movieById(@PathVariable("id") int id) {
        return coursesService.getCoursesById(id);
    }
    @RequestMapping(value = "/deleteCourses", method = RequestMethod.DELETE)
    public String deleteCourses() {
        return coursesService.deleteAllCourses();
    }
    @RequestMapping(value = "/deleteCoursesByID/{id}", method = RequestMethod.DELETE)
    public Courses deleteByIdCourses(@PathVariable("id") int id) {
        return coursesService.deleteByIdCourses(id);
    }
    @RequestMapping(value = "/checkCoursesById/{id}", method = RequestMethod.GET)
    public boolean checkCoursesById(@PathVariable("id") int id) {
        return coursesService.checkByIdCourses(id);
    }
    @RequestMapping(value = "/countCourses", method = RequestMethod.GET)
    public long countCourse() {
        return coursesService.coursesCount();
    }


}
