package com.bookStore.repositry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookStore.entity.MyBookList;

@Repository
public interface MyBookRepositry extends JpaRepository<MyBookList,Integer> {

}
