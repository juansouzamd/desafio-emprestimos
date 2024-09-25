package tech.api.loans.controller.dto;

public record CustomerLoanRequest(
        Integer age,
        String cpf,
        String name,
        String income,
        String location) {
}
