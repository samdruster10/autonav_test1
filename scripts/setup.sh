#!/bin/bash

echo "🚀 Setting up AutoNav Fleet Management System..."

# Check Java installation
if ! command -v java &> /dev/null; then
    echo "❌ Java is not installed. Please install Java 11 or higher."
    exit 1
fi

echo "✅ Java version:"
java -version

# Check Maven installation
if ! command -v mvn &> /dev/null; then
    echo "⚠️  Maven not found, using Maven wrapper..."
fi

echo "📦 Building project..."
./mvnw clean package -DskipTests -q

if [ $? -eq 0 ]; then
    echo "✅ Build successful!"
else
    echo "❌ Build failed!"
    exit 1
fi

echo "✅ Setup complete! Run './scripts/build.sh' to build or './scripts/deploy.sh' to deploy."
