public class heart extends medcon{
    private int heartrate;

    public heart(String name, String condition, int heartrate) {
        super(name, condition);
        this.heartrate = heartrate;
    }

    public int getHeartrate() {
        return heartrate;
    }

    public void setHeartrate(int heartrate) {
        this.heartrate = heartrate;
    }
}
