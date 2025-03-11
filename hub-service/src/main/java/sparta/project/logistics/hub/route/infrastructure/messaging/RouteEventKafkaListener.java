package sparta.project.logistics.hub.route.infrastructure.messaging;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import sparta.project.logistics.common.event.RouteModifiedEvent;

@Component
@RequiredArgsConstructor
public class RouteEventKafkaListener {
    // common-lib 참조를 위한 예제 구문
    private final KafkaTemplate<String, RouteModifiedEvent> kafkaTemplate;
}
