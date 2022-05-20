Feature: google search - amazon search

Scenario Outline: amazon search - samsung galaxy

Given I am on the amazon homepage
When I enter search "<term>"
And I click on amazon search button
Then I received related search result


Examples:
|term          |
|samsung galaxy|
