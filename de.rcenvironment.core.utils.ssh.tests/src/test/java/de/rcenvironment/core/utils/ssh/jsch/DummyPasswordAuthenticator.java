/*
 * Copyright (C) 2006-2014 DLR, Germany
 * 
 * All rights reserved
 * 
 * http://www.rcenvironment.de/
 */
 
package de.rcenvironment.core.utils.ssh.jsch;

import org.apache.sshd.server.PasswordAuthenticator;
import org.apache.sshd.server.session.ServerSession;

/**
 * Test implementation of {@link PasswordAuthenticator}.
 * 
 * @author Doreen Seider
 */
public class DummyPasswordAuthenticator implements PasswordAuthenticator {

    /** User name. */
    public static final String USERNAME = "aUser";
    
    /** Unknown user name. */
    public static final String USERNAME_UNKNOWN = "unknownUser";
    
    /** Password. */
    public static final String PASSWORD = "passwd";

    /** Invalid password. */
    public static final String PASSWORD_INVALID = "invalidPasswd";

    @Override
    public boolean authenticate(String username, String password, ServerSession session) {
        boolean authenticated = false;
        if (username.equals(USERNAME) && password.equals(PASSWORD)) {
            authenticated = true;
        }
        return authenticated;
    }
    
}
