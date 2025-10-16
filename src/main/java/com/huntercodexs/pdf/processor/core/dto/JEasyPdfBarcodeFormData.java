package com.huntercodexs.pdf.processor.core.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;

@Data
@Setter
@Getter
public class JEasyPdfBarcodeFormData {

    private String dataHeaderImage = null;
    private String dataHeaderOperator = "0000-00";
    private String dataHeaderBarcode = "00000.00000 00000.000000 00000.00000 0 00000000000000";
    private String dataLeft1 = "dataLeft1";
    private String dataLeft2 = "dataLeft2";
    private String dataLeft3 = "dataLeft3";
    private String dataLeft4 = "dataLeft4";
    private String dataLeft5 = "dataLeft5";
    private String dataLeft6 = "dataLeft6";
    private String dataLeft7 = "dataLeft7";
    private String dataLeft8 = "dataLeft8";
    private String dataLeft9 = "dataLeft9";
    private String dataLeft10 = "dataLeft10";
    private List<String> dataLeft11 = Arrays.asList("dataLeft11-1", "dataLeft11-2","dataLeft11-3","dataLeft11-4", "dataLeft11-5","dataLeft11-6","dataLeft11-7","dataLeft11-8");
    private String dataLeft12 = "dataLeft12"; /*Can be used like a qrcode reserved space*/
    private List<String> dataLeft13 = Arrays.asList("dataLeft13-1", "dataLeft13-2","dataLeft13-3");
    private String dataRight1 = "dataRight1";
    private String dataRight2 = "dataRight2";
    private String dataRight3 = "dataRight3";
    private String dataRight4 = "dataRight4";
    private String dataRight5 = "dataRight5";
    private String dataRight6 = "dataRight6";
    private String dataRight7 = "dataRight7";
    private String dataRight8 = "dataRight8";
    private String dataRight9 = "dataRight9";
    private String dataRight10 = "dataRight10";

}
