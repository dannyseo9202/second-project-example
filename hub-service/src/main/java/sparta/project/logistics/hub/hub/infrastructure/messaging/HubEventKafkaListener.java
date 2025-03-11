package sparta.project.logistics.hub.hub.infrastructure.messaging;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import sparta.project.logistics.common.event.HubCreatedEvent;

@Component
@RequiredArgsConstructor
public class HubEventKafkaListener {
    // common-lib 참조를 위한 예제 구문
    private final KafkaTemplate<String, HubCreatedEvent> kafkaTemplate;
}
