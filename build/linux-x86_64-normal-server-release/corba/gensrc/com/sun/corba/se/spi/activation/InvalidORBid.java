package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/InvalidORBid.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /home/jeroen/openjdk-8-b132/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Thursday, April 10, 2014 9:47:55 AM CEST
*/

public final class InvalidORBid extends org.omg.CORBA.UserException
{

  public InvalidORBid ()
  {
    super(InvalidORBidHelper.id());
  } // ctor


  public InvalidORBid (String $reason)
  {
    super(InvalidORBidHelper.id() + "  " + $reason);
  } // ctor

} // class InvalidORBid