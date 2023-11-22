package de.limago.loanapplicationacceptance.adapter.mapper;


import de.limago.loanapplicationacceptance.adapter.dto.LoanApplicationDTO;
import de.limago.loanapplicationacceptance.domain.model.LoanApplication;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface LoanApplicationDTOMapper {
    LoanApplicationDTO convert(LoanApplication loanApplication);
    LoanApplication convert(LoanApplicationDTO dto);

    Iterable<LoanApplicationDTO> convert(Iterable<LoanApplication> applications);
}
