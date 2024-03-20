package com.office.axiosex;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.office.axiosex.util.UploadFileService;

import jakarta.servlet.http.HttpSession;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequestMapping("/axios")
public class AxiosController {

	@Autowired
	UploadFileService uploadFileService;
	
	/////////////////// OBJECT  ///////////////////
	
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
	
	
	@PostMapping("/transfer_file")
	public Object transferFile(@RequestParam("id") String id, 
							   @RequestParam(value = "attach_file", required = false) MultipartFile attach_file, 
							   HttpSession session) {
		log.info("transferFile()");
		log.info("id: {}", id);
		log.info("attach_file: {}", attach_file);
		log.info("session ID: {}", session.getId());
		
		// SAVE FILE
		uploadFileService.upload("gildong", attach_file);
		
		Map<String, Object> responseMap = new HashMap<>();
		
		responseMap.put("data1", "Good");
		responseMap.put("data2", " ");
		responseMap.put("data3", "morning.");
		
		return responseMap;
		
	}
	
	
	/////////////////// FORMDATA  ///////////////////
	// GET은 FORMDATA 안됨
	
	@PostMapping("/post_formdata")
	public Object postFormdata(@RequestParam("id") String id, 
							   @RequestParam("pw") String pw, 
							   HttpSession session) {
		log.info("postFormdata()");
		log.info("id: {}", id);
		log.info("pw: {}", pw);
		log.info("session ID: {}", session.getId());
		
		Map<String, Object> responseMap = new HashMap<>();
		
		responseMap.put("data1", "Good");
		responseMap.put("data2", " ");
		responseMap.put("data3", "morning.");
		
		return responseMap;
		
	}
	
	@PutMapping("/put_formdata")
	public Object putFormdata(@RequestParam("id") String id, 
							  @RequestParam("pw") String pw, 
							  HttpSession session) {
		log.info("putFormdata()");
		log.info("id: {}", id);
		log.info("pw: {}", pw);
		log.info("session ID: {}", session.getId());
		
		Map<String, Object> responseMap = new HashMap<>();
		
		responseMap.put("data1", "Good");
		responseMap.put("data2", " ");
		responseMap.put("data3", "morning.");
		
		return responseMap;
		
	}
	
	@DeleteMapping("/delete_formdata")
	public Object deleteFormdata(@RequestParam("id") String id, 
							  	 @RequestParam("pw") String pw, 
							     HttpSession session) {
		log.info("deleteFormdata()");
		log.info("id: {}", id);
		log.info("pw: {}", pw);
		log.info("session ID: {}", session.getId());
		
		Map<String, Object> responseMap = new HashMap<>();
		
		responseMap.put("data1", "Good");
		responseMap.put("data2", " ");
		responseMap.put("data3", "morning.");
		
		return responseMap;
		
	}
	
	
	/////////////////// DTO MAPPING  ///////////////////
	
	@DeleteMapping("/delete_formdata_dto")
	public Object deleteFormdataDto(AxiosDto axiosDto, 
								 @RequestParam("email") String email,
							     HttpSession session) {
		log.info("deleteFormdataDto()");
		log.info("id: {}", axiosDto.getId());
		log.info("pw: {}", axiosDto.getPw());
		log.info("mail: {}", axiosDto.getMail());
		log.info("email: {}", email);
		log.info("session ID: {}", session.getId());
		
		Map<String, Object> responseMap = new HashMap<>();
		
		responseMap.put("data1", "Good");
		responseMap.put("data2", " ");
		responseMap.put("data3", "morning.");
		
		return responseMap;
		
	}
	
}
