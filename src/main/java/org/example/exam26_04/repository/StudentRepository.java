package org.example.exam26_04.repository;

import jakarta.persistence.NamedQuery;
import org.example.exam26_04.entity.StudentEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer>,
        JpaSpecificationExecutor<StudentEntity>
{
    List<StudentEntity> findByFirstName(@Param("name") String name);
    @EntityGraph(attributePaths = "courses")
    List<StudentEntity> findAll();
}
