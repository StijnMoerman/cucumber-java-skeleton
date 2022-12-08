Feature: Game Initial Values

  Scenario: game has initial values as expected
    Given I have a game
    When I consider the current game scenario
    Then the game is not finished yet
    And it is the turn of player 1
    And player 1 has 0 points
    And player 2 has 0 points
    And the current game scenario is like 
      | 4 | 4 | 4 | 4 | 4 | 4 | 0 | 4 | 4 | 4 | 4 | 4 | 4 | 0 | 

