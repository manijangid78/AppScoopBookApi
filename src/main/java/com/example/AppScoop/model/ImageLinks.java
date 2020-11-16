package com.example.AppScoop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImageLinks {

    private String smallThumbnail;
    private String thumbnail;

}
