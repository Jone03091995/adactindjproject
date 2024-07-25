Feature: Book A Hotel In The Adactin Application

@smoketest
Scenario: User Login Into The Adactin Application

Given User Launch The Adactin Webpage 
When User Enters The Username In The Username Field 
And User Enters The Password In The Password Field
And User Clicks The Login Button And It Navigates To Search Hotel Page
And User Select The location In The Search Hotel Field
And User Select The Number Of Rooms In The The Search Hotel Field
And User Select The Adults Per Room In The The Search Hotel Field
And User Clicks  The Search Button And It Navigates To Select Hotel Page
And User Select The Hotel In The The Select Hotel Field
And User Clicks  The Continue Button And It Navigates To  Hotel Book   Page
And User Enters The Name In First Name Field
And User Enters The Last Name In First Name Field
And User Enters The  Address In Billing Address Field
And User Enters The  Credit No In Card No Field
And User Select The  Card Type  In The Credit  Card Type Field
And User Select Month  In The Expiry Date Field
And User Select Year  In The Expiry Date Field
And User Enters The  Cvv No In Cvv Number Field
And User click The   Book Now Button In Book Now Field
Then User Take Screenshot The Hotel Confirmation Page And Report