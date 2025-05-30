package com.clifav.accounts.dto;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AccountsDto {

    @NotEmpty(message = "Account Number should not be empty")
    @Pattern(regexp = "^[0-9]+$", message = "Invalid account number format")
    private Long accountNumber;
    @NotEmpty(message = "Account Type should not be empty")
    private String accountType;
    @NotEmpty(message = "Branch Address should not be empty")
    private String branchAddress;
}
