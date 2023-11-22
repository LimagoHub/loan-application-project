package de.limago.smartbankloanapplicationstore.adapter.event.listener;


import de.limago.smartbankloanapplicationstore.adapter.event.LoanApplicationEvent;
import de.limago.smartbankloanapplicationstore.adapter.event.ScoringEvent;
import de.limago.smartbankloanapplicationstore.adapter.mapper.LoanApplicationDTOMapper;
import de.limago.smartbankloanapplicationstore.application.commandhandler.LoanApplicationHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class EventListener {

    @Bean
    public Consumer<LoanApplicationEvent> loanApplicationAccepted(final LoanApplicationHandler handler, final
    LoanApplicationDTOMapper mapper){
        return event -> handler.handleKreditantragRegistriert(mapper.convert(event.getLoanApplicationDTO()));

    }


    @Bean
    public Consumer<ScoringEvent> scoringNegative (final LoanApplicationHandler handler){
        return event -> handler.handleScoringNegativ(event.getCreditApplicationId());
    }
    @Bean
    public Consumer<ScoringEvent> scoringPositive (final LoanApplicationHandler handler){
        return event -> handler.handleScoringPositiv(event.getCreditApplicationId());
    }
    @Bean
    public Consumer<ScoringEvent> cityScoringNegative (final LoanApplicationHandler handler){
        return event -> handler.handleCityScoringNegativ(event.getCreditApplicationId());
    }
    @Bean
    public Consumer<ScoringEvent> cityScoringPositive (final LoanApplicationHandler handler){
        return event -> handler.handleCityScoringPositiv(event.getCreditApplicationId());
    }

}
