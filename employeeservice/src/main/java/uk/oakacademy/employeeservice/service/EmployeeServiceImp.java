package uk.oakacademy.employeeservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import uk.oakacademy.employeeservice.entities.Employee;
import uk.oakacademy.employeeservice.repositories.EmployeeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImp implements EmployeeService{
    private final EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getAll() {
        return List.of();
    }

    @Override
    public Employee getId(String id) {
        return null;
    }

    @Override
    public Employee save(Employee employee) {
        return null;
    }

    @Override
    public Employee delete(String id) {
        return null;
    }

    @Override
    public Page<Employee> findPagination(int pagesize, int pageno, String sortField, String sortDirection) {
        return null;
    }
}
