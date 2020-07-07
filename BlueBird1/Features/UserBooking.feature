@UserBooking
Feature: UserBooking
Scenario Outline: add valid user of booking 
Given I am appliocation home page
When I click booking link
And I entered "<user name>","<password>"
And I click submit button
And I entered "<radio button>","<passengers>","<departing from>","<date>","<arriving in>","<returning>","<service class>","<airline>"
Then I click continue button

Examples:
|rdio button|passengers|departing from|date|arriving in|returning|service class|airline|
|round trip|2|ny|01-01-2021|dallas|july|economy|nopreferance|

