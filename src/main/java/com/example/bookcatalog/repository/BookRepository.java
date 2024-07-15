package com.example.bookcatalog.repository;

import com.example.bookcatalog.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    // No additional methods needed for basic CRUD operations as JpaRepository provides them out of the box.
}
