package de.limago.smartbankloanapplicationstore.adapter.repositories;


import de.limago.smartbankloanapplicationstore.adapter.repositories.entities.LoanApplicationEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface LoanApplicationPersistence extends CrudRepository<LoanApplicationEntity, UUID> {
}
