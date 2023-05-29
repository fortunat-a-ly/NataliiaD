import java.math.BigDecimal;

public class JavaScriptProgrammer extends Programmer {

    private static final String language = "JavaScript";
    private final BigDecimal salary;

    JavaScriptProgrammer(BigDecimal salary) {
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
