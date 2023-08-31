FROM eclipse-temurin:17
COPY target/appdev.jar appdev.jar
CMD ["java","-jar","appdev.jar"]