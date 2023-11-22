package de.limago.loanapplicationacceptance.adapter.controller;

import de.limago.loanapplicationacceptance.adapter.dto.LoanApplicationDTO;
import de.limago.loanapplicationacceptance.adapter.mapper.LoanApplicationDTOMapper;
import de.limago.loanapplicationacceptance.application.LoanApplicationHandler;
import de.limago.loanapplicationacceptance.domain.service.LoanApplicatonCommandService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/v1/loan-applications")
@AllArgsConstructor
public class LoanApplicationCommandController {

    private final LoanApplicationHandler handler;
    private final LoanApplicationDTOMapper mapper;

    @Operation(summary = "accepts a loan application")
    @ApiResponse(responseCode = "201", description = "LoanApplication accepted", content = @Content)
    @ApiResponse(responseCode = "400", description = "Bad Request (possibly already recorded or validation error)" ,content = @Content)
    @ApiResponse(responseCode = "500", description = "Internal Server Error",content = @Content)

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> accept(@Valid @RequestBody LoanApplicationDTO loanApplicationDTO) throws Exception {
        handler.handle(mapper.convert(loanApplicationDTO));
        return ResponseEntity.status(HttpStatus.CREATED).build();

    }
}
