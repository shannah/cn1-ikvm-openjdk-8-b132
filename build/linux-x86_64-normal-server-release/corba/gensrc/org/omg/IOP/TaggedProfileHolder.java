package org.omg.IOP;

/**
* org/omg/IOP/TaggedProfileHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /home/jeroen/openjdk-8-b132/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Thursday, April 10, 2014 9:47:58 AM CEST
*/

public final class TaggedProfileHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.IOP.TaggedProfile value = null;

  public TaggedProfileHolder ()
  {
  }

  public TaggedProfileHolder (org.omg.IOP.TaggedProfile initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.IOP.TaggedProfileHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.IOP.TaggedProfileHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.IOP.TaggedProfileHelper.type ();
  }

}
