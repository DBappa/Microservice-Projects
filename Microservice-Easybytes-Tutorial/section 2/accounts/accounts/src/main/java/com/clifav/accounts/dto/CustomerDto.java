package com.clifav.accounts.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
       name = "Customer",
        description = "Schema  to hold Customer and Account Information"
)
public class CustomerDto {

    @Schema(
            description = "Name of the Customer",
            example = "Bappaditya"
    )
    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 50, message = "Name should be between 2 and 50 characters")
    private String name;

    @Schema(
            description = "Email address of the Customer",
            example = "bdutta@wiley.com"
    )
    @NotEmpty(message = "Email should not be empty")
    @Email(message = "Invalid email format")
    private String email;


    @Schema(
            description = "Mobile number of the Customer",
            example = "9345432123"
    )
    @NotEmpty(message = "Mobile Number should not be empty")
    @Pattern(regexp = "^(\\+\\d{1,3}[- ]?)?\\d{10}$", message = "Invalid mobile number format")
    private String mobileNumber;

    @Schema(
            description="Account details of the Customer"
    )
    private AccountsDto accountsDto;
}
