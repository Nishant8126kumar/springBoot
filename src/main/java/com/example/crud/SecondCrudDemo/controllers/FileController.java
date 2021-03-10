package com.example.crud.SecondCrudDemo.controllers;

import com.example.crud.SecondCrudDemo.exception.DatabaseException;
import com.example.crud.SecondCrudDemo.helper.FileUploadHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/file")
public class FileController {

    @Autowired
    FileUploadHelper fileUploadHelper;

    @PostMapping(value = "/resume", produces = {MediaType.MULTIPART_FORM_DATA_VALUE, MediaType.APPLICATION_JSON_VALUE}
            , consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity<?> uploadResume(MultipartFile file) {
        throw new DatabaseException("Some Exception are occurred while fetch data from database");
////        if (file.isEmpty()) {
////            throw new RuntimeException("File should not be emopty");
////        }
//        boolean uploadedFile = fileUploadHelper.fileUpload(file);
//        if (uploadedFile) {
//            return ResponseEntity.ok("File Uploaded successfully");
//        } else {
//            return ResponseEntity.ok(HttpStatus.BAD_REQUEST);
//        }
    }
}
