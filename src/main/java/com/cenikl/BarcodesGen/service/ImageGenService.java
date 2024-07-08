package com.cenikl.BarcodesGen.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@Service
@AllArgsConstructor
public class ImageGenService {

    public byte[] imageGen(BufferedImage img) throws IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        ImageIO.write(img,"png",output);
        return output.toByteArray();
    }
}
