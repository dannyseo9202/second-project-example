package sparta.project.logistics.hub.hub.domain.model;


import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Hub {
    @EmbeddedId
    private HubId hubId;

    private String name;

    @Embedded
    private Address address;
    @Embedded
    private Location location;

    public Hub(HubId hubId, String name, Address address, Location location) {
        this.hubId = hubId;
        this.name = name;
        this.address = address;
        this.location = location;
    }
}
