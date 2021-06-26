public class stomach extends medcon{
    private String fed;

    public stomach(String name, String condition, String fed) {
        super(name, condition);
        this.fed = fed;
    }

    public String getFed() {
        return fed;
    }

    public void setFed(String fed) {
        this.fed = fed;
    }
}
