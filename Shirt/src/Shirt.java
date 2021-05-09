public class Shirt {
    private String id;
    private String description;
    private String color;
    private String size;

    public Shirt(String id, String description, String color, String size) {
        this.id = id;
        this.description = description;
        this.color = color;
        this.size = size;
    }

    public Shirt(String description) {
        String[] desc = description.split(",");
        if (desc.length != 4)
            throw new IllegalArgumentException();
        this.id = desc[0];
        this.description = desc[1];
        this.color = desc[2];
        this.size = desc[3];
    }

    @Override
    public String toString() {
        return  "id='" + id + '\'' + "\n" +
                "description='" + description + '\'' + "\n" +
                "color='" + color + '\'' + "\n" +
                "size='" + size + '\'';
    }
}
