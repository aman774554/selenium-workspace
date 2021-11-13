Feature: TestModules
Scenario: way2sms successful login with valid credentials

Given User is present on way2sms login page
When Title of the login Page is free SMS to India
Then User Enter the PhoneNumber and Password
Then User Click Login Button