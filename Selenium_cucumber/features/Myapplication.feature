	Feature: Test Newtours smoke scenario

	Scenario:  Test login with valid credentials
Given Open firefox and start application
When I enter valid username "mercury" and valid password "mercury"
Then user should be able to login successfully

