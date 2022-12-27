
Feature: US 0030 Requirements Ekleme Testi

  Scenario: Requirements should be addable with the "+" button



    Given Launch browser Go to url
    Then Click on Login button
    Then Enter correct instructor email address and password
    Then Click on the Instructor button
    Then Click on Course Manager from the menu under Navigation
    Then Click on Add New Course in the upper right corner of the page
    Then Click Requirements from the row under the Course Add Form
    Then Add a box by pressing the green + button.
    And  Log out by closing the page
