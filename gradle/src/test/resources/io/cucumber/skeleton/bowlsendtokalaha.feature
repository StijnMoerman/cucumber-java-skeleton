Feature: Bowl Send To Kalaha

  Scenario Outline: bowl sends stones to kalaha
    Given I have a bowl
    When I consider bowl <bowl>
    And this bowl sends <stones> stones to Kalaha
    And I consider how the stones are distributed
    Then the stones should be distributed like
      | <st1> | <st2> | <st3> | <st4> | <st5> | <st6> | <st7> | <st8> | <st9> | <st10> | <st11> | <st12> | <st13> | <st14> | 

  Examples:
    | bowl | stones  | st1 | st2 | st3 | st4 | st5 | st6 | st7 | st8 | st9 | st10 | st11 | st12 | st13 | st14 | 
    | 1    | 42      | 4 | 4 | 4 | 4 | 4 | 4 | 42 | 4 | 4 | 4 | 4 | 4 | 4 | 0 | 
    | 2    | 42      | 4 | 4 | 4 | 4 | 4 | 4 | 42 | 4 | 4 | 4 | 4 | 4 | 4 | 0 | 
    | 3    | 42      | 4 | 4 | 4 | 4 | 4 | 4 | 42 | 4 | 4 | 4 | 4 | 4 | 4 | 0 | 
    | 4    | 42      | 4 | 4 | 4 | 4 | 4 | 4 | 42 | 4 | 4 | 4 | 4 | 4 | 4 | 0 | 
    | 5    | 42      | 4 | 4 | 4 | 4 | 4 | 4 | 42 | 4 | 4 | 4 | 4 | 4 | 4 | 0 | 
    | 6    | 42      | 4 | 4 | 4 | 4 | 4 | 4 | 42 | 4 | 4 | 4 | 4 | 4 | 4 | 0 | 
    | 7    | 42      | 4 | 4 | 4 | 4 | 4 | 4 | 42 | 4 | 4 | 4 | 4 | 4 | 4 | 0 | 
    | 8    | 42      | 4 | 4 | 4 | 4 | 4 | 4 | 0 | 4 | 4 | 4 | 4 | 4 | 4 | 42 |  
    | 9    | 42      | 4 | 4 | 4 | 4 | 4 | 4 | 0 | 4 | 4 | 4 | 4 | 4 | 4 | 42 |  
    | 10   | 42      | 4 | 4 | 4 | 4 | 4 | 4 | 0 | 4 | 4 | 4 | 4 | 4 | 4 | 42 |  
    | 11   | 42      | 4 | 4 | 4 | 4 | 4 | 4 | 0 | 4 | 4 | 4 | 4 | 4 | 4 | 42 |  
    | 12   | 42      | 4 | 4 | 4 | 4 | 4 | 4 | 0 | 4 | 4 | 4 | 4 | 4 | 4 | 42 |  
    | 13   | 42      | 4 | 4 | 4 | 4 | 4 | 4 | 0 | 4 | 4 | 4 | 4 | 4 | 4 | 42 | 
    | 14   | 42      | 4 | 4 | 4 | 4 | 4 | 4 | 0 | 4 | 4 | 4 | 4 | 4 | 4 | 42 |  
    | 15   | 42      | 4 | 4 | 4 | 4 | 4 | 4 | 42 | 4 | 4 | 4 | 4 | 4 | 4 | 0 |  
