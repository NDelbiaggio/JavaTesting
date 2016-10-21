package com.delbiaggio.haagahelia.delbiaggioTesting;

/**
 * @author NicolasDelbiaggio
 * @version 18.10.2016
 *
 */
import java.util.Date;

public class SystemTimeSource implements TimeSource {

    /**
     * Gets the current time from the system.
     *
     * @return
     */
    public Date getTimeMoment() {
        return new Date();
    }

}
