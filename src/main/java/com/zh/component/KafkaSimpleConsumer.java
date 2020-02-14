package com.zh.component;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class KafkaSimpleConsumer {

// 简单消费者
	@KafkaListener(topics = "test")
	public void consumer1_1(String message) {
		System.out.println("消费者收到消息:" + message);
		/*
		 * 如果需要手工提交异步 consumer.commitSync(); 手工同步提交 consumer.commitAsync()
		 */
	}
}