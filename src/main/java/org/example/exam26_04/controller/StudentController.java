package org.example.exam26_04.controller;

import lombok.RequiredArgsConstructor;
import org.example.exam26_04.dto.StudentRequestDto;
import org.example.exam26_04.entity.StudentEntity;
import org.example.exam26_04.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/student")
public class StudentController {
    private final StudentService studentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody StudentRequestDto studentEntity) {
         studentService.save(studentEntity);
    }

    @GetMapping("/ageGreater/{age}")
    public List<StudentEntity> ageGreaterThan20(@PathVariable  int age) {
        return studentService.ageGreaterThan(age);
    }

    @GetMapping("/filter")
    public List<StudentEntity> filterByName(String firstName) {
        return studentService.findByName(firstName);
    }
}
