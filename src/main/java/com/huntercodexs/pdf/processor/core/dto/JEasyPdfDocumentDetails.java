package com.huntercodexs.pdf.processor.core.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class JEasyPdfDocumentDetails {

    private int numberOfPages;
    private boolean isProtected;
    private boolean hasSignature;
    private String date;
    private String title;
    private String author;
    private String subject;
    private String pageSize;
    private String fontName;
    private String fontSize;
    private String keywords;
    private String signature;
    private String documentId;

}
