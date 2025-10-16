package com.huntercodexs.pdf.processor.template.setting.free;

import com.huntercodexs.pdf.processor.core.enumerator.ColorsToJEasyPdf;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class FreeTemplateSettings {
    //General
    public int freeQuantity;
    /*IMPORTANT: DO NOT CHANGE THESE VALUES*/
    public static final int FREE_DEFAULT_OFFSET_X = 20;
    public static final int FREE_DEFAULT_OFFSET_Y = 20;
    public static final int FREE_DEFAULT_WIDTH = 570;
    public static final int FREE_DEFAULT_HEIGHT = 750;
    public boolean templateTitleEnabled = false;
    public int[] boxWidth = new int[]{0,0,0,0,0};
    public int[] boxAdjustOffsetX = new int[]{0,0,0,0,0};
    public int[] boxAdjustOffsetY = new int[]{0,0,0,0,0};
    public boolean[] boxBorderEnabled = new boolean[]{true, true, true, true, true};
    public ColorsToJEasyPdf[] boxBackColor = new ColorsToJEasyPdf[]{null, null, null, null, null};

}
