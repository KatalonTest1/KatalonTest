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

WebUI.click(findTestObject('Object Repository/Global Nav/Locate Parts and Service/New LAD/li_Locate Parts andService'))

WebUI.click(findTestObject('Object Repository/Global Nav/Locate Parts and Service/New LAD/span_Locate a GM Collision Repair Network Facility'))

WebUI.setText(findTestObject('Object Repository/Global Nav/Locate Parts and Service/New LAD/input_ZIP Code or CityState_inpZip'), 
    '10001')

WebUI.click(findTestObject('Object Repository/Global Nav/Locate Parts and Service/New LAD/button_ZIP Code or CityState_searchBtn'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Global Nav/Locate Parts and Service/New LAD/h2_precision auto works'))

WebUI.click(findTestObject('Object Repository/Global Nav/Locate Parts and Service/New LAD/p_Back to List'))

WebUI.click(findTestObject('Object Repository/Global Nav/Locate Parts and Service/New LAD/button_Terms of Use_gm-control-active gm-fullscreen-control'))

WebUI.click(findTestObject('Object Repository/Global Nav/Locate Parts and Service/New LAD/button_Terms of Use_gm-control-active gm-fullscreen-control'))

WebUI.closeBrowser()

