package com.zh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.zh.vo.NoticeVO;

@RestController
public class NoticeController {
	@GetMapping
	public String sendNotice() {
		return null;
	}
	
	public static void main(String[] args) {
		NoticeVO noticeVO=new NoticeVO()
				;
		noticeVO.setContent("\"content\"");
		noticeVO.setTitle("title");
		System.out.println(JSONObject.parseObject(JSONObject.toJSON(noticeVO).toString(),noticeVO.getClass()));
	}

}
