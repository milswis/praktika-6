public abstract class BaseVisitor {
    protected int id;
    protected String name;

    public BaseVisitor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void buy(BaseTicket ticket);
    public abstract void visit(BaseAttraction attraction);

    @Override
    public abstract String toString();
}
