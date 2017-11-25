package application.employee.api;

import application.employee.model.Employee;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collection;

@Path("/employee")
public interface EmployeeServiceInterface {

    @GET
    @Path("/employees")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Collection<Employee> getEmployees();

    void addEmployee(Employee employee);
}
