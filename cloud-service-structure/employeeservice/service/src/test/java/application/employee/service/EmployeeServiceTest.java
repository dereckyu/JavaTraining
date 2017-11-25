package application.employee.service;

import application.employee.config.EmployeeConfigContext;
import application.employee.model.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import platform.persistence.mongo.MongoConfigContext;

import java.util.Collection;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by admin on 2017-11-18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MongoConfigContext.class, EmployeeConfigContext.class})
public class EmployeeServiceTest {

    @Autowired
    EmployeeService employeeService;

    @Test
    public void testGetEmployees() {
        Collection<Employee> employees = employeeService.getEmployees();
        assertTrue(!employees.isEmpty());
        System.out.println(employees);
    }

    @Test
    public void testAddEmployee() {
        assertNotNull(employeeService);

        Employee employee = new Employee();
        employee.setCode("002");
        employee.setName("mmm");

        employeeService.addEmployee(employee);
    }



}
