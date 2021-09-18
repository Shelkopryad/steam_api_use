package ru.shelk.steam_api_project.entities.news;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class NewsDto {

    @JsonProperty
    private String title;

    @JsonProperty
    private String content;

}
