package org.omg.IOP;


/**
* org/omg/IOP/CodecFactoryOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /home/jeroen/openjdk-8-b132/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Thursday, April 10, 2014 9:47:58 AM CEST
*/


/**
   * <code>Codecs</code> are obtained from the <code>CodecFactory</code>. 
   * The <code>CodecFactory</code> is obtained through a call to 
   * <code>ORB.resolve_initial_references( "CodecFactory" )</code>.
   */
public interface CodecFactoryOperations 
{

  /**
       * Create a <code>Codec</code> of the given encoding.
       * <p>
       * @param enc The encoding for which to create a <code>Codec</code>.
       * @return A <code>Codec</code> obtained with the given encoding.
       * @exception UnknownEncoding thrown if this factory cannot create a 
       *     <code>Codec</code> of the given encoding.
       */
  org.omg.IOP.Codec create_codec (org.omg.IOP.Encoding enc) throws org.omg.IOP.CodecFactoryPackage.UnknownEncoding;
} // interface CodecFactoryOperations
