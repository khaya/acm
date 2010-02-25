/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mydomain.scm.utils;

/**
 *
 * @author khaya
 */
public class PasswordUtils {

    public static String getRandomPassword(){
        return ""+ RandomGenerator.getInstance().nextInt(999999, 9999999);
    }

}
