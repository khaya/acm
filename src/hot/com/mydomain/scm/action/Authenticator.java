package com.mydomain.scm.action;

import javax.ejb.Local;

@Local
public interface Authenticator {

    boolean authenticate();

}
