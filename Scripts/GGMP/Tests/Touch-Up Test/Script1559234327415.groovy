import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.genuinegmparts.com/')

WebUI.click(findTestObject('TOOLS/Touch-Up Test/a_Touch-Up Paint'))

WebUI.delay(2)

WebUI.click(findTestObject('TOOLS/Touch-Up Test/a_SEARCH FOR'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TOOLS/Touch-Up Test/select_Year'), '2019', true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('TOOLS/Touch-Up Test/select_Make BuickChevrolet'), 'Chevrolet', true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/TOOLS/Touch-Up Test/select_Model Corvette'), 'Corvette', true)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/TOOLS/Touch-Up Test/select_Paint'), 'Genesis-*Metallic-1', true)

WebUI.click(findTestObject('TOOLS/Touch-Up Test/button_Search'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('TOOLS/Touch-Up Test/h1_Touch-up'), 'Touch-up paint code results')

WebUI.closeBrowser()

