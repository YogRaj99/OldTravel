
package dao;

import java.sql.SQLException;
import pojo.Country;

public class Country_Dao extends ConnectionInnitilizer{
    
    
    public Country_Dao() throws Exception{
             conn= dao.DB.getInstance().dataConnection();
        
         if (conn != null) {
            System.out.println("connection success in Test Class......");
     }
         
}

   
    
    public boolean addCountry(Country cd) throws SQLException{
        
        stmt=conn.prepareStatement("insert into country(Country_name,Country_id) values (0,?, ? )");
         int value = stmt.executeUpdate();
        //
             stmt.setString(1, cd.getCountry_name());
            stmt.setInt(2, cd.getCountry_id());
            
            
       if (value > 0) {

            return true;
        } else {
            return false;
        }
    }
    
    
    public boolean deleteCity( Country cd)throws Exception{
        
          stmt = conn.prepareStatement("delete from Country where country_id=?");
           int value = stmt.executeUpdate();
            stmt.setInt(1, cd.getCountry_id());
            stmt.executeUpdate();
            
             if (value > 0) {

            return true;
        } else {
            return false;
        }

    }
    
     public boolean updateAuction (Country cd) throws Exception 
    {
        
       stmt = conn.prepareStatement("update country set country_name=?"+"where country_id=?");
          int value = stmt.executeUpdate();
           stmt.setString(1, cd.getCountry_name());
           
           if (value > 0) {

            return true;
        } else {
            return false;
        }
          
    }
    
    
}
