Feature: Bowl Executes Turn

  Scenario Outline: bowl executes turn
    Given I have a bowl
    When I consider bowl <bowl>
    And this bowl executes a turn
    And I consider how the stones are distributed
    Then the stones should be distributed like
      | <st1> | <st2> | <st3> | <st4> | <st5> | <st6> | <st7> | <st8> | <st9> | <st10> | <st11> | <st12> | <st13> | <st14> | 

  Examples:
    | bowl | st1 | st2 | st3 | st4 | st5 | st6 | st7 | st8 | st9 | st10 | st11 | st12 | st13 | st14 |
    | 1    | 0 | 5 | 5 | 5 | 5 | 4 | 0 | 4 | 4 | 4 | 4 | 4 | 4 | 0 |  
    | 2    | 4 | 0 | 5 | 5 | 5 | 5 | 0 | 4 | 4 | 4 | 4 | 4 | 4 | 0 |  
    | 3    | 4 | 4 | 0 | 5 | 5 | 5 | 1 | 4 | 4 | 4 | 4 | 4 | 4 | 0 |  
    | 4    | 4 | 4 | 4 | 0 | 5 | 5 | 1 | 5 | 4 | 4 | 4 | 4 | 4 | 0 |  
    | 5    | 4 | 4 | 4 | 4 | 0 | 5 | 1 | 5 | 5 | 4 | 4 | 4 | 4 | 0 |  
    | 6    | 4 | 4 | 4 | 4 | 4 | 0 | 1 | 5 | 5 | 5 | 4 | 4 | 4 | 0 |  
    | 8    | 4 | 4 | 4 | 4 | 4 | 4 | 0 | 0 | 5 | 5 | 5 | 5 | 4 | 0 |  
    | 9    | 4 | 4 | 4 | 4 | 4 | 4 | 0 | 4 | 0 | 5 | 5 | 5 | 5 | 0 |  
    | 10   | 4 | 4 | 4 | 4 | 4 | 4 | 0 | 4 | 4 | 0 | 5 | 5 | 5 | 1 |  
    | 11   | 5 | 4 | 4 | 4 | 4 | 4 | 0 | 4 | 4 | 4 | 0 | 5 | 5 | 1 |  
    | 12   | 5 | 5 | 4 | 4 | 4 | 4 | 0 | 4 | 4 | 4 | 4 | 0 | 5 | 1 |  
    | 13   | 5 | 5 | 5 | 4 | 4 | 4 | 0 | 4 | 4 | 4 | 4 | 4 | 0 | 1 |  
