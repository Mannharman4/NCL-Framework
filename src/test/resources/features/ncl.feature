#Author: ncl
@tag1
Feature: filtering cruises

Scenario: Client filters cruises by destination and price 
Given Client searches for"<String>" on "<String>"
And sees a "<String>" on the first dispalyed cruise
When the cleint selects "<String>" 
And navigates to "<String>" section 
Then at least one Category Meta "<string>" should match the adverised "<string>"
