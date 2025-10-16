package com.huntercodexs.pdf.processor.core.enumerator;

import lombok.Getter;

@Getter
public enum JEasyPdfTemplates {
    SLIM("SLIM"),
    BOX("BOX"),
    BOX_OPEN("BOX_OPEN"),
    SLIM_BOX("SLIM_BOX"),
    TRIPLE_FALL("TRIPLE_FALL"),
    FREE("FREE"),
    HEADER_BODY("HEADER_BODY"),
    BIG_BURGER("BIG_BURGER");

    private final String template;

    JEasyPdfTemplates(String template) {
        this.template = template;
    }

    public static String template(JEasyPdfTemplates template) {
        return template.getTemplate();
    }
}
