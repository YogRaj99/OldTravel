/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import pojo.Customer_Pojo;

public class Customer extends ConnectionInnitilizer {

    public Customer() throws Exception {

        conn = dao.DB.getInstance().dataConnection();

        if (conn != null) {
            System.out.println("connection success in Test Class......");
        }
    }

   

    public boolean addCustomer(Customer_Pojo cust) throws Exception {

        stmt = conn.prepareStatement("insert into Customer(cust_name,cust_contact,cust_email,Address_id) values (0,?, ?, ?, ?)");
            // Parameters start with 1

        int value = stmt.executeUpdate();
        stmt.setInt(1, cust.getCust_id());
        stmt.setString(2, cust.getCust_name());
        stmt.setInt(3, cust.getCust_contact());
        stmt.setString(4, cust.getCust_email());
        stmt.setString(5, cust.getAddress_id());
          
        if (value > 0) {

            return true;
        } else {
            return false;
        }

    }

    /**
     *
     * @param cs
     * @throws Exception
     */
    public boolean deleteCustomer(Customer_Pojo cust) throws Exception {

        stmt = conn.prepareStatement("delete from Customer where cust_id=?");
      int value = stmt.executeUpdate();
      
        stmt.setInt(1, cust.getCust_id());
        stmt.executeUpdate();
        
        if (value > 0) {

            return true;
        } else {
            return false;
        }

    }

    public boolean updateAuction(Customer_Pojo cust) throws Exception {

        stmt = conn.prepareStatement("update Customer set cust_name=?,cust_contact=?, custm_email=?, address_id=?" + "where cut_id=?");
        // Parameters start with 1
        stmt.setString(1, cust.getCust_name());
        stmt.setInt(2,cust.getCust_contact());
        stmt.setString(3, cust.getCust_email());
        stmt.setString(4, cust.getAddress_id());
       int value = stmt.executeUpdate();
        stmt.executeUpdate();
         
        if (value > 0) {

            return true;
        } else {
            return false;
        }
    }

}
