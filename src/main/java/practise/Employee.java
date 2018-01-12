package practise;

import lombok.Builder;
import lombok.Value;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

@Value
@Builder
public class Employee {
    String firstName;
    String lastName;
    LocalDate hiredDate;
    private static final AtomicInteger counter = new AtomicInteger(0);
    private final int employeeNumber = counter.incrementAndGet();
}
