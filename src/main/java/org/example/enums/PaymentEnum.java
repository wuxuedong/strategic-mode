package org.example.enums;

/**
 * 支付类型enum
 */
public enum PaymentEnum {
    WX("微信支付",1),
    ZFB("支付宝",2);

    private String paymentName;
    private Integer code;

    private PaymentEnum(String paymentName,Integer code){
        this.paymentName = paymentName;
        this.code = code;
    }

    public String getPaymentName() {
        return paymentName;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
