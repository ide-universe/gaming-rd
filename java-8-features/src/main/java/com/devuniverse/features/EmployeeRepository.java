package com.devuniverse.features;

import java.util.List;
import java.util.Optional;

public class EmployeeRepository {
    private List<Employee> employeeList ;

    public EmployeeRepository(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }



    public Optional<Employee> findById(Integer id ){
        return  employeeList.stream().filter( e -> e.getId() == id).findFirst();
    }
}
