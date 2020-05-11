package ru.company.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.company.entity.Department;
import ru.company.mapper.DepartmentMapper;

import java.util.List;
@Repository
public class DepartmentDAO implements DAO{

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Department> findAll(){
        String sql = "SELECT * FROM companyguide.departments";
        return jdbcTemplate.query(sql, new DepartmentMapper());
    }


    public Department findById(Integer id){
        String sql = "SELECT * FROM companyguide.departments where DepartmentCode = ?";
        return jdbcTemplate.queryForObject(sql, new DepartmentMapper(), id);
    }

    public List<Department> findByName(String name){
        String sql = "SELECT * FROM companyguide.departments where departmentName = ? ";
        return jdbcTemplate.query(sql, new DepartmentMapper(), name);
    }

    public void add(Department department){
        String sql = "INSERT INTO companyguide.departments (departmentCode, departmentName,departmentHead) VALUES (?, ?, ?)";
         jdbcTemplate.update(sql, department.getDepartmentCode(), department.getDepartmentName(), department.getDepartmentHead());
    }


    public void delete(Integer id){
        String sql = "DELETE companyguide.departments where departmentCode = ? ";
         jdbcTemplate.update(sql, id);
    }

    void update (Department department){
        String sql = "UPDATE companyguide.departments SET departmentName = ?, departmentHead = ? where departmentCode = ? ";
        jdbcTemplate.update(sql, department.getDepartmentName(), department.getDepartmentHead(), department.getDepartmentCode());
    }
}
