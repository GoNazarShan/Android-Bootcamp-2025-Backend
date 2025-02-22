package com.example.bootcamp.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class CentersDTO {

    private long id;
    private String name;
    private String address;
    private float latitude;
    private String tag;
    private String imageUrl;
    private String phone;
    private float longitude;
    private LocalDateTime created;
    private LocalDateTime updated;
}
