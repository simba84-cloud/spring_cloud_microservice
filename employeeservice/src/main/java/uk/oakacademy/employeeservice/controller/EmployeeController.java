package uk.oakacademy.employeeservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.oakacademy.employeeservice.dto.EmployeeDTO;
import uk.oakacademy.employeeservice.service.EmployeeService;
import uk.oakacademy.employeeservice.service.EmployeeServiceImp;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public ResponseEntity<EmployeeDTO>addEmployee(@RequestBody EmployeeDTO employeeDTO){
    return new ResponseEntity<EmployeeDTO>(employeeService.save(employeeDTO),HttpStatus.ACCEPTED);
    }
}
