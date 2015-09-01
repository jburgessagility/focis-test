color 04
set testvar="3600"
:loop
::start cmd /k "color 2&run java -jar testjames.jar"
start java -jar jamesie.jar 8
timeout /t %testvar% /nobreak
taskkill /f /im java.exe
taskkill /f /im firefox.exe
start java -jar sendmail.jar 
timeout /t 30 /nobreak
taskkill /f /im java.exe
java -jar getmail.jar 
"C:\Program Files\R\R-3.2.1\bin\R.exe" CMD BATCH --vanilla --slave "masterpiece.R"
java -jar servermail2.jar
goto loop

