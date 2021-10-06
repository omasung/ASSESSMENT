package com.sabi.assessment.mapper;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sabi.assessment.dto.VideoPriceDTO;
import com.sabi.assessment.model.Video;
import com.sabi.assessment.service.VideoService;
import com.sabi.assessment.utility.Types;

@Service
@Transactional
public class VideoPriceMapper {

	@Autowired private VideoService videoService;
	
	public VideoPriceDTO mapperVideoPriceCalculator (long videoId, int numberOfDays) {
		
		Video video = null;
		video = videoService.getVideoByPk(videoId);
		
		VideoPriceDTO videoPriceDTO = new VideoPriceDTO ();
		
		if (video != null) {
			
			Double price = 0.0;
			
//			Regular: rate × days                        
//			Children’s movie: rate × days + maximumAge / 2
//			New Release: rate * days -  years of released			
			
			if (video.getVideoType().getType().equals(Types.Regular_Movie)) {
				
				price = video.getVideoType().getTypeRate() * numberOfDays;
				
			} else if (video.getVideoType().getType().equals(Types.Children_Movie)) {
				
				price = (video.getVideoType().getTypeRate() * numberOfDays) + (video.getVideoType().getMaxAge()/2);
				
			} else if (video.getVideoType().getType().equals(Types.New_Release)) {				
				
				LocalDate localDate = LocalDate.now();
				
				int currentYear = localDate.getYear();
				int yearReleased = video.getVideoType().getReleaseYear().getYear();
				
				int yearsOfReleased = currentYear - yearReleased;
								
				price = (video.getVideoType().getTypeRate() * numberOfDays) - (yearsOfReleased);
				
			}			
			
			videoPriceDTO.setName("Sunday Omada");
			videoPriceDTO.setTitle(video.getTitle());
			videoPriceDTO.setNumberOfDays(String.valueOf(numberOfDays));
			videoPriceDTO.setPrice(String.valueOf(price));				
			
		} else {
			
			videoPriceDTO = null;
			
		}
		
		return videoPriceDTO;
	}
	
}
