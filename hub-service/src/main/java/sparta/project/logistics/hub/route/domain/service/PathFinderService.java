package sparta.project.logistics.hub.route.domain.service;


import sparta.project.logistics.hub.route.domain.model.Route;

import java.util.ArrayList;
import java.util.List;

//도메인 서비스 !!
public class PathFinderService {
    public List<String> findShortestPath(List<Route> routes, String startHubId, String endHubId, boolean byDistance) {
        // 거리 계산 로직 구현
        return new ArrayList<>();
    }
}
