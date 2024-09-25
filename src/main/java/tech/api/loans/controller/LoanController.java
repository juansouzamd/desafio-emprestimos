package tech.api.loans.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tech.api.loans.controller.dto.CustomerLoanRequest;
import tech.api.loans.controller.dto.CustomerLoanResponse;

@RestController
public class LoanController {

    @PostMapping(value = "/customer-loans")
    public ResponseEntity<CustomerLoanResponse> customerLoans(@RequestBody CustomerLoanRequest loanRequest){

    }
}
