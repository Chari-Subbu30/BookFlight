$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Flight_Booking.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: chari.subbu81@gmail.com"
    }
  ],
  "line": 3,
  "name": "Book a flight",
  "description": "I want to use this template for booking a flight",
  "id": "book-a-flight",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@Functional"
    }
  ]
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Booking a flight based on Source and Destionation",
  "description": "",
  "id": "book-a-flight;booking-a-flight-based-on-source-and-destionation",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Navigate to flight booking portal",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User enters from city \"\u003cSource\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enters destination city \"\u003cDestination\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Search for a given flight",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Get the fares",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Selects best itinerary",
  "keyword": "When "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "book-a-flight;booking-a-flight-based-on-source-and-destionation;",
  "rows": [
    {
      "cells": [
        "Source",
        "Destination"
      ],
      "line": 16,
      "id": "book-a-flight;booking-a-flight-based-on-source-and-destionation;;1"
    },
    {
      "cells": [
        "Hyderabad",
        "Bengaluru"
      ],
      "line": 17,
      "id": "book-a-flight;booking-a-flight-based-on-source-and-destionation;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 230300,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Booking a flight based on Source and Destionation",
  "description": "",
  "id": "book-a-flight;booking-a-flight-based-on-source-and-destionation;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Functional"
    },
    {
      "line": 6,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Navigate to flight booking portal",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User enters from city \"Hyderabad\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enters destination city \"Bengaluru\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Search for a given flight",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Get the fares",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Selects best itinerary",
  "keyword": "When "
});
formatter.match({
  "location": "HomePage_StepDefinitions.navigate_to_flight_booking_portal()"
});
formatter.result({
  "duration": 7198461400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hyderabad",
      "offset": 23
    }
  ],
  "location": "HomePage_StepDefinitions.user_enters_from_city(String)"
});
formatter.result({
  "duration": 13066721300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bengaluru",
      "offset": 30
    }
  ],
  "location": "HomePage_StepDefinitions.user_enters_destination_city(String)"
});
formatter.result({
  "duration": 12497949600,
  "status": "passed"
});
formatter.match({
  "location": "HomePage_StepDefinitions.search_for_a_given_flight()"
});
formatter.result({
  "duration": 5259812400,
  "status": "passed"
});
formatter.match({
  "location": "ResultsPage_StepDefinition.get_the_fares()"
});
formatter.result({
  "duration": 519698000,
  "status": "passed"
});
formatter.match({
  "location": "ResultsPage_StepDefinition.selects_best_itinerary()"
});
formatter.result({
  "duration": 1103421800,
  "status": "passed"
});
formatter.after({
  "duration": 49200,
  "status": "passed"
});
});