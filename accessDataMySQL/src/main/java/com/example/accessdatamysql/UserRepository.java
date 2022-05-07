package com.example.accessdatamysql;

//a JpaRepository can also be used in the same way.
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Step 2: repository that holds user records
 */
public interface UserRepository extends JpaRepository<User, Integer> {

}
