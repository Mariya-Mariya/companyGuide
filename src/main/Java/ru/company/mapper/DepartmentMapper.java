package ru.company.mapper;
import org.springframework.jdbc.core.RowMapper;
import ru.company.entity.Department;

import java.sql.ResultSet;
import java.sql.SQLException;


public class DepartmentMapper implements RowMapper<Department> {


    @Override
    public Department mapRow(ResultSet rs, int rowNum) throws SQLException {
        Department department = new Department();
        department.setDepartmentCode(rs.getInt("DepartmentCode"));
        department.setDepartmentName(rs.getString("DepartmentName"));
        department.setDepartmentHead(rs.getInt("DepartmentHead"));
        return department;
    }
}
