package com.huntercodexs.pdf.processor.template.setting.triplefall;

import com.huntercodexs.pdf.processor.core.enumerator.ColorsToJEasyPdf;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class TripleFallTemplateSettings {
    //General
    public int tripleFallQuantity;
    /*IMPORTANT: DO NOT CHANGE THESE VALUES*/
    public static final int TRIPLE_FALL_QUANTITY = 3;
    public static final int TRIPLE_FALL_DEFAULT_WIDTH = 188;
    public static final int TRIPLE_FALL_DEFAULT_HEIGHT = 750;
    public boolean templateTitleEnabled = false;
    public int[] boxWidth = new int[]{0,0,0,0,0};
    public int[] boxAdjustOffsetX = new int[]{0,0,0,0,0};
    public int[] boxAdjustOffsetY = new int[]{0,0,0,0,0};
    public boolean[] boxBorderEnabled = new boolean[]{true, true, true, true, true};
    public ColorsToJEasyPdf[] boxBackColor = new ColorsToJEasyPdf[]{null, null, null, null, null};

}
