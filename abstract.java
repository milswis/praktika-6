public abstract class BaseEmployee {
    protected int id;
    protected String firstName;
    protected String lastName;

    public BaseEmployee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public abstract void work();
    public abstract void takeBreak();
    public abstract void maintain(BaseAttraction attraction);

    @Override
    public abstract String toString();
}
