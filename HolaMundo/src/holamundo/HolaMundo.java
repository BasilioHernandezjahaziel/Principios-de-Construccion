/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/**
 *
 * @author jahaziel1999
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Logger logger=Logger.getLogger(HolaMundo.class.getName());
        LogRecord r=new LogRecord(Level.INFO,"HOLA MUNDO!");
        logger.log(r);
    }
    
}
