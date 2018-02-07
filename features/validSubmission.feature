Feature: Contact Us Page 


Scenario: Valid Submission 


Given  Given I am on the QAWorks Site		


When I should be able to contact QAWorks with the following information
      | name    | j.Bloggs                                  |test|
      | email   | jwBloggs@qaworks.com                      |test@gmail.com|

      | subject   | test automation                     |test|
      | message | please contact me I want to find out more |test|	

Then Send the message