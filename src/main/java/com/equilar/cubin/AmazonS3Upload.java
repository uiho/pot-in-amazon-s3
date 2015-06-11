package com.equilar.cubin;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.equilar.cubin.service.AmazonS3Service;
import com.equilar.cubin.util.AmazonS3Property;

@Component
public class AmazonS3Upload {
	
	private static Logger logger = Logger.getLogger(AmazonS3Upload.class);
	
	private static String PERSON_ID = AmazonS3Property.PERSON_ID.getValue();
	private static String IMAGE_PATH = AmazonS3Property.IMAGE_PATH.getValue();
	
	
	@Autowired
	private AmazonS3Service amazonS3Service;
	
	public void upload(){
		amazonS3Service.uploadFile(PERSON_ID, IMAGE_PATH);
	}
	
}
