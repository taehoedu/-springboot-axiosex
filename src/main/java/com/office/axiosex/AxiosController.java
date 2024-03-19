package com.office.axiosex;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequestMapping("/axios")
public class AxiosController {

	@GetMapping("/get_data")
//	public Object getData(@RequestParam("id") String id) {
	public Object getData(@RequestParam Map<String, String> paramsMap, HttpSession session) {
		log.info("getData()");
//		log.info("id: {}", id);
		log.info("paramsMap: {}", paramsMap);
		log.info("paramsMap's id: {}", paramsMap.get("id"));
		log.info("session ID: {}", session.getId());
		
		Map<String, Object> responseMap = new HashMap<>();
		
		responseMap.put("data1", "Good");
		responseMap.put("data2", " ");
		responseMap.put("data3", "morning.");
		
		return responseMap;
		
	}
	
	@PostMapping("/post_data")
	public Object postData(@RequestBody Map<String, String> paramsMap, HttpSession session) {
		log.info("postData()");
		log.info("paramsMap: {}", paramsMap);
		log.info("paramsMap's id: {}", paramsMap.get("id"));
		log.info("session ID: {}", session.getId());
		
		Map<String, Object> responseMap = new HashMap<>();
		
		responseMap.put("data1", "Good");
		responseMap.put("data2", " ");
		responseMap.put("data3", "morning.");
		
		return responseMap;
		
	}
	
	@PutMapping("/put_data")
	public Object putData(@RequestBody Map<String, String> paramsMap, HttpSession session) {
		log.info("putData()");
		log.info("paramsMap: {}", paramsMap);
		log.info("paramsMap's id: {}", paramsMap.get("id"));
		log.info("session ID: {}", session.getId());
		
		Map<String, Object> responseMap = new HashMap<>();
		
		responseMap.put("data1", "Good");
		responseMap.put("data2", " ");
		responseMap.put("data3", "morning.");
		
		return responseMap;
		
	}
	
	@DeleteMapping("/delete_data")
	public Object deleteData(@RequestBody Map<String, String> paramsMap, HttpSession session) {
		log.info("deleteData()");
		log.info("paramsMap: {}", paramsMap);
		log.info("paramsMap's id: {}", paramsMap.get("id"));
		log.info("session ID: {}", session.getId());
		
		Map<String, Object> responseMap = new HashMap<>();
		
		responseMap.put("data1", "Good");
		responseMap.put("data2", " ");
		responseMap.put("data3", "morning.");
		
		return responseMap;
		
	}
	
}
