package org.example.controller.repository;

import org.example.model.Book;
import org.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public  interface UserRepository extends JpaRepository<User, Long> {
    User findbyUsername(String username);
}