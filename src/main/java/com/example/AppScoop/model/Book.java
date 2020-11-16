package com.example.AppScoop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    private String kind;

    @Id
    private String id;
    private String etag;
    private String selfLink;

    @Embedded
    private VolumeInfo volumeInfo;

}
