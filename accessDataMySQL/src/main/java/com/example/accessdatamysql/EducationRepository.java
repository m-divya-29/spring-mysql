package com.example.accessdatamysql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EducationRepository extends JpaRepository<Education, Integer> {

}
