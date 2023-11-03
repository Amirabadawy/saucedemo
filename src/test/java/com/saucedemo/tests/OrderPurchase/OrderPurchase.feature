Feature: Check making order and logout

  Scenario Outline: Validate E2E scenario for making order
    Given login with valid username "<userName>" and valid password "<password>"
    When click on add to cart button in home page
    And click on cart icon in home page
    And click on checkout button in cart page
    And enter first name "<firstName>", last name "<lastName>", and postal code "<postalCode>" in checkout info page
    And click on finish button in checkout page
    And click on side menu button in home page
    And click on Logout button in side menu
    Examples:
      | userName      | password     | firstName     | lastName     | postalCode |
      | standard_user | secret_sauce | Amira         | Mustafa      | 11711      |