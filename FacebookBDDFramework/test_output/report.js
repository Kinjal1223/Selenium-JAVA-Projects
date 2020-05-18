$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Eclips/FacebookBDDFramework/src/test/java/Features/ArtofTesting.feature");
formatter.feature({
  "line": 1,
  "name": "ArtofTesting website testing",
  "description": "",
  "id": "artoftesting-website-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Mouse over on Manual",
  "description": "",
  "id": "artoftesting-website-testing;mouse-over-on-manual",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User on ArtOfTesting webpage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User mouse over on Manual",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "User clicks on Manual Testing Tutorial",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User Clicks on What is Software Testing",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FbStepDefinition.user_on_ArtOfTesting_webpage()"
});
formatter.result({
  "duration": 11210041300,
  "status": "passed"
});
formatter.match({
  "location": "FbStepDefinition.user_mouse_over_on_Manual()"
});
formatter.result({
  "duration": 436510800,
  "status": "passed"
});
formatter.match({
  "location": "FbStepDefinition.user_clicks_on_Manual_Testing_Tutorial()"
});
formatter.result({
  "duration": 1568685801,
  "status": "passed"
});
formatter.match({
  "location": "FbStepDefinition.user_Clicks_on_What_is_Software_Testing()"
});
formatter.result({
  "duration": 961704300,
  "status": "passed"
});
formatter.match({
  "location": "FbStepDefinition.close_browser()"
});
formatter.result({
  "duration": 1110691400,
  "status": "passed"
});
});