package org.example.exam26_04.repository;

import org.example.exam26_04.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity,Integer>,
        JpaSpecificationExecutor<CourseEntity>
{
}
