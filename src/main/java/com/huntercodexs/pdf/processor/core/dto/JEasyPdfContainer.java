package com.huntercodexs.pdf.processor.core.dto;

import com.huntercodexs.pdf.processor.core.enumerator.ColorsToJEasyPdf;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class JEasyPdfContainer {

    private int width;
    private int height;
    private int offsetX;
    private int offsetY;
    private int borderWidth = 1;
    private boolean border = false;
    private boolean roundedBorder = false;
    private ColorsToJEasyPdf backColor;
    private ColorsToJEasyPdf borderColor;

}
