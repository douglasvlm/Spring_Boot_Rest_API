package com.projeto.douglas.controller;

import com.projeto.douglas.model.Discipline;
import com.projeto.douglas.service.DisciplineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/discipline")
public class DisciplineController {

    @Autowired
    DisciplineService disciplineService;

    @PostMapping
    public Discipline createDiscipline(@RequestBody Discipline discipline) {
        return disciplineService.saveDiscipline(discipline);
    }
    @GetMapping
    public List<Discipline> getDisciplineList(){
        return disciplineService.findAll();
    }

    @GetMapping("/{id_Discipline}")
    public ResponseEntity<Discipline> getDisciplineById(@PathVariable("id_Discipline") long id_Discipline) throws Exception {
        return  ResponseEntity.ok(disciplineService.getById(id_Discipline).orElseThrow(() -> new NoSuchElementException("Registro não encontrado.")));
    }

    @PutMapping
    public Discipline updateDiscipline(@RequestBody Discipline discipline) {
        return disciplineService.updateDiscipline(discipline);
    }

    @DeleteMapping("/{id_Discipline}")
    public ResponseEntity<?> deleteByID(@PathVariable("id_Discipline") long id_Discipline) {
        try {
            disciplineService.deleteDisciplien(id_Discipline);
            return  ResponseEntity.ok().build();
        } catch (Exception e) {
            return  ResponseEntity.notFound().build();
        }
    }
}