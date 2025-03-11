package sparta.project.logistics.hub.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sparta.project.logistics.hub.route.domain.model.Distance;
import sparta.project.logistics.hub.route.domain.model.Duration;
import sparta.project.logistics.hub.route.domain.model.Route;
import sparta.project.logistics.hub.route.domain.model.RouteId;
import sparta.project.logistics.hub.route.domain.repository.RouteRepository;


@SpringBootTest
class RouteRepositoryTest {
    @Autowired
    private RouteRepository routeRepository;

    @Test
    void givenRoute_whenSaveExecuted_thenShouldBeSavedProperly() {
        // Given: 경로(Route) 객체 생성
        Route route = new Route(new RouteId("1", "2"), new Distance(30), new Duration(50));

        // When: 저장 수행
        Route saved = routeRepository.save(route);

        // Then: 저장된 엔티티 검증
        Assertions.assertAll(
                () -> Assertions.assertNotNull(saved.getId(), "Route ID가 null이면 안 됨"),
                () -> Assertions.assertEquals(route.getDistance(), saved.getDistance(), "거리 값이 일치해야 함"),
                () -> Assertions.assertEquals(route.getDuration(), saved.getDuration(), "소요 시간이 일치해야 함")
        );
    }

}