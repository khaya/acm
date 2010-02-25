/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mydomain.scm.options;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;

/**
 *
 * @author khaya
 */
@Name("userOptions")
@Scope(ScopeType.SESSION)
public class UserOptions {

    @In
    private AppOptions appOptions;
    private String skin;

    public String getSkin() {
        if (skin == null) {
            skin = appOptions.getDefaultSkin();
        }
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }
}
