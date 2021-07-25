package com.projeto.douglas.service;

import com.projeto.douglas.model.Academic_Ann;
import com.projeto.douglas.repository.AcademicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AcademicService {

    AcademicRepository academicRepository;

    @Autowired
    public AcademicService(AcademicRepository academicRepository) {
        this.academicRepository = academicRepository;
    }

    public Academic_Ann saveAcademic(Academic_Ann academic_ann){
        return academicRepository.save(academic_ann);
    }

    public List<Academic_Ann> findAll(){
        return academicRepository.findAll();
    }

    public Optional<Academic_Ann> getById(long id_Academic_Ann) { return  academicRepository.findById(id_Academic_Ann); }

    public Academic_Ann updateAcademic(Academic_Ann academic_ann){
        return academicRepository.save(academic_ann);
    }

    public void deleteAcademic(long id_Academic_Ann) {
        academicRepository.deleteById(id_Academic_Ann);
    }
}