package com.haqqem.coin;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@Slf4j
@RestController
public class GrabController {
    private final WebClient webClient;

    public GrabController(WebClient webClient) {
        this.webClient = webClient;
    }

    @GetMapping("/grab")
    public String main(@RequestParam String url, @RequestParam String xpath) {
        try {
            HtmlPage page = webClient.getPage(url);
            String s = page.getFirstByXPath(xpath).toString();
            log.info(s);
            return s;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "Hello World!";
    }
}
