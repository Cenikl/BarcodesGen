package com.cenikl.BarcodesGen.service;

import com.cenikl.BarcodesGen.controller.model.CodeContent;
import com.cenikl.BarcodesGen.service.validator.CodeContentValidator;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.*;
import com.google.zxing.pdf417.PDF417Writer;
import com.google.zxing.qrcode.QRCodeWriter;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.awt.image.BufferedImage;

@Service
@AllArgsConstructor
public class BarcodesService {
    private CodeContentValidator codeContentValidator;

    public BufferedImage BarcodeGen(CodeContent content) throws WriterException {
        codeContentValidator.accept(content);
        BitMatrix bitMatrix = null;
        switch (content.getCodeType()) {
            case EAN13 :
                EAN13Writer ean13Gen = new EAN13Writer();
                bitMatrix = ean13Gen.encode(content.getContent(), BarcodeFormat.EAN_13, content.getWidth(),content.getHeight());
                break;
            case EAN8 :
                EAN8Writer ean8Gen = new EAN8Writer();
                bitMatrix = ean8Gen.encode(content.getContent(), BarcodeFormat.EAN_8, content.getWidth(),content.getHeight());
                break;
            case QRCODE :
                QRCodeWriter qrcodeGen = new QRCodeWriter();
                bitMatrix = qrcodeGen.encode(content.getContent(),BarcodeFormat.QR_CODE, content.getWidth(),content.getHeight());
                break;
            case UPCA :
                UPCAWriter upcaWriter = new UPCAWriter();
                bitMatrix = upcaWriter.encode(content.getContent(), BarcodeFormat.UPC_A, content.getWidth(), content.getHeight());
                break;
            case UPCE :
                UPCEWriter upceWriter = new UPCEWriter();
                bitMatrix = upceWriter.encode(content.getContent(), BarcodeFormat.UPC_E, content.getWidth(), content.getHeight());
                break;
            case CODABAR:
                CodaBarWriter codaBarWriter = new CodaBarWriter();
                bitMatrix = codaBarWriter.encode(content.getContent(),BarcodeFormat.CODABAR,content.getWidth(),content.getHeight());
                break;
            case CODE39:
                Code39Writer code39Writer = new Code39Writer();
                bitMatrix = code39Writer.encode(content.getContent(),BarcodeFormat.CODE_39,content.getWidth(),content.getHeight());
                break;
            case CODE93:
                Code93Writer code93Writer = new Code93Writer();
                bitMatrix = code93Writer.encode(content.getContent(),BarcodeFormat.CODE_93,content.getWidth(),content.getHeight());
                break;
            case CODE128:
                Code128Writer code128Writer = new Code128Writer();
                bitMatrix = code128Writer.encode(content.getContent(),BarcodeFormat.CODE_128,content.getWidth(),content.getHeight());
                break;
            case ITF:
                ITFWriter itfWriter = new ITFWriter();
                bitMatrix = itfWriter.encode(content.getContent(),BarcodeFormat.ITF,content.getWidth(),content.getHeight());
                break;
            case PDF417:
                PDF417Writer pdf417Writer = new PDF417Writer();
                bitMatrix = pdf417Writer.encode(content.getContent(),BarcodeFormat.PDF_417,content.getWidth(),content.getHeight());
                break;
            default :
                break;
        }
        return MatrixToImageWriter.toBufferedImage(bitMatrix);
    }

}
