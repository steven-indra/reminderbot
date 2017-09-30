/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.timx.reminderbot;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 *
 * @author pacman
 */
@Data
public class Address {

    private String place;
    private String street;
    private String district;
    private String province;
    private Geo geo;

}


