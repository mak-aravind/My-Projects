Feature: Invalid Contact Us Page

Scenario: InValid Submission 

Given I am on the QAWorks WebSite

When I should be able to enter the below in Contact US page and Send the message

	|name|			|email|					|subject|				|message|										|expected results flag|
	|1234|		|j.Bloggs@qaworks.com|		|test automation|		|please contact me I want to find out more|					|Valid|
	|j.Bloggs|  |@qaworks.com|			|test automation|	|please contact me I want to find out more|						|Invalid Email|
	|j.Bloggs|  |j.Bloggsqaworks.com|	|test automation|	|please contact me I want to find out more|						|Invalid Email|
	|j.Bloggs| 			| |				|test automation|	|please contact me I want to find out more|						|Invalid Email|
	|j.Bloggs|  |J.Bloggs@qaworks|		|test automation|	|please contact me I want to find out more|						|Invalid Email|
	|j.Bloggs|  |J.Bloggs@qaworks.com|	|test automation|	| |																|Invalid Message|
	||		|j.Bloggs@qaworks.com|		|test automation|		|please contact me I want to find out more|					|Invalid Name|
	||		|j.Bloggs@qaworks.com|		|test automation|		||															|Invalid Name and message|
	||		||		|test automation|		||															|Invalid Name and email and message|
	||		||		|test automation|		||															|Invalid Name and email|
	|j.Bloggs|		||		|test automation|		||															|Invalid email and message|
Then close the browser