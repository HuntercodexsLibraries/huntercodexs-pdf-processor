package com.huntercodexs.pdf.processor.template.setting.slim;

import com.huntercodexs.pdf.processor.core.enumerator.ColorsToJEasyPdf;
import com.huntercodexs.pdf.processor.core.enumerator.FontNameToJEasyPdf;
import com.huntercodexs.pdf.processor.core.enumerator.FontSizeToJEasyPdf;
import com.huntercodexs.pdf.processor.core.enumerator.TableDimensionsToJEasyPdf;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class SlimTemplateSettings {
    //General
    /*IMPORTANT: DO NOT CHANGE THESE VALUES*/
    public static final int BOX_QUANTITY = 5;
    public static final int COLUMN_QUANTITY = 3;
    public static final int DEFAULT_WIDTH = 570;
    public static final int DEFAULT_HEIGHT = 135;
    public static final int DEFAULT_OFFSET_X = 20;
    public static final int OFFSET_Y_BLOCK1 = 640;
    public static final int OFFSET_Y_BLOCK2 = 485;
    public static final int OFFSET_Y_BLOCK3 = 330;
    public static final int OFFSET_Y_BLOCK4 = 175;
    public static final int OFFSET_Y_BLOCK5 = 20;
    public boolean templateTitleEnabled = false;
    public int[] boxWidth = new int[]{0,0,0,0,0};
    public int[] boxAdjustOffsetX = new int[]{0,0,0,0,0};
    public int[] boxAdjustOffsetY = new int[]{0,0,0,0,0};
    public boolean[] boxBorderEnabled = new boolean[]{true, true, true, true, true};
    public ColorsToJEasyPdf[] boxBackColor = new ColorsToJEasyPdf[]{null, null, null, null, null};

    //Title
    public int leftTitleAdjustmentX = 0;
    public int leftTitleAdjustmentY = 0;
    public int centerTitleAdjustmentX = 0;
    public int centerTitleAdjustmentY = 0;
    public int rightTitleAdjustmentX = 0;
    public int rightTitleAdjustmentY = 0;
    public int[] titleOffsetX = new int[]{35,250,450};
    public int[] titleOffsetY = new int[]{750,595,440,285,130};
    public boolean[] leftTitleEnable = new boolean[]{false,false,false,false,false};
    public boolean[] centerTitleEnable = new boolean[]{false,false,false,false,false};
    public boolean[] rightTitleEnable = new boolean[]{false,false,false,false,false};
    public ColorsToJEasyPdf leftTitleColor = ColorsToJEasyPdf.BLACK;
    public ColorsToJEasyPdf centerTitleColor = ColorsToJEasyPdf.BLACK;
    public ColorsToJEasyPdf rightTitleColor = ColorsToJEasyPdf.BLACK;
    public FontSizeToJEasyPdf leftTitleSize = FontSizeToJEasyPdf.MEDIUM;
    public FontSizeToJEasyPdf centerTitleSize = FontSizeToJEasyPdf.MEDIUM;
    public FontSizeToJEasyPdf rightTitleSize = FontSizeToJEasyPdf.MEDIUM;
    public FontNameToJEasyPdf leftTitleFont = FontNameToJEasyPdf.HELVETICA_B;
    public FontNameToJEasyPdf centerTitleFont = FontNameToJEasyPdf.HELVETICA_B;
    public FontNameToJEasyPdf rightTitleFont = FontNameToJEasyPdf.HELVETICA_B;

    //Column
    public int columnBoxWidth = 170;
    public int columnBoxHeight = 90;
    public int columnBoxChars = 40;
    public int[] columnBoxOffsetX = new int[]{35,220,405};
    public int[] columnBoxOffsetY = new int[]{655,500,345,190,35};
    public int[] columnBoxLeftPadding = new int[]{10,10,10,10,10};
    public int[] columnBoxCenterPadding = new int[]{10,10,10,10,10};
    public int[] columnBoxRightPadding = new int[]{10,10,10,10,10};
    public int[] columnBoxLeftBorderWidth = new int[]{1,1,1,1,1};
    public int[] columnBoxCenterBorderWidth = new int[]{1,1,1,1,1};
    public int[] columnBoxRightBorderWidth = new int[]{1,1,1,1,1};
    public int[] columnBoxLeftLineHeight = new int[]{14,14,14,14,14};
    public int[] columnBoxCenterLineHeight = new int[]{14,14,14,14,14};
    public int[] columnBoxRightLineHeight = new int[]{14,14,14,14,14};
    public int[] columnBoxLeftAdjustmentX = new int[]{0,0,0,0,0};
    public int[] columnBoxLeftAdjustmentY = new int[]{0,0,0,0,0};
    public int[] columnBoxCenterAdjustmentX = new int[]{0,0,0,0,0};
    public int[] columnBoxCenterAdjustmentY = new int[]{0,0,0,0,0};
    public int[] columnBoxRightAdjustmentX = new int[]{0,0,0,0,0};
    public int[] columnBoxRightAdjustmentY = new int[]{0,0,0,0,0};
    public boolean[] columnBoxLeftEnable = new boolean[]{false,false,false,false,false};
    public boolean[] columnBoxCenterEnable = new boolean[]{false,false,false,false,false};
    public boolean[] columnBoxRightEnable = new boolean[]{false,false,false,false,false};
    public boolean[] columnBoxLeftBorderEnable = new boolean[]{true,true,true,true,true};
    public boolean[] columnBoxCenterBorderEnable = new boolean[]{true,true,true,true,true};
    public boolean[] columnBoxRightBorderEnable = new boolean[]{true,true,true,true,true};
    public ColorsToJEasyPdf[] columnBoxLeftBackColor = new ColorsToJEasyPdf[]{null, null, null, null, null};
    public ColorsToJEasyPdf[] columnBoxCenterBackColor = new ColorsToJEasyPdf[]{null, null, null, null, null};
    public ColorsToJEasyPdf[] columnBoxRightBackColor = new ColorsToJEasyPdf[]{null, null, null, null, null};
    public ColorsToJEasyPdf[] columnBoxLeftBorderColor = new ColorsToJEasyPdf[]{null, null, null, null, null};
    public ColorsToJEasyPdf[] columnBoxCenterBorderColor = new ColorsToJEasyPdf[]{null, null, null, null, null};
    public ColorsToJEasyPdf[] columnBoxRightBorderColor = new ColorsToJEasyPdf[]{null, null, null, null, null};
    public ColorsToJEasyPdf[] columnBoxLeftTextColor = new ColorsToJEasyPdf[]{null, null, null, null, null};
    public ColorsToJEasyPdf[] columnBoxCenterTextColor = new ColorsToJEasyPdf[]{null, null, null, null, null};
    public ColorsToJEasyPdf[] columnBoxRightTextColor = new ColorsToJEasyPdf[]{null, null, null, null, null};
    public FontSizeToJEasyPdf[] columnBoxLeftFontSize = new FontSizeToJEasyPdf[]{null, null, null, null, null};
    public FontSizeToJEasyPdf[] columnBoxCenterFontSize = new FontSizeToJEasyPdf[]{null, null, null, null, null};
    public FontSizeToJEasyPdf[] columnBoxRightFontSize = new FontSizeToJEasyPdf[]{null, null, null, null, null};
    public FontNameToJEasyPdf[] columnBoxLeftFontName = new FontNameToJEasyPdf[]{null, null, null, null, null};
    public FontNameToJEasyPdf[] columnBoxCenterFontName = new FontNameToJEasyPdf[]{null, null, null, null, null};
    public FontNameToJEasyPdf[] columnBoxRightFontName = new FontNameToJEasyPdf[]{null, null, null, null, null};

    //Table
    public int tableWidth = 540;
    public int tableHeight = 90;
    public int tableOffsetX = 35;
    public int tableColumnWidth = 90;
    public int tableColumnHeight = 18;
    public int tableHeaderHeight = 30;
    public int tableHeaderAdjustOffsetX = 0;
    public int tableHeaderAdjustOffsetY = 0;
    public int tableBodyAdjustOffsetX = 0;
    public int tableBodyAdjustOffsetY = 0;
    public int[] tableContainerOffsetY = new int[]{656, 500, 346, 190, 35};
    public int[] tableHeaderOffsetY = new int[]{728, 572, 418, 262, 107};
    public int[] tableColumnOffsetX = new int[] {35,125,215,305,395,485};
    public int[] tableDataOffsetY = new int[]{710, 554, 400, 244, 89};
    public boolean[] tableEnable = new boolean[]{false,false,false,false,false};
    public ColorsToJEasyPdf tableBorderColor = ColorsToJEasyPdf.WHITE;
    public ColorsToJEasyPdf tableHeaderColor = ColorsToJEasyPdf.GRAY;
    public ColorsToJEasyPdf tableBodyColor = ColorsToJEasyPdf.ICE;
    public ColorsToJEasyPdf tableHeaderFontColor = ColorsToJEasyPdf.WHITE;
    public ColorsToJEasyPdf tableBodyFontColor = ColorsToJEasyPdf.GRAY;
    public FontSizeToJEasyPdf tableHeaderFontSize = FontSizeToJEasyPdf.NORMAL;
    public FontSizeToJEasyPdf tableBodyFontSize = FontSizeToJEasyPdf.NORMAL;
    public FontNameToJEasyPdf tableHeaderFontName = FontNameToJEasyPdf.HELVETICA;
    public FontNameToJEasyPdf tableBodyFontName = FontNameToJEasyPdf.HELVETICA;
    public TableDimensionsToJEasyPdf tableSize = TableDimensionsToJEasyPdf.TABLE_5X6;

    //Signature Box
    public int signatureBoxWidth = 200;
    public int signatureBoxHeight = 100;
    public int signatureBoxAdjustOffsetX = 0;
    public int[] signatureBoxOffsetX = new int[]{55,210,355};
    public int[] signatureBoxOffsetY = new int[]{35,122,100};
    public int[] signatureBoxDigitalTitleOffsetX = new int[]{105,260,405};
    public int[] signatureBoxContentOffsetX = new int[]{70,230,370};
    public boolean signatureBoxBorderEnable = false;
    public boolean leftSignatureBoxEnable = false;
    public boolean centerSignatureBoxEnable = false;
    public boolean rightSignatureBoxEnable = false;
    public FontSizeToJEasyPdf signatureFontSize = FontSizeToJEasyPdf.SMALL;
    public FontNameToJEasyPdf signatureFontName = FontNameToJEasyPdf.HELVETICA_B;
    public ColorsToJEasyPdf signatureBoxColor = ColorsToJEasyPdf.BLACK;

    //Signature Tape
    public int signatureTapeWidth = 500;
    public int signatureTapeHeight = 30;
    public int signatureTapeOffsetX = 55;
    public int signatureTapeOffsetY = 35;
    public int signatureTapeTitleOffsetX = 260;
    public int signatureTapeTitleOffsetY = 57;
    public int signatureTapeValueOffsetX = 130;
    public int signatureTapeValueOffsetY = 40;
    public int signatureTapeAdjustOffsetX = 10;
    public boolean signatureTapeEnable = false;
    public FontSizeToJEasyPdf signatureTapeFontSize = FontSizeToJEasyPdf.SMALL;
    public FontNameToJEasyPdf signatureTapeFontName = FontNameToJEasyPdf.HELVETICA_B;
    public ColorsToJEasyPdf signatureTapeColor = ColorsToJEasyPdf.GRAY;

    //Text
    public int lineHeight = 18;
    public int textOffsetX = 35;
    public int textChars = 400;
    public int[] textOffsetY = new int[]{732,577,421,266,111};
    public boolean[] textEnable = new boolean[]{false,false,false,false,false};
    public ColorsToJEasyPdf textColor = ColorsToJEasyPdf.BLACK;
    public FontSizeToJEasyPdf textSize = FontSizeToJEasyPdf.NORMAL;
    public FontNameToJEasyPdf textFont = FontNameToJEasyPdf.HELVETICA;

    //Image
    public int imageWidth = 0;
    public int imageHeight = 0;
    public int imageAdjustOffsetX = 0;
    public int imageAdjustOffsetY = 0;
    public int[] imageOffsetX = new int[]{35,180,330};
    public int[] imageOffsetY = new int[]{650,495,340,185,30};
    public boolean[] leftImageEnable = new boolean[]{false,false,false,false,false};
    public boolean[] centerImageEnable = new boolean[]{false,false,false,false,false};
    public boolean[] rightImageEnable = new boolean[]{false,false,false,false,false};

    //Barcode
    public int barcodeDpi = 400;
    public int barcodeWidth = 500;
    public int barcodeHeight = 50;
    public static final int barcodeOffsetX = 55;
    public int barcodeAdjustOffsetX = 0;
    public int barcodeAdjustOffsetY = 0;
    public int[] barcodeOffsetY = new int[]{655,500,345,190,35};
    public int[] barcodeInfoOffsetY = new int[]{750, 595, 440, 285, 130};
    public int[] barcodeValueOffsetY = new int[]{690, 535, 380, 225, 70};
    public int[] barcodeAmountOffsetY = new int[]{745, 590, 435, 280, 135};
    public boolean barcodeShowText = true;
    public boolean[] barcodeEnabled = new boolean[]{false,false,false,false,false};

    //QRCode
    public int qrCodeDpi = 400;
    public int qrCodeWidth = 200;
    public int qrCodeHeight = 50;
    public int qrCodeAdjustOffsetX = 0;
    public int qrCodeAdjustOffsetY = 0;
    public int[] qrCodeOffsetX = new int[]{40,260,470};
    public int[] qrCodeOffsetY = new int[]{655,502,348,193,38};
    public int[] qrCodeInfoOffsetX = new int[]{145, 365, 365};
    public int[] qrCodeInfoOffsetY = new int[]{745, 595, 440, 285, 130};
    public boolean[] qrCodeLeftEnable = new boolean[]{false,false,false,false,false};
    public boolean[] qrCodeCenterEnable = new boolean[]{false,false,false,false,false};
    public boolean[] qrCodeRightEnable = new boolean[]{false,false,false,false,false};

}
