package ru.shelk.steam_api_project.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import ru.shelk.steam_api_project.entities.app.AppMap;

@FeignClient(name = "GetAllApps", url = "${steam.apps}")
public interface SteamAppsGateway {

    @GetMapping
    AppMap getAppList();

}
