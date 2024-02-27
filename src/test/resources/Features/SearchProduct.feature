Feature: Amazon product
@Smoke
Scenario: Search the Product
Given I have a search field on Amazon page
When I search for a product with name "Apple MacBook Air" and Price "200"
Then Product with name "Apple MacBook pro" should be displayed
Then order id is 1234 and user name is "vinay"

@Regression
Scenario: Search the Product
Given I have a search field on Amazon page
When I search for a product with name "Phone" and Price "22200"
Then Product with name "phone" should be displayed
Then order id is 6789 and user name is "vinayit"