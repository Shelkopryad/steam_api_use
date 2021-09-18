package ru.shelk.steam_api_project.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.shelk.steam_api_project.config.FeignConfig;
import ru.shelk.steam_api_project.entities.news.AppNewsData;

@FeignClient(name = "GetNewsByAppId", url = "${steam.news}", configuration = FeignConfig.class)
public interface SteamNewsGateway {

    @GetMapping
    AppNewsData getNews(@RequestParam("appid") Long appid,
                        @RequestParam("count") int count,
                        @RequestParam("maxlength") int maxLength,
                        @RequestParam("format") String format
    );

}
