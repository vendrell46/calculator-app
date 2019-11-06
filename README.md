# calculator-app
## Automated framework added to test app, with Cucumber + Espresso

**How to run set of test cases:**


- First of all, clone repository https://github.com/vendrell46/calculator-app to a local directory and open it with Android Studio.
- Create a new virtual device (e.g. using AVD Manager from Android Studio) and open it.
- Go to Edit Configurations menu. 
- Click on "+" to Add New Configuration.
- Choose Android Instrumented Tests
- Once created, select "app" Module from the options offered under General tab.
- Click "Apply" and "Ok".
- Now in order to execute all test cases under AndroidTest folder, Run the previously created config.

Note: Currently, code is not merged to `master`, you will find a Pull Request created from branch `feature/new-test`.




**Brief information about how I have test the calculator app:**


- I have used Cucumber to handle execution of test cases, Koin for Dependency Injection and Espresso with Kotlin. 
- I have switched to `androidx` libraries to be able to use existing class `CucumberAndroidJUnitRunner` from Cucumber to execute test cases on BDD with Gherkin.
- I have been running tests on Nexus 6P; API 26; OS Android 8.0; English locale; v 4.0.0. Yet, I have also run test cases on Android 4.1 to check if it’s functional in lower version of Android OS.




**Issues found:**


I have found five issues while testing the app and to be aware of its existence I have created a test case for each of them and they are marked with tag `@Bug`. Please find below the name of mentioned test cases and a brief description of the issue:

- `DivideByZero`: When any number is divided by zero, result should show NaN/Error, however, app displays zero.
- `RootOfNegativeNumber`: When root of negative number is done, app crashes if we try to enter any number.
- `OperationsWithNaN`: Any operation with NaN/Error it should return NaN/Error, yet when we do NaN to the power of a number, app returns zero.
- `NaNDisappearsWhenDecimalKeyClicked`: When NaN is displayed in the app, after pressing decimal key the expected result would be 0. but app shows NaN., and besides that, app would crash if we press any operation key.
- `ResetDisplayAfterOperationWhenNewNumberPressed`: Once an operation is done, when a  new key number is pressed, it should be shown on its own, but app does not reset display and adds number to whatever is displayed.




**Possible improvements for the future:**


- I would handle the purchase pop-up displayed randomly on start.
- I would replace hardcoded results for the verification steps.
- I would test app with different Locale.
- I would test that deeplinks on About page work accordingly.
- I would integrate Spoon into the framework to run tests simultaneously in multiple emulators and get a report from the run.
- I would add config to run specific test cases by tag. Which afterwards would be useful when configuring a job on Jenkins.
