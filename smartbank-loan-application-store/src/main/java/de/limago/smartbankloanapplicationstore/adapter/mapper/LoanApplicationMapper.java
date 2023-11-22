package de.limago.smartbankloanapplicationstore.adapter.mapper;


import de.limago.smartbankloanapplicationstore.adapter.repositories.entities.LoanApplicationEntity;
import de.limago.smartbankloanapplicationstore.domain.aggregate.LoanApplication;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LoanApplicationMapper {
    LoanApplication convert(LoanApplicationEntity loanApplicationEntity);
    LoanApplicationEntity convert(LoanApplication loanApplication);

    Iterable<LoanApplication> convert(Iterable<LoanApplicationEntity> antraege);
}
