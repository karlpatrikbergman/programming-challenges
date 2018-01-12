package sort;

import lombok.Builder;
import lombok.Value;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

@Value
@Builder
class Employee {
    String firstName;
    String lastName;
    LocalDate hireDate;
    private static final AtomicInteger counter = new AtomicInteger(0);
    private final int employeeNumber = counter.incrementAndGet();
}
