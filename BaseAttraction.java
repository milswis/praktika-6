public abstract class BaseAttraction {
    protected int id;
    protected String name;

    public BaseAttraction(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void start();
    public abstract void stop();
    public abstract void repair();

    @Override
    public abstract String toString();
}
