package design.pattern.ch7.adapter;

public class HDMI {
    private byte[] images;

    public HDMI(byte[] images) {
        this.images = images;
    }

    public byte[] getImages() {
        return images;
    }

    public void setImages(byte[] images) {
        this.images = images;
    }
}
