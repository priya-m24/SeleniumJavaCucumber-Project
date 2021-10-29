$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ExcelReader.feature");
formatter.feature({
  "line": 1,
  "name": "Excel Data Reader",
  "description": "",
  "id": "excel-data-reader",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User Login scenario",
  "description": "",
  "id": "excel-data-reader;user-login-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is at the login page if the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User login with the following username and password with data in Excel at \"C:\\Users\\CPPPP\\PVT-workspace\\Automation\\src\\test\\java\\TestData\\TestDatas.xlsx\"",
  "keyword": "When "
});
formatter.match({
  "location": "ExcelReaderStepDef.user_is_at_the_login_page_if_the_application()"
});
formatter.result({
  "duration": 288895298,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat StepDefinitions.ExcelReaderStepDef.user_is_at_the_login_page_if_the_application(ExcelReaderStepDef.java:17)\r\n\tat ✽.Given User is at the login page if the application(ExcelReader.feature:5)\r\n",
  "status": "pending"
});
formatter.match({
  "arguments": [
    {
      "val": "C:\\Users\\CPPPP\\PVT-workspace\\Automation\\src\\test\\java\\TestData\\TestDatas.xlsx",
      "offset": 75
    }
  ],
  "location": "ExcelReaderStepDef.user_login_with_the_following_username_and_password_with_data_in_Excel_at(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("TestPage.feature");
formatter.feature({
  "line": 1,
  "name": "Login Functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "CPP Test Page",
  "description": "",
  "id": "login-functionality;cpp-test-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "CPP Test Page is loaded in t0",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 28
    }
  ],
  "location": "testPageStepDef.cpp_Test_Page_is_loaded_in_t(String)"
});
formatter.result({
  "duration": 16784625963,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"summary-align-target\"]/div[1]/div/a[2]\"}\n  (Session info: chrome\u003d80.0.3987.122)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:53\u0027\nSystem info: host: \u0027M081017\u0027, ip: \u002757.28.213.38\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.122, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\CPPPP\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:55026}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 22f704c61e5e8f60213410719ac924cd\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"summary-align-target\"]/div[1]/div/a[2]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat Pages.testPage.select_payMethod(testPage.java:66)\r\n\tat StepDefinitions.testPageStepDef.cpp_Test_Page_is_loaded_in_t(testPageStepDef.java:16)\r\n\tat ✽.Given CPP Test Page is loaded in t0(TestPage.feature:4)\r\n",
  "status": "failed"
});
});