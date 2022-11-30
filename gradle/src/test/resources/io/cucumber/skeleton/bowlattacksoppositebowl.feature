Feature: Bowl Attacks Opposite Bowl

  Scenario Outline: bowl attacks opposite bowl
    Given I have a bowl
    When I consider bowl <bowl>
    And this bowl attacks its opposite bowl
    Then this bowl has 0 stones
    And I consider this bowls opposite bowl
    And this bowl has 0 stones
    And I consider bowl <kalaha>
    And this bowl has 8 stones

  Examples:
    | bowl | kalaha    | 
    | 1    | 7         | 
    | 2    | 7         | 
    | 3    | 7         | 
    | 4    | 7         | 
    | 5    | 7         | 
    | 6    | 7         | 
    | 8    | 14        | 
    | 9    | 14        | 
    | 10   | 14        | 
    | 11   | 14        | 
    | 12   | 14        | 
    | 13   | 14        | 
    | 15   | 7         | 
