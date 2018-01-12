package practise;

import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SortEmployeeTest {
    List<Employee> employees = Arrays.asList(
            Employee.builder()
                    .firstName("Lisa")
                    .lastName("Nilsson")
                    .hiredDate(LocalDate.now())
                    .build(),
            Employee.builder()
                    .firstName("Tommy")
                    .lastName("Nilsson")
                    .hiredDate(LocalDate.now().minusDays(10))
                    .build(),
            Employee.builder()
                    .firstName("Xavier")
                    .lastName("Xerxes")
                    .hiredDate(LocalDate.now().minusDays(5))
                    .build()
    );

    @Test
    public void oldSort() {
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                return employee1.getHiredDate().compareTo(employee2.getHiredDate());
            }
        });
        assertTrue(employees.get(0).getFirstName().equals("Tommy"));
    }

    @Test
    public void newSort() {
        Optional<Employee> employeeOptional = employees.stream()
                .sorted(Comparator.comparing(Employee::getHiredDate))
                .findFirst();
        assertTrue(employeeOptional.isPresent());
        assertEquals("Tommy", employeeOptional.get().getFirstName());
    }
}
