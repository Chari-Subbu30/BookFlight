#Author: chari.subbu81@gmail.com
@Functional
Feature: Book a flight 
  I want to use this template for booking a flight

  @Smoke
  Scenario Outline: Booking a flight based on Source and Destionation
    Given Navigate to flight booking portal
    When User enters from city "<Source>"
    And User enters destination city "<Destination>"
    And Search for a given flight
    Then Get the fares
    When Selects best itinerary 

    Examples: 
      | Source    | Destination |
      | Hyderabad | Bengaluru   |
