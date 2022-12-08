Feature: Mancala Ends

  Scenario Outline: mancala does turns as expected and ends
    Given I have a Mancala game
    When Mancala executes a turn on bowl <bowl1>
    When Mancala executes a turn on bowl <bowl2>
    When Mancala executes a turn on bowl <bowl3>
    When Mancala executes a turn on bowl <bowl4>
    When Mancala executes a turn on bowl <bowl5>
    When Mancala executes a turn on bowl <bowl6>
    When Mancala executes a turn on bowl <bowl7>
    When Mancala executes a turn on bowl <bowl8>
    When Mancala executes a turn on bowl <bowl9>
    When Mancala executes a turn on bowl <bowl10>
    When Mancala executes a turn on bowl <bowl11>
    And I consider the state of the current Mancala game
    Then the Mancala game is finished
    And it is the turn of player <player> in Mancala
    And the winner of Mancala is 1
    And the state of the current Mancala game is like 
      | <st1> | <st2> | <st3> | <st4> | <st5> | <st6> | <st7> | <st8> | <st9> | <st10> | <st11> | <st12> | <st13> | <st14> |

    Examples:
      | bowl1 | bowl2 | bowl3 | bowl4 | bowl5 | bowl6 | bowl7 | bowl8 | bowl9 | bowl10 | bowl11 | player | st1 | st2 | st3 | st4 | st5 | st6 | st7 | st8 | st9 | st10 | st11 | st12 | st13 | st14 |
      | 3 | 6 | 2|3|1|4|1|5|1|6|1 | 2 | 0 | 0 | 0 | 0 | 0 | 0 | 41 | 0 | 0 | 0 | 0 | 0 | 0 | 7 | 
