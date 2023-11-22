package de.limago.smartbankloanapplicationstore.application.config;



import de.limago.smartbankloanapplicationstore.domain.event.LocalEventPublisher;
import de.limago.smartbankloanapplicationstore.domain.service.LoanApplicationRepository;
import de.limago.smartbankloanapplicationstore.domain.service.LoanApplicationService;
import de.limago.smartbankloanapplicationstore.domain.service.internal.LoanApplicationServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KreditantragConfig {

    @Bean
    public LoanApplicationService createKreditantragService(LoanApplicationRepository repo, LocalEventPublisher publisher) {
        return new LoanApplicationServiceImpl(repo, publisher);
    }
}
