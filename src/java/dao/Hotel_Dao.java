
package dao;

import pojo.Hotel;


public class Hotel_Dao extends ConnectionInnitilizer{
    
    
    public Hotel_Dao() throws Exception{
    
        conn=DB.getInstance().dataConnection();
        
           if (conn != null) {
            System.out.println("connection success in Test Class......");
     }
    
}

    /* 
    public static void main(String[] args) throws Exception{
        
          Hotel_Dao ht=new Hotel_Dao();
    }
    */
    
    public boolean addHotel(Hotel ht) throws Exception{
    
        
        
          stmt=conn.prepareStatement("insert into hotel(hotel_id,hotel_name,hotel_address) values (0,?, ?, ?, )");
            
        
        int value = stmt.executeUpdate();
       
            stmt.setInt(1, ht.getHotel_id());
            stmt.setString(2, ht.getHotel_name());
            stmt.setString(3, ht.getHotel_address());
           
           
             if (value > 0) {

            return true;
        } else {
            return false;
        }
             
             
             
             
    }
    
     public boolean deleteHotel(Hotel ht) throws Exception{
    
        
        
          stmt=conn.prepareStatement("delete from hotel where hotel_id=?");
            
        
        int value = stmt.executeUpdate();
       
            stmt.setInt(1, ht.getHotel_id());
           
                if (value > 0) {

            return true;
        } else {
            return false;
        }
           
}

 public boolean updateHotel (Hotel ht) throws Exception 
    {
        
       stmt = conn.prepareStatement("update hotel set hotel_name=?, hotel_address=?, hotel_description=?"+"where hotel_id=?");
               int value = stmt.executeUpdate();
           stmt.setString(1, ht.getHotel_name());
            stmt.setString(2, ht.getHotel_address());
            stmt.setString(3, ht.getHotel_description());
              
                  stmt.executeUpdate();
           // stmt.setDate(3, new java.sql.Date(user.getDob().getTime()));
             if (value > 0) {

            return true;
        } else {
            return false;
        }
            

        }
     
     
}

