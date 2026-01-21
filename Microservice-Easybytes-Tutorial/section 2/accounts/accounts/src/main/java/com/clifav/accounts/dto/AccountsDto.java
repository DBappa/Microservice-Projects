package com.clifav.accounts.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name= "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {

    @Schema(
            description = "AccountNumber of Easy Bank Account"
    )
    @NotEmpty(message = "Account Number should not be empty")
    @Pattern(regexp = "^[0-9]+$", message = "Invalid account number format")
    private Long accountNumber;

    @Schema(
           description = "Account Type of Easy Bank Account",
            example = "Savings"
    )
    @NotEmpty(message = "Account Type should not be empty")
    private String accountType;

    @Schema(
            description = "Easy Bank branch address"
    )
    @NotEmpty(message = "Branch Address should not be empty")
    private String branchAddress;
}
