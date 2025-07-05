package uk.oakacademy.employeeservice.service;

import org.springframework.data.domain.Page;
import uk.oakacademy.employeeservice.entities.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAll();
    public Employee getId(String id);
    public Employee save(Employee employee);
    public Employee delete(String id);
    public Page<Employee> findPagination(int pagesize, int pageno,String sortField,String sortDirection);

}
