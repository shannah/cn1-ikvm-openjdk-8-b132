package org.omg.CosNaming;


/**
* org/omg/CosNaming/NamingContextExt.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /home/jeroen/openjdk-8-b132/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Thursday, April 10, 2014 9:47:56 AM CEST
*/


/** 
 * <code>NamingContextExt</code> is the extension of <code>NamingContext</code>
 * which
 * contains a set of name bindings in which each name is unique and is
 * part of Interoperable Naming Service.
 * Different names can be bound to an object in the same or different
 * contexts at the same time. Using <tt>NamingContextExt</tt>, you can use
 * URL-based names to bind and resolve. <p>
 * 
 * See <a href="http://www.omg.org/technology/documents/formal/naming_service.htm">
 * CORBA COS 
 * Naming Specification.</a>
 */
public interface NamingContextExt extends NamingContextExtOperations, org.omg.CosNaming.NamingContext, org.omg.CORBA.portable.IDLEntity 
{
} // interface NamingContextExt
