package sparta.project.logistics.hub.hub.domain.model;

import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@EqualsAndHashCode
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Address {
    private String roadAddress;   // 도로명 주소 (예: 서울특별시 강남구 테헤란로 123)
    private String jibunAddress;  // 지번 주소 (예: 서울특별시 강남구 역삼동 123-45)
    private String city;          // 도시 (예: 서울특별시)
    private String district;      // 구/군 (예: 강남구)
    private String state;         // 시/도 (예: 서울특별시)
    private String postalCode;    // 우편번호 (예: 06164)

    public Address(String roadAddress, String jibunAddress, String city, String district, String state, String postalCode) {
        validateNotEmpty(roadAddress, "도로명 주소(roadAddress)");
        validateNotEmpty(city, "도시(city)");
        validateNotEmpty(state, "시/도(state)");
        validateNotEmpty(postalCode, "우편번호(postalCode)");

        this.roadAddress = roadAddress;
        this.jibunAddress = jibunAddress;
        this.city = city;
        this.district = district;
        this.state = state;
        this.postalCode = postalCode;
    }

    private void validateNotEmpty(String value, String fieldName) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(fieldName + "는 비워둘 수 없습니다.");
        }
    }
}

