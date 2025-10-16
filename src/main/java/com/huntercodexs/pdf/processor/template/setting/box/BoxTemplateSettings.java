package com.huntercodexs.pdf.processor.template.setting.box;

import com.huntercodexs.pdf.processor.core.enumerator.ColorsToJEasyPdf;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class BoxTemplateSettings {
    //General
    public int boxQuantity;
    /*IMPORTANT: DO NOT CHANGE THESE VALUES*/
    public boolean templateTitleEnabled = false;
    public int[] boxWidth = new int[]{0,0,0,0,0};
    public int[] boxAdjustOffsetX = new int[]{0,0,0,0,0};
    public int[] boxAdjustOffsetY = new int[]{0,0,0,0,0};
    public boolean[] boxBorderEnabled = new boolean[]{true, true, true, true, true};
    public ColorsToJEasyPdf[] boxBackColor = new ColorsToJEasyPdf[]{null, null, null, null, null};

    public static final int BOXES = 10;
    public static final int BOX_DEFAULT_WIDTH = 286;
    public static final int BOX_DEFAULT_HEIGHT = 135;

}
