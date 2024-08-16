Feature: Amazon Login Document
  I want to use this document to write login test cases

 @amazon @uid
 Scenario: Userid Test
    Given browser "chrome" is open with url "https://www.amazon.in" and reportname "LoginTest" with testname "UidTest"
    And i click signin
    When I enter valid userid "paragguide@yahoo.co.in"
    And click continue button
    Then I validate that error message should not come

@amazon @pwd    
Scenario: Password Test
  Given userid is valid
  When valid password "RMinfotech12#&&" is entered 
  Then i should login
 
 @amazon @search
 Scenario Outline: Search Test 
   Given i am logged in
   When i search for <productname> in price range <price>
   Then search results must come
   
  @data1 
  Examples:
  | productname | price |
  | Shirt | 1000 |
  | Pant | 5000 |
  | Tie | 500 | 
  
  @data2
  Examples:
  | productname | price |
  | Sun Glasses | 700 |
  | kids wear | 1200 |
  
  @amazon @close
  Scenario: close browser
   Given test is executed
   Then close Browser
   
   @amazon @forget
   Scenario: forget test
   Given i open browser "chrome" and enter url "https://www.amazon.in/" initialize report "ForgetReport" and testname "forgettest"
   And click on sigin link
   And click needhelp link and forget password link
   When i enter mobile number "9810926239"
   And click on ctnbtn button
   Then i should get OTP
   