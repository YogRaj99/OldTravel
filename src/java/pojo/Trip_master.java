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
public class Trip_master {
    
   private int trip_master_id;
   private int trip_confirmdate;
   private int quot_id;    //(fk) (here changes)
   private int  Auc_id;   //(fk)  (here changes)
  private int travel_age_id;  //  (fk)  (here changes)

    /**
     * @return the trip_master_id
     */
    public int getTrip_master_id() {
        return trip_master_id;
    }

    /**
     * @param trip_master_id the trip_master_id to set
     */
    public void setTrip_master_id(int trip_master_id) {
        this.trip_master_id = trip_master_id;
    }

    /**
     * @return the trip_confirmdate
     */
    public int getTrip_confirmdate() {
        return trip_confirmdate;
    }

    /**
     * @param trip_confirmdate the trip_confirmdate to set
     */
    public void setTrip_confirmdate(int trip_confirmdate) {
        this.trip_confirmdate = trip_confirmdate;
    }

    /**
     * @return the quot_id
     */
    public int getQuot_id() {
        return quot_id;
    }

    /**
     * @param quot_id the quot_id to set
     */
    public void setQuot_id(int quot_id) {
        this.quot_id = quot_id;
    }

    /**
     * @return the Aucti_id
     */
    public int getAuc_id() {
        return Auc_id;
    }

    /**
     * @param Aucti_id the Aucti_id to set
     */
    public void setAuc_id(int Auc_id) {
        this.Auc_id = Auc_id;
    }

    /**
     * @return the Trav_id
     */
    public int getTravel_age_id() {
        return  travel_age_id;
    }

    /**
     * @param Trav_id the Trav_id to set
     */
    public void setTravel_age_id(int  travel_age_id) {
        this. travel_age_id =  travel_age_id;
    }
    
}
