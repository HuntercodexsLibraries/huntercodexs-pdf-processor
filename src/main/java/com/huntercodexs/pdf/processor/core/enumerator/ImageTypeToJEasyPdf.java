package com.huntercodexs.pdf.processor.core.enumerator;

import lombok.Getter;

@Getter
public enum ImageTypeToJEasyPdf {
    JPEG("JPEG"),
    JPG("JPEG"),
    PNG("PNG"),
    GIF("GIF"),
    TIFF("TIFF"),
    BMP("BMP");

    private final String imageType;

    ImageTypeToJEasyPdf(String imageType) {
        this.imageType = imageType;
    }

    public static String imageType(ImageTypeToJEasyPdf imageType) {
        return imageType.getImageType();
    }
}
