# Use OpenJDK 17 base image
FROM openjdk:17-jdk-slim

# Set working directory in the container
WORKDIR /app

# Copy the built JAR file to the container
COPY target/*.jar app.jar

# Expose port (default Spring Boot port)
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]