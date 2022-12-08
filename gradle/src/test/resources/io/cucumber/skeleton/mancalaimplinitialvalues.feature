Feature: Mancala Initial Values

  Scenario: mancala has initial values as expected
    Given I have a Mancala game
    When I consider the state of the current Mancala game
    Then the Mancala game is not finished yet
    And it is the turn of player 1 in Mancala
    And the winner of Mancala is 0
    And the state of the current Mancala game is like 
      | 4 | 4 | 4 | 4 | 4 | 4 | 0 | 4 | 4 | 4 | 4 | 4 | 4 | 0 | 
