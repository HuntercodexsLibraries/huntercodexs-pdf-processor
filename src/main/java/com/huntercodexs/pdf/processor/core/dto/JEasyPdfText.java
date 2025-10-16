package com.huntercodexs.pdf.processor.core.dto;

import com.huntercodexs.pdf.processor.core.enumerator.ColorsToJEasyPdf;
import com.huntercodexs.pdf.processor.core.enumerator.FontNameToJEasyPdf;
import com.huntercodexs.pdf.processor.core.enumerator.FontSizeToJEasyPdf;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class JEasyPdfText {

    private int width;
    private int height;
    private int offsetX;
    private int offsetY;
    private int lineHeight;
    private int letterSpace;
    private boolean bold = false;
    private boolean italic = false;
    private boolean underline = false;
    private FontNameToJEasyPdf fontName;
    private FontSizeToJEasyPdf fontSize;
    private ColorsToJEasyPdf fontColor;

}

