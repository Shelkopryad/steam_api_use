package ru.shelk.steam_api_project.entities.news;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
public class NewsItem {
    private String gid;
    private String title;
    private String url;
    private Boolean isExternalUrl;
    private String author;
    private String contents;
    private String feedLabel;
    private Date date;
    private String feedName;
    private String feedType;
    private Integer appId;
}
