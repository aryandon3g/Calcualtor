@echo off
echo ==========================================
echo      Android APK Build Helper
echo ==========================================
echo.
echo Checking for Java...
java -version >nul 2>&1
if %errorlevel% neq 0 (
    echo [ERROR] Java is NOT installed or not in PATH.
    echo You need to install Android Studio or Java JDK 11+.
    echo.
    echo Please download Android Studio: https://developer.android.com/studio
    echo.
    pause
    exit /b
)

echo Java found. Checking for Gradle...
call gradle -version >nul 2>&1
if %errorlevel% neq 0 (
    echo [WARNING] Gradle not found in PATH.
    echo We will try to use the project wrapper if available, or you should open this project in Android Studio.
    echo.
)

echo.
echo To build the APK:
echo 1. Open Android Studio.
echo 2. Select "Open" and choose this 'android_src' folder.
echo 3. Click the Green "Run" button (Play icon).
echo.
echo If you want to build from command line and have Android SDK installed:
echo    gradlew assembleDebug
echo.
pause
