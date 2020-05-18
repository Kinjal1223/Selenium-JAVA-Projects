$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Eclips/FreeCRMBDDFramework/src/test/java/Features/Contact.feature");
formatter.feature({
  "line": 1,
  "name": "Create new contact",
  "description": "",
  "id": "create-new-contact",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "Create new contacts scenario",
  "description": "",
  "id": "create-new-contact;create-new-contacts-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user clicks on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user mouse hover on Contacts",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Enters on contact page \"\u003cFirstname\u003e\" and \"\u003cLastName\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Save button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "create-new-contact;create-new-contacts-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "Firstname",
        "LastName"
      ],
      "line": 13,
      "id": "create-new-contact;create-new-contacts-scenario;;1"
    },
    {
      "cells": [
        "apatel",
        "Pulsure",
        "Tracy",
        "NON"
      ],
      "line": 14,
      "id": "create-new-contact;create-new-contacts-scenario;;2"
    },
    {
      "cells": [
        "apatel",
        "Pulsure",
        "Jamie",
        "NON"
      ],
      "line": 15,
      "id": "create-new-contact;create-new-contacts-scenario;;3"
    },
    {
      "cells": [
        "kpatel",
        "Pulsure",
        "Kin",
        "Patel"
      ],
      "line": 16,
      "id": "create-new-contact;create-new-contacts-scenario;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Create new contacts scenario",
  "description": "",
  "id": "create-new-contact;create-new-contacts-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters \"apatel\" and \"Pulsure\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user clicks on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user mouse hover on Contacts",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Enters on contact page \"Tracy\" and \"NON\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Save button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Contacts.user_on_login_page()"
});
formatter.result({
  "duration": 13255155700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "apatel",
      "offset": 13
    },
    {
      "val": "Pulsure",
      "offset": 26
    }
  ],
  "location": "Contacts.user_enters_and(String,String)"
});
formatter.result({
  "duration": 585830100,
  "status": "passed"
});
formatter.match({
  "location": "Contacts.user_clicks_on_Login_button()"
});
formatter.result({
  "duration": 4266079800,
  "status": "passed"
});
formatter.match({
  "location": "Contacts.user_mouse_hover_on_Contacts()"
});
formatter.result({
  "duration": 599617300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tracy",
      "offset": 24
    },
    {
      "val": "NON",
      "offset": 36
    }
  ],
  "location": "Contacts.Enters_on_contact_page_Firsrname_and_NON(String,String)"
});
formatter.result({
  "duration": 1304588900,
  "status": "passed"
});
formatter.match({
  "location": "Contacts.save_button()"
});
formatter.result({
  "duration": 127449400,
  "status": "passed"
});
formatter.match({
  "location": "Contacts.close_the_browser()"
});
formatter.result({
  "duration": 1059051700,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Create new contacts scenario",
  "description": "",
  "id": "create-new-contact;create-new-contacts-scenario;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters \"apatel\" and \"Pulsure\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user clicks on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user mouse hover on Contacts",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Enters on contact page \"Jamie\" and \"NON\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Save button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Contacts.user_on_login_page()"
});
formatter.result({
  "duration": 11448570700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "apatel",
      "offset": 13
    },
    {
      "val": "Pulsure",
      "offset": 26
    }
  ],
  "location": "Contacts.user_enters_and(String,String)"
});
formatter.result({
  "duration": 808749200,
  "status": "passed"
});
formatter.match({
  "location": "Contacts.user_clicks_on_Login_button()"
});
formatter.result({
  "duration": 4852344100,
  "status": "passed"
});
formatter.match({
  "location": "Contacts.user_mouse_hover_on_Contacts()"
});
formatter.result({
  "duration": 412813400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jamie",
      "offset": 24
    },
    {
      "val": "NON",
      "offset": 36
    }
  ],
  "location": "Contacts.Enters_on_contact_page_Firsrname_and_NON(String,String)"
});
formatter.result({
  "duration": 1103195100,
  "status": "passed"
});
formatter.match({
  "location": "Contacts.save_button()"
});
formatter.result({
  "duration": 121719100,
  "status": "passed"
});
formatter.match({
  "location": "Contacts.close_the_browser()"
});
formatter.result({
  "duration": 1042856200,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Create new contacts scenario",
  "description": "",
  "id": "create-new-contact;create-new-contacts-scenario;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters \"kpatel\" and \"Pulsure\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user clicks on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user mouse hover on Contacts",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Enters on contact page \"Kin\" and \"Patel\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Save button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Contacts.user_on_login_page()"
});
formatter.result({
  "duration": 12016400600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kpatel",
      "offset": 13
    },
    {
      "val": "Pulsure",
      "offset": 26
    }
  ],
  "location": "Contacts.user_enters_and(String,String)"
});
formatter.result({
  "duration": 905839000,
  "status": "passed"
});
formatter.match({
  "location": "Contacts.user_clicks_on_Login_button()"
});
formatter.result({
  "duration": 798891000,
  "status": "passed"
});
formatter.match({
  "location": "Contacts.user_mouse_hover_on_Contacts()"
});
formatter.result({
  "duration": 3688076700,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d79.0.3945.130)\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027DESKTOP-KU574QB\u0027, ip: \u0027192.168.1.164\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 79.0.3945.130, chrome: {chromedriverVersion: 78.0.3904.105 (60e2d8774a81..., userDataDir: C:\\Users\\keenj\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:50602}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: c1a42f71bc8ff504de5d3400cffa6b91\n*** Element info: {Using\u003dcss selector, value\u003dframe#mainpanel,iframe#mainpanel}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:349)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementsByCssSelector(RemoteWebDriver.java:420)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElements(By.java:441)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:310)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteTargetLocator.frame(RemoteWebDriver.java:877)\r\n\tat stepDefinition.Contacts.user_mouse_hover_on_Contacts(Contacts.java:50)\r\n\tat ✽.Then user mouse hover on Contacts(D:/Eclips/FreeCRMBDDFramework/src/test/java/Features/Contact.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Kin",
      "offset": 24
    },
    {
      "val": "Patel",
      "offset": 34
    }
  ],
  "location": "Contacts.Enters_on_contact_page_Firsrname_and_NON(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Contacts.save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Contacts.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});