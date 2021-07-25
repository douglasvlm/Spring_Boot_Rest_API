package com.projeto.douglas.service;

import com.projeto.douglas.model.ClassPeriod;
import com.projeto.douglas.repository.ClassPeriodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ClassPeriodService {

    ClassPeriodRepository classPeriodRepository;

    @Autowired
    public ClassPeriodService(ClassPeriodRepository classPeriodRepository) {
        this.classPeriodRepository = classPeriodRepository;
    }

    public ClassPeriod saveClassPeriod(ClassPeriod classPeriod){
        return classPeriodRepository.save(classPeriod);
    }

    public List<ClassPeriod> findAll(){
        return classPeriodRepository.findAll();
    }

    public Optional<ClassPeriod> getById(long id_ClassPeriod) { return  classPeriodRepository.findById(id_ClassPeriod); }

    public ClassPeriod updateClassPeriod(ClassPeriod classPeriod){
        return classPeriodRepository.save(classPeriod);
    }

    public void deleteClassPeriod(long id_ClassPeriod) {
        classPeriodRepository.deleteById(id_ClassPeriod);
    }
}