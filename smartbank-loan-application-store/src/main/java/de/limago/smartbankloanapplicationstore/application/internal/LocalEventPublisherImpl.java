package de.limago.smartbankloanapplicationstore.application.internal;


import de.limago.smartbankloanapplicationstore.domain.event.LoanApplicationAcceptedLocalEvent;
import de.limago.smartbankloanapplicationstore.domain.event.LoanApplicationDeniedLocalEvent;
import de.limago.smartbankloanapplicationstore.domain.event.LoanApplicationPersistiertLocalEvent;
import de.limago.smartbankloanapplicationstore.domain.event.LocalEventPublisher;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LocalEventPublisherImpl implements LocalEventPublisher {

    private final ApplicationEventPublisher publisher;

    @Override
    public void sende(LoanApplicationPersistiertLocalEvent event) {
        publisher.publishEvent(event);
    }

    @Override
    public void sende(LoanApplicationAcceptedLocalEvent event) {
        publisher.publishEvent(event);
    }

    @Override
    public void sende(LoanApplicationDeniedLocalEvent event) {
        publisher.publishEvent(event);
    }
}
