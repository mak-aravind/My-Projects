Feature: Invalid Contact Us Page

Scenario: InValid Submission 

Given I am on the QAWorks Site

When I should be able to enter the below in Contact US page and Send the message

	|name|			|email|					|subject|				|message|										|expected results flag|
	||		|j.Bloggs@qaworks.com|		|test automation|		|please contact me I want to find out more|					|Invalid Name|
	|j.Bloggs|  |@qaworks.com|			|test automation|	|please contact me I want to find out more|						|Invalid Email|
	|j.Bloggs|  |j.Bloggsqaworks.com|	|test automation|	|please contact me I want to find out more|						|Invalid Email|
	|j.Bloggs| 			| |				|test automation|	|please contact me I want to find out more|						|Invalid Email|
	|j.Bloggs|  |J.Bloggs@qaworks|		|test automation|	|please contact me I want to find out more|						|Invalid Email|
	|j.Bloggs|  |J.Bloggs@qaworks.com|	|test automation|	| |																|Invalid Message|

Then close the browser