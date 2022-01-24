package design.pattern.ch7.adapter;

import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HDMIConverterTest {
    @Test
    void converterTest() {
        // given
        byte[] imageBytes = "변환할 이미지 정보의 스트림".getBytes(StandardCharsets.UTF_8);
        RGB rgb = new RGB();
        rgb.setImages(imageBytes);

        // when
        HDMIConverter hdmiConverter = new HDMIConverter();
        HDMI hdmi = hdmiConverter.convertRGBToHDMI(rgb);

        // then
        assertEquals(hdmi.getImages(), imageBytes);
    }
}