import java.math.BigDecimal;

public class JavaProgrammer extends Programmer {

    private static final String language = "Java";
    private final BigDecimal salary;

    public JavaProgrammer(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public BigDecimal getSalary() {
        return salary;
    }

    @Override
    protected String getLanguage() {
        return language;
    }
}
