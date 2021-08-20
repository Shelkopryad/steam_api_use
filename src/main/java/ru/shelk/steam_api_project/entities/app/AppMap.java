package ru.shelk.steam_api_project.entities.app;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class AppMap {
    private Map<String, List<App>> applist;
}
