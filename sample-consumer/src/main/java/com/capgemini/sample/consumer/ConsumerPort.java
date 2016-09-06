package com.capgemini.sample.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by chrisw on 20/06/2016.
 */

@Component
public class ConsumerPort {
    private String url;
    private RestTemplate restTemplate;

    @Autowired
    public ConsumerPort(@Value("${producer}") String url) {
        this.url = url;
        this.restTemplate = new RestTemplate();
    }

    public String customers() {
        return restTemplate.getForEntity(url + "/customers/1", String.class).getBody();
    }
}
