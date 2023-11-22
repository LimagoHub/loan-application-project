package de.limago.loanapplicationacceptance.domain.repository;

import de.limago.loanapplicationacceptance.domain.model.LoanApplication;

import java.util.Optional;
import java.util.UUID;

public interface LoanApplicationRepository {

    void create(final LoanApplication loanApplication);

    boolean exitsById(UUID id);

    Optional<LoanApplication> findById(UUID id);

    Iterable<LoanApplication> findAll();

}
