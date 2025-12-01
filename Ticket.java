public class Ticket extends BaseTicket {
    private double price;
    private String date;

    public Ticket(int id, BaseVisitor v, BaseAttraction a, double p, String d) {
        super(id, v, a);
        this.price = p;
        this.date = d;
    }

    @Override
    public void use() {
        System.out.println("Ticket.use()");
    }

    @Override
    public void refund() {
        System.out.println("Ticket.refund()");
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", visitor=" + visitor +
                ", attraction=" + attraction +
                ", price=" + price +
                ", date='" + date + '\'' +
                '}';
    }
}
