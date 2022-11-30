Feature: Bowl Kalaha

  Scenario Outline: first bowl is not a Kalaha
    Given I have a bowl
    When I consider bowl number <bowl>
    Then this bowl "<KalahaOrNot>" a Kalaha

  Examples:
    | bowl     | KalahaOrNot    | 
    | 1        | is not         | 
    | 2        | is not         | 
    | 3        | is not         | 
    | 4        | is not         | 
    | 5        | is not         | 
    | 6        | is not         | 
    | 7        | is             | 
    | 8        | is not         | 
    | 9        | is not         | 
    | 10       | is not         | 
    | 11       | is not         | 
    | 12       | is not         | 
    | 13       | is not         | 
    | 14       | is             | 
    | 15       | is not         | 
