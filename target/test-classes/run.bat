set ProjectPath=D:\CucumberExtentReporter\src\test\resources
echo %ProjectPath%
java org.testng.TestNG %ProjectPath%\suite.xml
pause