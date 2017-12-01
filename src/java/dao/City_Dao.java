
package dao;

import java.sql.SQLException;
import pojo.City;


public class City_Dao extends ConnectionInnitilizer{

    public City_Dao() throws Exception{
             conn= dao.DB.getInstance().dataConnection();
        
         if (conn != null) {
            System.out.println("connection success in Test Class......");
     }
         
}

 
    
    public boolean addCity(City Cd) throws SQLException{
        
        stmt=conn.prepareStatement("insert into City(city_name,city_id) values (0,?, ? )");
         int value = stmt.executeUpdate();
        //
            stmt.setString(1, Cd.getCity_name());
            stmt.setInt(2, Cd.getCity_id());
            
            
       if (value > 0) {

            return true;
        } else {
            return false;
        }
    }
    
    
    public void deleteCity(City Cd)throws Exception{
        
          stmt = conn.prepareStatement("delete from City where city_id=?");
            // Parameters start with 1
            stmt.setInt(1, Cd.getCity_id());
            stmt.executeUpdate();

    }
    
     public void updateCity (City Cd) throws Exception 
    {
        
       stmt = conn.prepareStatement("update city set city_name=?"+"where city_id=?");
            // Parameters start with 1
           stmt.setString(1, Cd.getCity_name());
           
    }
    
    
}