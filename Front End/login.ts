/**
 * @license
 * Copyright (c) 2014, 2024, Oracle and/or its affiliates.
 * Licensed under The Universal Permissive License (UPL), Version 1.0
 * as shown at https://oss.oracle.com/licenses/upl/
 * @ignore
 */

import * as ko from "knockout";
import "oj-c/input-text";
import "ojs/ojknockout";

import { IntlConverterUtils } from "ojs/ojconverterutils-i18n";
import 'oj-c/input-password';
import ArrayDataProvider = require('ojs/ojarraydataprovider');
import 'oj-c/select-single';
import "oj-c/button";
import 'oj-c/form-layout';

class IncidentsViewModel {

  url = "http://localhost:8080/loginscreen/a"
  username: ko.Observable<string>;
  password: ko.Observable<string>;

  
  //readonly messages: MutableArrayDataProvider<string, DemoMessageBannerItem>;
  
  
  
  constructor() {
    this.username = ko.observable("");
    this.password = ko.observable("");
    
  }

  public checkLoginDetails = async (event: Event) => {
    console.log("button pressed")
    document.body.style.backgroundColor = '#B0E0E6';

    let initialJSON= {
      username: this.username(),
      password: this.password()
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
      alert("Hello " + this.username())
    } catch (error) {
      console.error("Error adding customer:", error);
    } 
  };

  public redirectToLogin = async (event: Event) => {
    window.location.href="http://localhost:8000/?ojr=register";

  }

}

export = IncidentsViewModel;
