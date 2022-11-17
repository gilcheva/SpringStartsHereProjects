package com.sfs._SFS.services;

import com.sfs._SFS.exceptions.NotEnoughMoneyException;
import com.sfs._SFS.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentDetails processPayment(){
        throw new NotEnoughMoneyException();
    }
}
