package design.pattern.ch7.adapter;

public class HDMIConverter implements Adapter {
    @Override
    public HDMI convertRGBToHDMI(RGB rgb) {
        return new HDMI(rgb.getImages());
    }
}
