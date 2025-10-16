package com.huntercodexs.pdf.processor.template.setting.bigburger;

import com.huntercodexs.pdf.processor.core.enumerator.ColorsToJEasyPdf;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class BigBurgerTemplateSettings {
    //General
    public int bigBurgerQuantity;
    /*IMPORTANT: DO NOT CHANGE THESE VALUES*/
    public boolean templateTitleEnabled = false;
    public int[] boxWidth = new int[]{0,0,0,0,0};
    public int[] boxAdjustOffsetX = new int[]{0,0,0,0,0};
    public int[] boxAdjustOffsetY = new int[]{0,0,0,0,0};
    public boolean[] boxBorderEnabled = new boolean[]{true, true, true, true, true};
    public ColorsToJEasyPdf[] boxBackColor = new ColorsToJEasyPdf[]{null, null, null, null, null};
    public static final int BIG_BURGER_DEFAULT_WIDTH = 570;
    public static final int BIG_BURGER_DEFAULT_HEIGHT = 135;
    public static final int BIG_BURGER_HEADER_OFFSET_X = 20;
    public static final int BIG_BURGER_HEADER_OFFSET_Y = 640;
    public static final int BIG_BURGER_HEADER_WIDTH = 570;
    public static final int BIG_BURGER_HEADER_HEIGHT = 135;
    public static final int BIG_BURGER_BODY_OFFSET_X = 20;
    public static final int BIG_BURGER_BODY_OFFSET_Y = 170;
    public static final int BIG_BURGER_BODY_WIDTH = 570;
    public static final int BIG_BURGER_BODY_HEIGHT = 455;
    public static final int BIG_BURGER_FOOTER_OFFSET_X = 20;
    public static final int BIG_BURGER_FOOTER_OFFSET_Y = 20;
    public static final int BIG_BURGER_FOOTER_WIDTH = 570;
    public static final int BIG_BURGER_FOOTER_HEIGHT = 135;

}
