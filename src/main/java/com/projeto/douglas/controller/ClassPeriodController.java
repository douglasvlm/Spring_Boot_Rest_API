package com.projeto.douglas.controller;

import com.projeto.douglas.model.ClassPeriod;
import com.projeto.douglas.service.ClassPeriodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/class_period")
public class ClassPeriodController {

    @Autowired
    ClassPeriodService classPeriodService;

    @PostMapping
    public ClassPeriod createClassPeriod(@RequestBody ClassPeriod classPeriod) {
        return classPeriodService.saveClassPeriod(classPeriod);
    }
    @GetMapping
    public List<ClassPeriod> getClassPeriodList(){
        return classPeriodService.findAll();
    }

    @GetMapping("/{id_ClassPeriod}")
    public ResponseEntity<ClassPeriod> geClassPeriodById(@PathVariable("id_ClassPeriod") long id_ClassPeriod) throws Exception {
        return  ResponseEntity.ok(classPeriodService.getById(id_ClassPeriod).orElseThrow(() -> new NoSuchElementException("Registro não encontrado.")));
    }

    @PutMapping
    public ClassPeriod updateClassPeriod(@RequestBody ClassPeriod classPeriod) {
        return classPeriodService.updateClassPeriod(classPeriod);
    }

    @DeleteMapping("/{id_ClassPeriod}")
    public ResponseEntity<?> deleteByID(@PathVariable("id_ClassPeriod") long id_ClassPeriod) {
        try {
            classPeriodService.deleteClassPeriod(id_ClassPeriod);
            return  ResponseEntity.ok().build();
        } catch (Exception e) {
            return  ResponseEntity.notFound().build();
        }
    }
}