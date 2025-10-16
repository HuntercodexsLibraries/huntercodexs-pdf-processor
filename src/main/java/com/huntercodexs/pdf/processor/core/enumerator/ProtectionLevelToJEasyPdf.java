package com.huntercodexs.pdf.processor.core.enumerator;

import lombok.Getter;

@Getter
public enum ProtectionLevelToJEasyPdf {
    LOW(64),
    MIDDLE(128),
    HIGH(256);

    private final int protectionLevel;

    ProtectionLevelToJEasyPdf(int protectionLevel) {
        this.protectionLevel = protectionLevel;
    }

    public static int protectionLevel(ProtectionLevelToJEasyPdf protectionLevel) {
        return protectionLevel.getProtectionLevel();
    }
}
