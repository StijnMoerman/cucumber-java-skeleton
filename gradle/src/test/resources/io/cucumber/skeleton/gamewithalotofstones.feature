Feature: Game With a Turn With A Lot Of Stones

  Scenario Outline: game executes turn well even with large numbers of stones
    Given I have a game
    When a turn is executed with bowl <bowl1> 
    And a turn is executed with bowl <bowl2> 
    And a turn is executed with bowl <bowl3> 
    And a turn is executed with bowl <bowl4> 
    And a turn is executed with bowl <bowl5> 
    And a turn is executed with bowl <bowl6> 
    And a turn is executed with bowl <bowl7> 
    And I consider the current game scenario
    Then the game is not finished yet
    And it is the turn of player <player>
    And player 1 has <points1> points
    And player 2 has <points2> points
    And the current game scenario is like 
      | <st1> | <st2> | <st3> | <st4> | <st5> | <st6> | <st7> | <st8> | <st9> | <st10> | <st11> | <st12> | <st13> | <st14> | 

    Examples:
      | bowl1 | bowl2 | bowl3 | bowl4 | bowl5 | bowl6 | bowl7 | player | points1 | points2 | st1 | st2 | st3 | st4 | st5 | st6 | st7 | st8 | st9 | st10 | st11 | st12 | st13 | st14 |
      | 3 | 4 | 6|2|1|5|6| 2 | 4 | 2 | 2 | 2 | 3 | 2 | 8 | 0 | 4 | 6 | 6 | 5 | 5 | 1 | 2 | 2 | 
