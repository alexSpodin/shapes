# SHAPES Spring Boot Application
Spring-Boot Rest API application that accepts input for calculating the area
and perimeter of different geometric shapes.

# Install & Run
1. Clone this repository
1. `mvn spring-boot:run` in root directory

# Endpoints
* "/api/v1/shape/{TYPE}/calculate" single REST API endpoint that accepts 
  * {TYPE} - placeholder for shape type (CIRCLE,TRIANGLE,RECTANGLE,SQUARE acceptable)
  * each shape should have required query parameters (i.e. ?dimension={double value}) with its dimensions (positive only)
    * CIRCLE - 1 dimension
    * TRIANGLE - 3 dimensions
    * RECTANGLE - 2 dimensions 
    * SQUARE - 1 dimension
* 200 OK status code for successful response
* 400 Bad request status code for validation errors


