# Citizen Plans Report Application

## Overview

Citizen Plans Report Application is a Spring Boot web application used to generate and manage citizen welfare plan reports.
The application provides dynamic search functionality based on multiple criteria and supports exporting reports in Excel and PDF formats.

## Features

* Search citizen plans using:

  * Plan Name
  * Plan Status
  * Gender
  * Start Date
  * End Date
* Display filtered records in a tabular format
* Export reports to Excel using Apache POI
* Export reports to PDF using iText PDF
* Send generated reports through Email
* Dynamic dropdown population from database
* Responsive user interface using Bootstrap

## Tech Stack

* Java 17
* Spring Boot
* Spring Data JPA
* JSP
* MySQL
* Apache POI
* iText PDF
* Maven
* Bootstrap 5

## Project Structure

```text
src/main/java
├── controller
├── entity
├── repository
├── request
├── runner
├── service
└── utils
```

## How to Run

1. Clone the repository
2. Configure MySQL database in `application.properties`
3. Update email configuration if required
4. Run the Spring Boot application
5. Open:
   http://localhost:8080

## Future Enhancements

* Pagination
* Sorting
* Role Based Authentication
* Dashboard and Analytics
* Cloud Deployment

## Author

**Md Shahnawaz Alam**

GitHub: https://github.com/Shahnawaz70
