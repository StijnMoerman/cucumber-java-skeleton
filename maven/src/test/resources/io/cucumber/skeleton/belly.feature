Feature: Belly

  Scenario Outline: a few cukes
    Given I have <cukes> cukes in my belly
    When I wait <hours> hour
    Then my belly should "<answer>"

  Examples:
    | cukes     | hours     | answer      |
    | 42        | 1         | growl       |
    | 42        | 2         | hurt        |
    | 42        | 3         | feel fine   |
    | 42        | 34        | feel fine   |
    | 8         | 1         | feel fine   |
    | 12        | 2         | feel fine   |
    | 12        | 1         | growl       |