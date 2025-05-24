package com.clifav.accounts.service;

import com.clifav.accounts.dto.CustomerDto;

public interface IAccountsService {
    /**
     * Creates a new account using the provided customer information.
     *
     * @param customerDto the data transfer object containing customer details
     */
    void createAccount(CustomerDto customerDto);

    CustomerDto fetchAccountDetails(String mobileNumber);

    boolean updateAccount(CustomerDto customerDto);

    boolean deleteAccount(String mobileNumber);
}
