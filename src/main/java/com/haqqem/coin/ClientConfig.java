package com.haqqem.coin;

import com.gargoylesoftware.htmlunit.WebClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class ClientConfig {
    @Bean
    WebClient webClient() {
        WebClient client = new WebClient();
        client.getOptions().setJavaScriptEnabled(false);
        client.getOptions().setCssEnabled(false);
        client.getOptions().setDownloadImages(false);
        client.getOptions().setUseInsecureSSL(true);
        client.getOptions().setPopupBlockerEnabled(true);
        client.getOptions().setRedirectEnabled(false);
        client.getOptions().setThrowExceptionOnScriptError(false);
        return client;
    }
}
