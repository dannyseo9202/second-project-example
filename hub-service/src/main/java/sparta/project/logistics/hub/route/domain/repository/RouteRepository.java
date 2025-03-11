package sparta.project.logistics.hub.route.domain.repository;


import sparta.project.logistics.hub.route.domain.model.Route;

import java.util.List;

public interface RouteRepository {
    Route save(Route route);

    List<Route> findAll();
}
