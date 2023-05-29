import java.math.BigDecimal;

public class HairDresser implements Job {

    private final BigDecimal salary;

    HairDresser(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public BigDecimal getSalary() {
        return salary;
    }
}
