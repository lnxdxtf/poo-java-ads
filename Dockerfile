# Use a image base OpenJDK 11
FROM openjdk:11-jdk-slim

# Define workdir on container 
WORKDIR /app

# Copy the project to the container
COPY . .

# Give permission to execute the Gradle Wrapper
RUN chmod +x ./gradlew

# Compile the project
RUN ./gradlew build

# Expose the port 8080
EXPOSE 8000

# Start the application
CMD ["java", "-jar", "./app/build/clinicproject_app.jar"]

# CMD ["tail", "-f", "/dev/null"]
