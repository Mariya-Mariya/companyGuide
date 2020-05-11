package ru.company.mapper;

import org.springframework.jdbc.core.RowMapper;
import ru.company.entity.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMapper implements RowMapper<Employee> {
    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee employee = new Employee();

        employee.setId(rs.getInt("id"));
        employee.setCodeDepartment(rs.getInt("CodeDepartment"));
        employee.setFirstName(rs.getString("FirstName"));
        employee.setMiddleName(rs.getString("MiddleName"));
        employee.setLastName(rs.getString("LastName"));
        employee.setPhone(rs.getString("phone"));
        employee.setEmail(rs.getString("email"));

        return employee;
    }
}
