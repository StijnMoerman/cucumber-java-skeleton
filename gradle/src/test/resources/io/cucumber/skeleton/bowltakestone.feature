Feature: Bowl Takes Stone

  Scenario Outline: bowl takes a stone
    Given I have a bowl
    When I consider bowl <bowl>
    And this bowl takes <stones> stones in turn of player 1
    Then this bowl has 5 stones
    And I consider bowl <kalaha>
    And this bowl has <stoneskalaha> stones

  Examples:
    | bowl | stones  | kalaha    | stoneskalaha |
    | 1    | 3       | 7         | 0            |
    | 2    | 3       | 7         | 0            |
    | 3    | 3       | 7         | 0            |
    | 4    | 3       | 7         | 0            |
    | 5    | 3       | 7         | 1            |
    | 6    | 3       | 7         | 1            |
    | 8    | 3       | 14        | 0            |
    | 9    | 3       | 14        | 0            |
    | 10   | 3       | 14        | 0            |
    | 11   | 3       | 14        | 0            |
    | 12   | 3       | 14        | 0            |
    | 13   | 3       | 14        | 0            |
    | 15   | 3       | 7         | 0            |
    | 6    | 10      | 14        | 0            |
