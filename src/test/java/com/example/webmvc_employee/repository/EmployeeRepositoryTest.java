package com.example.webmvc_employee.repository;

import com.example.webmvc_employee.entity.Employee;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeRepositoryTest {
  private EntityManager entityManager;
  private final EmployeeRepository repository = new EmployeeRepository(entityManager);

  @Test
  void findAll() {
    Employee employee = new Employee();
    employee.setEmpId("202301");
    employee.setEmpName("홍길동");
    repository.save(employee);
    Assertions.assertEquals(0, repository.findAll().size());
  }
}