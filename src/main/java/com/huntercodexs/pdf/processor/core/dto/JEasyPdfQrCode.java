package com.huntercodexs.pdf.processor.core.dto;

import com.huntercodexs.pdf.processor.core.enumerator.CodeType4ScannerToJEasyPdf;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class JEasyPdfQrCode {

    private int dpi = 400;
    private int margin = 0;
    private int matrix = 70;
    private int size = 70;
    private int onColor = 0xFF000001;
    private int offColor = 0xFFFFFFFF;
    private float offsetX = 0;
    private float offsetY = 400;
    private String data;
    private String infoOne;
    private String infoThree;
    private String infoFour;
    private CodeType4ScannerToJEasyPdf codeType4Scanner;

}
