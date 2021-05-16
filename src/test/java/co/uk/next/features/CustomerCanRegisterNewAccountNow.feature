Feature: New account
  As customer
  I want to be able to open account
  So I buy items of my choice

  Scenario Outline:  Customer Open new account
    Given I navigate to next homepage
    When I click on "<REGISTER NOW>" button
    And I select "<MyTitle>" from Title dropdown
    And I enter "<FirstName>" into the Name field
    And  I enter "<LastName>" into the Last name text box
   When I enter "<Email>" into the Email field
    And I enter "<Password>" into the Password text box
    And I enter "<DateOfBirth>" in the Date of birth searchfield
    And I enter "<ContactTelephone>" into the Telephone text box
    And I enter "<House No./ Name>" into the text box
    And I enter "<Postcode>" into the text box
    And I click on FIND button
    Then I select address from "<PleaseSelectAddress>" dropdown
    And I click on click "<GREAT,REGISTERMYACCOUNT>" button
    Then welcome to next is displayed
    And I click on "<ShopNow>" tab button
    And my account is displayed

    Examples:
      | REGISTER NOW | MyTitle | FirstName | LastName | Email | Password | DateOfBirth | ContactTelephone | House No./ Name | Postcode | PleaseSelectAddress | GREAT,REGISTERMYACCOUNT | ShopNow |
     |Register now  |   Mr      |  Tunde         |  Ade        | tunadng@yahoo.com      |   07809127596       |  45           |   M24 2FZ               |45 Fern Close Middleton Manchester                 |          |                     |                         |         |