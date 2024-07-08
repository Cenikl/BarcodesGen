package com.cenikl.BarcodesGen.controller.model;

import org.springframework.stereotype.Component;

@Component
public class CodeContent {
    String content;
    CodeType codeType;
    Integer width;
    Integer height;

    public String getContent() {
        return content;
    }

    public CodeType getCodeType() {
        return codeType;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }
}
