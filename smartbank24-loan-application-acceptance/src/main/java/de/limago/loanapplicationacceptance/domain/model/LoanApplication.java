package de.limago.loanapplicationacceptance.domain.model;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter(AccessLevel.PRIVATE)
public class LoanApplication {

    private UUID creditApplicationId ;

    private String firstName;

    private String lastName;

    private String city;

    private LocalDateTime applicationDate ;

    private double monthlyIncome;

    private double monthlyExpenditure;

    private double creditSum;

}
