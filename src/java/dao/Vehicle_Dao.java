package dao;

import pojo.Vehicle;


 
public class Vehicle_Dao  extends ConnectionInnitilizer{
    
    public Vehicle_Dao() throws Exception{
        
        
        
        conn=DB.getInstance().dataConnection();
    
     if (conn != null)
      {
            System.out.println("connection success in Test Class......");
   }
      
      
    }
    
    
    
    
    
     
    public boolean addVehicle(Vehicle vehi) throws Exception{
    
        
        
     stmt=conn.prepareStatement("insert into Vehicle(vehicle_id,vehicle_no,vehicle_driver,vehicle_model,vehicle_company,vehicle_status) values (0,?, ?, ?,?,?,? )");
            
        
        int value = stmt.executeUpdate();
       
            stmt.setInt(1, vehi.getVehicle_id());
            stmt.setInt(2, vehi.getVehicle_no());
            stmt.setString(3, vehi.getVehicle_driver());
            stmt.setString(4, vehi.getVehicle_model());
            stmt.setString(5, vehi.getVehicle_company());
            stmt.setString(6, vehi.getVehicle_driver());
           
           
             if (value > 0) {

            return true;
        } else {
            return false;
        }
             
             
             
             
    }
    
     public boolean deleteVehicle(Vehicle vehi) throws Exception{
    
        
        
          stmt=conn.prepareStatement("delete from Vehicle  where vehicle_id=?");
            
        
        int value = stmt.executeUpdate();
       
            stmt.setInt(1, vehi.getVehicle_id());
           
                if (value > 0) {

            return true;
        } else {
            return false;
        }
           
}

 public boolean updateVehicle  (Vehicle vehi) throws Exception 
    {
        
       stmt = conn.prepareStatement("update hotel set vehicle_no=?,vehicle_driver=?,vehicle_model=?,vehicle_company=?,vehicle_status=?"+"where vehicle_id=?");
               
       int value = stmt.executeUpdate();
               
               
           
            stmt.setInt(1, vehi.getVehicle_no());
            stmt.setString(2, vehi.getVehicle_driver());
            stmt.setString(3, vehi.getVehicle_model());
            stmt.setString(4, vehi.getVehicle_company());
            stmt.setString(5, vehi.getVehicle_status());
            
              
                  stmt.executeUpdate();
           // stmt.setDate(3, new java.sql.Date(user.getDob().getTime()));
             if (value > 0) {

            return true;
        } else {
            return false;
        }
            

        }
     
   
    
}
