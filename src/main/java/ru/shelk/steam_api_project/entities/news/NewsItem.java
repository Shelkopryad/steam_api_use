package ru.shelk.steam_api_project.entities.news;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
public class NewsItem {
    @JsonProperty("gid")
    private String gid;

    @JsonProperty("title")
    private String title;

    @JsonProperty("url")
    private String url;

    @JsonProperty("is_external_url")
    private Boolean isExternalUrl;

    @JsonProperty("author")
    private String author;

    @JsonProperty("contents")
    private String contents;

    @JsonProperty("feedlabel")
    private String feedLabel;

    @JsonProperty("date")
    private Date date;

    @JsonProperty("feedname")
    private String feedName;

    @JsonProperty("feed_type")
    private String feedType;

    @JsonProperty("appid")
    private Integer appId;
}
