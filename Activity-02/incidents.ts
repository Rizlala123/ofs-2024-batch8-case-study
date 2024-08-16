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
import "ojs/ojdatetimepicker";
import "ojs/ojlabel";
import { IntlConverterUtils } from "ojs/ojconverterutils-i18n";
import 'oj-c/input-password';
import ArrayDataProvider = require('ojs/ojarraydataprovider');
import 'oj-c/select-single';
import 'oj-c/form-layout';

const statesArray = [
  { value: 'AL', label: 'AL' },
  { value: 'AK', label: 'AK' },
  { value: 'AR', label: 'AR' },
  { value: 'AZ', label: 'AZ' },
  { value: 'CA', label: 'CA' },
  { value: 'CO', label: 'CO' }]

class IncidentsViewModel {
  value: ko.Observable<string>;
  salary: ko.Observable<number> | ko.Observable<any>;
  datetime: ko.Observable<string>;
  password: ko.Observable<string>;
  stateVal: ko.Observable<string>;
  clickedButton: ko.Observable<string>;
  
  
  
  constructor() {
    this.value = ko.observable("Default text");
    this.salary = ko.observable(null);
    this.datetime = ko.observable(
      IntlConverterUtils.dateToLocalIso(new Date(2013, 0, 1))
    );
    this.password = ko.observable("");
    this.stateVal = ko.observable("");
    this.clickedButton = ko.observable("click for counter");
  }

  public buttonClick = (event: Event) => {
    this.clickedButton((event.currentTarget as HTMLElement).id);
    return true;
  };

  readonly statesDP = new ArrayDataProvider(statesArray, {
    keyAttributes: 'value'
  });
}

export = IncidentsViewModel;
