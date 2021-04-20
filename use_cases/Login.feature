Feature: Admin Login 
Scenario Outline: Administrator can log in with valid credentials
		Given admin want to log in with user name "<username>" and pass "<password>"
		When logged in
		Then Message displayed Login Successfully
		
Examples:
|username     | password  |
|ola          |123@       |
|danashami    |456#       |
|aya          |789$       |



Scenario Outline: Administrator has the wrong password
Given admin want to log in with wrong password "<username>" and pass "<password>"
When logged in
Then Message displayed Login UnSuccessfully 
Examples:
|username     | password  |
|ola          |123       |
|danashami    |456       |
|aya          |789       |