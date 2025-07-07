package uk.oakacademy.employeeservice.service;

import org.springframework.data.domain.Page;
import uk.oakacademy.employeeservice.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {
    public List<EmployeeDTO> getAll();
    public EmployeeDTO getById(String id);
    public EmployeeDTO save(EmployeeDTO employeeDTO);
    public EmployeeDTO delete(String id);
    public Page<EmployeeDTO> findPagination(int pagesize, int pageno,String sortField,String sortDirection);
    public EmployeeDTO update(EmployeeDTO employeeDTO);
}
