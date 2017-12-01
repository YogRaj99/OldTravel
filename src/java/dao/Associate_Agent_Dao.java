/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import pojo.Associate_Agent;

/**
 *
 * @author Dnyaneshwar
 */
public class Associate_Agent_Dao extends ConnectionInnitilizer{
    
    
    public Associate_Agent_Dao()throws Exception
    {
        conn=dao.DB.getInstance().dataConnection();
        
        if (conn != null) {
            System.out.println("connection success in Test Class......");
     }
        
        
    }
    
    public static void main(String[] args) throws Exception
    {
       Associate_Agent_Dao Aa=new Associate_Agent_Dao();   
    }
    
    
    public boolean addAssociate(Associate_Agent Aa) throws Exception{
    
        
        
          stmt=conn.prepareStatement("insert into Associate_Agent(id,firmname,name,contact,email,address) values (0,?, ?, ?, ?,?,?.? )");
            
        
        int value = stmt.executeUpdate();
       
            stmt.setInt(1, Aa.getAsso_age_id());
            stmt.setString(2, Aa.getAsso_age_name());
            stmt.setString(3, Aa.getAsso_age_firmname());
            stmt.setInt(4, Aa.getAsso_age_contact());
            stmt.setString(3, Aa.getAsso_age_email());
            stmt.setString(3, Aa.getAsso_age_address());
            stmt.setInt(3, Aa.getAsso_age_joining());
           
             if (value > 0) {

            return true;
        } else {
            return false;
        }
    }
    
    
    public void daleteAssociate(Associate_Agent Aa) throws Exception{
        
        
        stmt=conn.prepareStatement("delete from Associate_Agent where Aucti_id=?");
        
        
            stmt.setInt(1, Aa.getAsso_age_id());
            stmt.executeUpdate();

        
        
    }
    
    
    public void updateAssociate(Associate_Agent Aa) throws Exception{
        
        
         stmt = conn.prepareStatement("update Associate_Agent set asso_age_name=?, asso_age_firmname=?, asso_age_contact=?,asso_age_address, asso_age_email=?"+"where asso_age_id=?");
            // Parameters start with 1
           stmt.setString(1, Aa.getAsso_age_name());
             stmt.setString(2, Aa.getAsso_age_firmname());
               stmt.setInt(3, Aa.getAsso_age_contact());
                 stmt.setString(4, Aa.getAsso_age_address());
                 stmt.setString(5, Aa.getAsso_age_email());
                  stmt.executeUpdate();
        
    }
    
    
    
    
    
}
