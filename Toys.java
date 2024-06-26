public class Toys {
    private int id;
    private String name;
    private int frequency;

    public Toys (int id, String name, int frequency) {
        this.id = id;
        this.name = name;
        this.frequency = frequency;
    }

    public int getId () {
        return id;
    }

    public String getName () {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }



    @Override
    public String toString() {
        return "Toy{" + "id=" + id + ", name='" + name + '\'' + ", frequency=" + frequency + "}";
    }

}