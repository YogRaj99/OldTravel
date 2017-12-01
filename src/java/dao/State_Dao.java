
package dao;

import java.sql.SQLException;

import pojo.State;


public class State_Dao extends ConnectionInnitilizer{
    
    public State_Dao() throws Exception{
             conn= dao.DB.getInstance().dataConnection();
        
         if (conn != null) {
            System.out.println("connection success in Test Class......");
     }
        
    
}

     public boolean addState(State st) throws SQLException{
        
        stmt=conn.prepareStatement("insert into state(statename,stateid) values (0,?, ? )");
         int value = stmt.executeUpdate();
        
            stmt.setString(1, st.getState_name());
            stmt.setInt(2, st.getState_id());
            
            
       if (value > 0) {

            return true;
        } else {
            return false;
        }
    }
    
    
    public boolean deleteState(State st)throws Exception{
        
          stmt = conn.prepareStatement("delete from state where state_id=?");
           int value = stmt.executeUpdate();
            stmt.setInt(1, st.getState_id());
            stmt.executeUpdate();
            
             if (value > 0) {

            return true;
        } else {
            return false;
        }

    }
    
     public boolean updateState(State st) throws Exception 
    {
        
       stmt = conn.prepareStatement("update state set state_name=?"+"where state_id=?");
          int value = stmt.executeUpdate();
           stmt.setString(1, st.getState_name());
           
            if (value > 0) {

            return true;
        } else {
            return false;
        }
    }
    
}  