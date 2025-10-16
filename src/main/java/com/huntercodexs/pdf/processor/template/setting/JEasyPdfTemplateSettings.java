package com.huntercodexs.pdf.processor.template.setting;

import com.huntercodexs.pdf.processor.core.dto.*;
import com.huntercodexs.pdf.processor.core.enumerator.JEasyPdfTemplates;
import com.huntercodexs.pdf.processor.template.setting.bigburger.BigBurgerDataContent;
import com.huntercodexs.pdf.processor.template.setting.bigburger.BigBurgerTemplateSettings;
import com.huntercodexs.pdf.processor.template.setting.box.BoxDataContent;
import com.huntercodexs.pdf.processor.template.setting.box.BoxTemplateSettings;
import com.huntercodexs.pdf.processor.template.setting.boxopen.BoxOpenDataContent;
import com.huntercodexs.pdf.processor.template.setting.boxopen.BoxOpenTemplateSettings;
import com.huntercodexs.pdf.processor.template.setting.free.FreeDataContent;
import com.huntercodexs.pdf.processor.template.setting.free.FreeTemplateSettings;
import com.huntercodexs.pdf.processor.template.setting.headerbody.HeaderBodyDataContent;
import com.huntercodexs.pdf.processor.template.setting.headerbody.HeaderBodyTemplateSettings;
import com.huntercodexs.pdf.processor.template.setting.slim.SlimDataContent;
import com.huntercodexs.pdf.processor.template.setting.slim.SlimTemplateSettings;
import com.huntercodexs.pdf.processor.template.setting.slimbox.SlimBoxDataContent;
import com.huntercodexs.pdf.processor.template.setting.slimbox.SlimBoxTemplateSettings;
import com.huntercodexs.pdf.processor.template.setting.triplefall.TripleFallDataContent;
import com.huntercodexs.pdf.processor.template.setting.triplefall.TripleFallTemplateSettings;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class JEasyPdfTemplateSettings {
    /*Template Name*/
    public JEasyPdfTemplates template = null;

    /*Template Background*/
    public String imageBackground = null;

    /*Template Elements*/
    public JEasyPdfDocument document = null;
    public JEasyPdfPage page = null;
    public JEasyPdfContainer container = null;
    public JEasyPdfText text = null;
    public JEasyPdfImage image = null;
    public JEasyPdfTable table = null;
    public JEasyPdfBarcode barcode = null;
    public JEasyPdfQrCode qrCode = null;

    /*Template Behavior*/
    public SlimTemplateSettings slim = null;
    public BoxTemplateSettings box = null;
    public BoxOpenTemplateSettings boxOpen = null;
    public SlimBoxTemplateSettings slimBox = null;
    public TripleFallTemplateSettings tripleFall = null;
    public FreeTemplateSettings free = null;
    public HeaderBodyTemplateSettings headerBody = null;
    public BigBurgerTemplateSettings bigBurger = null;

    /*Template Content*/
    public SlimDataContent slimContent = null;
    public BoxDataContent boxContent = null;
    public BoxOpenDataContent boxOpenContent = null;
    public SlimBoxDataContent slimBoxContent = null;
    public TripleFallDataContent tripleFallContent = null;
    public FreeDataContent freeContent = null;
    public HeaderBodyDataContent headerBodyContent = null;
    public BigBurgerDataContent bigBurgerContent = null;

}
