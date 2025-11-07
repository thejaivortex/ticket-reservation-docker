
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

# Use official OpenJDK base image
FROM openjdk:17-jdk-slim

# Set working directory inside container
WORKDIR /app

# Copy all source files to the container
COPY ./src /app/src

# Compile Java source files
RUN mkdir /app/out && javac -d /app/out $(find /app/src -name "*.java")

# Run the main class
CMD ["sh", "-c", "java -cp /app/out com.mycompany.assessment_04.Assessment_04 && tail -f /dev/null"]


