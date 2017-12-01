
package dao;

import pojo.Guide;


public class Guide_Dao extends ConnectionInnitilizer {
    
    public Guide_Dao() throws Exception{

      conn= dao.DB.getInstance().dataConnection();
        
         if (conn != null) {
            System.out.println("connection success in Test Class......");
     }
    }
    
    
  /*  public static void main(String[] args) throws Exception{
        
          Guide_Dao gd=new Guide_Dao();
    }*/

    
    public boolean addGuide(Guide gd) throws Exception{
    
        
        
          stmt=conn.prepareStatement("insert into guide(guide_id,guide_name,guide_contact,guide_email,guide_address) values (0,?, ?, ?, ?,?)");
            
        
        int value = stmt.executeUpdate();
       
            stmt.setInt(1, gd.getGuide_id());
            stmt.setString(2, gd.getGuide_name());
            stmt.setInt(3, gd.getGuide_contact());
            stmt.setString(4, gd.getGuide_email());
            stmt.setString(3, gd.getGuide_address());
            
           
             if (value > 0) {

            return true;
        } else {
            return false;
        }
             
             
    }
    
    
     public boolean deleteGuide(Guide gd) throws Exception{
    
        
        
          stmt=conn.prepareStatement("delete from Guide where Guide_id=?");
            
        
        int value = stmt.executeUpdate();
       
            stmt.setInt(1, gd.getGuide_id());
      
            
              if (value > 0) {

            return true;
        } else {
            return false;
        }
           
}

     
      public boolean updateAuction (Guide gd) throws Exception 
    {
        
       stmt = conn.prepareStatement("update guide set guide_name=?, guide_contact=?, guide_email=?, guide_address=?"+"where guide_id=?");
           int value = stmt.executeUpdate();
           
             stmt.setString(1, gd.getGuide_name());
               stmt.setInt(2, gd.getGuide_contact());
                 stmt.setString(1, gd.getGuide_email());
                   stmt.setString(1, gd.getGuide_address());
               
               stmt.executeUpdate();
           // stmt.setDate(3, new java.sql.Date(user.getDob().getTime()));
         
              if (value > 0) {

            return true;
        } else {
            return false;
        }

        }
     
     
}