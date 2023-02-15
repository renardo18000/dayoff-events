@rem
@rem Copyright 2015 the original author or authors.
@rem
@rem Licensed under the Apache License, Version 2.0 (the "License");
@rem you may not use this file except in compliance with the License.
@rem You may obtain a copy of the License at
@rem
@rem      https://www.apache.org/licenses/LICENSE-2.0
@rem
@rem Unless required by applicable law or agreed to in writing, software
@rem distributed under the License is distributed on an "AS IS" BASIS,
@rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@rem See the License for the specific language governing permissions and
@rem limitations under the License.
@rem

@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  events-lambda startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Resolve any "." and ".." in APP_HOME to make it shorter.
for %%i in ("%APP_HOME%") do set APP_HOME=%%~fi

@rem Add default JVM options here. You can also use JAVA_OPTS and EVENTS_LAMBDA_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS=

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto execute

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto execute

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\events-lambda.jar;%APP_HOME%\lib\kgraphql-0.18.0.jar;%APP_HOME%\lib\DeferredJsonBuilder-1.0.0.jar;%APP_HOME%\lib\kotlinx-coroutines-core-jvm-1.6.4.jar;%APP_HOME%\lib\KDataLoader-jvm-0.4.0.jar;%APP_HOME%\lib\kodein-di-jvm-7.15.0.jar;%APP_HOME%\lib\http4k-client-okhttp-4.33.1.0.jar;%APP_HOME%\lib\http4k-contract-4.33.1.0.jar;%APP_HOME%\lib\http4k-server-jetty-4.33.1.0.jar;%APP_HOME%\lib\http4k-serverless-lambda-4.33.1.0.jar;%APP_HOME%\lib\http4k-serverless-core-4.33.1.0.jar;%APP_HOME%\lib\http4k-cloudnative-4.33.1.0.jar;%APP_HOME%\lib\http4k-cloudevents-4.33.1.0.jar;%APP_HOME%\lib\http4k-client-apache-4.33.1.0.jar;%APP_HOME%\lib\http4k-graphql-4.33.1.0.jar;%APP_HOME%\lib\http4k-format-kotlinx-serialization-4.33.1.0.jar;%APP_HOME%\lib\http4k-format-jackson-4.33.1.0.jar;%APP_HOME%\lib\http4k-format-moshi-4.33.1.0.jar;%APP_HOME%\lib\http4k-format-core-4.33.1.0.jar;%APP_HOME%\lib\http4k-realtime-core-4.33.1.0.jar;%APP_HOME%\lib\http4k-core-4.33.1.0.jar;%APP_HOME%\lib\java-jwt-4.2.1.jar;%APP_HOME%\lib\log4j-slf4j-impl-2.19.0.jar;%APP_HOME%\lib\log4j-core-2.19.0.jar;%APP_HOME%\lib\log4j-api-2.19.0.jar;%APP_HOME%\lib\kmongo-4.7.1.jar;%APP_HOME%\lib\kmongo-id-serialization-4.8.0.jar;%APP_HOME%\lib\kmongo-serialization-4.8.0.jar;%APP_HOME%\lib\kmongo-serialization-mapping-4.8.0.jar;%APP_HOME%\lib\kbson-0.4.5.jar;%APP_HOME%\lib\kotlinx-serialization-json-jvm-1.4.1.jar;%APP_HOME%\lib\koin-core-jvm-3.3.2.jar;%APP_HOME%\lib\koin-annotations-jvm-1.1.0.jar;%APP_HOME%\lib\kaverit-jvm-2.2.1-kotlin-1.7.20-RC.jar;%APP_HOME%\lib\kotlinx-serialization-core-jvm-1.4.1.jar;%APP_HOME%\lib\moshi-kotlin-1.14.0.jar;%APP_HOME%\lib\moshi-1.14.0.jar;%APP_HOME%\lib\okhttp-4.10.0.jar;%APP_HOME%\lib\okio-jvm-3.0.0.jar;%APP_HOME%\lib\kotlin-stdlib-jdk8-1.7.21.jar;%APP_HOME%\lib\kotlinx-datetime-jvm-0.4.0.jar;%APP_HOME%\lib\kmongo-jackson-mapping-4.7.1.jar;%APP_HOME%\lib\kmongo-id-jackson-4.7.1.jar;%APP_HOME%\lib\kmongo-core-4.8.0.jar;%APP_HOME%\lib\kmongo-property-4.8.0.jar;%APP_HOME%\lib\kmongo-shared-4.8.0.jar;%APP_HOME%\lib\kmongo-id-4.8.0.jar;%APP_HOME%\lib\jackson-module-loader-0.4.0.jar;%APP_HOME%\lib\cloudevents-json-jackson-2.4.0.jar;%APP_HOME%\lib\jackson-databind-2.13.4.2.jar;%APP_HOME%\lib\jackson-annotations-2.13.4.jar;%APP_HOME%\lib\jackson-core-2.13.4.jar;%APP_HOME%\lib\jackson-module-kotlin-2.13.4.jar;%APP_HOME%\lib\kreflect-1.0.0.jar;%APP_HOME%\lib\kotlin-reflect-1.7.21.jar;%APP_HOME%\lib\kmongo-data-4.8.0.jar;%APP_HOME%\lib\kotlin-stdlib-jdk7-1.7.21.jar;%APP_HOME%\lib\kotlin-stdlib-1.7.21.jar;%APP_HOME%\lib\kotlin-stdlib-common-1.7.21.jar;%APP_HOME%\lib\websocket-core-server-11.0.12.jar;%APP_HOME%\lib\jetty-servlet-11.0.12.jar;%APP_HOME%\lib\jetty-security-11.0.12.jar;%APP_HOME%\lib\jetty-server-11.0.12.jar;%APP_HOME%\lib\jakarta.servlet-api-6.0.0.jar;%APP_HOME%\lib\httpclient5-5.1.3.jar;%APP_HOME%\lib\graphql-java-19.2.jar;%APP_HOME%\lib\websocket-core-common-11.0.12.jar;%APP_HOME%\lib\jetty-http-11.0.12.jar;%APP_HOME%\lib\jetty-io-11.0.12.jar;%APP_HOME%\lib\java-dataloader-3.2.0.jar;%APP_HOME%\lib\jetty-util-11.0.12.jar;%APP_HOME%\lib\slf4j-api-2.0.0.jar;%APP_HOME%\lib\cloudevents-core-2.4.0.jar;%APP_HOME%\lib\caffeine-3.0.2.jar;%APP_HOME%\lib\aws-lambda-java-core-1.2.1.jar;%APP_HOME%\lib\jetty-jakarta-servlet-api-5.0.2.jar;%APP_HOME%\lib\bson4jackson-2.13.1.jar;%APP_HOME%\lib\annotations-13.0.jar;%APP_HOME%\lib\mongodb-driver-sync-4.8.0.jar;%APP_HOME%\lib\mongodb-driver-core-4.8.0.jar;%APP_HOME%\lib\bson-record-codec-4.8.0.jar;%APP_HOME%\lib\bson-4.8.0.jar;%APP_HOME%\lib\cloudevents-api-2.4.0.jar;%APP_HOME%\lib\httpcore5-h2-5.1.3.jar;%APP_HOME%\lib\httpcore5-5.1.3.jar;%APP_HOME%\lib\commons-codec-1.15.jar;%APP_HOME%\lib\checker-qual-3.12.0.jar;%APP_HOME%\lib\error_prone_annotations-2.6.0.jar;%APP_HOME%\lib\reactive-streams-1.0.3.jar


@rem Execute events-lambda
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %EVENTS_LAMBDA_OPTS%  -classpath "%CLASSPATH%" com.simon.DayOffHttp4KKt %*

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable EVENTS_LAMBDA_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%EVENTS_LAMBDA_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
