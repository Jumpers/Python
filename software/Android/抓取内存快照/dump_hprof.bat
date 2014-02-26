@echo off
adb start-server
adb wait-for-device

for /f %%i in (%~dp0target_applications.txt) do (
    java -jar "%~dp0DeveloperTools.jar" %%i
    ping 127.0.0.1 -n 3 > nul
)

ping 127.0.0.1 -n 5 > nul
