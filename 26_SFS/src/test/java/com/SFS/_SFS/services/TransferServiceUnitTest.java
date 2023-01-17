package com.SFS._SFS.services;

import com.SFS._SFS.model.Account;
import com.SFS._SFS.repositories.AccountRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Optional;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class TransferServiceUnitTest {

    @Test
//   Good practice is to describe the test scenario
    @DisplayName("Test the amount is transferred from one account to another if no exception occurs.")
    void transferMoneyHappyFlow() {
//        We use the Mockito mock() method to create a mock instance for the AccountRepository object.
        AccountRepository accountRepository = mock(AccountRepository.class);

//        We create an instance of the TransferService object whose method we want to test.
//        Instead of a real AccountRepository instance, we create the object using a mock AccountRepository.
//        This way, we replace the dependency with something we can control.
        TransferService transferService = new TransferService(accountRepository);

//        We create the sender and the destination Account instances, which hold the Account details,
//        which we assume the app would find in the database.
        Account sender = new Account();
        sender.setId(1);
        sender.setAmount(new BigDecimal(1000));

        Account destination = new Account();
        destination.setId(2);
        destination.setAmount(new BigDecimal(1000));

//        Using the given() method, you tell the mock how to behave when one of its methods is called.
//        Here, we want the AccountRepository’s findById() method to return a specific Account instance
//        for a given parameter value.
        given(accountRepository.findById(sender.getId()))
                .willReturn(Optional.of(sender));

//        We control the mock’s findById() method to return the destination account instance
//        when it gets the destination account ID.
//        Read this as “If one calls the findById() method with the destination ID parameter,
//        then return the destination account instance.”
        given(accountRepository.findById(destination.getId()))
                .willReturn(Optional.of(destination));

//        Then call the tested method and prove it works as expected in the given conditions.
//        We call the method we want to test with the sender ID, destination ID, and the value to be transferred.
        transferService.transferMoney(sender.getId(), destination.getId(), new BigDecimal(100));

//        Verify that the changeAmount() method in the AccountRepository was called with the expected parameters.
        verify(accountRepository).changeAmount(1, new BigDecimal(900));
        verify(accountRepository).changeAmount(2, new BigDecimal(1100));
    }
}