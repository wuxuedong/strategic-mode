package org.example.service;

import org.example.enums.PaymentEnum;
import org.springframework.stereotype.Service;

@Service
public interface PaymentService {
    /** 支付逻辑处理*/
    String payment();
    /** 获取支付类型*/
    PaymentEnum getType();
}
