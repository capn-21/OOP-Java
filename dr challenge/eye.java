public class eye extends medcon{
    private String color;

    public eye(String name, String condition, String color) {
        super(name, condition);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
