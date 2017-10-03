/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.timx.reminderbot;

import com.sun.jndi.toolkit.url.Uri;
import com.timx.reminderbot.model.WitAiPOJO;
import java.net.MalformedURLException;
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
//        Pageable limit = new PageRequest(0,10);
        RestTemplate rt = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer ETJQLX67SUQU4YE4XIBGH66NWZCTLDJU");
        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme("https").host("api.wit.ai")
                .path("/message").query("q={keyword}").buildAndExpand("show rock concerts in december");
//        String url = "https://api.wit.ai/message?v=03/10/2017&q=show%20concerts%20in%20august";
        ResponseEntity<WitAiPOJO> exchange = rt.exchange(uriComponents.toUri(), HttpMethod.GET, entity, WitAiPOJO.class);
        return "OK : " + exchange.getBody().getEntities().getIntent().get(0).getValue();
    }
    
}
