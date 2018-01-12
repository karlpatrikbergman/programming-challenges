package sort;

import org.junit.BeforeClass;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.junit.Assert.assertTrue;

public class EmployeeTest {

    private static List<Employee> employees;

    @BeforeClass
    public static void setup() {
        employees = Arrays.asList(
                Employee.builder()
                        .firstName("Ove")
                        .lastName("Thörnqvist")
                        .hireDate(LocalDate.now())
                        .build(),
                Employee.builder()
                        .firstName("Nina")
                        .lastName("Abrahamsson")
                        .hireDate(LocalDate.now().minusDays(1))
                        .build(),
                Employee.builder()
                        .firstName("Ada")
                        .lastName("Abrahamsson")
                        .hireDate(LocalDate.now().minusDays(1))
                        .build(),
                Employee.builder()
                        .firstName("Susanne")
                        .lastName("Ljung")
                        .hireDate(LocalDate.now().plusDays(1))
                        .build()
        );
    }

    @Test
    public void sortByHireDatePreJava8() {
        Comparator<Employee> comparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                if(employee1.getHireDate().isBefore(employee2.getHireDate())) {
                    return -1;
                } else if (employee1.getHireDate().equals(employee2.getHireDate())) {
                    return 0;
                } else {
                    return 1;
                }
            }
        };
        employees.sort(comparator);

        assertTrue(employees.get(0).getFirstName().equals("Nina"));
        employees.stream()
                .forEach(System.out::println);
    }

    @Test
    public void sortByHireDatePreJava8_2() {
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                if(employee1.getHireDate().isBefore(employee2.getHireDate())) {
                    return -1;
                } else if (employee1.getHireDate().equals(employee2.getHireDate())) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });
        assertTrue(employees.get(0).getFirstName().equals("Nina"));
    }

    @Test
    public void sortByHireDateJava8() {
        Optional<Employee> firstEmployed = employees.stream()
                .sorted(Comparator.comparing(Employee::getHireDate))
                .findFirst();
        assertTrue(firstEmployed.isPresent());
        assertTrue(firstEmployed.get().getFirstName().equals("Nina"));
    }

    @Test
    public void sortByHireDateAndFirstName() {
        List<Employee> employeeList = employees.stream()
                .sorted(Comparator.comparing(Employee::getHireDate)
                        .thenComparing(Employee::getFirstName))
                .collect(Collectors.toList());

        assertTrue(employeeList.get(0).getFirstName().equals("Ada"));

        employeeList.stream()
                .forEach(System.out::println);
    }
}
