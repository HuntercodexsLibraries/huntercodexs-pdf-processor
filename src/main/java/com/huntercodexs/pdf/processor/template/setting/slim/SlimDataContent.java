package com.huntercodexs.pdf.processor.template.setting.slim;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;

@Data
@Setter
@Getter
public class SlimDataContent {
    //Title
    public String leftTitleContent = "";
    public String centerTitleContent = "";
    public String rightTitleContent = "";

    //Column
    public HashMap<Integer, String> columnContent = new HashMap<>();

    //Table
    public HashMap<Integer, List<String>> tableHeaderContent = new HashMap<>();
    public HashMap<Integer, List<String>> tableBodyContent = new HashMap<>();

    //Signature
    public String signaturePersonName = "";
    public String signaturePersonDoc = "";
    public String signatureRecord = "";
    public String signatureDateGmt = "";
    public String signatureStampMark = "";

    //Text
    public HashMap<Integer, String> textContent = new HashMap<>();

    //Image
    public String[] leftImagePaths = new String[]{null,null,null,null,null};
    public String[] centerImagePaths = new String[]{null,null,null,null,null};
    public String[] rightImagePaths = new String[]{null,null,null,null,null};

    //Barcode
    public HashMap<Integer, String>  barcodeValue = new HashMap<>();
    public HashMap<Integer, String>  barcodeInfoOne = new HashMap<>();
    public HashMap<Integer, String>  barcodeInfoTwo = new HashMap<>();
    public HashMap<Integer, String>  barcodeInfoThree = new HashMap<>();
    public HashMap<Integer, String>  barcodeInfoFour = new HashMap<>();
    public HashMap<Integer, String>  barcodeAmount = new HashMap<>();

    //QrCode
    public HashMap<Integer, String>  qrCodeValue = new HashMap<>();
    public HashMap<Integer, String> qrCodeInfoOne = new HashMap<>();
    public HashMap<Integer, String>  qrCodeInfoTwo = new HashMap<>();
    public HashMap<Integer, String>  qrCodeInfoThree = new HashMap<>();
    public HashMap<Integer, String>  qrCodeInfoFour = new HashMap<>();
    public HashMap<Integer, String>  qrCodeAmount = new HashMap<>();

}
