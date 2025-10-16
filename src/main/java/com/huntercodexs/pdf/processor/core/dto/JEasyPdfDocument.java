package com.huntercodexs.pdf.processor.core.dto;

import com.huntercodexs.pdf.processor.core.enumerator.FontNameToJEasyPdf;
import com.huntercodexs.pdf.processor.core.enumerator.FontSizeToJEasyPdf;
import com.huntercodexs.pdf.processor.core.enumerator.ProtectionLevelToJEasyPdf;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class JEasyPdfDocument {

    private int startPage;
    private int endPage;
    private int numberOfPages;
    private String date;
    private String title;
    private String author;
    private String subject;
    private FontNameToJEasyPdf fontName;
    private FontSizeToJEasyPdf fontSize;
    private String keywords;
    private String userPassword;
    private String ownerPassword;
    private ProtectionLevelToJEasyPdf protectionLevel;
    private String filenamePath;

}
