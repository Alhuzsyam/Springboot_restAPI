# Full Rest Api Spring boot

<b> get started </b>

first clone the repo in your local computer
after clone the repository, install mysql & phpmyadmin on your laptop, you can use xampp or docker, it most easyly if you setup with docker
if you use docker, just running the command below`

`docker-compose up -d`
it will be build the docker image

the last step just run the spring boot with the command below

`mvn spring-boot:run `


<b> Insert data to database </b>
Methode | #Post 
--- | ---
Path | http://localhost:8080/api/product

`{
	"id": 2,
	"name": "test1",
	"description": "keyboard",
	"price": 200
}`



<b> Get all data </b>
Methode | #Get 
--- | ---
Path | http://localhost:8080/api/product

<b> Get data by id </b>
Methode | #Get 
--- | ---
Path | http://localhost:8080/api/product/{id}

<b> Delete data by id </b>
Methode | #Delete 
--- | ---
Path | http://localhost:8080/api/product/{id}


<b> Update data to database </b>
Methode | #Update
--- | ---
Path | http://localhost:8080/api/product 

`{
		"id": 2,
		"name": "test1",
		"description": "test",
		"price": 200
}`
