/**
 * @license
 * Copyright (c) 2014, 2024, Oracle and/or its affiliates.
 * Licensed under The Universal Permissive License (UPL), Version 1.0
 * as shown at https://oss.oracle.com/licenses/upl/
 * @ignore
 */
import * as AccUtils from "../accUtils";
import * as ko from "knockout";
import "oj-c/input-text";
import "ojs/ojknockout";
import "oj-c/input-number";
import "oj-c/button";



class RegisterViewModel {
  url = "http://localhost:8080/customerapi/customeradd"
  firstName: ko.Observable<string>;
  lastName: ko.Observable<string>;
  address: ko.Observable<string>;
  city: ko.Observable<string>;
  state: ko.Observable<string>;
  zip: ko.Observable<number> | ko.Observable<any>;
  email: ko.Observable<string>;
  phone: ko.Observable<number> | ko.Observable<any>;
  cell: ko.Observable<number> | ko.Observable<any>;
  
  constructor() {
    this.firstName = ko.observable("");
    this.lastName = ko.observable("");
    this.address = ko.observable("");
    this.city = ko.observable("");
    this.state = ko.observable("");
    this.zip = ko.observable(null);
    this.email = ko.observable("");
    this.phone = ko.observable(null);
    this.cell = ko.observable(null);
  }

  public submitRegistration = async (event: Event) => {
    


    let initialJSON= {
      f_name: this.firstName(),
      l_name:this.lastName(),
      address:this.address(),
      city:this.city(),
      state:this.state(),
      zip:this.zip(),
      email:this.email(),
      phone:this.phone(),
      cell:this.cell()
    }

    let finalJSON = JSON.stringify(initialJSON);
    console.log(finalJSON)

    

    const request = new Request(this.url, {
      headers: new Headers({
        "Content-type": "application/json; charset=UTF-8",
      }),
      body: JSON.stringify(initialJSON),
      method: "POST",
    });

    try 
    {
      const response = await fetch(request);
      console.log('request is initalized');
      const addedCustomer = await response.json();
      console.log('reponse is initialized');
      console.log("Customer added:", addedCustomer);
      alert("Hello " + this.firstName())
    } catch (error) {
      console.error("Error adding customer:", error);
    } 




    
    
}
}

export = RegisterViewModel;
