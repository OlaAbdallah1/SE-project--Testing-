Feature: Administrator LogOut 
Scenario Outline: Administrator logs out
		Given admin with "<username>" and "<password>" want to log out
		When logged out
		Then Message displayed LogOut!
		
Examples:
|username     | password  |
|ola          |123@       |
|danashami    |456#       |
|aya          |789$       |
|ayaa         |160        |