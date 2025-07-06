package uk.oakacademy.employeeservice.service;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import uk.oakacademy.employeeservice.dto.EmployeeDTO;
import uk.oakacademy.employeeservice.entities.Employee;
import uk.oakacademy.employeeservice.repositories.EmployeeRepository;

import java.util.List;

@Service
//@RequiredArgsConstructor
public class EmployeeServiceImp implements EmployeeService{
    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    public EmployeeServiceImp(EmployeeRepository employeeRepository, ModelMapper modelMapper) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public List<EmployeeDTO> getAll() {
        return List.of();
    }

    @Override
    public EmployeeDTO getId(String id) {
        return null;
    }

    @Override
    public EmployeeDTO save(EmployeeDTO employeeDTO) {
        // with modelmapper
        Employee employee= modelMapper.map(employeeDTO,Employee.class);
        employee = employeeRepository.save(employee);
        employeeDTO = modelMapper.map(employee,EmployeeDTO.class);
        return employeeDTO;

        // without modelmapper
//        Employee employee = new Employee();
//        employee.setAge(employeeDTO.getAge());
//        employee.setName(employeeDTO.getName());
//        employee.setSurname(employeeDTO.getSurname());
//        employee.setEmail(employeeDTO.getEmail());
//        employee.setJob(employeeDTO.getJob());
//          employee = employeeRepository.save(employee);
//        employeeDTO.setId(employee.getId());
//        employee.setAddedDate(employee.getAddedDate());
//        return employeeDTO;
    }

    @Override
    public EmployeeDTO delete(String id) {
        return null;
    }

    @Override
    public Page<EmployeeDTO> findPagination(int pagesize, int pageno, String sortField, String sortDirection) {
        return null;
    }
}
