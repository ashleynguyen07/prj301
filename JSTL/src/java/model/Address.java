/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author tramy
 */
public class Address {
  public String streetAddress;
  public String city;
  public String zipCode;
  
  public Address(){
      
  }

  public Address(String streetAddress, String city, String zipCode) {
    this.streetAddress = streetAddress;
    this.city = city;
    this.zipCode = zipCode;
  }

  public String getStreetAddress() {
    return streetAddress;
  }

  public String getCity() {
    return city;
  }

  public String getZipCode() {
    return zipCode;
  }
}
