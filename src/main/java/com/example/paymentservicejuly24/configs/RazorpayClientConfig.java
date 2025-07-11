package com.example.paymentservicejuly24.configs;

import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RazorpayClientConfig {
    @Value("${razorpay.key.id}")
    private String razorpayKeyId;

    @Value("${razorpay.key.secret}")
    private String razorpayKeySecret;

    @Bean
    public RazorpayClient createRazorpayClient() throws RazorpayException {
        // This is a random print statement to test git commands.
        System.out.println("Adding a random print statement to test git commands.");

        return new RazorpayClient(razorpayKeyId, razorpayKeySecret);
    }
}
