
package dao;

import pojo.Hotel_Category;



public class Hotel_Category_Dao extends ConnectionInnitilizer{
    
    
     public Hotel_Category_Dao() throws Exception{
    
        conn=DB.getInstance().dataConnection();
        
           if (conn != null) {
            System.out.println("connection success in Test Class......");
     }
    
}

     
  /*  public static void main(String[] args) throws Exception{
        
          Hotel_Dao htc=new Hotel_Dao();
    } */
    
    
    public boolean addHotel(Hotel_Category htc) throws Exception{
    
        
        
          stmt=conn.prepareStatement("insert into hotel_Category (hotel_cat_id,hotel_cat_name) values (0,?, ?, )");
            
        
        int value = stmt.executeUpdate();
       
            stmt.setInt(1, htc.getHotel_cat_id());
            stmt.setString(2, htc.getHotel_cat_name());
           
           
           
             if (value > 0) {

            return true;
        } else {
            return false;
        }
             
             
             
             
    
}
    
     public boolean deleteHotel(Hotel_Category htc) throws Exception{
    
        
        
          stmt=conn.prepareStatement("delete from hotel_category where hotel_cat_id=?");
            
        
        int value = stmt.executeUpdate();
       
            stmt.setInt(1, htc.getHotel_cat_id());
       
            
             if (value > 0) {

            return true;
        } else {
            return false;
        }
            
           
}

 public boolean updateAuction (Hotel_Category htc) throws Exception 
    {
        
       stmt = conn.prepareStatement("update hotel set hotel_name=?, hotel_address=?, hotel_description=?"+"where hotel_id=?");
             int value = stmt.executeUpdate();
             
             stmt.setInt(1, htc.getHotel_cat_id());
            stmt.setString(2, htc.getHotel_cat_name());
            
              
                  stmt.executeUpdate();
           // stmt.setDate(3, new java.sql.Date(user.getDob().getTime()));
         
           
             if (value > 0) {

            return true;
        } else {
            return false;
        } 

        }

    
}