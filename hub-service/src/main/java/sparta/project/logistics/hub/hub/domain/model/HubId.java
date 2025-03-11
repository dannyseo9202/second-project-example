package sparta.project.logistics.hub.hub.domain.model;


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
public class HubId implements Serializable {
    private String id;

    public HubId(String id) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("허브 ID는 필수입니다.");
        }
        this.id = id;
    }
}
