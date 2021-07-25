package com.projeto.douglas.service;

import com.projeto.douglas.model.Discipline;
import com.projeto.douglas.repository.DisciplineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DisciplineService {

    DisciplineRepository disciplineRepository;

    @Autowired
    public DisciplineService(DisciplineRepository disciplineRepository) {
        this.disciplineRepository = disciplineRepository;
    }

    public Discipline saveDiscipline(Discipline discipline){
        return disciplineRepository.save(discipline);
    }

    public List<Discipline> findAll(){
        return disciplineRepository.findAll();
    }

    public Optional<Discipline> getById(long id_Discipline) { return  disciplineRepository.findById(id_Discipline); }

    public Discipline updateDiscipline(Discipline discipline){
        return disciplineRepository.save(discipline);
    }

    public void deleteDisciplien(long id_Discipline) { disciplineRepository.deleteById(id_Discipline); }
}