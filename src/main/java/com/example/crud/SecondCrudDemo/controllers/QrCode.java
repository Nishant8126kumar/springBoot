package com.example.crud.SecondCrudDemo.controllers;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/qrcode")
public class QrCode {

    @GetMapping(value = "/generate")
    public ResponseEntity<?> generateQrCode() throws IOException, WriterException {
        System.out.println("Come Here request");
        String data = "Strange event , https://alpa.satrangi.com/evet/5j6h5";
        String path = "demo.png";
        String charset = "UTF-8";
        Map<EncodeHintType, ErrorCorrectionLevel> hashMap
                = new HashMap<EncodeHintType,
                ErrorCorrectionLevel>();
        final String UPLOAD_PATH = "D:\\demoSpring\\SecondCrudDemp\\src\\main\\resources\\static\\resume6.png";

        hashMap.put(EncodeHintType.ERROR_CORRECTION,
                ErrorCorrectionLevel.L);
        int height = 200;
        int width = 200;

        BitMatrix matrix = new MultiFormatWriter().encode(
                new String(data.getBytes(charset), charset),
                BarcodeFormat.QR_CODE, width, height);

        MatrixToImageWriter.writeToFile(
                matrix,
                UPLOAD_PATH.substring(UPLOAD_PATH.lastIndexOf('.') + 1),
                new File(UPLOAD_PATH));
        return null;
    }
}

