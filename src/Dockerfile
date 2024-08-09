# 기본 이미지로 OpenJDK 17을 사용합니다.
FROM openjdk:17-jdk-slim

# 작업 디렉토리를 설정합니다.
WORKDIR /app

# Gradle 빌드를 위해 필요한 파일들을 복사합니다.
COPY build.gradle settings.gradle gradlew* ./
COPY gradle /app/gradle

# 의존성 설치를 위해 Gradle을 실행합니다.
RUN ./gradlew build --no-daemon || return 0

# 소스 코드를 복사합니다.
COPY src ./src

# 애플리케이션을 빌드합니다.
RUN ./gradlew build --no-daemon

# JAR 파일을 실행합니다.
CMD ["java", "-jar", "build/libs/yulpoint-application.jar"]
