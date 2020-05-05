package com.robkinsey.app;

import java.util.logging.Logger;
import java.util.logging.Level;

/**
 * This application will use a woodstove to heat a room.
 *
 */
public class App 
{
    private final static Logger LOGGER = Logger.getLogger(App.class.getName());

    public static void main( String[] args )
    {
      LOGGER.setLevel(Level.INFO);  
      LOGGER.info( "The room is now toasty." );
    }
}
