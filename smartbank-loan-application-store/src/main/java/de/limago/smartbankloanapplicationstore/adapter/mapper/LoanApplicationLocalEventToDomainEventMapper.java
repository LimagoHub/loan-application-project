package de.limago.smartbankloanapplicationstore.adapter.mapper;


import de.limago.smartbankloanapplicationstore.adapter.event.LoanApplicationEvent;
import de.limago.smartbankloanapplicationstore.domain.event.LoanApplicationAcceptedLocalEvent;
import de.limago.smartbankloanapplicationstore.domain.event.LoanApplicationDeniedLocalEvent;
import de.limago.smartbankloanapplicationstore.domain.event.LoanApplicationPersistiertLocalEvent;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface LoanApplicationLocalEventToDomainEventMapper {

    @Mapping(source="loanApplication", target="loanApplicationDTO")
    @Mapping(target = "eventID", ignore = true)
    @Mapping(target = "eventTimestamp", ignore = true)
    LoanApplicationEvent convert(LoanApplicationPersistiertLocalEvent loanApplicationPersistiertLocalEvent);
    @Mapping(source="loanApplication", target="loanApplicationDTO")
    @Mapping(target = "eventID", ignore = true)
    @Mapping(target = "eventTimestamp", ignore = true)
    LoanApplicationEvent convert(LoanApplicationAcceptedLocalEvent loanApplicationAcceptedLocalEvent);
    @Mapping(source="loanApplication", target="loanApplicationDTO")
    @Mapping(target = "eventID", ignore = true)
    @Mapping(target = "eventTimestamp", ignore = true)
    LoanApplicationEvent convert(LoanApplicationDeniedLocalEvent loanApplicationDeniedLocalEvent);
}
