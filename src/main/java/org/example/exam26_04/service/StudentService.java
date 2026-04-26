package org.example.exam26_04.service;

import lombok.RequiredArgsConstructor;
import org.example.exam26_04.dto.StudentRequestDto;
import org.example.exam26_04.entity.StudentEntity;
import org.example.exam26_04.mapper.StudentMapper;
import org.example.exam26_04.repository.StudentRepository;
import org.example.exam26_04.specification.StudentSpecification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public void save(StudentRequestDto student) {
         studentRepository.save(StudentMapper.dtoToEntity(student));
    }

    public List<StudentEntity> findByName(String name) {
        return studentRepository.findByFirstName(name);
    }

    public List<StudentEntity> ageGreaterThan(int age) {
        return studentRepository.findAll(StudentSpecification.ageGreaterThan(age));
    }
}
