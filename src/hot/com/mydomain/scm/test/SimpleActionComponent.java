/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mydomain.scm.test;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;

/**
 *
 * @author khaya
 */
@Name("simpleActionComponent")
@Scope(ScopeType.SESSION)
public class SimpleActionComponent {
    @In
    private SimpleComponent simpleComponent;

    public SimpleComponent getSimpleComponent() {
        if(simpleComponent== null){
            simpleComponent = new SimpleComponent();
        }
        return simpleComponent;
    }

    public void setSimpleComponent(SimpleComponent simpleComponent) {
        this.simpleComponent = simpleComponent;
    }

    public void log(){
        System.out.println("Value of simplecomponent name :" +  simpleComponent.getName());
    }

}
