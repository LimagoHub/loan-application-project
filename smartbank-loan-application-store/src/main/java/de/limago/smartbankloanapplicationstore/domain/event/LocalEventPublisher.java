package de.limago.smartbankloanapplicationstore.domain.event;

public interface LocalEventPublisher {

    void sende(LoanApplicationPersistiertLocalEvent event);
    void sende(LoanApplicationAcceptedLocalEvent event);
    void sende(LoanApplicationDeniedLocalEvent event);

}
