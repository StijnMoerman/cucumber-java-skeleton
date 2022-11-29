Feature: Bowl Stones

  Scenario Outline: first bowl has four stones
    Given I have a bowl
    Then bowl <bowl> has <stones> stones

  Examples:
    | bowl     | stones    | 
    | 1        | 4         | 
    | 2        | 4         | 
    | 3        | 4         | 
    | 4        | 4         | 
    | 5        | 4         | 
    | 6        | 4         | 
    | 7        | 0         | 
    | 8        | 4         | 
    | 9        | 4         | 
    | 10       | 4         | 
    | 11       | 4         | 
    | 12       | 4         | 
    | 13       | 4         | 
    | 14       | 0         | 
    | 15       | 4         | 
