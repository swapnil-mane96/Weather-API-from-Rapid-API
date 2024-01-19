# Weather-API-from-Rapid-API
In this Spring Boot project, I've fetched the data of weather using Rapid API.

#Steps to check working of code:
1. Download/clone this repo into your laptop.
2. Open the project in IDE (STS/IntelliJ)
3. Run the project as a spring boot application.
4. Open postman -> localhost:8080/weather/forecastSummaryByLocationName use this url for API 1 -> select GET call and hit on Send button. You will get the data.
5. Follow the same step for localhost:8080/weather/hourlyForecastByLocationName -> select GET call and hit on Send button. You will get the data.

NOTE: Don't hit Request more than 10 times a day, because I have used free version of Rapid API if you try to do so then it will throw an INTERNAL_SERVER_ERROR.

Thanks,
Swapnil Mane
