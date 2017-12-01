/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author Dnyaneshwar
 */
public class Country {
    
   private int country_id;
    private String country_name;

    /**
     * @return the Country_id
     */
    public int getCountry_id() {
        return country_id;
    }

    /**
     * @param Country_id the Country_id to set
     */
    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    /**
     * @return the Country_name
     */
    public String getCountry_name() {
        return country_name;
    }

    /**
     * @param Country_name the Country_name to set
     */
    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }
    
}
