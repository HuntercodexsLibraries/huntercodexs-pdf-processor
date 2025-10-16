package com.huntercodexs.pdf.processor.core.enumerator;

import lombok.Getter;

@Getter
public enum ImageQualityToJEasyPdf {
    LOW(50),
    NORMAL(120),
    GOOD(300),
    ULTRA(500),
    SUPER(800);

    private final int imageQuality;

    ImageQualityToJEasyPdf(int imageQuality) {
        this.imageQuality = imageQuality;
    }

    public static int imageQuality(ImageQualityToJEasyPdf imageQuality) {
        return imageQuality.getImageQuality();
    }
}
