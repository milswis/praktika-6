public abstract class BasePark {
    protected int id;
    protected String name;

    public BasePark(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void open();
    public abstract void close();
    public abstract void add(BaseAttraction attraction);

    @Override
    public abstract String toString();
}
