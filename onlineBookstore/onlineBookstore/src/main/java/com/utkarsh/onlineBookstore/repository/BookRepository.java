package com.utkarsh.onlineBookstore.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utkarsh.onlineBookstore.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
