#Author: Valeria Rivera Diossa
@Test
Feature: carry out the completion of the form in order to create a new username.

  @NewUser
  Scenario Outline: fill out the form to create a new user
    Given Valeria going to create a new user
      |firstname  |lastname  |email  | month | day | year |languages   |city  |postal  |model  |syos  |password  |
      |<firstname>|<lastname>|<email>|<month>|<day>|<year>|<languages> |<city>|<postal>|<model>|<syos>|<password>|

    When Valeria going to into sign in
      |email  |password  |
      |<email>|<password>|

    Then Valeria going to  verify her account
      | email |
      |<email>|
    Examples:
      |firstname|lastname|email                         |month |day|year|languages|city                         |postal| model   |syos    |password        |
      | Valeria |Diossa  |valved56@chartering.com|August| 7 |1993|Span     |Medellin, Antioquia, Colombia|050001|iPhone 4 |iOS 11.3|Retotecnico2021+|