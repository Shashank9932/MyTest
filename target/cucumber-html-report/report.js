$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/autoapp/automation/features/Register.feature");
formatter.feature({
  "line": 1,
  "name": "Registering to automation practice",
  "description": "",
  "id": "registering-to-automation-practice",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Registration error-incorrect email",
  "description": "",
  "id": "registering-to-automation-practice;registration-error-incorrect-email",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Automation practice application is opened",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click sign in",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I create account with emailid \"testRandomtestauto.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I will see an error \"\u003cerror\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "registering-to-automation-practice;registration-error-incorrect-email;",
  "rows": [
    {
      "cells": [
        "error"
      ],
      "line": 10,
      "id": "registering-to-automation-practice;registration-error-incorrect-email;;1"
    },
    {
      "cells": [
        "Invalid email address."
      ],
      "line": 11,
      "id": "registering-to-automation-practice;registration-error-incorrect-email;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Registration error-incorrect email",
  "description": "",
  "id": "registering-to-automation-practice;registration-error-incorrect-email;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Automation practice application is opened",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click sign in",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I create account with emailid \"testRandomtestauto.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I will see an error \"Invalid email address.\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterStepDef.automation_practice_application_is_opened()"
});
formatter.result({
  "duration": 87850894,
  "error_message": "java.lang.NullPointerException\n\tat autoapp.automation.pages.RegisterPage.openApplicaiton(RegisterPage.java:46)\n\tat autoapp.automation.stepDef.RegisterStepDef.automation_practice_application_is_opened(RegisterStepDef.java:13)\n\tat ✽.Given Automation practice application is opened(src/test/java/autoapp/automation/features/Register.feature:4)\n",
  "status": "failed"
});
formatter.match({
  "location": "RegisterStepDef.i_click_sign_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "testRandomtestauto.com",
      "offset": 31
    }
  ],
  "location": "RegisterStepDef.i_create_account_with_emailid(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Invalid email address.",
      "offset": 21
    }
  ],
  "location": "RegisterStepDef.iWillSeeAnError(String)"
});
formatter.result({
  "status": "skipped"
});
});