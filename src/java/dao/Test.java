/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import pojo.Auctions_Pojo;

/**
 *
 * @author Dnyaneshwar
 */
public class Test extends ConnectionInnitilizer {

    public Test() throws Exception {
        conn = dao.DB.getInstance().dataConnection();
        if (conn != null) {
            System.out.println("connection success in Test Class......");
        }

    }

    public static void main(String[] args) throws Exception {
        Test t = new Test();
    }

    public boolean Adddat(Auctions_Pojo a) throws Exception {
        stmt = conn.prepareStatement("insert inyto t values(0,?,?,?)");
        stmt.setString(1, a.getAuc_fromplaceid());
        int value = stmt.executeUpdate();
        if (value > 0) {

            return true;
        } else {
            return false;
        }
    }
    
}
