Feature: Test the groovy stuff

  Scenario: I want to add two numbers
    When I add "2" and "2"
    Then the result should be "4"

  Scenario Outline: I want to subtract two numbers
    When I subtract "<b>" from "<a>"
    Then the result should be "<result>"
  Examples:
    | a | b | result |
    | 1 | 1 | 0 |
    | 2 | 1 | 1 |