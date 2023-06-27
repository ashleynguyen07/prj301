/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author tramy
 */
public class Employee {
  public Name name;
  public Address address;
  
  public Employee(){
      
  }

  public Employee(Name name, Address address) {
    this.name = name;
    this.address = address;
  }

  public Name getName() {
    return name;
  }

  public Address getAddress() {
    return address;
  }
}