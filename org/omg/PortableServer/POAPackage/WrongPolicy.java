package org.omg.PortableServer.POAPackage;


/**
* org/omg/PortableServer/POAPackage/WrongPolicy.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /build/openjdk-8-WFA7ig/openjdk-8-8u162-b12/src/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Thursday, March 15, 2018 9:30:35 PM UTC
*/

public final class WrongPolicy extends org.omg.CORBA.UserException
{

  public WrongPolicy ()
  {
    super(WrongPolicyHelper.id());
  } // ctor


  public WrongPolicy (String $reason)
  {
    super(WrongPolicyHelper.id() + "  " + $reason);
  } // ctor

} // class WrongPolicy