package com.apurva.springboot.controller;


import java.util.List;

import com.apurva.springboot.bean.Subject;
import com.apurva.springboot.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @GetMapping(value="/subjects")
    public List<Subject> getAllSubjects() {
        return subjectService.getAllSubjects();
    }

    @PostMapping("/subjects")
    public void addSubject(@RequestBody Subject subject) {
        subjectService.addSubject(subject);
    }

    @PutMapping("/subjects/{id}")
    public void updateSubject(@PathVariable String id, @RequestBody Subject subject){
        subjectService.updateSubject(id, subject);
    }
    @DeleteMapping(value="/subjects/{id}")
    public void DeleteSubject(@PathVariable String id) {
        subjectService.deleteSubject(id);
    }
}
