package com.wcs.Security.services;

import com.wcs.Security.models.Video;

import java.util.List;

public interface VideoService {

    Video createVideo(Video video);
    List<Video> getAllVideos();
    Video getVideoById(Long id);

}
