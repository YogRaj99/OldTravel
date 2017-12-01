/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import pojo.vehicle_Category;

/**
 *
 * @author Dnyaneshwar
 */
public class Vehicle_Category_Dao extends ConnectionInnitilizer{

    
    
    
    public Vehicle_Category_Dao() throws Exception{
        
        
        conn=DB.getInstance().dataConnection();
        
           if (conn != null) {
            System.out.println("connection success in Test Class......");
     }
    }
    
      
    public boolean addVehicleCat(vehicle_Category vehicle_cat) throws Exception{
    
        
        
          stmt=conn.prepareStatement("insert into Vehicle_Category (vehicle_cat_id,vehicle_cat_name) values (0,?, ?, )");
            
        
        int value = stmt.executeUpdate();
       
            stmt.setInt(1, vehicle_cat.getVehicle_cat_id());
            stmt.setString(2, vehicle_cat.getVehicle_cat_name());
           
           
           
             if (value > 0) {

            return true;
        } else {
            return false;
        }
             
             
             
             
    
}
    
     public boolean deleteVehicleCat(vehicle_Category vehicle_cat ) throws Exception{
    
        
        
          stmt=conn.prepareStatement("delete from Vehicle_category where vehicle_cat_id=?");
            
        
        int value = stmt.executeUpdate();
       
            stmt.setInt(1, vehicle_cat.getVehicle_cat_id());
       
            
             if (value > 0) {

            return true;
        } else {
            return false;
        }
            
           
}

 public boolean updateVehicleCat(vehicle_Category vehicle_cat) throws Exception 
    {
        
       stmt = conn.prepareStatement("update Vehicle_Category set vehicle_cat_name=?"+"where vehicle_cat_id=?");
             int value = stmt.executeUpdate();
             
            
            stmt.setString(2, vehicle_cat.getVehicle_cat_name());
            
              
                  stmt.executeUpdate();
           // stmt.setDate(3, new java.sql.Date(user.getDob().getTime()));
         
           
             if (value > 0) {

            return true;
        } else {
            return false;
        } 

        }

    
   }
