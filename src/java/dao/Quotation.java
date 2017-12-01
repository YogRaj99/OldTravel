
package dao;
import pojo.Quotations_Pojo;
public class Quotation extends ConnectionInnitilizer{
    
    
    public Quotation() throws Exception{
        
        conn=DB.getInstance().dataConnection();
        
        if(conn!=null){
            System.out.println("connection success in Test Class......");
               }
        }
        
        
    
    
   public boolean addQuotation (Quotations_Pojo qt)throws Exception{
        
    stmt=conn.prepareStatement("insert into Quotation(quot_id,quot_total_amount) values (1,?, ?)");

         int value = stmt.executeUpdate();
       
            stmt.setInt(1, qt.getQuot_id());
            stmt.setInt(2, qt.getQuot_total_amount());
            
           
           
             if (value > 0) {

            return true;
        } else {
            return false;
        }
             
             
     }
    
    
    public boolean  deleteQuotation(Quotations_Pojo qt)throws Exception{
    
       stmt=conn.prepareStatement("delete from Quotation where quot_id=?");
            
        
        int value = stmt.executeUpdate();
       
            stmt.setInt(1, qt.getQuot_id());
            
             if (value > 0) {

            return true;
        } else {
            return false;
        }
             
   
    }
    
    
    
     public boolean updateQuotation (Quotations_Pojo qt) throws Exception 
    {
        
       stmt = conn.prepareStatement("update Quotation set quot_total_amount=?"+"where quot_id=?");
               int value = stmt.executeUpdate();
           stmt.setInt(1, qt.getQuot_total_amount());
           
         stmt.executeUpdate();
          
             if (value > 0) {

            return true;
        } else {
            return false;
        }
            

        }
     
    
    
    }
    

