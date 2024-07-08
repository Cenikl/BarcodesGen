package com.cenikl.BarcodesGen.service.validator;

import com.cenikl.BarcodesGen.controller.model.CodeContent;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

@Component
@AllArgsConstructor
public class CodeContentValidator implements Consumer<CodeContent> {

    @Override
    public void accept(CodeContent codeContent) {
     Set<String> violationsMessages = new HashSet<>();
     if(codeContent.getContent() == "" || codeContent.getContent() == null){
         violationsMessages.add("The content should not be empty");
     }
     if(codeContent.getCodeType() == null){
         violationsMessages.add("The type of the content should not null");
     }
     if(codeContent.getWidth() == null){
         violationsMessages.add("Width should not be null");
     }
     if(codeContent.getHeight() == null){
         violationsMessages.add("Height should not be null");
     }
    }
}
