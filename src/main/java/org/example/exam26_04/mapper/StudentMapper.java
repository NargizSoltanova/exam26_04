package org.example.exam26_04.mapper;

import lombok.experimental.UtilityClass;
import org.example.exam26_04.dto.StudentRequestDto;
import org.example.exam26_04.entity.StudentEntity;

@UtilityClass
public class StudentMapper {
    public StudentEntity dtoToEntity(StudentRequestDto student){
       return StudentEntity.builder()
                .firstName(student.getFirstName())
                .lastName(student.getLastName())
                .age(student.getAge())
                .build();
    }
}
