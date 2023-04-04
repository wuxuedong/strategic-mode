package org.example.factory;

import org.example.service.PaymentService;

/**
 * 支付工厂抽象层
 */
public interface ConText {
    PaymentService paymentServiceSelect(int type);
}
