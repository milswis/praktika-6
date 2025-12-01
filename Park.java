public class Park extends BasePark {
    private String location;
    private int foundedYear;

    public Park(int id, String name, String loc, int y) {
        super(id, name);
        this.location = loc;
        this.foundedYear = y;
    }

    @Override
    public void open() {
        System.out.println("Park.open()");
    }

    @Override
    public void close() {
        System.out.println("Park.close()");
    }

    @Override
    public void add(BaseAttraction attraction) {
        System.out.println("Park.add()");
    }

    @Override
    public String toString() {
        return "Park{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", foundedYear=" + foundedYear +
                '}';
    }
}
