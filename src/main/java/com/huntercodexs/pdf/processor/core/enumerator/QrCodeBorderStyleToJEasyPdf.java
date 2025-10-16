package com.huntercodexs.pdf.processor.core.enumerator;

import lombok.Getter;

@Getter
public enum QrCodeBorderStyleToJEasyPdf {
    BORDERED("BORDERED"),
    BORDERLESS("BORDERLESS"),
    LEFT_BORDERED("LEFT_BORDERED");

    private final String borderStyle;

    QrCodeBorderStyleToJEasyPdf(String borderStyle) {
        this.borderStyle = borderStyle;
    }

    public static String qrCodeBorderStyle(QrCodeBorderStyleToJEasyPdf borderStyle) {
        return borderStyle.getBorderStyle();
    }
}
