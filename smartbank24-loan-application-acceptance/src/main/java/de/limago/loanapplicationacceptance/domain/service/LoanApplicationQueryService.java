package de.limago.loanapplicationacceptance.domain.service;

import de.limago.loanapplicationacceptance.domain.model.LoanApplication;

import java.util.Optional;
import java.util.UUID;

public interface LoanApplicationQueryService {

    Optional<LoanApplication> findLoanApplivationById(UUID id);
    Iterable<LoanApplication> findAllLoanApplications();
}
