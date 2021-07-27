#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: In order to remember the things I want to do, as a ToDo MVC user, I want to manage my todo list
@regression @smoke
    Scenario: Enter the todo list
    Given the user is in homepage   
    When the user enters the data
    |Wakeup|Refresh|EatFruits|
    Then the user verifies the data is updated
    
@smoke @regression
  Scenario: Check for Active and completed tab
    Given the user retrieves the list count and check it matches   
    And the user clicks Active tab   
    When the user clicks completed tab
    Then verifies the data is empty 
@sanity    
    Scenario: Edit todo list
    Given the user doubleclicks and edits todo   
    And verifies the todolist is updated 
    
@all    
    Scenario: Toggle todo list check
    When the user clicks the toggle icon   
    Then verify the todo is marked completed 
    And click the toggle icon again
    Then verify the todo items are still active
    