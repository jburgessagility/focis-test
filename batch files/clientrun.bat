@echo off
 setlocal enableextensions disabledelayedexpansion

    call :getTime now

    set "task=day"
    if "%now%" lss "02:20:00,00" ( set "task=night" ) 
    if "%now%" geq "02:00:00,00" ( set "task=night" )

    call :task_%task%

    endlocal
    exit /b

:task_day
    java -jar testjames.jar
	sleep 1200

    goto :eof

:task_night
    start sendmail.jar
    goto :eof

:getTime returnVar [time]
    setlocal enableextensions disabledelayedexpansion

    :: Retrieve parameters if present. Else take current time
    if "%~2"=="" ( set "t= %time%" ) else ( set "t= %~2" )

    :: Test if time contains "correct" (usual) data. Else leave
    echo(%t%|findstr /i /r /b /e /c:"[0-9:,.apm -]*" >nul || ( endlocal & exit /b )

    :: Check if 24h time adjust is needed
    if not "%t:pm=%"=="%t%" (set "p=12" ) else (set "p=0")

    :: Separate the elements of the time string
    for /f "tokens=1-5 delims=:.,-PpAaMm " %%a in ("%t:* =%") do (
        set "h=%%a" & set "m=00%%b" & set "s=00%%c" & set "c=00%%d" 
    )

    :: Adjust the hour part of the time string
    set /a "h=100%h:*0=%+%p%"

    :: Clean up and return the new time string
    endlocal & if not "%~1"=="" set "%~1=%h:~-2%:%m:~-2%:%s:~-2%,%c:~-2%" & exit /b