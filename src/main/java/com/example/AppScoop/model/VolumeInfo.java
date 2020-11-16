package com.example.AppScoop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.util.ArrayList;
import java.util.List;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VolumeInfo {

    private String title;
    private String subtitle;

    @ElementCollection
    private List<String> authors = new ArrayList<>();

    private String publishedDate;

    @Embedded
    @ElementCollection
    private List<IndustryIdentifiers> industryIdentifiers = new ArrayList<>();

    @Embedded
    private ReadingModes readingModes;

    private int pageCount;

    private String printType;

    private int averageRating;

    private int ratingsCount;

    @ElementCollection
    private List<String> categories;

    private String maturityRating;

    private boolean allowAnonLogging;

    private String contentVersion;

    @Embedded
    private PanelizationSummary panelizationSummary;

    @Embedded
    private ImageLinks imageLinks;

    private String language;
    private String previewLink;
    private String infoLink;
    private String canonicalVolumeLink;


}
