public abstract class BaseTicket {
    protected int id;
    protected BaseVisitor visitor;
    protected BaseAttraction attraction;

    public BaseTicket(int id, BaseVisitor v, BaseAttraction a) {
        this.id = id;
        this.visitor = v;
        this.attraction = a;
    }

    public abstract void use();
    public abstract void refund();

    @Override
    public abstract String toString();
}
