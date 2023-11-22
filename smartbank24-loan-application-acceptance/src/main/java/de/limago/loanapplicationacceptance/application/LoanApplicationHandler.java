package de.limago.loanapplicationacceptance.application;

import de.limago.loanapplicationacceptance.domain.model.LoanApplication;

public interface LoanApplicationHandler {
    void handle(LoanApplication loanApplication);
}
