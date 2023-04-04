package org.example.service.Impl;

import org.example.enums.PaymentEnum;
import org.example.service.PaymentService;
import org.springframework.stereotype.Service;

/**
 * 微信支付逻辑层
 */
@Service
public class WxPaymentServiceImpl implements PaymentService {

    @Override

    public String payment() {
        return "微信支付";
    }

    @Override
    public PaymentEnum getType() {
        return PaymentEnum.WX;
    }
}
