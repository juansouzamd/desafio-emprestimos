package tech.api.loans.controller.dto;

import tech.api.loans.domain.LoanType;

public record LoanResponse(
        LoanType type,
        Double interestRate) {
}
