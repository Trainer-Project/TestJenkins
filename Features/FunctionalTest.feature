Feature: Valid user can buy the Jupiter All-Weather Trainer jackets and verify the confurmation


@functionalTest
Scenario Outline: 
Given User is able to select Jackets from the man module
When User is able to click on <jackects> from list of jackects
And User is able to select the <size> size
And User is able to select the <color> color and <qty> quantity
And User is able to click on add to cart BTN
And User is able to click on shopping cart on the top
And User is able to click on Proceed to Checkout BTN
And User is able to add the shipping information
And User is able to select shipping method
And User is able to click next BTN
And User is able to click place order
Then User can verify the order confirmation <confirmation>

Examples:
|           jackects        |size|color |qty|        confirmation        |
|Jupiter All-Weather Trainer|  S |Blue  | 1 |Thank you for your purchase!|
|Jupiter All-Weather Trainer|  M |Green | 1 |Thank you for your purchase!|
|Jupiter All-Weather Trainer|  L |Purple| 2 |Thank you for your purchase!|
|Jupiter All-Weather Trainer|  XL|Blue  | 3 |Thank you for your purchase!|






