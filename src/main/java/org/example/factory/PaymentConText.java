package org.example.factory;

import org.example.service.PaymentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 支付工厂
 */
@Service
public class PaymentConText implements ConText {
    private final List<PaymentService> paymentServiceList;

    public PaymentConText(List<PaymentService> paymentServiceList) {
        this.paymentServiceList = paymentServiceList;
    }


    /**
     * 根据type获取支付对象
     * @param type 1.微信支付   2.支付宝支付
     * @return
     */
    @Override
    public PaymentService paymentServiceSelect(int type) {
        List<PaymentService> paymentServiceLIst = paymentServiceList.stream().filter(x->x.getType().getCode() == type).collect(Collectors.toList());
        return paymentServiceLIst.get(0);
    }
}

