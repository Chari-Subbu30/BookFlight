$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Flight_Booking.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: chari.subbu81@gmail.com"
    }
  ],
  "line": 3,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
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
  "name": "Title of your scenario outline",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario-outline",
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
  "id": "title-of-your-feature;title-of-your-scenario-outline;",
  "rows": [
    {
      "cells": [
        "Source",
        "Destination"
      ],
      "line": 16,
      "id": "title-of-your-feature;title-of-your-scenario-outline;;1"
    },
    {
      "cells": [
        "Hyderabad",
        "Bengaluru"
      ],
      "line": 17,
      "id": "title-of-your-feature;title-of-your-scenario-outline;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "Title of your scenario outline",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario-outline;;2",
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
  "duration": 12613898000,
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
  "duration": 6545672900,
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
  "duration": 8045626000,
  "status": "passed"
});
formatter.match({
  "location": "HomePage_StepDefinitions.search_for_a_given_flight()"
});
formatter.result({
  "duration": 3628338000,
  "status": "passed"
});
formatter.match({
  "location": "ResultsPage_StepDefinition.get_the_fares()"
});
formatter.result({
  "duration": 4498652900,
  "status": "passed"
});
formatter.match({
  "location": "ResultsPage_StepDefinition.selects_best_itinerary()"
});
formatter.result({
  "duration": 4148044000,
  "status": "passed"
});
});