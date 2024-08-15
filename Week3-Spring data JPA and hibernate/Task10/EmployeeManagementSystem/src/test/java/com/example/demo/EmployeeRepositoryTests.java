package com.example.demo;

import com.example.demo.projections.EmployeeProjection;
import com.example.demo.projections.EmployeeProjectionClass;
import com.example.demo.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class EmployeeRepositoryTests {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void testFindEmployeeProjections() {
        List<EmployeeProjection> projections = employeeRepository.findEmployeeProjections();
        assertThat(projections).isNotEmpty();
        // Add more assertions based on your requirements
    }

    @Test
    public void testFindEmployeeProjectionsClass() {
        List<EmployeeProjectionClass> projections = employeeRepository.findEmployeeProjectionsClass();
        assertThat(projections).isNotEmpty();
        // Add more assertions based on your requirements
    }
}
