package sparta.project.logistics.hub.hub.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sparta.project.logistics.hub.hub.domain.model.Hub;
import sparta.project.logistics.hub.hub.domain.model.HubId;
import sparta.project.logistics.hub.hub.domain.repository.HubRepository;

@Repository
public interface JpaHubRepository extends JpaRepository<Hub, HubId>, HubRepository {
}
