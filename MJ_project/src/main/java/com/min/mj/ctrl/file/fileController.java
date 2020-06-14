package com.min.mj.ctrl.file;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

public class fileController {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	public String upload(MultipartFile filename, Model model) {
		log.info("Welcome upload : \t{}", filename, new Date());

		return "download";
	}
}
