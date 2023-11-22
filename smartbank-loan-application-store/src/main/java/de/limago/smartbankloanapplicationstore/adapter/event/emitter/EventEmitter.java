package de.limago.smartbankloanapplicationstore.adapter.event.emitter;


import de.limago.smartbankloanapplicationstore.adapter.mapper.LoanApplicationLocalEventToDomainEventMapper;
import de.limago.smartbankloanapplicationstore.domain.event.LoanApplicationAcceptedLocalEvent;
import de.limago.smartbankloanapplicationstore.domain.event.LoanApplicationDeniedLocalEvent;
import de.limago.smartbankloanapplicationstore.domain.event.LoanApplicationPersistiertLocalEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EventEmitter {

    private static final String SUPPLIER_BINDING_NAME_PERSISTIERT = "loanApplicationPersisted-out-0";
    private static final String SUPPLIER_BINDING_NAME_EMPFOHLEN = "contractAccepted-out-0";
    private static final String SUPPLIER_BINDING_NAME_ABGELEHNT = "contractDenied-out-0";
    private final StreamBridge bridge;
    private final LoanApplicationLocalEventToDomainEventMapper mapper;

    @EventListener
    public void handle(LoanApplicationPersistiertLocalEvent event){
        bridge.send(SUPPLIER_BINDING_NAME_PERSISTIERT, mapper.convert(event));
    }
    @EventListener
    public void handle(LoanApplicationAcceptedLocalEvent event){
        bridge.send(SUPPLIER_BINDING_NAME_EMPFOHLEN, mapper.convert(event));
    }
    @EventListener
    public void handle(LoanApplicationDeniedLocalEvent event){
        bridge.send(SUPPLIER_BINDING_NAME_ABGELEHNT, mapper.convert(event));
    }
}
