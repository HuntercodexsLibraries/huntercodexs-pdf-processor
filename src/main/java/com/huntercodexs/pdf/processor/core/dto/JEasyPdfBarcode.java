package com.huntercodexs.pdf.processor.core.dto;

import com.huntercodexs.pdf.processor.core.enumerator.CodeType4ScannerToJEasyPdf;
import com.huntercodexs.pdf.processor.core.enumerator.FontNameToJEasyPdf;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.krysalis.barcode4j.HumanReadablePlacement;

@Data
@Setter
@Getter
public class JEasyPdfBarcode {

    private int dpi = 400;
    private int width = 370;
    private int height = 40;
    private int fontSize = 2;
    private int lineHeight = 20;
    private int margin = 0;
    private int orientation = 0;
    private float offsetX = 0;
    private float offsetY = 400;
    private double fixQuiteZone = 0;
    private boolean doQuiteZone = false;
    private String data = "00000.00000 00000.000000 00000.00000 0 00000000000000";
    private String infoOne = "";
    private String infoThree = "";
    private String infoFour = "";
    private FontNameToJEasyPdf fontName = FontNameToJEasyPdf.COURIER;
    private HumanReadablePlacement textPosition = HumanReadablePlacement.HRP_NONE;
    private CodeType4ScannerToJEasyPdf codeType4Scanner;

}
