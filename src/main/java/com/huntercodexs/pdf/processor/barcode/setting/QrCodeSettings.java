package com.huntercodexs.pdf.processor.barcode.setting;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class QrCodeSettings {
    private int dpi = 400;
    private int margin = 0;
    private int matrix = 70;
    private int size = 70;
    private int onColor = 0xFF000001;
    private int offColor = 0xFFFFFFFF;
    private float offsetX = 0;
    private float offsetY = 400;
    private String data;

}
