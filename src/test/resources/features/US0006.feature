@levent
Feature: US0006
  Scenario Outline: KULLANICI YANLIS BILGILER ILE GIRIS YAPAMAZ

     Given Open browser go to url "myUrl"
     Then  User clicks on the login link, enters "<mailnevzat>" and "<passwordnevzat>" and logs in.
     Then  User verifies that (These credentials do not match our records.) message appears in the corner
     Then  Closes the page
    Examples:
      | mailnevzat  | passwordnevzat |
      | yanlismail  | yanlispassword |
      | yanlismail2 | yanlispassword2 |
      | yanlismail3 | yanlispassword3 |
      | yanlismail4 | yanlispassword4 |
      | yanlismail5 | yanlispassword5 |




