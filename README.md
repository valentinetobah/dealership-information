# Simple Spring boot Application for Capturing and Modifying Dealearship Information

For Testing checkout code on local and run the below commands to start application withthe default speficied settings on the properties file

1. mvn clena install

2. mvn spring-boot:run

On Successful start up the databse tables will be created from the specified entities and data.sql entries will be loaded unto the variuos database tables

## Below are some of the available services

### Retrieve the available countries
GET  http://localhost:8080/countries

### Retrieve the available provinces for a given country in ASC order
GET  http://localhost:8080/countries/{countryCode}/provinces


### Retrieve List of Dealerships available
GET http://localhost:8080/dealerships

### Capture Dealership information
POST http://localhost:8080/dealerships

Sample Payload

{
    "dealershipName": "BMW Midrand 001",
    "line1": "1 Olea Road",
    "line2": "Rosa Royale Estate",
    "suburb": "Summerset",
    "city": "Midrand",
    "province": {
        "provinceCode": "GP",
        "name": "Gauteng",
        "country": {
            "countryCode": "ZA",
            "name": "South Africa"
        }
    },
    "postalCode": 1685
}


### Update existing Dealership information
PUT http://localhost:8080/dealerships/{dealershipId}

