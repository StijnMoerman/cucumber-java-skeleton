Feature: Bowl Send To Kalaha

  Scenario Outline: bowl sends stones to kalaha
    Given I have a bowl
    When I consider bowl <bowl>
    And this bowl sends <stones> stones to Kalaha
    Then I consider bowl <kalaha>
    And this bowl has <stones> stones

  Examples:
    | bowl | stones  | kalaha    | 
    | 1    | 42      | 7         | 
    | 2    | 42      | 7         | 
    | 3    | 42      | 7         | 
    | 4    | 42      | 7         | 
    | 5    | 42      | 7         | 
    | 6    | 42      | 7         | 
    | 7    | 42      | 7         | 
    | 8    | 42      | 14        | 
    | 9    | 42      | 14        | 
    | 10   | 42      | 14        | 
    | 11   | 42      | 14        | 
    | 12   | 42      | 14        | 
    | 13   | 42      | 14        | 
    | 14   | 42      | 14        | 
    | 15   | 42      | 7         | 
