#Author: chari.subbu81@gmail.com
@Functional
Feature: Title of your feature
  I want to use this template for my feature file

  @Smoke
  Scenario Outline: Title of your scenario outline
    Given Navigate to flight booking portal
    When User enters from city "<Source>"
    And User enters destination city "<Destination>"
    And Search for a given flight
    Then Get the fares
    When Selects best itinerary 

    Examples: 
      | Source    | Destination |
      | Hyderabad | Bengaluru   |
