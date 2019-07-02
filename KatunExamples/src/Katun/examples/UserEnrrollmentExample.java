/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Katun.examples;

import java.util.logging.Level;
import java.util.logging.Logger;
import katun.network.EnrollUserKatun;
import katun.user.KatunUserContext;

/**
 *
 * @author Valeria-Katun
 */
public class UserEnrrollmentExample {
    public static KatunUserContext getKatunUserEnroollment(){
         KatunUserContext katunUser = null;
        try {
            EnrollUserKatun euk = new EnrollUserKatun();
            katunUser = euk.enrollUserKatun("summit", "WBqpDkgBkDdI");
        } catch (Exception ex) {
            Logger.getLogger(UserEnrrollmentExample.class.getName()).log(Level.SEVERE, "ERROR: The user cant not be enrrolled", ex.getMessage());
        }
        return katunUser;
    }
    
    public static void main(String[] args) throws Exception {   
        KatunUserContext enrollUser = getKatunUserEnroollment();
        System.out.println("enrollUser:" + enrollUser);
    }
}
