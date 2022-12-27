@life
Feature: US1111 AutomationLogin Testi

  Scenario: Kullanici Basarili bir sekilde giris yapabilmeli

    Given Kullanici "myAutomationUrl" sayfasina gider
    Then  Kullanici Signup butonuna tiklar
    Then  Kullanici mail bolumune "mail" gonderir
    Then  Kullanici password bolumune "password" gonderir
    Then  Kullanici login Butonuna tiklar
    Then  Kullanici Automation sayfasina giris yaptigini test eder
    And   Sayfayi kapatir