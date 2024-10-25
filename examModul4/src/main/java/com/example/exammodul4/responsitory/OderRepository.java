package com.example.exammodul4.responsitory;


import com.example.exammodul4.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OderRepository extends JpaRepository<Orders,Long> {

}
