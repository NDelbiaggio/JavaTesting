package com.delbiaggio.haagahelia.delbiaggioTesting;

/**
 * @author NicolasDelbiaggio
 * @version 18.10.2016
 *\\myy.haaga-helia.fi\delbiaggio
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "System Date = " + new SystemTimeSource().getTimeMoment() );
        System.out.println( "Internet Date = " + new InternetTimeSource().getTimeMoment() );
    }
}
