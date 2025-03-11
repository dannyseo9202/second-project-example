package sparta.project.logistics.hub.route.domain.model;

import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Getter
@EqualsAndHashCode
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RouteId implements Serializable {
    private String fromHubId;
    private String toHubId;

    public RouteId(String fromHubId, String toHubId) {
        if (fromHubId == null || toHubId == null) {
            throw new IllegalArgumentException("경로 ID는 필수입니다.");
        }
        this.fromHubId = fromHubId;
        this.toHubId = toHubId;
    }
}
