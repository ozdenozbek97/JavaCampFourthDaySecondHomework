/**
 * KPSPublicSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.gov.nvi.tckimlik.WS;

import java.time.LocalDate;

public interface KPSPublicSoap extends java.rmi.Remote {
    public boolean TCKimlikNoDogrula(long TCKimlikNo, java.lang.String ad, java.lang.String soyad, int dogumYili) throws java.rmi.RemoteException;

	public boolean TCKimlikNoDogrula(long parseLong, String firstName, String lastName, LocalDate birthDay);
}
