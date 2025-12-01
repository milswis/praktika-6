public class Attraction extends BaseAttraction {
    private String type;
    private int capacity;
    private boolean isWorking;

    public Attraction(int id, String name, String type, int capacity, boolean isWorking) {
        super(id, name);
        this.type = type;
        this.capacity = capacity;
        this.isWorking = isWorking;
    }

    @Override
    public void start() {
        System.out.println("Attraction.start()");
    }

    @Override
    public void stop() {
        System.out.println("Attraction.stop()");
    }

    @Override
    public void repair() {
        System.out.println("Attraction.repair()");
    }

    @Override
    public String toString() {
        return "Attraction{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", capacity=" + capacity +
                ", isWorking=" + isWorking +
                '}';
    }
}
