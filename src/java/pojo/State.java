/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;


public class State {
    
    private int state_id;
     private String state_name;
      private int conntry_id;
     //  private int state_id;

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
     * @return the state_name
     */
    public String getState_name() {
        return state_name;
    }

    /**
     * @param state_name the state_name to set
     */
    public void setState_name(String state_name) {
        this.state_name = state_name;
    }

    /**
     * @return the conntry_id
     */
    public int getConntry_id() {
        return conntry_id;
    }

    /**
     * @param conntry_id the conntry_id to set
     */
    public void setConntry_id(int conntry_id) {
        this.conntry_id = conntry_id;
    }
    
    
}
