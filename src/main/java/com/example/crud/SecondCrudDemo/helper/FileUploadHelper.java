package com.example.crud.SecondCrudDemo.helper;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

@Component
public class FileUploadHelper {

    public final String UPLOAD_PATH = "D:\\demoSpring\\SecondCrudDemp\\src\\main\\resources\\static\\resume";

    public boolean fileUpload(MultipartFile file) {
        boolean result = false;
        try {

            //read file data
            InputStream inputStream = file.getInputStream();
            byte[] data = new byte[inputStream.available()];
            inputStream.read(data);
//
//            //write file data
            FileOutputStream fileOutputStream = new FileOutputStream(UPLOAD_PATH + File.separator + file.getOriginalFilename());
            fileOutputStream.write(data);
            fileOutputStream.flush();
            fileOutputStream.close();

//            Files.copy(file.getInputStream(), Paths.get(UPLOAD_PATH + File.separator + file.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
            result = true;
        } catch (Exception e) {

        }
        return result;

    }
}
