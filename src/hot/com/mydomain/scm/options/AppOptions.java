/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mydomain.scm.options;

import java.util.List;
import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.annotations.Startup;
import org.jboss.seam.annotations.Synchronized;

/**
 *
 * @author khaya
 */
@Name("appOptions")
@Scope(ScopeType.APPLICATION)
@Startup
@Synchronized
public class AppOptions {

    private String defaultSkin;
    private List<String> availableSkins;
    private List<String> reservedWords;

    public List<String> getReservedWords() {
        return reservedWords;
    }

    public void setReservedWords(List<String> reservedWords) {
        this.reservedWords = reservedWords;
    }


    public List<String> getAvailableSkins() {
        return availableSkins;
    }

    public void setAvailableSkins(List<String> availableSkins) {
        this.availableSkins = availableSkins;
    }

    public String getDefaultSkin() {
        return defaultSkin;
    }

    public void setDefaultSkin(String defaultSkin) {
        this.defaultSkin = defaultSkin;
    }

    

}
