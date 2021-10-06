package com.sabi.assessment.api.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.sabi.assessment.dto.VideoDTO;
import com.sabi.assessment.dto.VideoPriceDTO;
import com.sabi.assessment.mapper.VideoMapper;
import com.sabi.assessment.mapper.VideoPriceMapper;
import com.sabi.assessment.model.Customer;
import com.sabi.assessment.model.Video;
import com.sabi.assessment.service.CustomerService;
import com.sabi.assessment.service.VideoService;
import com.sabi.assessment.utility.Validation;

@RestController
@RequestMapping(value = "/rental")
public class VideoRentalController {
	
	@Autowired VideoService videoService;
	@Autowired VideoMapper videoMapper;
	@Autowired VideoPriceMapper videoPriceMapper;
	@Autowired CustomerService customerService;
	@Autowired private Validation validation;

	@RequestMapping(value = "/videolist/{pageNumber}", method = { RequestMethod.GET }, produces = "application/json")
	public Map<String, Object> videoListEndpoint(@PathVariable String pageNumber) {
		
		Map<String, Object> map = new HashMap<String, Object>();

		if (validation.validateInput(pageNumber).equals(false)) {

			map.put("message", "invalid page number");

		} else if (Integer.parseInt(pageNumber) == 0) {
			
			map.put("message", "page number must be greater 0");
			
		} else {
			
			int pageSize = 5;
			List<VideoDTO> videoList = videoMapper.mapperFindAllVideoPaginated(pageSize, Integer.parseInt(pageNumber));
						
			map.put("videos", videoList);
			
		}
																	
		return map;
			
	}

	@RequestMapping(value = "/price/{videoId}/{numberOfDays}", method = { RequestMethod.GET }, produces = "application/json")
	public Map<String, Object> priceEnpoint(@PathVariable String videoId, @PathVariable String numberOfDays) {
		
		Map<String, Object> map = new HashMap<String, Object>();

		if (validation.validateInput(videoId).equals(false)) {

			map.put("message", "invalid video id");
			
		} else if (validation.validateInput(numberOfDays).equals(false)) {
			
			map.put("message", "invalid number of days");
			
		} else {
			
			VideoPriceDTO videoPriceDTO = videoPriceMapper.mapperVideoPriceCalculator(Long.parseLong(videoId), Integer.parseInt(numberOfDays));			
			
			if (videoPriceDTO != null) {
				
				Video video = null;
				video = videoService.getVideoByPk(Long.parseLong(videoId));
				
				Customer customer = new Customer();
				customer.setName(videoPriceDTO.getName());
				customer.setVideo(video);
				customer.setNumberOfDays(Integer.parseInt(numberOfDays));
				customer.setPrice(Double.parseDouble(videoPriceDTO.getPrice()));
				customerService.addCustomer(customer);
				
				map.put("info", videoPriceDTO);
				map.put("success", "video rented successful");
				
			} else {
				
				map.put("message", "video not found");
				
			}
			
		}
																	
		return map;
			
	}	
	
}
