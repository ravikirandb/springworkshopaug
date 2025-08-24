package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.payment.CardPayment;
import com.example.payment.NetBankingPayment;
import com.example.payment.UpiPayment;

@Configuration
//class with bean definition
public class AppConfig {
	
	//this is the bean definition
	@Bean
	@Primary //IPaymentProcessor process - new CardPayment();
	//the method name is the bean name
	CardPayment cardPay(){
		return new CardPayment();
	}
	
	@Bean
	NetBankingPayment netPay(){
		return new NetBankingPayment();
	}
	
	@Bean
	UpiPayment upiPay(){
		return new UpiPayment();
	}
}
