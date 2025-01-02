package com.clifav.accounts.controller;


import com.clifav.accounts.dto.CustomerDto;
import com.clifav.accounts.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping(path = "/api", produces = {MediaType.APPLICATION_JSON_VALUE})
public class AccountsController {

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createAccount(@RequestBody CustomerDto customerDto) {

        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDto("success", "Account created successfully"));
    }
}
