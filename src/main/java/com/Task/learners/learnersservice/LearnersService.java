package com.Task.learners.learnersservice;

import com.Task.courses.coursesmodel.Courses;
import com.Task.courses.coursesrepository.CoursesRepository;
import com.Task.learners.learnersmodel.Learners;
import com.Task.learners.learnersrepository.LearnersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LearnersService {
    private LearnersRepository learnersRepository;
    @Autowired
    public LearnersService(LearnersRepository learnersRepository)
    {
        this.learnersRepository=learnersRepository;
    }

    public String saveLearners(Learners movie) {
        Learners savedLearners = learnersRepository.save(movie);
        return "New Movie Created: " + savedLearners;
    }

    public List<Learners> getLearnersList() {
        return learnersRepository.findAll();
    }

    public Learners getLearnersById(int id) {
        return learnersRepository.findById(id);
    }


    public Learners deleteByIdLearners(int id) {
        return learnersRepository.deleteById(id);
    }


    public long LearnersCount() {
        return learnersRepository.count();
    }


    public String deleteAllLearners() {
        learnersRepository.deleteAll();
        return "All Learners Deleted";
    }

    public boolean checkByIdLearners(int id) {
        return learnersRepository.existsById(id);
    }

}
