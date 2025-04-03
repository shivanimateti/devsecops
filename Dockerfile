# Use official OpenJDK image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy Maven dependencies and application JAR
COPY target/demo-1.0.0.jar app.jar

# Expose port
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "app.jar"]
