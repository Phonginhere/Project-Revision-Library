/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project2.com.dao;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author FR
 */
public class Utils {
      public static String getMd5( String input ) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");

            if (input != null) {
                md.update(input.getBytes());
            }
            md.update(input.getBytes());

            byte byteData[] = md.digest();

            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < byteData.length; i++) {
                sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
            }
            return sb.toString();
        } // For specifying wrong message digest algorithms 
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    
}
