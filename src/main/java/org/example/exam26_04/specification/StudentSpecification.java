package org.example.exam26_04.specification;

import org.example.exam26_04.entity.StudentEntity;
import org.springframework.data.jpa.domain.Specification;

public class StudentSpecification {
    public static Specification<StudentEntity> ageGreaterThan(int age) {
        return (root,_, builder) ->
                builder.greaterThan(root.get("age"), age);
    }
}
