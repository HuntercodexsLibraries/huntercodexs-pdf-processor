package com.huntercodexs.pdf.processor.barcode.setting;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class BarcodeScanner {
    private int page;
    private String barcodeType;
    private String barcodeValue;
}
