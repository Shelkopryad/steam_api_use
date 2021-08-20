package ru.shelk.steam_api_project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.shelk.steam_api_project.interfaces.SteamAppsGateway;
import ru.shelk.steam_api_project.interfaces.SteamNewsGateway;

import java.util.LinkedHashMap;
import java.util.List;

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

    public List<LinkedHashMap<String, Object>> getNews(Long appId, int count, int maxLength, String format) {
        return (List<LinkedHashMap<String, Object>>) newsGateway.getNews(appId, count, maxLength, format).get("appnews").get("newsitems");
    }


}
