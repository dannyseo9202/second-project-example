package sparta.project.logistics.hub.hub.application;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HubService {
    private final HubEventPublisher hubEventPublisher;


}
