
Feature: US 0003 Test For Social Media Icons

  Scenario: TC 0301 Facebook, Twitter, LinkedIn icons should be visible


    Given  Kullanici "myUrl" sayfasina gider
    Then   Click cookies pop-up message
    Then   Test if Facebook, Twitter, LinkedIn icons are visable
    Then   Sayfayi kapatir

  Scenario:  TC_0302 Facebook, Twitter, LinkedIn icons should be clickable

    Given  Kullanici "myUrl" sayfasina gider
    Given  Click cookies pop-up message
    Given  Test if Facebook, Twitter, LinkedIn icons are clickable
    Then   Sayfayi kapatir

  Scenario: TC_0303 After clicking the Facebook, Twitter, LinkedIn icons,The company-related pages should be visible.

    Given Kullanici "myUrl" sayfasina gider
    Given Click cookies pop-up message
    Then  Click Facebook icon
    Then  Test if Quality Demy's Facebook page is visible
    Then  Click Twitter icon
    Then  Test if Quality Demy's Twitter page is visible
    Then  Click LinkedIn icon
     And  Test if Quality Demy's LinkedIn page is visible
    Then  Sayfayi kapatir