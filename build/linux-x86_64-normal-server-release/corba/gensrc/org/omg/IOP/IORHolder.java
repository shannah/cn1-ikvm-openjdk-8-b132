package org.omg.IOP;

/**
* org/omg/IOP/IORHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /home/jeroen/openjdk-8-b132/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Thursday, April 10, 2014 9:47:58 AM CEST
*/

public final class IORHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.IOP.IOR value = null;

  public IORHolder ()
  {
  }

  public IORHolder (org.omg.IOP.IOR initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.IOP.IORHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.IOP.IORHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.IOP.IORHelper.type ();
  }

}
