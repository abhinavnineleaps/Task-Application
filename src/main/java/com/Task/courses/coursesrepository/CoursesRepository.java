package com.Task.courses.coursesrepository;

import com.Task.courses.coursesmodel.Courses;
import com.Task.learners.learnersmodel.Learners;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoursesRepository extends CrudRepository<Courses,Integer> {
    public List<Courses> findAll();

    public Courses findById(int id);

    public Courses save(Courses movie);

    public Courses deleteById(int id);

    public long count();

    public boolean existsById(int id);

    public void deleteAll();


}
