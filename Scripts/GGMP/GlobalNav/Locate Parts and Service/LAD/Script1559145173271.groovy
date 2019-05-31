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

WebUI.click(findTestObject('Object Repository/Global Nav/Locate Parts and Service/LAD/li_Locate Parts andService'))

WebUI.click(findTestObject('Object Repository/Global Nav/Locate Parts and Service/LAD/span_Locate a Parts Dealer'))

WebUI.setText(findTestObject('Object Repository/Global Nav/Locate Parts and Service/LAD/input_City State_inpZip'), '10001')

WebUI.click(findTestObject('Object Repository/Global Nav/Locate Parts and Service/LAD/button_Begin your search'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Global Nav/Locate Parts and Service/LAD/span'), 0)

WebUI.closeBrowser()

