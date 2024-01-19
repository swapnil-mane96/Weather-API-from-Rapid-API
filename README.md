# Weather-API-from-Rapid-API
In this Spring Boot project, I've fetched the data of weather using Rapid API.

#Steps to check working of code:
1. Download/clone this repo into your laptop.
2. Open the project in IDE (STS/IntelliJ)
3. Run the project as a spring boot application.
4. Open postman -> localhost:8080/weather/forecastSummaryByLocationName use this url for API 1 -> select GET call and hit on Send button. You will get the data.
5. Follow the same step for localhost:8080/weather/hourlyForecastByLocationName -> select GET call and hit on Send button. You will get the data.

# Added authorize/authenticate to the API
I have added authorize/authenticate to the APIs.
steps:
1. Clone main repo
2. Open project in STS IDE
3. I have used lombok to reduce boilerplate code
4. Configure lombok to your system if not configured sharing link to configure: https://youtu.be/VR7VaiXHJEY?si=nQeYjuHwQjx4hO7N
6. I have used MySQL to register User and to generate JWT Token.
7. So, create new db for this application in your MySQL and give path of your db in application.properties file.
8. run project -> create new user using endpoint http://localhost:8080/users/saveuser -> login with registered user http://localhost:8080/auth/login you will get JWT Token
9. Use JWT token in Headers section of Postman tool by selecting Authorization as a Key and in Value type Bearer<space>paste generated JWT token.
10. You will access API endpoint
   
NOTE: Don't hit Request more than 10 times a day, because I have used free version of Rapid API if you try to do so then it will throw an INTERNAL_SERVER_ERROR.

Thanks,
Swapnil Mane
