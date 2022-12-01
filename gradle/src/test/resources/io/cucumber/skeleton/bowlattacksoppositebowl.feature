Feature: Bowl Attacks Opposite Bowl

  Scenario Outline: bowl attacks opposite bowl
    Given I have a bowl
    When I consider bowl <bowl>
    And this bowl attacks its opposite bowl
    And I consider how the stones are distributed
    Then the stones should be distributed like
      | <st1> | <st2> | <st3> | <st4> | <st5> | <st6> | <st7> | <st8> | <st9> | <st10> | <st11> | <st12> | <st13> | <st14> | 

  Examples:
    | bowl | st1 | st2 | st3 | st4 | st5 | st6 | st7 | st8 | st9 | st10 | st11 | st12 | st13 | st14 |
    | 1    | 0 | 4 | 4 | 4 | 4 | 4 | 8 | 4 | 4 | 4 | 4 | 4 | 0 | 0 |  
    | 2    | 4 | 0 | 4 | 4 | 4 | 4 | 8 | 4 | 4 | 4 | 4 | 0 | 4 | 0 |  
    | 3    | 4 | 4 | 0 | 4 | 4 | 4 | 8 | 4 | 4 | 4 | 0 | 4 | 4 | 0 |  
    | 4    | 4 | 4 | 4 | 0 | 4 | 4 | 8 | 4 | 4 | 0 | 4 | 4 | 4 | 0 |  
    | 5    | 4 | 4 | 4 | 4 | 0 | 4 | 8 | 4 | 0 | 4 | 4 | 4 | 4 | 0 |  
    | 6    | 4 | 4 | 4 | 4 | 4 | 0 | 8 | 0 | 4 | 4 | 4 | 4 | 4 | 0 |  
    | 7    | 4 | 4 | 4 | 4 | 4 | 4 | 0 | 4 | 4 | 4 | 4 | 4 | 4 | 0 |  
    | 8    | 4 | 4 | 4 | 4 | 4 | 0 | 0 | 0 | 4 | 4 | 4 | 4 | 4 | 8 |  
    | 9    | 4 | 4 | 4 | 4 | 0 | 4 | 0 | 4 | 0 | 4 | 4 | 4 | 4 | 8 |  
    | 10   | 4 | 4 | 4 | 0 | 4 | 4 | 0 | 4 | 4 | 0 | 4 | 4 | 4 | 8 |  
    | 11   | 4 | 4 | 0 | 4 | 4 | 4 | 0 | 4 | 4 | 4 | 0 | 4 | 4 | 8 |  
    | 12   | 4 | 0 | 4 | 4 | 4 | 4 | 0 | 4 | 4 | 4 | 4 | 0 | 4 | 8 |  
    | 13   | 0 | 4 | 4 | 4 | 4 | 4 | 0 | 4 | 4 | 4 | 4 | 4 | 0 | 8 |  
    | 14   | 4 | 4 | 4 | 4 | 4 | 4 | 0 | 4 | 4 | 4 | 4 | 4 | 4 | 0 |  
