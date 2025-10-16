package com.huntercodexs.pdf.processor.template.setting.headerbody;

import com.huntercodexs.pdf.processor.core.enumerator.ColorsToJEasyPdf;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class HeaderBodyTemplateSettings {
    //General
    public int headerBodyQuantity;
    /*IMPORTANT: DO NOT CHANGE THESE VALUES*/
    public boolean templateTitleEnabled = false;
    public int[] boxWidth = new int[]{0,0,0,0,0};
    public int[] boxAdjustOffsetX = new int[]{0,0,0,0,0};
    public int[] boxAdjustOffsetY = new int[]{0,0,0,0,0};
    public boolean[] boxBorderEnabled = new boolean[]{true, true, true, true, true};
    public ColorsToJEasyPdf[] boxBackColor = new ColorsToJEasyPdf[]{null, null, null, null, null};

    public static final int HEADER_BODY_DEFAULT_OFFSET_X = 20;
    public static final int HEADER_BODY_DEFAULT_OFFSET_Y = 640;
    public static final int HEADER_BODY_DEFAULT_WIDTH = 570;
    public static final int HEADER_BODY_DEFAULT_HEIGHT = 135;
    public static final int HEADER_BODY_OFFSET_Y = 20;
    public static final int HEADER_BODY_HEIGHT = 600;

}
