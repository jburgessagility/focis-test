color 04
:loop
::start cmd /k "color 2&run java -jar testjames.jar"
start java -jar testjames.jar 
timeout /t 360 /nobreak
taskkill /f /im java.exe
taskkill /f /im firefox.exe
start java -jar sendmail.jar 
timeout /t 30 /nobreak
taskkill /f /im java.exe
goto loop

