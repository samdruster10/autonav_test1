#!/bin/bash

echo "🚀 Deploying AutoNav Fleet Management System..."

# Build first
echo "Building application..."
./mvnw clean package -DskipTests -q

if [ $? -ne 0 ]; then
    echo "❌ Build failed!"
    exit 1
fi

# Kill existing process if running
if lsof -Pi :8080 -sTCP:LISTEN -t >/dev/null ; then
    echo "⏹️  Stopping existing process on port 8080..."
    kill -9 $(lsof -t -i:8080)
    sleep 2
fi

# Start application
echo "🟢 Starting application..."
java -jar target/autonav_test-0.0.1-SNAPSHOT.jar &

sleep 5

echo "✅ Application started!"
echo "📱 Access at: http://localhost:8080"
echo "🔑 Login credentials:"
echo "   Admin: admin / admin123"
echo "   User:  user / user123"
