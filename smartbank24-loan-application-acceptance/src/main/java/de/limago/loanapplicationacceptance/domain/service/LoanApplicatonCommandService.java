package de.limago.loanapplicationacceptance.domain.service;

import de.limago.loanapplicationacceptance.domain.model.LoanApplication;

public interface LoanApplicatonCommandService {

    void accept(final LoanApplication application);
}
