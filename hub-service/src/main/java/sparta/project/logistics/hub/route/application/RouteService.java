package sparta.project.logistics.hub.route.application;

import org.springframework.stereotype.Service;
import sparta.project.logistics.hub.route.domain.model.Route;
import sparta.project.logistics.hub.route.domain.repository.RouteRepository;
import sparta.project.logistics.hub.route.domain.service.PathFinderService;

import java.util.List;

@Service

public class RouteService {
    private final RouteRepository routeRepository;
    private final PathFinderService pathFinderService;

    public RouteService(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;

        //아래는 도메인 서비스 입니다.
        this.pathFinderService = new PathFinderService();
    }

    public List<String> findShortestPath(String startHubId, String endHubId, boolean byDistance) {
        List<Route> routes = routeRepository.findAll();
        return pathFinderService.findShortestPath(routes, startHubId, endHubId, byDistance);
    }
}
