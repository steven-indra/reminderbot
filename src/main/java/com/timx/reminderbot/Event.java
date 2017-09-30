/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.timx.reminderbot;

import java.util.Date;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Agustinus_A7234
 */
@Data
public class Event {
    
    @Id
    private String id;
    private String title;
    private String description;
    private Date date;
    private String type;
    private Address address;
    private String[] imgurls;

    
}
