/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import pojo.QuoteDetails_Pojo;

/**
 *
 * @author Dnyaneshwar
 */
public class Quotation_Details  extends ConnectionInnitilizer{
    
    
    public Quotation_Details() throws Exception{
        
        
        conn=DB.getInstance().dataConnection();
        
         if(conn!=null){
            System.out.println("connection success in Test Class......");
               }
        }
        
        
        
    public boolean addQuotation_Details(QuoteDetails_Pojo quot_Det) throws Exception{
        
        stmt=conn.prepareStatement("insert into Quotation(quot_details_id,quot_details_items,quot_details_quantity,Quot_details_rate,Quot_details_total) values (1,?,? ,?,?,?)");

         int value = stmt.executeUpdate();
               stmt.setInt(1, quot_Det.getQuot_details_id());
               stmt.setString(2, quot_Det.getQuot_details_items());
                stmt.setInt(3, quot_Det.getQuot_details_quantity());
                stmt.setInt(4, quot_Det.getQuot_details_rate());
                stmt.setInt(5, quot_Det.getQuot_details_total());
            
           
           
             if (value > 0) {

            return true;
        } else {
            return false;
        }
        
    }

    public boolean  deleteQuotation_Details(QuoteDetails_Pojo quot_Det)throws Exception{
    
       stmt=conn.prepareStatement("delete from Quotation_Details where quot_details_id=?");
            
        
        int value = stmt.executeUpdate();
       
            stmt.setInt(1, quot_Det.getQuot_details_id());
            
             if (value > 0) {

            return true;
        } else {
            return false;
        }
             
   
    }
    
    
    
    
     
     public boolean updateQuotation_Details (QuoteDetails_Pojo quot_Det) throws Exception 
    {
        
       stmt = conn.prepareStatement("update  set quot_details_quantity=?, quot_details_items=?,quot_details_rate=?,Quot_details_total=?"+"where quot_details_id=?");
               int value = stmt.executeUpdate();
           stmt.setInt(1, quot_Det.getQuot_details_quantity());
           stmt.setString(1, quot_Det.getQuot_details_items());
           stmt.setInt(1, quot_Det.getQuot_details_rate());
           stmt.setInt(1, quot_Det.getQuot_details_total());
           
           
         stmt.executeUpdate();
          
             if (value > 0) {

            return true;
        } else {
            return false;
        }
            

        }
     
    
    
    
    
    
    
    
    
    
    
    }
    

