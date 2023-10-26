
@Regression
Feature: Techfios billing login functionality validation


@Scenario1
Scenario Outline: User should be able to login with credentials
	Given User is on techfios login page
	When User enters the "<username>" in "Username" field
	When User enters the "<password>" in "Password" field
	And User clicks on login
	Then User should land on Dashboard page
	And User clicks on bankCash
	And User clicks on newAccount
	Then User should land on Accounts page
	And User enters "<accountTitle>" in "AccountTitle" field of accounts page 
	And User enters "<description>" in "Description" field of accounts page 
	And User enters "<initialBalance>" in "InitialBalance" field of accounts page 
	And User enters "<accountNumber>" in "AccountNumber" field of accounts page 
	And User enters "<contactPerson>" in "ContactPerson" field of accounts page 
	And User enters "<phone>" in "Phone" field of accounts page 
	And User enters "<internetBankingURL>" in "InternetBankingURL" field of accounts page 
	And User clicks on submit
	Then User should be able to validate account created successfully

	Examples:
	|	username					|	password	|	accountTitle	|	description	|	initialBalance	|	accountNumber	|	contactPerson | phone				|	internetBankingURL		|
	|	demo@techfios.com	|	abc123		|	Saving				|	MyMoney			|	2054545					|	66666666666		|	Myself				|	1231231234	|	https://www.techfios.com/billing/?ng=admin/|
