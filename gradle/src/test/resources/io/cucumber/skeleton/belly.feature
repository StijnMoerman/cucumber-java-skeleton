Feature: Belly

  Scenario Outline: a few cukes
    Given I have 42 cukes in my belly
    When I wait <hours> hour
    Then my belly should "<answer>"

  Examples:
    | hours     | answer      |
    | 1         | growl       |
    | 2         | growl       |
    | 3         | feel fine   |