package com.devuniverse.features;

import org.apache.commons.lang3.StringUtils;
import org.junit.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.apache.commons.lang3.StringUtils.*;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
@Tag("emp_test_class")
@DisplayName("Employee class Test cases")
public class EmployeeTest {
    private static String fileName = "src/test/resources/test.txt";

    private static List<Employee> employeeList = List.of(new Employee[]{
            new Employee(1, "Ram", 1000.0),
            new Employee(2, "Ram", 2000.0),
            new Employee(3, "Ram", 3000.0)
    });

    private static EmployeeRepository employeeRepository = new EmployeeRepository(employeeList);



@BeforeClass
public static void setup(){
//employeeRepository = new EmployeeRepository(employeeList);
}

@AfterClass
public static void clean(){

}

@Before
public void beforeEach(){


}

@After
public void afterEach(){

}
    @Test

    @DisplayName("Employee list stream test ")
    @RepeatedTest(10)
    public void whenGetStreamFromList_ObtainStream(){

        Stream.Builder<Employee> empStreamBuilder = Stream.builder();

        employeeList.forEach( e -> empStreamBuilder.accept(e));

        Stream<Employee> empStream = empStreamBuilder.build();

        assert(empStream instanceof Stream<?>);

    }

    @ParameterizedTest
    @ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
    void palindromes(String candidate) {
        assertTrue(StringUtils.isNotEmpty(candidate));
    }

    @Test
    public void test(){
        assertTrue(true);
    }

    @Test
    public void whenFilterEmployees_thenGetFilteredStream() {
        Integer[] empIds = { 1, 2, 3};

        List<Optional<Employee>> employees = Stream.of(empIds)
                .map(employeeRepository::findById)
                .filter(Objects::nonNull)
                .filter(e -> e.get().getSalary() > 0)
                .collect(Collectors.toList());

        assertEquals(employees.size(), empIds.length );
    }

}
