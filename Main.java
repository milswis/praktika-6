public class Main {
    public static void main(String[] args) {
        BasePark park = new Park(1, "Sunny Park", "Одеса", 2005);
        BaseAttraction attraction = new Attraction(1, "Гірки", "Екстремальний", 20, true);
        BaseVisitor visitor = new Visitor(1, "Анна", 17);
        BaseEmployee employee = new Employee(1, "Наталья", "Ковальчук", "Оператор", 5);
        BaseTicket ticket = new Ticket(1, visitor, attraction, 150, "2025-10-06");

        park.open();
        attraction.start();
        employee.work();
        visitor.visit(attraction);
        ticket.use();

        System.out.println(park);
        System.out.println(attraction);
        System.out.println(visitor);
        System.out.println(employee);
        System.out.println(ticket);
    }
}
