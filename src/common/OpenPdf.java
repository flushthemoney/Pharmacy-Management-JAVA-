/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import ding.PharmacyUtils;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author knara
 */
public class OpenPdf {
    public static void openById(String id){
        try{
        if((new File(PharmacyUtils.billPath+id+".pdf")).exists()){
        Process P;
            P = Runtime
                    .getRuntime()
                    .exec("rundll32 url.dll,FileProtocolHandler "+PharmacyUtils.billPath+""+id+".pdf");
}
        else{
        JOptionPane.showMessageDialog(null,"File is not exist");}}
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);}
    }
    
}
