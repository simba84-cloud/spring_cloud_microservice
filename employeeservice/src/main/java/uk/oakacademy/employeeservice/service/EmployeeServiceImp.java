package uk.oakacademy.employeeservice.service;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import uk.oakacademy.employeeservice.dto.EmployeeDTO;
import uk.oakacademy.employeeservice.entities.Employee;
import uk.oakacademy.employeeservice.repositories.EmployeeRepository;

import java.util.List;
import java.util.stream.Collectors;

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
        List<Employee>employees=employeeRepository.findAll();
        List<EmployeeDTO>list=employees.stream().map(employee -> modelMapper.map(employee,EmployeeDTO.class))
                .collect(Collectors.toList());
        return list;
    }

    @Override
    public EmployeeDTO getById(String id) {
        Employee employee= employeeRepository.findById(id).orElseThrow();
        EmployeeDTO employeeDTO = modelMapper.map(employee, EmployeeDTO.class);
        return employeeDTO;
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
        Employee employee= employeeRepository.findById(id).orElseThrow();
        EmployeeDTO employeeDTO = modelMapper.map(employee,EmployeeDTO.class);
        employeeRepository.deleteById(id);
        return employeeDTO;
    }

    @Override
    public Page<EmployeeDTO> findPagination(int pagesize, int pageno, String sortField, String sortDirection) {
        return null;
    }

    @Override
    public EmployeeDTO update(EmployeeDTO employeeDTO) {
        Employee employee = employeeRepository.findById(employeeDTO.getId()).orElseThrow(()->new IllegalArgumentException());
        employee.setName(employeeDTO.getName());
        employee.setJob(employeeDTO.getJob());
        employee.setEmail(employeeDTO.getEmail());
        employee.setAge(employeeDTO.getAge());
        employee.setSurname(employeeDTO.getSurname());
        employeeRepository.save(employee);
        return employeeDTO;

    }
}
