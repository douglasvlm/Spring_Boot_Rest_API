package com.projeto.douglas.controller;
import com.projeto.douglas.model.Academic_Ann;
import com.projeto.douglas.service.AcademicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/academic")
public class AcademicAnnController {

    @Autowired
    AcademicService academicService;

    @PostMapping
    public Academic_Ann createAcademic(@RequestBody Academic_Ann academic_ann) {
        return academicService.saveAcademic(academic_ann);
    }
    @GetMapping
    public List<Academic_Ann> getAcademicList(){
        return academicService.findAll();
    }

    @GetMapping("/{id_Academic_Ann}")
    public ResponseEntity<Academic_Ann> getAcademicById(@PathVariable("id_Academic_Ann") long id_Academic_Ann) throws Exception {
        return  ResponseEntity.ok(academicService.getById(id_Academic_Ann).orElseThrow(() -> new NoSuchElementException("Registro não encontrado.")));
    }

    @PutMapping
    public Academic_Ann updateAcademic(@RequestBody Academic_Ann academic_ann) {
        return academicService.updateAcademic(academic_ann);
    }

    @DeleteMapping("/{id_Academic_Ann}")
    public ResponseEntity<?> deleteByID(@PathVariable("id_Academic_Ann") long id_Academic_Ann) {
        try {
            academicService.deleteAcademic(id_Academic_Ann);
            return  ResponseEntity.ok().build();
        } catch (Exception e) {
            return  ResponseEntity.notFound().build();
        }
    }
}