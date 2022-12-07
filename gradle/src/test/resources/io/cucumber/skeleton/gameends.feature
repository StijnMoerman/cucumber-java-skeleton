Feature: Game Ends

  Scenario Outline: game does turns as expected and ends
    Given I have a game
    When a turn is executed with bowl <bowl1> 
    And a turn is executed with bowl <bowl2> 
    And a turn is executed with bowl <bowl3> 
    And a turn is executed with bowl <bowl4> 
    And a turn is executed with bowl <bowl5> 
    And a turn is executed with bowl <bowl6> 
    And a turn is executed with bowl <bowl7> 
    And a turn is executed with bowl <bowl8> 
    And a turn is executed with bowl <bowl9> 
    And a turn is executed with bowl <bowl10> 
    And a turn is executed with bowl <bowl11> 
    And all stones are send to the next Kalaha
    And I consider the current game scenario
    Then the game is finished
    And it is the turn of player <player>
    And player 1 has <points1> points
    And player 2 has <points2> points
    And the current game scenario is like 
      | <st1> | <st2> | <st3> | <st4> | <st5> | <st6> | <st7> | <st8> | <st9> | <st10> | <st11> | <st12> | <st13> | <st14> | 

    Examples:
      | bowl1 | bowl2 | bowl3 | bowl4 | bowl5 | bowl6 | bowl7 | bowl8 | bowl9 | bowl10 | bowl11 | player | points1 | points2 | st1 | st2 | st3 | st4 | st5 | st6 | st7 | st8 | st9 | st10 | st11 | st12 | st13 | st14 |
      | 3 | 6 | 2|3|1|4|1|5|1|6|1 | 2 | 41 | 7 | 0 | 0 | 0 | 0 | 0 | 0 | 41 | 0 | 0 | 0 | 0 | 0 | 0 | 7 | 
