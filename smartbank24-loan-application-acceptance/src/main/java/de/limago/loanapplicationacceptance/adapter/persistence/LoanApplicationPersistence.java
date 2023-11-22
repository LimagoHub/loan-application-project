package de.limago.loanapplicationacceptance.adapter.persistence;

import de.limago.loanapplicationacceptance.adapter.entity.LoanApplicationEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface LoanApplicationPersistence extends CrudRepository<LoanApplicationEntity, UUID> {
}
