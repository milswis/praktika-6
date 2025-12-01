public class Visitor extends BaseVisitor {
    private int age;

    public Visitor(int id, String name, int age) {
        super(id, name);
        this.age = age;
    }

    @Override
    public void buy(BaseTicket ticket) {
        System.out.println("Visitor.buy()");
    }

    @Override
    public void visit(BaseAttraction attraction) {
        System.out.println("Visitor.visit()");
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
