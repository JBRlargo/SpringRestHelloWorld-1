package com.dwes.rest.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dwes.rest.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
