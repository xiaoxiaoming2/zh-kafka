package com.zh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zh.component.KafKaCustomrProducer;

@RestController
public class NoticeController {
	@Autowired
	private KafKaCustomrProducer kafKaCustomrProducer;
	
	@GetMapping("sendNotice")
	public String sendNotice() {
		 kafKaCustomrProducer.sendMessage("test", "HelloWorld");
		 return "";
	}
}
