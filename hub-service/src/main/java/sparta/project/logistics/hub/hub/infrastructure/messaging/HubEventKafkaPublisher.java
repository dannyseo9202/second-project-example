package sparta.project.logistics.hub.hub.infrastructure.messaging;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import sparta.project.logistics.hub.hub.application.HubEventPublisher;

@Component
@RequiredArgsConstructor
public class HubEventKafkaPublisher implements HubEventPublisher {
}
