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
public class Associate_Agent {
   
    
     
    private int asso_age_id;
     private String asso_age_name;    
      private String asso_age_firmname;
       private int asso_age_contact;
        private String asso_age_email;
         private String asso_age_address;
         private int asso_age_joining;
         
         private int travel_age_id; ////(fk)
         private int city_id;  //(fk)
         private int country_id; //(fk)
          private int state_id; //(fk)

    /**
     * @return the asso_age_id
     */
    public int getAsso_age_id() {
        return asso_age_id;
    }

    /**
     * @param asso_age_id the asso_age_id to set
     */
    public void setAsso_age_id(int asso_age_id) {
        this.asso_age_id = asso_age_id;
    }

    /**
     * @return the asso_age_name
     */
    public String getAsso_age_name() {
        return asso_age_name;
    }

    /**
     * @param asso_age_name the asso_age_name to set
     */
    public void setAsso_age_name(String asso_age_name) {
        this.asso_age_name = asso_age_name;
    }

    /**
     * @return the asso_age_firmname
     */
    public String getAsso_age_firmname() {
        return asso_age_firmname;
    }

    /**
     * @param asso_age_firmname the asso_age_firmname to set
     */
    public void setAsso_age_firmname(String asso_age_firmname) {
        this.asso_age_firmname = asso_age_firmname;
    }

    /**
     * @return the asso_age_contact
     */
    public int getAsso_age_contact() {
        return asso_age_contact;
    }

    /**
     * @param asso_age_contact the asso_age_contact to set
     */
    public void setAsso_age_contact(int asso_age_contact) {
        this.asso_age_contact = asso_age_contact;
    }

    /**
     * @return the asso_age_email
     */
    public String getAsso_age_email() {
        return asso_age_email;
    }

    /**
     * @param asso_age_email the asso_age_email to set
     */
    public void setAsso_age_email(String asso_age_email) {
        this.asso_age_email = asso_age_email;
    }

    /**
     * @return the asso_age_address
     */
    public String getAsso_age_address() {
        return asso_age_address;
    }

    /**
     * @param asso_age_address the asso_age_address to set
     */
    public void setAsso_age_address(String asso_age_address) {
        this.asso_age_address = asso_age_address;
    }

    /**
     * @return the asso_age_joining
     */
    public int getAsso_age_joining() {
        return asso_age_joining;
    }

    /**
     * @param asso_age_joining the asso_age_joining to set
     */
    public void setAsso_age_joining(int asso_age_joining) {
        this.asso_age_joining = asso_age_joining;
    }

    /**
     * @return the travel_age_id
     */
    public int getTravel_age_id() {
        return travel_age_id;
    }

    /**
     * @param travel_age_id the travel_age_id to set
     */
    public void setTravel_age_id(int travel_age_id) {
        this.travel_age_id = travel_age_id;
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
}
