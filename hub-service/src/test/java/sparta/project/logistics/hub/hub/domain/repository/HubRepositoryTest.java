package sparta.project.logistics.hub.hub.domain.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sparta.project.logistics.hub.hub.domain.model.Address;
import sparta.project.logistics.hub.hub.domain.model.Hub;
import sparta.project.logistics.hub.hub.domain.model.HubId;
import sparta.project.logistics.hub.hub.domain.model.Location;

@SpringBootTest
class HubRepositoryTest {
    @Autowired
    private HubRepository hubRepository;

    @Test
    void givenHub_whenSaveExecuted_thenShouldBeSavedProperly() {
        // Given: 주소 및 위치 정보 생성
        Address address = new Address("서울특별시 강남구 테헤란로 123", "서울특별시 강남구 역삼동 123-45", "서울특별시", "강남구", "서울특별시", "06164");
        Location location = new Location(37.5665, 126.9780);

        // 허브(Hub) 객체 생성
        Hub hub = new Hub(new HubId("3"), "서울 허브", address, location);

        // When: 저장 수행
        Hub savedHub = hubRepository.save(hub);

        // Then: 저장된 엔티티 검증
        Assertions.assertAll(
                () -> Assertions.assertNotNull(savedHub, "저장된 Hub 객체가 null이면 안 됨"),
                () -> Assertions.assertNotNull(savedHub.getHubId(), "Hub ID가 null이면 안 됨"),
                () -> Assertions.assertEquals(hub.getName(), savedHub.getName(), "Hub 이름이 일치해야 함"),
                () -> Assertions.assertEquals(hub.getAddress(), savedHub.getAddress(), "주소 정보가 일치해야 함"),
                () -> Assertions.assertEquals(hub.getLocation(), savedHub.getLocation(), "위치 정보가 일치해야 함")
        );
    }
}