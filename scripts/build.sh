#!/bin/bash

echo "🔨 Building AutoNav Fleet Management System..."

./mvnw clean package -DskipTests

if [ $? -eq 0 ]; then
    echo "✅ Build successful!"
    echo "JAR file created at: target/autonav_test-0.0.1-SNAPSHOT.jar"
else
    echo "❌ Build failed!"
    exit 1
fi
