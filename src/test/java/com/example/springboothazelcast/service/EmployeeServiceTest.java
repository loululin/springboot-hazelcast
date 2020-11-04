package com.example.springboothazelcast.service;

import com.example.springboothazelcast.entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: springboot-hazelcast
 * @description: EmployeeServiceTest
 * @author: loulvlin
 * @create: 2020-11-04 16:50
 */
@SpringBootTest
public class EmployeeServiceTest {

    @Resource
    private IEmployeeService employeeService;


    @Test
    public void list(){
        List<Employee> result = employeeService.list();
        List<Employee> result2 = employeeService.list();
        List<Employee> result3 = employeeService.list();
        System.out.println(result3.size());
    }
}
