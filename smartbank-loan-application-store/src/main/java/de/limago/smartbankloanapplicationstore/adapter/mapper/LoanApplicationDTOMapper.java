package de.limago.smartbankloanapplicationstore.adapter.mapper;



import de.limago.loanapplicationacceptance.adapter.dto.LoanApplicationDTO;
import de.limago.smartbankloanapplicationstore.domain.aggregate.LoanApplication;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface LoanApplicationDTOMapper {

    LoanApplicationDTO convert(LoanApplication loanApplication);
    @Mapping(target = "scoringState", ignore = true)
    @Mapping(target = "cityScoringState", ignore = true)
    @Mapping(target = "applicationState", ignore = true)
    LoanApplication convert(LoanApplicationDTO dto);


    Iterable<LoanApplicationDTO> convert(Iterable<LoanApplication> applications);
}
