package com.Task.courses.coursesservice;

import com.Task.courses.coursesmodel.Courses;
import com.Task.courses.coursesrepository.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursesService {
    private CoursesRepository coursesRepository;
    @Autowired
    public CoursesService(CoursesRepository coursesRepository)
    {
        this.coursesRepository=coursesRepository;
    }
    public String saveCourses(Courses movie) {
        Courses savedCourses = coursesRepository.save(movie);
        return "New Movie Created: " + savedCourses;
    }

    public List<Courses> getCoursesList() {
        return coursesRepository.findAll();
    }

    public Courses getCoursesById(int id) {
        return coursesRepository.findById(id);
    }


    public Courses deleteByIdCourses(int id) {
        return coursesRepository.deleteById(id);
    }


    public long coursesCount() {
        return coursesRepository.count();
    }

    public boolean checkByIdCourses(int id) {
        return coursesRepository.existsById(id);
    }

    public String deleteAllCourses() {
        coursesRepository.deleteAll();
        return "All Courses Deleted";
    }

}
