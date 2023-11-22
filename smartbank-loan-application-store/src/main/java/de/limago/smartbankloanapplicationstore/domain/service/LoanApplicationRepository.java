package de.limago.smartbankloanapplicationstore.domain.service;



import de.limago.smartbankloanapplicationstore.domain.aggregate.LoanApplication;

import java.util.Optional;
import java.util.UUID;

public interface LoanApplicationRepository {

    void anlegen(LoanApplication application);

    boolean existenzPruefen(LoanApplication application);

    Optional<LoanApplication> findeAntragNachId(UUID id);

    Iterable<LoanApplication> findeAlle();
}
