package com.huntercodexs.pdf.processor.core.dto;

import com.huntercodexs.pdf.processor.core.enumerator.ColorsToJEasyPdf;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class JEasyPdfForm {

    private int width;
    private int height;
    private int offsetX;
    private int offsetY;
    private boolean border;
    private ColorsToJEasyPdf headerColor;
    private ColorsToJEasyPdf celColor;
    private ColorsToJEasyPdf borderColor;

}
