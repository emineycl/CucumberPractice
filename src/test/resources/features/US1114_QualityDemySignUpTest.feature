@life
Feature: US1114 Signup Testi

  Scenario Outline: Kullanici yanlis formatta bilgiler girdiginde uyelik hesabi olusturamamali

    Given Kullanici "myUrl" sayfasina gider
    Then  Kullanici demy sayfasinda Signup linkine tiklar
    Then  Kullanici Firstname box a "<istenenIsim>" gonderir
    Then  Kullanici Lastname box a "<istenenSoyisim>" gonderir
    Then  Kullanici Email box a "<istenenMail>" gonderir
    Then  Kullanici Password box a "<istenenPassword>" gonderir
    Then  Kullanici demy sayfasinda Signup Butonuna tiklar
    Then  Kullanici uye hesabi olusturmaadigini test eder
    And   Sayfayi kapatir
   Examples:
     | istenenIsim | istenenSoyisim  | istenenMail  | istenenPassword   |
     | yanlisisim  |  dogrusoyisim   | yanlismail   | yanlispassword    |
     | dogruisim   |  yanlissoyisim  | yanlismail2  | dogrusifre        |
     | yanlisisim  |  dogrusoyisim   | yanlismail3  | yanlispassword    |
     | dogruisim   |  yanlissoyisim  | yanlismail4  | dogrusifre        |
     | yanlisisim  |  yanlissoyisim  | yanlismail5  | dogrusifre        |
     | yanlisisim  |  yanlissoyisim  | yanlismail5  | yanlispassword    |
     | yanlisisim  |  yanlissoyisim  | yanlismail5  | yanlispassword2   |
     | yanlisisim  |  yanlissoyisim  | yanlismail5  | yanlispassword3   |
     | yanlisisim  |  yanlissoyisim  | yanlismail5  | yanlispassword4   |
     | yanlisisim  |  yanlissoyisim  | yanlismail5  | yanlispassword5   |
     | dogruisim   |   dogrusoyisim  | dogruemail   | yanlispassword4   |








