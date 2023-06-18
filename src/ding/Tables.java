/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ding;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author knara
 */
public class Tables {
    public static void main (String[] args){
        try {
        Connection con;
            con = ConnectionProvider.getCon();
        Statement st=con.createStatement();
        st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT primary key,userRole varchar(200),name varchar(200),dob varchar(60),mobileNumber varchar(50),email varchar(200),username varchar(200),password varchar(50),address varchar(200))");
        st.executeUpdate("insert into appuser(userRole,name,dob,mobileNumber,email,username,password,address) values('Admin','Admin','12-03-1991','0000001111','admin@email.com','wishnew','admin','India')");
        st.executeUpdate("create table medicine(medicine_pk int AUTO_INCREMENT primary key,uniqueId varchar(200),name varchar(200),companyName varchar(200),quantity bigint,price bigint)");
        st.executeUpdate("create table bill(bill_pk int AUTO_INCREMENT primary key,bilId varchar(200),billDate varchar(200),totalPaid bigint,generatedBy varchar(5))");
        JOptionPane.showMessageDialog(null,"Table created successfully");}
        catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    
}
}