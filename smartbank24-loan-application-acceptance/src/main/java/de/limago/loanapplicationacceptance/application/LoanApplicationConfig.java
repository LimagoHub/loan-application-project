package de.limago.loanapplicationacceptance.application;

import de.limago.loanapplicationacceptance.domain.repository.LoanApplicationRepository;
import de.limago.loanapplicationacceptance.domain.service.LoanApplicationQueryService;
import de.limago.loanapplicationacceptance.domain.service.LoanApplicatonCommandService;
import de.limago.loanapplicationacceptance.domain.service.internal.LoanApplicationServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class LoanApplicationConfig {


    @Bean
    @Primary
    public LoanApplicatonCommandService createLoanApplicatonCommandService(final LoanApplicationRepository repo){
        return new LoanApplicationServiceImpl(repo);
    }

    @Bean
    public LoanApplicationQueryService createLoanApplicatonQueryService(final LoanApplicationRepository repo){
        return new LoanApplicationServiceImpl(repo);
    }
}
