package com.loxasoft.employeeservice.repository;

import com.loxasoft.employeeservice.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
