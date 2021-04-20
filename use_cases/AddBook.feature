Feature: Add a book
Scenario Outline: Add a book when the administrator is logged in 
Given admin is logged in and want to add  book "<title>" , "<author>" , "<signature>" , and a "<ISBN>" with user "<username>" password "<password>"
	When added book 
Then the book should be added to the library 
		
Examples:
	|title                            |author      |signature     |ISBN         |username      |password  |
	|Test-Drivenest Driven Development|Kent Beck   |Beck2002      |1499311095   |ola          |123@       |
	|Web Development                  |Jon Bloch   |Bloch2007     |1066199591   |danashami    |456#       |
	|OOP - Opject Oriented Programming|Jon Brown   |Brown2002     |007462542X   |aya          |789$       |
	|OOP                              |Jack Brown  |Brown2012     |007462542a   |aya          |789$       |
	|E    Book                        |Ola Abdallah|Abdallah2010  |10658714     |ola          |123@       |	
	|Test Book                        |Ola Abdallah|Abdallah2010  |10658714     |ola          |123        |
	|Done Book                        |Dana Shami  |Shami2021     |007462542-1  |danashami    |456#        |


		
	
	

