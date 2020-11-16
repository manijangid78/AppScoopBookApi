package com.example.AppScoop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PanelizationSummary {

    private boolean containsEpubBubbles;
    private boolean containsImageBubbles;

}
