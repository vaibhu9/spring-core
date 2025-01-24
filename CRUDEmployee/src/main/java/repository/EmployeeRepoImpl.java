package repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import entities.Employee;

@Repository("employeeRepo")
public class EmployeeRepoImpl implements EmployeeRepo{

    @Autowired
    JdbcTemplate template;

    @Override
    public boolean isAddEmployee(Employee employee) {
        // TODO Auto-generated method stub
        int value=template.update("insert into employee(name, email, contact) values(?,?,?)", new PreparedStatementSetter() {

            @Override
            public void setValues(PreparedStatement ps) throws SQLException {
                // TODO Auto-generated method stub
                ps.setString(1, employee.getName());
                ps.setString(2, employee.getEmail());
                ps.setString(3, employee.getContact());
            }
            
        });
        return (value>0)?true:false;
    }

    @Override
    public List<Employee> viewEmployee() {
        // TODO Auto-generated method stub
        List<Employee> list= template.query("select *from employee",new RowMapper<Employee>(){

            @Override
            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
                // TODO Auto-generated method stub
                Employee e=new Employee();
                e.setId(rs.getInt(1));
                e.setName(rs.getString(2));
                e.setEmail(rs.getString(3));
                e.setContact(rs.getString(4));
                return e;
            }
            
        });
        return list;
    }

    @Override
    public boolean isDeleteEmployee(Object obj) {
        // TODO Auto-generated method stub
        int value=template.update("delete from employee where id=?", obj);
        return (value>0)?true:false;
    }

    @Override
    public Employee serachEmployeeById(Object obj) {
        // TODO Auto-generated method stub
        return template.queryForObject("select *from employee where id=?", new Object[]{obj}, new RowMapper<Employee>(){

            @Override
            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
                // TODO Auto-generated method stub
                Employee e=new Employee();
                e.setId(rs.getInt(1));
                e.setName(rs.getString(2));
                e.setEmail(rs.getString(3));
                e.setContact(rs.getString(4));
                return e;
            }
            
        });
    }

    @Override
    public boolean isUpdateEmployee(Employee employee) {
        // TODO Auto-generated method stub
        int value=template.update("update employee set name=? email=? contact=? where id=?", new PreparedStatementSetter() {

            @Override
            public void setValues(PreparedStatement ps) throws SQLException {
                // TODO Auto-generated method stub
                ps.setString(1, employee.getName());
                ps.setString(2, employee.getEmail());
                ps.setString(3, employee.getContact());
                ps.setInt(4,employee.getId());
            }
            
        });
        return (value>0)?true:false;
    }
    
}
