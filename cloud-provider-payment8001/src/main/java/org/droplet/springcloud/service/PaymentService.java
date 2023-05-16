package org.droplet.springcloud.service;

import org.apache.ibatis.annotations.Param;
import org.droplet.springcloud.entities.Payment;

public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
