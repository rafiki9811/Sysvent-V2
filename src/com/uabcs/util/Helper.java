/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uabcs.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Admin
 */
public class Helper {
    
     public static String hash1(String data) throws NoSuchAlgorithmException {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
    md.update(data.getBytes());
    return bytesTohex(md.digest());
    
            }

    private static String bytesTohex(byte[] bytes) {
        StringBuffer result = new StringBuffer();
        for (byte byt : bytes) result.append(Integer.toString((byt & 0xff) + 0x100, 16 ).substring(1));
        return result.toString();
//To change body of generated methods, choose Tools | Templates.
    }
    
}
