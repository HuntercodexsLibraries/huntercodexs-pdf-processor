package com.huntercodexs.pdf.processor.core.dto;

import com.huntercodexs.pdf.processor.core.enumerator.ColorsToJEasyPdf;
import com.huntercodexs.pdf.processor.core.enumerator.QrCodeBorderStyleToJEasyPdf;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class JEasyPdfBarcodeForm {

    private int width;
    private int height;
    private int offsetX;
    private int offsetY;
    private int borderWidth = 1;
    private int adjustOffsetX = 0;
    private int adjustOffsetY = 0;
    private boolean border = true;
    private boolean qrcode = true;
    private boolean revealFields = false;
    private ColorsToJEasyPdf headerColor;
    private ColorsToJEasyPdf celColor;
    private ColorsToJEasyPdf borderColor;
    private JEasyPdfBarcode barcode = new JEasyPdfBarcode();
    private JEasyPdfBarcodeFormFields fields = new JEasyPdfBarcodeFormFields();
    private JEasyPdfBarcodeFormData data = new JEasyPdfBarcodeFormData();
    private QrCodeBorderStyleToJEasyPdf borderStyle = QrCodeBorderStyleToJEasyPdf.BORDERED;

}
