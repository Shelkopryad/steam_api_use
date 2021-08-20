package ru.shelk.steam_api_project.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.shelk.steam_api_project.config.FeignConfig;

import java.util.Map;

@FeignClient(name = "GetNewsByAppId", url = "${steam.news}", configuration = FeignConfig.class)
public interface SteamNewsGateway {

    @GetMapping
    Map<String, Map<String, Object>> getNews(@RequestParam("appid") Long appid,
                @RequestParam("count") int count,
                @RequestParam("maxlength") int maxLength,
                @RequestParam("format") String format
    );

}
