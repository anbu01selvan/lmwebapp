FROM eclipse-temurin:17
COPY target/lmwebapp.jar lmwebapp.jar
CMD ["java","-jar","lmwebapp.jar"]