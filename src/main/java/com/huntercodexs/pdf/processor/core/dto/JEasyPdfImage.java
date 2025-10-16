package com.huntercodexs.pdf.processor.core.dto;

import com.huntercodexs.pdf.processor.core.enumerator.ImageQualityToJEasyPdf;
import com.huntercodexs.pdf.processor.core.enumerator.ImageTypeToJEasyPdf;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class JEasyPdfImage {

    private int width;
    private int height;
    private int offsetX;
    private int offsetY;
    private int maxWidth;
    private int maxHeight;
    private boolean border;
    private boolean resize;
    private String filenamePath;
    private ImageTypeToJEasyPdf imageType;
    private ImageQualityToJEasyPdf imageQuality;

}
