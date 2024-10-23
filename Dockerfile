# Use a base image with Java 21
FROM openjdk:21

# Set the working directory
WORKDIR /app

# Copy the JAR file into the container
COPY one.jar app.jar  # Copy the JAR file from the root directory

# Expose the port the app runs on
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "app.jar"]
