package de.limago.loanapplicationacceptance.domain.service.internal;

import de.limago.loanapplicationacceptance.domain.model.LoanApplication;
import de.limago.loanapplicationacceptance.domain.repository.LoanApplicationRepository;
import de.limago.loanapplicationacceptance.domain.service.LoanApplicationQueryService;
import de.limago.loanapplicationacceptance.domain.service.LoanApplicatonCommandService;
import lombok.RequiredArgsConstructor;

import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
public class LoanApplicationServiceImpl implements LoanApplicationQueryService, LoanApplicatonCommandService {

    private final LoanApplicationRepository repo;

    @Override
    public Optional<LoanApplication> findLoanApplivationById(final UUID id) {
        return repo.findById(id);
    }

    @Override
    public Iterable<LoanApplication> findAllLoanApplications() {
        return repo.findAll();
    }

    @Override
    public void accept(final LoanApplication application) {
           repo.create(application);
    }
}
