Feature: Bowl Opposite Bowl

  Scenario Outline: find opposite bowl
    Given I have a bowl
    When I consider bowl number <bowl>
    Then this bowl has opposite bowl <oppbowl>

  Examples:
    | bowl     | oppbowl   | 
    | 1        | 13        | 
    | 2        | 12        | 
    | 3        | 11        | 
    | 4        | 10        | 
    | 5        | 9         | 
    | 6        | 8         | 
    | 7        | 7         | 
    | 8        | 6         | 
    | 9        | 5         | 
    | 10       | 4         | 
    | 11       | 3         | 
    | 12       | 2         | 
    | 13       | 1         | 
    | 14       | 14        | 
    | 15       | 13        | 
