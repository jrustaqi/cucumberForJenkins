$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/BankAndCash.feature");
formatter.feature({
  "line": 3,
  "name": "Techfios billing login functionality validation",
  "description": "",
  "id": "techfios-billing-login-functionality-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@Regression"
    }
  ]
});
formatter.scenarioOutline({
  "line": 7,
  "name": "User should be able to login with credentials",
  "description": "",
  "id": "techfios-billing-login-functionality-validation;user-should-be-able-to-login-with-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User is on techfios login page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User enters the \"\u003cusername\u003e\" in \"Username\" field",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enters the \"\u003cpassword\u003e\" in \"Password\" field",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User clicks on login",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User clicks on bankCash",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User clicks on newAccount",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User should land on Accounts page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User enters \"\u003caccountTitle\u003e\" in \"AccountTitle\" field of accounts page",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User enters \"\u003cdescription\u003e\" in \"Description\" field of accounts page",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User enters \"\u003cinitialBalance\u003e\" in \"InitialBalance\" field of accounts page",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User enters \"\u003caccountNumber\u003e\" in \"AccountNumber\" field of accounts page",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User enters \"\u003ccontactPerson\u003e\" in \"ContactPerson\" field of accounts page",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User enters \"\u003cphone\u003e\" in \"Phone\" field of accounts page",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User enters \"\u003cinternetBankingURL\u003e\" in \"InternetBankingURL\" field of accounts page",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User clicks on submit",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 26,
  "name": "",
  "description": "",
  "id": "techfios-billing-login-functionality-validation;user-should-be-able-to-login-with-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "accountTitle",
        "description",
        "initialBalance",
        "accountNumber",
        "contactPerson",
        "phone",
        "internetBankingURL"
      ],
      "line": 27,
      "id": "techfios-billing-login-functionality-validation;user-should-be-able-to-login-with-credentials;;1"
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123",
        "Saving",
        "MyMoney",
        "2054545",
        "66666666666",
        "Myself",
        "1231231234",
        "https://www.techfios.com/billing/?ng\u003dadmin/"
      ],
      "line": 28,
      "id": "techfios-billing-login-functionality-validation;user-should-be-able-to-login-with-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3939236800,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "User should be able to login with credentials",
  "description": "",
  "id": "techfios-billing-login-functionality-validation;user-should-be-able-to-login-with-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Scenario1"
    },
    {
      "line": 2,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User is on techfios login page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User enters the \"demo@techfios.com\" in \"Username\" field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enters the \"abc123\" in \"Password\" field",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User clicks on login",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User clicks on bankCash",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User clicks on newAccount",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User should land on Accounts page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User enters \"Saving\" in \"AccountTitle\" field of accounts page",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User enters \"MyMoney\" in \"Description\" field of accounts page",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User enters \"2054545\" in \"InitialBalance\" field of accounts page",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User enters \"66666666666\" in \"AccountNumber\" field of accounts page",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User enters \"Myself\" in \"ContactPerson\" field of accounts page",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User enters \"1231231234\" in \"Phone\" field of accounts page",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User enters \"https://www.techfios.com/billing/?ng\u003dadmin/\" in \"InternetBankingURL\" field of accounts page",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User clicks on submit",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "BankAndCashStepDifinations.user_is_on_techfios_login_page()"
});
formatter.result({
  "duration": 1968967400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 17
    },
    {
      "val": "Username",
      "offset": 40
    }
  ],
  "location": "BankAndCashStepDifinations.user_enters_the_in_field(String,String)"
});
formatter.result({
  "duration": 153568100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 17
    },
    {
      "val": "Password",
      "offset": 29
    }
  ],
  "location": "BankAndCashStepDifinations.user_enters_the_in_field(String,String)"
});
formatter.result({
  "duration": 105524000,
  "status": "passed"
});
formatter.match({
  "location": "BankAndCashStepDifinations.user_clicks_on_login()"
});
formatter.result({
  "duration": 6500486000,
  "status": "passed"
});
formatter.match({
  "location": "BankAndCashStepDifinations.user_should_land_on_Dashboard_page()"
});
formatter.result({
  "duration": 256006500,
  "status": "passed"
});
formatter.match({
  "location": "BankAndCashStepDifinations.user_clicks_on_bankCash()"
});
formatter.result({
  "duration": 54729500,
  "status": "passed"
});
formatter.match({
  "location": "BankAndCashStepDifinations.user_clicks_on_newAccount()"
});
formatter.result({
  "duration": 5818784100,
  "status": "passed"
});
formatter.match({
  "location": "BankAndCashStepDifinations.user_should_land_on_Accounts_page()"
});
formatter.result({
  "duration": 161530600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Saving",
      "offset": 13
    },
    {
      "val": "AccountTitle",
      "offset": 25
    }
  ],
  "location": "BankAndCashStepDifinations.user_enters_in_field_of_accounts_page(String,String)"
});
formatter.result({
  "duration": 100418600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MyMoney",
      "offset": 13
    },
    {
      "val": "Description",
      "offset": 26
    }
  ],
  "location": "BankAndCashStepDifinations.user_enters_in_field_of_accounts_page(String,String)"
});
formatter.result({
  "duration": 84979800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2054545",
      "offset": 13
    },
    {
      "val": "InitialBalance",
      "offset": 26
    }
  ],
  "location": "BankAndCashStepDifinations.user_enters_in_field_of_accounts_page(String,String)"
});
formatter.result({
  "duration": 85738500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "66666666666",
      "offset": 13
    },
    {
      "val": "AccountNumber",
      "offset": 30
    }
  ],
  "location": "BankAndCashStepDifinations.user_enters_in_field_of_accounts_page(String,String)"
});
formatter.result({
  "duration": 82083400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Myself",
      "offset": 13
    },
    {
      "val": "ContactPerson",
      "offset": 25
    }
  ],
  "location": "BankAndCashStepDifinations.user_enters_in_field_of_accounts_page(String,String)"
});
formatter.result({
  "duration": 79823000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1231231234",
      "offset": 13
    },
    {
      "val": "Phone",
      "offset": 29
    }
  ],
  "location": "BankAndCashStepDifinations.user_enters_in_field_of_accounts_page(String,String)"
});
formatter.result({
  "duration": 69811000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.techfios.com/billing/?ng\u003dadmin/",
      "offset": 13
    },
    {
      "val": "InternetBankingURL",
      "offset": 62
    }
  ],
  "location": "BankAndCashStepDifinations.user_enters_in_field_of_accounts_page(String,String)"
});
formatter.result({
  "duration": 93442300,
  "status": "passed"
});
formatter.match({
  "location": "BankAndCashStepDifinations.user_clicks_on_submit()"
});
formatter.result({
  "duration": 6757352700,
  "status": "passed"
});
formatter.match({
  "location": "BankAndCashStepDifinations.user_should_be_able_to_validate_account_created_successfully()"
});
formatter.result({
  "duration": 31814800,
  "error_message": "junit.framework.ComparisonFailure: MESSAGE TEXT IS NOT AVAILABLE! expected:\u003c[ ]Account Created Succ...\u003e but was:\u003c[×\n]Account Created Succ...\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat steps.BankAndCashStepDifinations.user_should_be_able_to_validate_account_created_successfully(BankAndCashStepDifinations.java:134)\r\n\tat ✽.Then User should be able to validate account created successfully(features/BankAndCash.feature:24)\r\n",
  "status": "failed"
});
});