package org.example.controller;

import org.example.factory.ConText;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 策略模式
 * 经典案例简述：在实际项目中，通常前端会出现类似选择支付类型，后台根据选择类型调用具体的支付接口，编写相关的逻辑代码。
 * 这种写法的好处在哪里？
 * 那么我们知道软件开发的一个原则：对修改关闭，对增加开放。很好，这里我后续增加一种支付方式，不需要写if else，直接实现接口就行
 */
@RestController
@RequestMapping("/pay")
public class PlayController {
    private final ConText conText;

    public PlayController(ConText conText) {
        this.conText = conText;
    }

    /**
     * 支付接口
     * @param type 1.微信支付   2.支付宝支付
     * @return
     */
    @GetMapping("/payment")
    public String payment(int type){
        return conText.paymentServiceSelect(type).payment();
    }
}

