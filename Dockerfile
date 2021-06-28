FROM openjdk:11
ADD target/weather-persistence.jar weather-persistence.jar
EXPOSE 8091
ENTRYPOINT ["java", "-jar", "weather-persistence.jar"]