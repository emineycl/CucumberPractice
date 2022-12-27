
Feature: US 1113 Automation Negatif Giris Testi

  Scenario Outline: Kullanici negatif bilgiler gonderdiginde giris yapilamaz

    Given Kullanici "myAutomationUrl" sayfasina gider
    Then  Kullanici Signup butonuna tiklar
    Then  Kullanici mail bolumune "<istenenMail>" gonderir
    Then  Kullanici password bolumune "<istenenPassword>" gonderir
    Then  Kullanici login Butonuna tiklar
    Then  Kullanici sayfaya giris yapilamadigini test eder
    Then  Sayfayi kapatir
    Examples:
      | istenenMail           | istenenPassword |
      | automationNegatifMail | automationPassword |
      | automationNegatifMail2 | automationPassword2 |
      | automationNegatifMail3 | automationPassword3 |
      | automationNegatifMail4 | automationPassword4 |

