package com.Task.learners.learnerscontroller;

import com.Task.courses.coursesmodel.Courses;
import com.Task.courses.coursesservice.CoursesService;
import com.Task.learners.learnersmodel.Learners;
import com.Task.learners.learnersservice.LearnersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/TaskApplication")
public class learnersControllers {
    private LearnersService learnersService;
    @Autowired
    public learnersControllers(LearnersService service)
    {
        this.learnersService=service;
    }

    @RequestMapping(value= "/Learners/save", method = RequestMethod.POST)
    public String saveLearners(@RequestBody Learners payload)
    {
        return learnersService.saveLearners(payload);
    }
    @RequestMapping(value = "/learners/list", method = RequestMethod.GET)
    public List<Learners> learnersList() {
        return learnersService.getLearnersList();
    }
    @GetMapping("/learners/{id}")
    public Learners movieById(@PathVariable("id") int id) {
        return learnersService.getLearnersById(id);
    }


        @RequestMapping(value = "/countLearners", method = RequestMethod.GET)
    public long countCourse() {
        return learnersService.LearnersCount();
    }


    @RequestMapping(value = "/deleteLearners", method = RequestMethod.DELETE)
    public String deleteLearners() {
        return learnersService.deleteAllLearners();
    }
    @RequestMapping(value = "/deleteByIdLearners/{id}", method = RequestMethod.DELETE)
    public Learners deleteLearnersId(@PathVariable("id") int id) {
        return learnersService.deleteByIdLearners(id);
    }


    @RequestMapping(value = "/checkLearnersById/{id}", method = RequestMethod.GET)
    public boolean checkLearnersById(@PathVariable("id") int id) {
        return learnersService.checkByIdLearners(id);
    }




}
