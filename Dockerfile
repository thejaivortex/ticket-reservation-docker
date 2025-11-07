# Use official OpenJDK 17 image
FROM eclipse-temurin:17-jdk

# Set working directory inside container
WORKDIR /app

# Copy all source files to the container
COPY ./src /app/src

# Compile Java source files
RUN mkdir /app/out && javac -d /app/out $(find /app/src -name "*.java")

# Run the main class and keep container alive
CMD ["sh", "-c", "java -cp /app/out com.mycompany.assessment_04.Assessment_04 && tail -f /dev/null"]

# Expose port (optional, to silence Render warning)
EXPOSE 8080
