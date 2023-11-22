package de.limago.smartbankloanapplicationstore.adapter.repositories.impl;


import de.limago.smartbankloanapplicationstore.adapter.mapper.LoanApplicationMapper;
import de.limago.smartbankloanapplicationstore.adapter.repositories.LoanApplicationPersistence;
import de.limago.smartbankloanapplicationstore.domain.aggregate.LoanApplication;
import de.limago.smartbankloanapplicationstore.domain.service.LoanApplicationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
@AllArgsConstructor
public class LoanApplicationRepositoryImpl implements LoanApplicationRepository {

    private final LoanApplicationPersistence persistence;
    private final LoanApplicationMapper mapper;

    @Override
    public void anlegen(LoanApplication antrag) {
        persistence.save(mapper.convert(antrag));
    }

    @Override
    public boolean existenzPruefen(LoanApplication k) {
        return persistence.existsById(k.getCreditApplicationId());
    }

    @Override
    public Optional<LoanApplication> findeAntragNachId(UUID id) {
        return persistence.findById(id).map(mapper::convert);
    }

    @Override
    public Iterable<LoanApplication> findeAlle() {
        return mapper.convert(persistence.findAll());
    }
}
