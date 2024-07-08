package com.cenikl.BarcodesGen.controller;

import com.cenikl.BarcodesGen.controller.model.CodeContent;
import com.cenikl.BarcodesGen.service.BarcodesService;
import com.cenikl.BarcodesGen.service.ImageGenService;
import com.google.zxing.WriterException;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@AllArgsConstructor
public class BarcodesController {

    private final BarcodesService barcodesService;
    private final ImageGenService imageGenService;

    @PostMapping(value = "/barcodeGen",produces = MediaType.IMAGE_PNG_VALUE)
    public @ResponseBody byte[] barcodeGen(@RequestBody CodeContent content) throws IOException, WriterException {
        return imageGenService.imageGen(barcodesService.BarcodeGen(content));
    }


}
