package sparta.project.logistics.hub.route.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sparta.project.logistics.hub.route.domain.model.Route;
import sparta.project.logistics.hub.route.domain.model.RouteId;
import sparta.project.logistics.hub.route.domain.repository.RouteRepository;

@Repository
public interface JpaRouteRepository extends JpaRepository<Route, RouteId>, RouteRepository {
}
