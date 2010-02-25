/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mydomain.scm.test;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;

/**
 *
 * @author khaya
 */
@Name("simpleComponent")
@Scope(ScopeType.SESSION)
public class SimpleComponent {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
