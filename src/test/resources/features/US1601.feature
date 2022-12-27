@nese
Feature: US1601

  Scenario: History page gorulmeli

  Given Open browser go to url "myUrl"
  Then  User clicks on the login link, enters "mailnevzat" and "passwordnevzat" and logs in.
  Then  User clicks on dashboard link
  Then User clicks Purchase History section on dashbord page
  Then User verifies that Purchase History page is accessible
  Then Closes the page


