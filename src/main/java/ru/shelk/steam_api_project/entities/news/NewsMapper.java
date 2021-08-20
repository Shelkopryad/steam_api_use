package ru.shelk.steam_api_project.entities.news;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface NewsMapper {

    NewsMapper INSTANCE = Mappers.getMapper(NewsMapper.class);

    @Mapping(source = "gid", target = "gid")
    @Mapping(source = "title", target = "title")
    @Mapping(source = "url", target = "url")
    @Mapping(source = "is_external_url", target = "isExternalUrl")
    @Mapping(source = "author", target = "author")
    @Mapping(source = "contents", target = "contents")
    @Mapping(source = "feedlabel", target = "feedLabel")
    @Mapping(source = "date", target = "date")
    @Mapping(source = "feedname", target = "feedName")
    @Mapping(source = "feed_type", target = "feedType")
    @Mapping(source = "appid", target = "appId")
    NewsItem getNewsItems(Object o);
}
