Feature: Pregnancy+ Homepage
This feature verifies the functionality on Pregnancy+ 
 

@PregCreateAccount
Scenario: Verify CreateAccount in Baby+
 
Given I am in HomeScreen of BabyPlus
Then I navigate to JoinUs Screen
When I enter the philips account credentials 'devicefarm@philips.com' with password '#Welcome123' 
And I verify that I am in Today Screen

@PregLogin
Scenario: Verify Login functionality on Pregnancy+ screen

Given I verify that I am in Login Screen
Then I enter Email Address and Confirm Email
And I enter Password
Then I choose Continue
And I verify that I am in Today Screen

@ChooseBaby
Scenario: Verify Choose Baby functionality in Pregnancy+

Given I verify that I am in Today Screen
Then I tap the image
And I swipe to choose babay
When I download Baby Image
Then I navigate back to Today Screen
And I verify that I am in Today Screen

@TrackerOptions
Scenario: Verify Tracker Options

Given I verify that I am in Today Screen
Then I navigate to more options screen
And I verify that I am in more options screen
Then I see Shortcut options 'Shop', 'KickCounter', 'HospitalBag', 'Contractions', 'Feedback', 'FAQs'.

@TrackerShop
Scenario: Verify Shop functionality 

Given I verify that I am in Today Screen
Then I navigate to more options screen
And I verify that I am in more options screen
Then I navigate to Shop Screen
Then I choose Baby Care
And I select an item
Then I navigate to MyItems
When I verify that Item Is Present

@Logout
Scenario: Verify LogOut functionality 

Given I verify that I am in Today Screen
Then I choose MyProfile Icon
Then I choose Signout


