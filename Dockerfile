# Use a base image with Java
FROM openjdk:11-jre-slim

# Set the working directory
WORKDIR /app

# Copy the jar file (assuming you have built your project)
COPY target/one.jar app.jar  

# Expose the port the app runs on
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "app.jar"]