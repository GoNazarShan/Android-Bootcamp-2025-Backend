package com.example.bootcamp.service;

import com.example.bootcamp.dto.VolunteerCenterCoordinatesDTO;
import com.example.bootcamp.dto.VolunteerCenterDTO;
import com.example.bootcamp.dto.VolunteerDTO;

import java.util.List;

public interface VolunteerCenterService {
    List<VolunteerCenterDTO> getAllVolunteerCenter();

    VolunteerCenterDTO getVolunteerCenterById(Long id);

    List<VolunteerDTO> getVolunteerByVolunteerCenter(Long id);

    VolunteerCenterDTO createVolunteerCenter(VolunteerCenterDTO dto);

    VolunteerCenterDTO updateVolunteerCenter(Long id, VolunteerCenterDTO dto);

    void deleteVolunteerCenter(Long id);

    public VolunteerCenterDTO getVolunteerCenterByCoordinates(VolunteerCenterCoordinatesDTO dto);

}
