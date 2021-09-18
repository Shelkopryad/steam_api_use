package ru.shelk.steam_api_project.entities.news;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class AppNews {

    @JsonProperty("appid")
    private Long appId;

    @JsonProperty("newsitems")
    private List<NewsItem> newsItems;

    @JsonProperty("count")
    private int count;

}
