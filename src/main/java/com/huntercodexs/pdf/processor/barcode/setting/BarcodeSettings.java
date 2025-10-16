package com.huntercodexs.pdf.processor.barcode.setting;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.krysalis.barcode4j.HumanReadablePlacement;

@Data
@Setter
@Getter
public class BarcodeSettings {

    private int dpi = 400;
    private int width = 500;
    private int height = 50;
    private int fontSize = 2;
    private int lineHeight = 20;
    private int margin = 0;
    private int orientation = 0;
    private float offsetX = 0;
    private float offsetY = 400;
    private double fixQuiteZone = 0;
    private boolean doQuiteZone = false;
    private String data;
    private String fontName = "courier";
    private HumanReadablePlacement textPosition = HumanReadablePlacement.HRP_BOTTOM;

}
