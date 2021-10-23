
Feature: Test different actions on a sandbox page
Scenario: As a Test Engineer, I want to retrieve the value of an static table.
    Given I navigate to the static table
    Then I can return the value I wanted

Scenario: As a Test Engineer I try out different actions on a sandbox page
    Given I navigate to the sandbox page

@Test
Scenario Outline: As a Test Engineer I want to validate that a text is present inside a list.
    Given I navigate to the list
    When I search <state> in the list
    Then I can find <city> in the list

    Examples:
        | state       | city                |
        | Washington  | Seattle, Washington |
        | Washington  | Mendoza, Washington  |
        | Chicago     | Chicago, Illinois   |