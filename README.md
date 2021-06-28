# weather-persistence

Create mysql container:

`docker pull mysql`

`docker run --name mysql-standalone -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=test -e MYSQL_USER=sa -e MYSQL_PASSWORD=password -d mysql:8.0.25`

Override properties:

`spring.datasource.password: password` 

`docker build . -t weather-persistence`

`docker run -p 8091:8091 --name weather-persistence --link mysql-standalone:mysql -d weather-persistence`
