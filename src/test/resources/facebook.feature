Feature: facebook

Background: common methods
Given user launched the browser "https://www.facebook.com/"

#Scenario: create account for facebook
#When click on createaccount button
#Then validate the output
@smoke
Scenario Outline: Mulitple
When click on createaccount button
When user enter the firstusername "<firstname>"
And user enter the surname "<surname>"
And user enter the mobilenumber "<mobilenumber>"
And user enter the enterpassword "<eneterpassword>"
And user click on date
And user click on month
And user click on year
And user select gender
Then validate the output before sign page<caseone>
And click on sign button
Then validate the output<casetwo>

Examples:
|firstname|surname|mobilenumber|enterpassword|caseone|casetwo|
|sury|m|5748743687|Kamajsn@1|case1|case1|
|sur|m|5748743682|Kamajsn@2|case2|case2|
|suryaa|m|5748743686|Kamajsn@3|case3|case3|
|suryam|m|5748743685|Kamajsn@4|case4|case4|