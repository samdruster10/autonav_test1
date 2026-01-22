# AutoNav Vehicle Tracking Dashboard - Design Updates

## Overview
The web pages have been redesigned to match a professional vehicle tracking dashboard with real-time mapping and status monitoring capabilities.

## Pages Updated

### 1. **Dashboard Page** (`src/main/resources/templates/dashboard.html`)
**Complete redesign** with a three-panel layout matching your reference image:

#### Layout Components:
- **Header Bar** - Dark navigation bar with AutoNav branding and logout button
- **Left Sidebar (Devices List)** - Displays all vehicles in a table format
  - Columns: Vehicle Name, Status, Last Update
  - Click to select vehicles
  - Visual status indicators (green for online, red for offline)
  - Auto-updates every 5 seconds

- **Center Panel (Interactive Map)** - Leaflet-based OpenStreetMap
  - Displays vehicle locations as markers
  - Click markers to view vehicle details
  - Zoom and pan capabilities
  - Responsive to vehicle selection

- **Right Sidebar (State Panel)** - Real-time vehicle information
  - Vehicle ID and Model
  - Current Status
  - Last Updated timestamp
  - GPS Coordinates
  - Speed information

#### Key Features:
- **Real-time Updates**: Auto-refreshes every 5 seconds
- **Interactive Map Integration**: Uses Leaflet.js library
- **Vehicle Tracking**: Click on any vehicle to see details and location
- **Responsive Design**: Works on desktop, tablet, and mobile devices
- **Modern Styling**: Clean, professional blue color scheme

### 2. **Login Page** (`src/main/resources/templates/login.html`)
**Modernized design** with gradient backgrounds and improved UX:

#### Updates:
- **Card-Based Layout**: Centered login card with shadow effects
- **Gradient Headers**: Blue gradient background with vehicle emoji
- **Enhanced Form Styling**: Modern input fields with focus states
- **Demo Credentials Section**: Clearly displayed test accounts
- **Responsive**: Mobile-friendly design
- **Visual Feedback**: Smooth transitions and hover effects

### 3. **Error Pages** 
#### 404 Error Page (`src/main/resources/templates/error/404.html`)
- Modern glassmorphism design
- Emoji icon (🚫)
- Link back to dashboard

#### 500 Error Page (`src/main/resources/templates/error/500.html`)
- Modern glassmorphism design
- Emoji icon (⚠️)
- Professional error messaging

## Technical Improvements

### Libraries Added
- **Leaflet.js**: OpenStreetMap integration for vehicle tracking
- CDN-based: No package.json changes required

### Color Scheme
- **Primary Blue**: `#3498db` - Interactive elements
- **Dark Blue**: `#2c3e50` - Text and headers
- **Light Gray**: `#ecf0f1` - Backgrounds
- **Status Green**: `#27ae60` - Online/Active vehicles
- **Status Red**: `#e74c3c` - Offline/Inactive vehicles

### Responsive Breakpoints
- **Desktop**: Full three-panel layout (1200px+)
- **Tablet**: Adjusted panel widths (768px - 1199px)
- **Mobile**: Stacked layout with collapsible sections (< 768px)

## Running the Application

```bash
# Build the project
./mvnw clean package

# Run the application (on port 8081)
java -jar target/autonav_test-0.0.1-SNAPSHOT.jar --server.port=8081

# Access the application
# Login: http://localhost:8081/login
# Dashboard: http://localhost:8081/dashboard
```

## Demo Credentials
- **Admin**: `admin` / `admin123`
- **User**: `user` / `user123`

## Features

### Dashboard Features
1. **Vehicle List** - View all tracked vehicles with status
2. **Live Map** - See vehicle locations in real-time
3. **Vehicle Details** - Click any vehicle to see:
   - ID and Model
   - Current Status
   - GPS Coordinates
   - Last Updated Time
4. **Auto-Refresh** - Dashboard updates every 5 seconds

### Map Features
- Interactive Leaflet map
- Click markers to select vehicles
- Zoom and pan controls
- Real-time marker positioning

### Visual Indicators
- **Green Dot**: Online/Active vehicle
- **Red Dot**: Offline/Inactive vehicle
- **Status Badge**: Current vehicle status

## Browser Support
- Chrome/Edge (latest)
- Firefox (latest)
- Safari (latest)
- Mobile browsers (iOS Safari, Chrome Mobile)

## Notes
- The map centers on different regions by default for demo purposes
- Vehicle coordinates are simulated for demonstration
- Real integration with GPS devices can be added to the backend API
- MongoDB connection attempts in logs (not critical for demo with H2 database)

## Next Steps for Enhancement
1. Add real GPS tracking API integration
2. Implement vehicle route history
3. Add alerts/notifications for vehicle status changes
4. Implement vehicle clustering for map performance
5. Add geofencing features
6. Implement real-time WebSocket updates instead of polling
