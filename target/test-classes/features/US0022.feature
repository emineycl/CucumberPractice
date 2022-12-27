
Feature: US22

    Scenario: TC_2201 Kullanici My account sayfasinin gorulur oldugunu dogrular

  Given Open browser go to url "myUrl"
  Then  User clicks on the login link, enters "maillife" and "passwordlife" and logs in.
  Then  User clicks on dashboard link
  Then  User clicks My Account section on dashbord page
  Then  User verifies that the page is accessible
  And   Closes the page


        Scenario: TC_2203 Kullanici sunu yapmali

        Given Open browser go to url "myUrl"
        Then  User clicks on the login link, enters "maillife" and "passwordlife" and logs in.
        Then User clicks on dashboard link
        Then User clicks My Account section on dashbord page
        Then Verifies that the Basic Info tab contains First Name, Last Name,Email Address, Phone Number, Date of Birth, Description,Text Box
        Then Closes the page

          Scenario:
            Then  User clicks on the login link, enters "mailnevzat" and "passwordnevzat" and logs in.

