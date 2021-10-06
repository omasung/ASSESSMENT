package com.sabi.assessment.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sabi.assessment.dto.VideoDTO;
import com.sabi.assessment.model.Video;
import com.sabi.assessment.service.VideoService;
import com.sabi.assessment.utility.Types;

@Service
@Transactional
public class VideoMapper {

	@Autowired private VideoService videoService;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<VideoDTO> mapperFindAllVideoPaginated(int pageSize, int pageNumber) {

		Video vd = null;
		ArrayList videoList = new ArrayList();
		List<Video> video = videoService.getAllVideoPaginated(pageSize, pageNumber - 1);

		if (!video.isEmpty()) {

			Collection coll = null;

			coll = (Collection) video;

			Iterator i = coll.iterator();

			while (i.hasNext()) {

				vd = (Video) i.next();
				
				String maxAge = "N/A";
				String yearRelease = "N/A";
				
				if (vd.getVideoType().getType().equals(Types.Children_Movie)) {
					
					maxAge = vd.getVideoType().getMaxAge().toString();
				
				}
				
				if (vd.getVideoType().getType().equals(Types.New_Release)) {
					
					yearRelease = String.valueOf(vd.getVideoType().getReleaseYear().getYear());
				
				}

				videoList.add(new VideoDTO(vd.getId().toString(), vd.getTitle(), vd.getVideoType().getType().getVideoType(),
										   vd.getVideoType().getTypeRate().toString(), vd.getVideoGenre().name(),
										   maxAge, yearRelease));

			}

		}

		return videoList;
	}
	
	
}
