Feature: Bowl Takes Stone

  Scenario Outline: bowl takes a stone
    Given I have a bowl
    When I consider bowl <bowl>
    And this bowl takes <stones> stones in turn of player 1
    And I consider how the stones are distributed
    Then the stones should be distributed like
      | <st1> | <st2> | <st3> | <st4> | <st5> | <st6> | <st7> | <st8> | <st9> | <st10> | <st11> | <st12> | <st13> | <st14> | 

  Examples:
    | bowl | stones | st1 | st2 | st3 | st4 | st5 | st6 | st7 | st8 | st9 | st10 | st11 | st12 | st13 | st14 | 
    | 1    | 3      | 5 | 5 | 5 | 4 | 4 | 4 | 0 | 4 | 4 | 4 | 4 | 4 | 4 | 0 |
    | 2    | 3      | 4 | 5 | 5 | 5 | 4 | 4 | 0 | 4 | 4 | 4 | 4 | 4 | 4 | 0 |
    | 3    | 3      | 4 | 4 | 5 | 5 | 5 | 4 | 0 | 4 | 4 | 4 | 4 | 4 | 4 | 0 |
    | 4    | 3      | 4 | 4 | 4 | 5 | 5 | 5 | 0 | 4 | 4 | 4 | 4 | 4 | 4 | 0 |
    | 5    | 3      | 4 | 4 | 4 | 4 | 5 | 5 | 1 | 4 | 4 | 4 | 4 | 4 | 4 | 0 |
    | 6    | 3      | 4 | 4 | 4 | 4 | 4 | 5 | 1 | 5 | 4 | 4 | 4 | 4 | 4 | 0 |
    | 6    | 10     | 5 | 5 | 4 | 4 | 4 | 5 | 1 | 5 | 5 | 5 | 5 | 5 | 5 | 0 |
    | 7    | 3      | 4 | 4 | 4 | 4 | 4 | 4 | 1 | 5 | 5 | 4 | 4 | 4 | 4 | 0 |
    | 8    | 3      | 4 | 4 | 4 | 4 | 4 | 4 | 0 | 5 | 5 | 5 | 4 | 4 | 4 | 0 |
    | 9    | 3      | 4 | 4 | 4 | 4 | 4 | 4 | 0 | 4 | 5 | 5 | 5 | 4 | 4 | 0 |
    | 10   | 3      | 4 | 4 | 4 | 4 | 4 | 4 | 0 | 4 | 4 | 5 | 5 | 5 | 4 | 0 |
    | 11   | 3      | 4 | 4 | 4 | 4 | 4 | 4 | 0 | 4 | 4 | 4 | 5 | 5 | 5 | 0 |
    | 12   | 3      | 5 | 4 | 4 | 4 | 4 | 4 | 0 | 4 | 4 | 4 | 4 | 5 | 5 | 0 |
    | 13   | 3      | 5 | 5 | 4 | 4 | 4 | 4 | 0 | 4 | 4 | 4 | 4 | 4 | 5 | 0 |
    | 14   | 3      | 5 | 5 | 5 | 4 | 4 | 4 | 0 | 4 | 4 | 4 | 4 | 4 | 4 | 0 |
    | 15   | 3      | 5 | 5 | 5 | 4 | 4 | 4 | 0 | 4 | 4 | 4 | 4 | 4 | 4 | 0 |
