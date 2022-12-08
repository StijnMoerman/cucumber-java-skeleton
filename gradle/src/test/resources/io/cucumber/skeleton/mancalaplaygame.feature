Feature: Mancala Play Game

  Scenario Outline: mancala plays game as expected
    Given I have a Mancala game
    When Mancala executes a turn on bowl <bowl1>
    When Mancala executes a turn on bowl <bowl2>
    When Mancala executes a turn on bowl <bowl3>
    And I consider the state of the current Mancala game
    Then the Mancala game is not finished yet
    And it is the turn of player <player> in Mancala
    And the winner of Mancala is 0
    And the state of the current Mancala game is like 
      | <st1> | <st2> | <st3> | <st4> | <st5> | <st6> | <st7> | <st8> | <st9> | <st10> | <st11> | <st12> | <st13> | <st14> |

  Examples:
    | bowl1|bowl2|bowl3 | player |st1 | st2 | st3 | st4 | st5 | st6 | st7 | st8 | st9 | st10 | st11 | st12 | st13 | st14 |
    | 6 | 1 | 4 | 2 | 4 | 4 | 4 | 0 | 5 | 1 | 2 | 1 | 6 | 6 | 5 | 5 | 5 | 0 | 
    | 6 | 3 | 1 | 2 | 0 | 5 | 5 | 5 | 5 | 0 | 7 | 0 | 5 | 0 | 5 | 5 | 5 | 1 | 
    | 1 | 1 | 1 | 1 | 0 | 5 | 5 | 5 | 5 | 4 | 0 | 0 | 5 | 5 | 5 | 5 | 4 | 0 | 