/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.timx.reminderbot;

import com.sun.jndi.toolkit.url.Uri;
import com.timx.reminderbot.model.ApiAiJSON;
import java.net.MalformedURLException;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

/**
 *
 * @author pacman
 */
@RestController
@RequestMapping("/sample")
public class SampleController {

    @Autowired
    private IEventRepository personRepo;

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public String view() {
    	String URL = "https://api.api.ai/v1/query";
        String date = DateUtils.getTodayDate();
        String sessionId = UUID.randomUUID().toString();
        RestTemplate rt = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer 1ab5cef3becc432eb54a79bacf5f7d85");
        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
        
        String text = "remind to go to gym this afternoon";
        
        UriComponentsBuilder uriComponents = UriComponentsBuilder.fromUriString(URL)
					                			.queryParam("v", date)
					                			.queryParam("query", text)
					                			.queryParam("sessionId", sessionId);
        
//        log.info("Uri builder: ", uriComponents.build().toUri());
//        log.info("Uri builder: ", uriComponents.build().toString());
        
        ResponseEntity<ApiAiJSON> exchange = rt.exchange(uriComponents.build().toUri(), HttpMethod.GET, entity, ApiAiJSON.class);
        return "OK : " + exchange.getBody().getResult().getMetadata().getIntentName();
//        String date = DateUtils.getTodayDate();
//        String sessionId = UUID.randomUUID().toString();
//        RestTemplate rt = new RestTemplate();
//        HttpHeaders headers = new HttpHeaders();
//        headers.set("Authorization", "Bearer 1ab5cef3becc432eb54a79bacf5f7d85");
//        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
//        
//        // iki ven
//        UriComponents uriComponents = UriComponentsBuilder.newInstance()
//                .scheme("https").host("api.api.ai")
//                .path("/v1").path("/query").query("v={keyword}").buildAndExpand("show rock concerts in december");
//        
//        ResponseEntity<ApiAiJSON> exchange = rt.exchange(uriComponents.toUri(), HttpMethod.GET, entity, ApiAiJSON.class);
//        return "OK : " + exchange.getBody().getResult().getMetadata().getIntentName();
    }

}
