package de.limago.smartbankloanapplicationstore.application.commandhandler;


import de.limago.smartbankloanapplicationstore.domain.aggregate.LoanApplication;

import java.util.UUID;

public interface LoanApplicationHandler {
    void handleKreditantragRegistriert(LoanApplication application);
    void handleScoringPositiv(UUID id);
    void handleScoringNegativ(UUID id);
    void handleCityScoringPositiv(UUID id);
    void handleCityScoringNegativ(UUID id);
}
