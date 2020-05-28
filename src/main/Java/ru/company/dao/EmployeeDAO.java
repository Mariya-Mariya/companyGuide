package ru.company.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.company.entity.Department;
import ru.company.entity.Employee;
import ru.company.mapper.DepartmentMapper;
import ru.company.mapper.EmployeeMapper;

import java.util.List;
@Repository
public class EmployeeDAO  {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public Employee findById(Integer id){
        String sql = "SELECT * FROM companyguide.employees WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new EmployeeMapper(), id);

    }
    public  List<Employee> findByName(String name) {
        String sql = "SELECT * FROM companyguide.employees WHERE FirstName like '%?%'";
        return jdbcTemplate.query(sql, new EmployeeMapper(), name);
    };
    public  List<Employee> findByDepartment(String code) {
        String sql = "SELECT * FROM companyguide.employees WHERE CodeDepartment = ?";
        return jdbcTemplate.query(sql, new EmployeeMapper(), code);
    };
    public  List<Employee> findAll() {
        String sql = "SELECT * FROM companyguide.employees ";
        return jdbcTemplate.query(sql, new EmployeeMapper());
    };
    public void add(Employee employee){
        String sql = "INSERT into companyguide.employees (FirstName, MiddleName, LastName, CodeDepartment, email, phone) values " +
                "(?, ?, ?, ?, ?, ?)" ;
        jdbcTemplate.update(sql, employee.getFirstName(), employee.getMiddleName(),
                employee.getLastName(), employee.getCodeDepartment(), employee.getEmail(), employee.getPhone());
    }


}
