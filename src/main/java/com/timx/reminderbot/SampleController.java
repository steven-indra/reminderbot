/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.timx.reminderbot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
        return "OK : " + personRepo.findAll().toString();
    }
    
}
