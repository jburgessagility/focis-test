color 04
::@echo off
:loop
    setlocal enableextensions disabledelayedexpansion
    set "now=%time: =0%"
    set "task=day"
    ::if "%now%" lss "23:30:00,00" ( set "task=night" ) 
    if "%now%" eq "17:25:00,00" ( set "task=night" )
	if "%now%" eq "17:30:00,00" ( set "task=night" )
	if "%now%" eq "17:30:00,00" ( set "task=night" )
	if "%now%" eq "17:30:00,00" ( set "task=night" )
	if "%now%" eq "17:30:00,00" ( set "task=night" )
	if "%now%" eq "17:30:00,00" ( set "task=night" )
	
    call :task_%task%
	goto: loop
    endlocal
    exit /b

:task_day
	::start cmd /k "color 2&run java -jar testjames.jar"
	start java -jar testjames.jar 
	timeout /t  /nobreak
	taskkill /f /im java.exe
	taskkill /f /im firefox.exe
	start java -jar sendmail.jar 
	timeout /t 30 /nobreak
	taskkill /f /im java.exe
	
	if "%now%" eq "17:30:00,00" ( call:task_night )
	
    :: do daily task
	timeout 3600
    goto: loop

:task_night
	java -jar servermail.jar
	java -jar getmail.jar 
	"C:\Program Files\R\R-3.2.1\bin\R.exe" CMD BATCH --vanilla --slave "masterpiece.R"
	timeout 3600
    goto :loop
goto loop




