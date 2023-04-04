package org.example.service.Impl;

import org.example.enums.PaymentEnum;
import org.example.service.PaymentService;
import org.springframework.stereotype.Service;

/**
 * 支付宝支付逻辑层
 */
@Service
public class ZfbPaymentServiceImpl implements PaymentService {

    @Override
    public String payment() {
        return "支付宝支付";
    }

    @Override
    public PaymentEnum getType() {
        return PaymentEnum.ZFB;
    }
}
