Feature: Bowl Side Player

  Scenario Outline: bowl on side player
    Given I have a bowl
    Then bowl number <bowl> is on side of player <player>

  Examples:
    | bowl     | player    | 
    | 1        | 1         | 
    | 2        | 1         | 
    | 3        | 1         | 
    | 4        | 1         | 
    | 5        | 1         | 
    | 6        | 1         | 
    | 7        | 1         | 
    | 8        | 2         | 
    | 9        | 2         | 
    | 10       | 2         | 
    | 11       | 2         | 
    | 12       | 2         | 
    | 13       | 2         | 
    | 14       | 2         | 
    | 15       | 1         | 
