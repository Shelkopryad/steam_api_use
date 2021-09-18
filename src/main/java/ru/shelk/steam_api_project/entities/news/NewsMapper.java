package ru.shelk.steam_api_project.entities.news;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface NewsMapper {

    NewsMapper INSTANCE = Mappers.getMapper(NewsMapper.class);

    @Mapping(source = "title", target = "title")
    @Mapping(source = "contents", target = "content")
    NewsDto newsItemsToNewsDto(NewsItem item);
}
