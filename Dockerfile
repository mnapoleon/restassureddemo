FROM gradle:8.5-jdk21 as BUILD
COPY . /app
WORKDIR /app
RUN ./gradlew -Dorg.gradle.daemon=false bootJar

FROM eclipse-temurin:21.0.1_12-jdk-alpine
COPY --from=BUILD /app/build/libs/rademo-*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
