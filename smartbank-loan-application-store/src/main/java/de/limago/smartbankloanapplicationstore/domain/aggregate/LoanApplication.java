package de.limago.smartbankloanapplicationstore.domain.aggregate;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter(AccessLevel.PRIVATE)
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoanApplication {

    private UUID creditApplicationId ;
    private String firstName;
    private String lastName;
    private String city;
    private LocalDateTime applicationDate ;
    private double monthlyIncome;
    private double monthlyExpenditure;
    private double creditSum;
    private LocalDateTime version;
    @Builder.Default
    private String scoringState ="in progress";

    @Builder.Default
    private String cityScoringState ="in progress";

    @Builder.Default
    private String applicationState ="in progress";

    public StatusChange behandlePositivesScoring() {
        if(! applicationState.equals("in progress")) return StatusChange.NO_CHANGE;
        if(! scoringState.equals("in progress")) return StatusChange.NO_CHANGE;

        if(scoringState.equals("in progress") && cityScoringState.equals("in progress")){
            scoringState = "Ok";
            return StatusChange.NO_CHANGE;
        }

        if(scoringState.equals("in progress") &&  cityScoringState.equals("Ok")){
            scoringState = "Ok";
            applicationState = "Accepted";
            return StatusChange.FINAL;
        }
        return StatusChange.NO_CHANGE;
    }

    public StatusChange behandleNegativesScoring() {
        if(! applicationState.equals("in progress")) return StatusChange.NO_CHANGE;
        if(! scoringState.equals("in progress")) return StatusChange.NO_CHANGE;

        scoringState = "abgelehnt";
        applicationState ="DENIED";
        return StatusChange.FINAL;
    }

    public StatusChange behandlePositivesCityScoring() {
        if(! applicationState.equals("in progress")) return StatusChange.NO_CHANGE;
        if(! cityScoringState.equals("in progress")) return StatusChange.NO_CHANGE;

        if(cityScoringState.equals("in progress") && scoringState.equals("in progress")){
            cityScoringState = "Ok";
            return StatusChange.NO_CHANGE;
        }

        if(cityScoringState.equals("in progress") &&  scoringState.equals("Ok")){
            cityScoringState = "Ok";
            applicationState = "Accepted";
            return StatusChange.FINAL;
        }
        return StatusChange.NO_CHANGE;

    }

    public StatusChange behandleNegativesCityScoring() {

        if(! applicationState.equals("in progress")) return StatusChange.NO_CHANGE;
        if(! cityScoringState.equals("in progress")) return StatusChange.NO_CHANGE;

        cityScoringState = "abgelehnt";
        applicationState ="DENIED";
        return StatusChange.FINAL;

    }

}
