public class Video {
    private int videoId;
    private String name;
    private int price;

    public Video(int videoId, String name, int price) {
        this.videoId = videoId;
        this.name = name;
        this.price = price;
    }

    public String get() {
        return "Id:" + videoId + " " + "name:" + name + " " + "price:" + price;
    }
}
