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
import "oj-c/input-number";
import "oj-c/button";
import "my-component/loader"

class CustomersViewModel {

  name: ko.Observable<string>;
  iq:ko.Observable<number>| ko.Observable<any>;
  personName:ko.Observable<string>;
  

  constructor() {
    this.name = ko.observable("");
    this.iq=ko.observable(null);
    this.personName= ko.observable("");
    
  }


  public buttonClick = async (event: Event) => {
    alert(this.name()+" is your name na? ")
    document.body.style.backgroundColor = 'grey';
    let namechecker = this.name();
    const iqById = document.getElementById('iq') as HTMLSpanElement;
    if (iqById) {
      iqById.innerText = 'Your iq is ' + getRandomInt(39);
      iqById.style.color = 'red'; 
      let personId=getRandomInt(11)

      let URL = "https://jsonplaceholder.typicode.com/users/"+ personId;

      let res = await fetch(URL);
      let jsonData = await res.json();
      console.log(jsonData);
      this.personName(jsonData['name']);
      
      const mockeryById = document.getElementById('mockery') as HTMLSpanElement;
    if (mockeryById) {
      // Change the text content
      mockeryById.innerText = 'WOW YOURE DUMBER THAN: ';
      mockeryById.style.color = 'green'; 
    }
    }

  function getRandomInt(max: number): number {
    return Math.floor(Math.random() * max);
}

  };
}

export = CustomersViewModel;
