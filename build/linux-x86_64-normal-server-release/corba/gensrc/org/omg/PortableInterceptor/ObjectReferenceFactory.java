package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/ObjectReferenceFactory.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /home/jeroen/openjdk-8-b132/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Thursday, April 10, 2014 9:47:58 AM CEST
*/


/** The object reference factory.  This provides the capability of
  * creating an object reference.
  */
public interface ObjectReferenceFactory extends org.omg.CORBA.portable.ValueBase
{

  /** make_object creates a CORBA object reference according
      * to the data in this template, with the given repository ID and
      * object ID.
      */
  public abstract org.omg.CORBA.Object make_object (String repositoryId, byte[] object_id);

} // interface ObjectReferenceFactory
