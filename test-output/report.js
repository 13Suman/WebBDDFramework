$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/suman/eclipse-workspace/WebBDDFramework/src/main/java/Features/homeitems.feature");
formatter.feature({
  "line": 1,
  "name": "Flipkart Home Decor Items",
  "description": "",
  "id": "flipkart-home-decor-items",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Flipkart Add Home Decor Items Test Scenario",
  "description": "",
  "id": "flipkart-home-decor-items;flipkart-add-home-decor-items-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Users is already present on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Title of Login Page is Flipkart Login",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters username and password",
  "rows": [
    {
      "cells": [
        "8700473576",
        "Suman@13"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User clicks on Login Button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User is in Home Page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User navigates to Home \u0026 Furniture Page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeItemStepDefinition.user_login_page()"
});
formatter.result({
  "duration": 14902132118,
  "status": "passed"
});
formatter.match({
  "location": "HomeItemStepDefinition.title_login_page()"
});
formatter.result({
  "duration": 16623279,
  "status": "passed"
});
formatter.match({
  "location": "HomeItemStepDefinition.enter_uname_pswrd(DataTable)"
});
formatter.result({
  "duration": 1355871303,
  "status": "passed"
});
formatter.match({
  "location": "HomeItemStepDefinition.click_on_login_btn()"
});
formatter.result({
  "duration": 131644222,
  "status": "passed"
});
formatter.match({
  "location": "HomeItemStepDefinition.user_is_in_home_page()"
});
formatter.result({
  "duration": 13557506,
  "status": "passed"
});
formatter.match({
  "location": "HomeItemStepDefinition.users_adds_painting_and_watches()"
});
formatter.result({
  "duration": 6376359073,
  "status": "passed"
});
formatter.match({
  "location": "HomeItemStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 160976501,
  "status": "passed"
});
});