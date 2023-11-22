package de.limago.smartbankloanapplicationstore.adapter.event;


import de.limago.loanapplicationacceptance.adapter.dto.LoanApplicationDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper=true)
public class LoanApplicationEvent extends BaseEvent{
    private LoanApplicationDTO loanApplicationDTO;
}
