package ru.shelk.steam_api_project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.shelk.steam_api_project.entities.news.NewsDto;
import ru.shelk.steam_api_project.entities.news.NewsItem;
import ru.shelk.steam_api_project.entities.news.NewsMapper;
import ru.shelk.steam_api_project.interfaces.SteamAppsGateway;
import ru.shelk.steam_api_project.interfaces.SteamNewsGateway;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SteamService {

    @Autowired
    private SteamAppsGateway appsGateway;

    @Autowired
    private SteamNewsGateway newsGateway;

    public Long getAppIdByName(String name) {
        return appsGateway
                .getAppList()
                .getApplist()
                .get("apps")
                .stream()
                .filter(it -> it.getName().equals(name))
                .findFirst()
                .orElseThrow(RuntimeException::new)
                .getAppid();
    }

    public List<NewsDto> getNews(Long appId, int count, int maxLength, String format) {
        List<NewsItem> list = newsGateway.getNews(appId, count, maxLength, format)
                .getAppNews()
                .getNewsItems();

        List<NewsDto> dtoList = list
                .stream()
                .map(NewsMapper.INSTANCE::newsItemsToNewsDto)
                .collect(Collectors.toList());

        return dtoList;
    }
}
