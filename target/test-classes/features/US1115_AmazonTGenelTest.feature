Feature: US1115 Aamazon Genel Testi
@nevzat
  Scenario Outline: Kullanici Drop downdan urun secip onu aratir,sonuclari karsilastirir

    Given Kullanici "amazonUrl" sayfasina gider
    Then  Kullanici arama kutusundaki drop down menusunden "<istenilenMenu>" secer
    Then  Kullanici amazon arama kutusunda "<istenilenKelimeyi>" arama yapar
    Then  Kullanici arattigi "<istenilenKelime>" test eder
    And   Sayfayi kapatir
  Examples:
    | istenilenMenu        |istenilenKelimeyi| istenilenKelime|
    | Arts & Crafts        |  Mona Lisa      | Mona Lisa      |
    | Automotive           |  Lastik         |   Lastik       |
    | Baby                 |  Biberon        |    Biberon     |
    |Beauty & Personal Care|  Krem           |      Krem      |
    | Books                | Namik Kemal     |    Namik Kemal |
    | Computers            |    Asus         |       Asus     |



