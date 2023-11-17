# PAF-API
Created API On Following Condition
Running the Application=> 1) Clone Repository Using git bash: git clone https://github.com/codeWithmanishM/PAF_API.git
                                                              cd PAF-API
                          2)Build the Application using bash : ./mvnw clean install
                          3)Run the Application using bash   : java -jar target/PAF-API-0.0.1-SNAPSHOT.jar
                          4) Access the API using base url : http://localhost:8080
  API EndPoints
  1. Auth Endpoint:Endpoint: `/auth`
                   Method: POST
                   Request body: Json
                                 {
                                    "username": "Manish30",
                                     "password": "Mech@2021"
                                 }
                   Response: Json
                                {
                                    "token": "M30"
                                }
  2.Get Country Information Endpoint:Endpoint: `/country/{countryName}`
                                     Method: GET
                                     Headers: 🔑key= Authorization , Value = Bearer M30
                  Response : {
                                "name": "india",
                                "population": 1000000,
                                "area": 100000,
                                "language": "Hindi"
                                // Other country details
                             }
 3.Filter and Sort Countries Endpoint:Endpoint:`/contries`
                                      Method:GET
                                      Headers: 🔑key= Authorization , Value = Bearer M30
                            Query parameters: `filter `(population/area/language)
                                              `sort `(asc/desc)
                                              `page `(pagination)
                 Response:JSON
                              {
                                    "countries": [
                                                   {
                                                     "name": "Country1",
                                                      // Other country details
                                                    },
                                                    {
                                                     "name": "Country2",
                                                      // Other country details
                                                     },
                                                    // ...
                                                 ] 
                                }

