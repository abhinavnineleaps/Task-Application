package com.Task.learners.learnersrepository;

import com.Task.learners.learnersmodel.Learners;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LearnersRepository extends CrudRepository<Learners,Integer> {
    public List<Learners> findAll();

    public Learners findById(int id);

    public Learners save(Learners learners);

    public Learners deleteById(int id);

    public long count();

    public boolean existsById(int id);

    public void deleteAll();

}
