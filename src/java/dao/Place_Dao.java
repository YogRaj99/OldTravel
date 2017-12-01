package dao;

import java.sql.SQLException;
import pojo.Place;


public class Place_Dao extends ConnectionInnitilizer{
    
    
     public Place_Dao() throws Exception{
             conn= dao.DB.getInstance().dataConnection();
        
         if (conn != null) {
            System.out.println("connection success in Test Class......");
     }
        
    
}

     public boolean addPlace(Place pla) throws SQLException{
        
        stmt=conn.prepareStatement("insert into Place(place_name,place_id) values (0,?, ? )");
         int value = stmt.executeUpdate();
        
            stmt.setString(1, pla.getPlace_name());
            stmt.setInt(2, pla.getPlace_id());
            
            
       if (value > 0) {

            return true;
        } else {
            return false;
        }
    }
    
    
    public boolean deletePlace(Place pla)throws Exception{
        
          stmt = conn.prepareStatement("delete from Place where place_id=?");
           int value = stmt.executeUpdate();
            stmt.setInt(1, pla.getPlace_id());
            stmt.executeUpdate();
            
             if (value > 0) {

            return true;
        } else {
            return false;
        }

    }
    
     public boolean updatePlace(Place pla) throws Exception 
    {
        
       stmt = conn.prepareStatement("update Place set place_name=?"+"where place_id=?");
          int value = stmt.executeUpdate();
           stmt.setString(1, pla.getPlace_name());
           
            if (value > 0) {

            return true;
        } else {
            return false;
        }
    }
   
    
}
