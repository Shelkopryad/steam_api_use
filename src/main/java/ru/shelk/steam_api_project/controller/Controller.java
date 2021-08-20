package ru.shelk.steam_api_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.shelk.steam_api_project.entities.app.AppMap;
import ru.shelk.steam_api_project.interfaces.SteamAppsGateway;
import ru.shelk.steam_api_project.services.SteamService;

import java.util.LinkedHashMap;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    private SteamAppsGateway appsGateway;

    @Autowired
    private SteamService service;

    @Autowired
    private String apiKey;

    @GetMapping("/apps")
    public ResponseEntity<AppMap> getInfo() {
        return new ResponseEntity<>(appsGateway.getAppList(), HttpStatus.OK);
    }

    @GetMapping("/news")
    public ResponseEntity<List<LinkedHashMap<String, Object>>> getNews(@RequestParam("name") String name,
                                                    @RequestParam(value = "count", defaultValue = "3") String count) {
        Long appId = service.getAppIdByName(name);
        return new ResponseEntity<>(service.getNews(appId, Integer.parseInt(count), 300, "json"), HttpStatus.OK);
    }

}
