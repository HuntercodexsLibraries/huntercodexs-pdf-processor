package com.huntercodexs.pdf.processor.core.dto;

import com.huntercodexs.pdf.processor.core.enumerator.ColorsToJEasyPdf;
import com.huntercodexs.pdf.processor.core.enumerator.FontNameToJEasyPdf;
import com.huntercodexs.pdf.processor.core.enumerator.FontSizeToJEasyPdf;
import com.huntercodexs.pdf.processor.core.enumerator.PageSizeToJEasyPdf;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class JEasyPdfPage {

    /*Page Size*/
    /*IMPORTANT: DO NOT CHANGE THESE VALUES*/
    private int width;
    private int height;
    private int offsetX;
    private int offsetY;
    private int lineHeight;
    private int pageNumber;
    private int margin;
    private int padding;
    private byte[] byteContent;
    private PageSizeToJEasyPdf pageSize;
    private FontNameToJEasyPdf fontName;
    private FontSizeToJEasyPdf fontSize;
    private ColorsToJEasyPdf fontColor;
    private ColorsToJEasyPdf pageColor;
    private String textContent = "";
    private String imageFilepath = null;

    public static final int WIDTH_ADJUST_A4 = -15;
    public static final int OFFSET_Y_ADJUST_A4 = 25;

    public static final int[] PAGE_SIZE_LETTER = new int[]{620,792};
    public static final int[] PAGE_SIZE_A4 = new int[]{596,842};

    public int getPageWidth(String type) {
        if (type.equals("LETTER") || type.equals("LETTER_LAYOUT")) {
            return PAGE_SIZE_LETTER[0];
        }
        return PAGE_SIZE_A4[0];
    }

    public int getPageHeight(String type) {
        if (type.equals("LETTER") || type.equals("LETTER_LAYOUT")) {
            return PAGE_SIZE_LETTER[1];
        }
        return PAGE_SIZE_A4[1];
    }

}
