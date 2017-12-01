/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import pojo.Travel_Agent;


public class Travel_Agent_Dao  extends ConnectionInnitilizer{  
    
    public Travel_Agent_Dao() throws Exception{
        
        conn=DB.getInstance().dataConnection();
         if(conn!=null){
            System.out.println("connection success in Test Class......");
               }
    } 
    
    
  public boolean addTravel_Agent(Travel_Agent tra_age) throws Exception {
      
     stmt = conn.prepareStatement("insert into Travel_Agent(travel_age_id,travel_age_name,travel_age_firmname,travel_age_contact,travel_age_email,travel_age_address) values (1,?, ?, ?, ?,?.?)");
       

        int value = stmt.executeUpdate();
        stmt.setInt(1, tra_age.getTravel_age_id());
        stmt.setString(2, tra_age.getTravel_age_name());
        stmt.setString(3, tra_age.getTravel_age_firmname());
        stmt.setInt(4, tra_age.getTravel_age_contact());
        stmt.setString(5, tra_age.getTravel_age_email());
        stmt.setString(6, tra_age.getTravel_age_address());
          
        if (value > 0) {

            return true;
        } else {
            return false;
        }    
}
        
     
  public boolean deleteTravel_Agent(Travel_Agent tra_age) throws Exception {
      
       stmt=conn.prepareStatement("delete from Travel_Agent where travel_age_id=?");
        

        int value = stmt.executeUpdate();
        stmt.setInt(1, tra_age.getTravel_age_id());
       
        if (value > 0) {

            return true;
        } else {
            return false;
        }

  }    
    
    
    
  public boolean updateTravel_Agent(Travel_Agent tra_age) throws Exception {
      
     stmt = conn.prepareStatement("update Travel_Agent set travel_age_name=?, travel_age_firmname=?,travel_age_contact=?,travel_age_email=?,travel_age_address=?"+"where travel_age_id=?");
     
        int value = stmt.executeUpdate();
   
        stmt.setString(1, tra_age.getTravel_age_name());
        stmt.setString(2, tra_age.getTravel_age_firmname());
        stmt.setInt(3, tra_age.getTravel_age_contact());
        stmt.setString(4, tra_age.getTravel_age_email());
        stmt.setString(5, tra_age.getTravel_age_address());
          
        if (value > 0) {

            return true;
        } else {
            return false;
        }    
}
    
    
   
}
    
    
