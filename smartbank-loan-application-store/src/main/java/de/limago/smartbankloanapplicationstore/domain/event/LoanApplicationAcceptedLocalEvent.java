package de.limago.smartbankloanapplicationstore.domain.event;


import de.limago.smartbankloanapplicationstore.domain.aggregate.LoanApplication;
import lombok.*;

@Getter
@Setter(AccessLevel.PRIVATE)
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoanApplicationAcceptedLocalEvent {

    private LoanApplication loanApplication;
}
