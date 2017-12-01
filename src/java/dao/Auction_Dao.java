package dao;
import pojo.Auctions_Pojo;


public class Auction_Dao extends ConnectionInnitilizer{
    
       public Auction_Dao() throws Exception
    {
        conn= dao.DB.getInstance().dataConnection();
        
         if (conn != null) {
            System.out.println("connection success in Test Class......");
     }
         

        
        
    }

    
    
    
    public boolean addAuctions(Auctions_Pojo ad) throws Exception{
     
        stmt=conn.prepareStatement("insert into Auctions(firstname,lastname,dob,email) values (0,?, ?, ?, ?,?,?.? )");
            // Parameters start with 1
        
        int value = stmt.executeUpdate();
        //
            stmt.setInt(1, ad.getAuc_id());
           stmt.setInt(2, ad.getAuc_date());
           stmt.setString(3, ad.getAuc_fromplaceid());
           stmt.setString(4, ad.getAuc_toplaceid());
           stmt.setInt(5, ad.getAuc_fromdate());
            stmt.setInt(6, ad.getAuc_todate());
             stmt.setInt(7, ad.getAuc_no_adults());
              stmt.setInt(8, ad.getAuc_no_childrens());
           // stmt.setDate(3, new java.sql.Date(Au_Dao.getDob().getTime()));
           
            //stm.executeUpdate();

       if (value > 0) {

            return true;
        } else {
            return false;
        }
        }
    
    
    public boolean deleteAuction( Auctions_Pojo ad) throws Exception{
        
            stmt = conn.prepareStatement("delete from Auctions where Aucti_id=?");
             int value = stmt.executeUpdate();
            stmt.setInt(1, ad.getAuc_id());
            stmt.executeUpdate();
            
              if (value > 0) {

            return true;
        } else {
            return false;
        }

    }

    public boolean updateAuction (Auctions_Pojo ad) throws Exception 
    {
        
       stmt = conn.prepareStatement("update Auction set Aucti_date=?, Aucti_fromplaceid=?, Aucti_fromdate=?, Aucti_todate=?"+"where Aucti_id=?");
            int value = stmt.executeUpdate();
           stmt.setInt(1, ad.getAuc_date());
             stmt.setString(2, ad.getAuc_fromplaceid());
               stmt.setInt(3, ad.getAuc_fromdate());
                 stmt.setInt(4, ad.getAuc_todate());
                  stmt.executeUpdate();
           // stmt.setDate(3, new java.sql.Date(user.getDob().getTime()));
         
            
              if (value > 0) {

            return true;
        } else {
            return false;
        }

        }
    }

    


