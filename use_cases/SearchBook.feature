Feature: Search Book

#-----Title-------
Scenario Outline: Searching for a substring of the title
 Given a book with the title "<title>"
    When the customer searches for books have a substring "<subtitle>"
  Then 2 books should have been found
     And Book should have the title "<title>"  
     
 Examples: 
   |title                             |subtitle |
   |Test-Drivenest Driven Development |Dev      |
   |Web Development                   |Dev      |  
   |OOP - Object Oriented Programming |Object   |
   |Test Book                         |Test     |
   |Done Book                         |sale     | 
 
#-------Author----------   
Scenario Outline: Searching for a substring of the author
 Given a book for author "<author>"
    When the customer searches for book's author have a substring "<subauthor>"
  Then 1 books for the author should have been found
  And Book should have for "<author>" 
   
     Examples:
	|author       |subauthor |
	|Kent Beck    |Beck      |
	|Jon Bloch    |Jon       |
    |Jon Brown    |Jon       |
    |Ola Abdallah |Ola       |
    |Dana Shami   |au        |
    
 
#-----Signature---------    
Scenario Outline: Searching for a substring of the signature
 Given a book  with signature "<signature>"
    When the customer searches for book with signature have a substring "<subsignature>"
  Then 1 books with this signature should have been found
  And Book should have with signature "<signature>"
 
     Examples:
	|signature     |subsignature|
	|Beck2002      |200         |
	|Bloch2007     |200         |
    |Brown2002     |200         |
    |Abdallah2010  |Abd         |
    |Shami2021     |15          |   

  
    
    
 #-----ISBN---------    
Scenario Outline: Searching for a book with ISBN
 Given a book  with ISBN "<iSBN>"
    When the customer searches for book with ISBN "<iSBN>"
  Then 1 books with this ISBN should have been found
  And Book should have with ISBN "<iSBN>"
 
     Examples:
	|iSBN          |
	|1499311095    |
	|1066199591    |
    |007462542X    |  
    |10658714      |
    |007462542a    |