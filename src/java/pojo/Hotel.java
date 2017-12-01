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
public class Hotel {
            private int hotel_id;
            private int hotel_cat_id;
            private String hotel_name;
            private String hotel_address;
            private String hotel_description;
            private int city_id; 
	    private int state_id ;
	    private int country_id ;

    /**
     * @return the hotel_id
     */
    public int getHotel_id() {
        return hotel_id;
    }

    /**
     * @param hotel_id the hotel_id to set
     */
    public void setHotel_id(int hotel_id) {
        this.hotel_id = hotel_id;
    }

    /**
     * @return the hotel_cat_id
     */
    public int getHotel_cat_id() {
        return hotel_cat_id;
    }

    /**
     * @param hotel_cat_id the hotel_cat_id to set
     */
    public void setHotel_cat_id(int hotel_cat_id) {
        this.hotel_cat_id = hotel_cat_id;
    }

    /**
     * @return the hotel_name
     */
    public String getHotel_name() {
        return hotel_name;
    }

    /**
     * @param hotel_name the hotel_name to set
     */
    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    /**
     * @return the hotel_address
     */
    public String getHotel_address() {
        return hotel_address;
    }

    /**
     * @param hotel_address the hotel_address to set
     */
    public void setHotel_address(String hotel_address) {
        this.hotel_address = hotel_address;
    }

    /**
     * @return the hotel_description
     */
    public String getHotel_description() {
        return hotel_description;
    }

    /**
     * @param hotel_description the hotel_description to set
     */
    public void setHotel_description(String hotel_description) {
        this.hotel_description = hotel_description;
    }

    /**
     * @return the city_id
     */
    public int getCity_id() {
        return city_id;
    }

    /**
     * @param city_id the city_id to set
     */
    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    /**
     * @return the state_id
     */
    public int getState_id() {
        return state_id;
    }

    /**
     * @param state_id the state_id to set
     */
    public void setState_id(int state_id) {
        this.state_id = state_id;
    }

    /**
     * @return the country_id
     */
    public int getCountry_id() {
        return country_id;
    }

    /**
     * @param country_id the country_id to set
     */
    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }
            
    
}
