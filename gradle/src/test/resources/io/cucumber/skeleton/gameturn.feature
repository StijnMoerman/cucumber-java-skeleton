Feature: Game Turn

  Scenario Outline: game does turn as expected
    Given I have a game
    When a turn is executed with bowl <bowl> 
    And I consider the current game scenario
    Then the game is not finished yet
    And it is the turn of player <player>
    And player 1 has <points1> points
    And player 2 has <points2> points
    And the current game scenario is like 
      | <st1> | <st2> | <st3> | <st4> | <st5> | <st6> | <st7> | <st8> | <st9> | <st10> | <st11> | <st12> | <st13> | <st14> | 

    Examples:
      | bowl | player | points1 | points2 | st1 | st2 | st3 | st4 | st5 | st6 | st7 | st8 | st9 | st10 | st11 | st12 | st13 | st14 |
      | 4 | 2 | 1 | 0 | 4 | 4 | 4 | 0 | 5 | 5 | 1 | 5 | 4 | 4 | 4 | 4 | 4 | 0 | 
      | 3 | 1 | 1 | 0 | 4 | 4 | 0 | 5 | 5 | 5 | 1 | 4 | 4 | 4 | 4 | 4 | 4 | 0 | 
      | 2 | 2 | 0 | 0 | 4 | 0 | 5 | 5 | 5 | 5 | 0 | 4 | 4 | 4 | 4 | 4 | 4 | 0 | 
      | 0 | 1 | 0 | 0 | 4 | 4 | 4 | 4 | 4 | 4 | 0 | 4 | 4 | 4 | 4 | 4 | 4 | 0 | 
      | 7 | 1 | 0 | 0 | 4 | 4 | 4 | 4 | 4 | 4 | 0 | 4 | 4 | 4 | 4 | 4 | 4 | 0 | 
