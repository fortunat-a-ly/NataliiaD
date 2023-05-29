public abstract class Programmer implements Job {

    public String work() {
        return "I code in " + getLanguage();
    }

    protected abstract String getLanguage();
}
