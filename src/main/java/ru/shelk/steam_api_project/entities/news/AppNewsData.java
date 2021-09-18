package ru.shelk.steam_api_project.entities.news;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Map;

@Data
public class AppNewsData {

    @JsonProperty("appnews")
    private AppNews appNews;

}
