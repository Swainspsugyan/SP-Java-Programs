package com.sp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

// Employee entity for PostgreSQL
@Entity
class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String departmentId;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    
    // getters and setters
}

// Department entity for MongoDB
class DepartmentEntity {
    private String departmentId;
    private String departmentName;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    
    // getters and setters
}

// Employee Repository for PostgreSQL
interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
    List<EmployeeEntity> findByDepartmentId(String departmentId);
}

// Department Repository for MongoDB
interface DepartmentRepository extends MongoRepository<DepartmentEntity, String> {
    Optional<DepartmentEntity> findByDepartmentId(String departmentId);
}

@Service
class EmployeeService {
    private final EmployeeRepository employeeRepository;
    
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    
    // Implement CRUD operations for Employee
    public List<EmployeeEntity> getAllEmployees() {
        return employeeRepository.findAll();
    }
    
    public EmployeeEntity createEmployee(EmployeeEntity employee) {
        return employeeRepository.save(employee);
    }
    
    public EmployeeEntity updateEmployee(EmployeeEntity employee) {
        return employeeRepository.save(employee);
    }
    
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
    
    public List<EmployeeEntity> getEmployeesByDepartment(String departmentId) {
        return employeeRepository.findByDepartmentId(departmentId);
    }
}

@Service
class DepartmentService {
    private final DepartmentRepository departmentRepository;
    
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }
    
    // Implement CRUD operations for Department
    public List<DepartmentEntity> getAllDepartments() {
        return departmentRepository.findAll();
    }
    
    public DepartmentEntity createDepartment(DepartmentEntity department) {
        return departmentRepository.save(department);
    }
    
    public DepartmentEntity updateDepartment(DepartmentEntity department) {
        return departmentRepository.save(department);
    }
    
    public void deleteDepartment(String departmentId) {
        departmentRepository.deleteById(departmentId);
    }
    
    public Optional<DepartmentEntity> getDepartmentById(String departmentId) {
        return departmentRepository.findByDepartmentId(departmentId);
    }
}

@SpringBootApplication
public class EmployeeManagementSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmployeeManagementSystemApplication.class, args);
    }
    
    @Bean
    public CommandLineRunner demo(EmployeeService employeeService, DepartmentService departmentService) {
        return args -> {
            // You can use this space to test your services and perform CRUD operations.
        };
    }
}
