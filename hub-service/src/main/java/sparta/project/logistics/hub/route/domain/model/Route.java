package sparta.project.logistics.hub.route.domain.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Route {
    @EmbeddedId
    private RouteId id;

    @Embedded
    private Distance distance;

    @Embedded
    private Duration duration;



    public Route(RouteId id, Distance distance, Duration duration) {
        this.id = id;
        this.distance = distance;
        this.duration = duration;
    }
}
