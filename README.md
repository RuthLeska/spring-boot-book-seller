# Spring Boot Book Seller

### Endpoints


#### Sign-up

```
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
"name": "Ruth",
"username": "Ruth",
"password": "Ruth"
}
```

#### Sign-in

```
POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{ 
    "username": "Ruth",
    "password": "Ruth"
}
```


#### Make-admin

```
PUT /api/internal/make-admin/admin HTTP/1.1
Host: localhost:8080
Authorization: Bearer InternalApiKey1234!
```



#### Get Purchase History

```
GET /api/purchase-history HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MiwiZXhwIjoxNjYyNzY3NjAyfQ.QIRYlKUWaXoFnqAiJCeZNN-rsie3oYR-SiEsL59wht3Hcdbw5SEiLcTs2O8wSuWMLGNq5O6_DR8G54YAP3_2sg
```


#### Save Purchase History

```
POST /api/purchase-history HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJSdXRoIiwicm9sZXMiOiJST0xFX1VTRVIiLCJ1c2VySWQiOjMsImV4cCI6MTY2Mjc2NzM2MX0.B04jL3e5YgULAexsOExPbRymcXtCSKWd-4CbWvUGSpDcRMoIpcIgJI7y2E78JRhOlLpL6Hb6JCiNq1gk3mv_Sg
Content-Type: application/json
Content-Length: 59

{
    "userId": 2,
    "bookId": 1,
    "price": 10

}
```


#### Save Book

```
POST /api/book HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MiwiZXhwIjoxNjYyNzY2Nzc2fQ.rS_MTZ5lLBZK9KIHCjV7pbsDJy3cWkaL6atajuwHixpCCcxGH1QY20L78U06q1nTgqoq-i1W5kpb7GLH1F3dTA
Content-Type: application/json
Content-Length: 119

{
    "title": "Test Book 2",
    "price": 20,
    "description": "description 2",
    "author": "Test author 2"
}
```

#### Get Book

```
GET /api/book HTTP/1.1
Host: localhost:8080
```


#### Delete Book

```
DELETE /api/book/2 HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MiwiZXhwIjoxNjYyNzY2Nzc2fQ.rS_MTZ5lLBZK9KIHCjV7pbsDJy3cWkaL6atajuwHixpCCcxGH1QY20L78U06q1nTgqoq-i1W5kpb7GLH1F3dTA
```
