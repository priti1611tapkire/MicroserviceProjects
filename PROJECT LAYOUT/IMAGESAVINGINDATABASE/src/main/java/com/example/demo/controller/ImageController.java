package com.example.demo.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.ImageModel;
import com.example.demo.repository.ImageRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/img")
public class ImageController {
	@Autowired
	ImageRepository hi;

	@PostMapping("/upload")
	public ImageModel uplaodImage(@RequestParam("myFile") MultipartFile file) throws IOException {
		ImageModel img=new ImageModel(file.getOriginalFilename(), file.getContentType(), file.getBytes());

		final ImageModel savedImage=hi.save(img);

		System.out.println("image saved");
		return savedImage;
	}
}

