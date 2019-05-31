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

WebUI.click(findTestObject('Object Repository/Global Nav/Collision/Touch-Up Paint/li_Collision'))

WebUI.click(findTestObject('Object Repository/Global Nav/Collision/Touch-Up Paint/span_Touch-up paint'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Global Nav/Collision/Touch-Up Paint/h1_Show your true colors with GM auto touch-up paint'), 
    'Show your true colors with GM auto touch-up paint')

WebUI.click(findTestObject('Object Repository/Global Nav/Collision/Touch-Up Paint/a_Downloadable Guides'))

WebUI.click(findTestObject('Object Repository/Global Nav/Collision/Touch-Up Paint/a_Downloadable Guides'))

WebUI.click(findTestObject('Object Repository/Global Nav/Collision/Touch-Up Paint/a_GM-approved paint manufacturers'))

WebUI.click(findTestObject('Object Repository/Global Nav/Collision/Touch-Up Paint/a_GM-approved paint manufacturers'))

WebUI.click(findTestObject('Object Repository/Global Nav/Collision/Touch-Up Paint/a_Where do I find the paint code'))

WebUI.click(findTestObject('Object Repository/Global Nav/Collision/Touch-Up Paint/a_Where do I find the paint code'))

WebUI.delay(2)

WebUI.click(findTestObject('Global Nav/Collision/Touch-Up Paint/span_2018 GM Refinish Materials - GMW-15406-2017'))

WebUI.closeBrowser()

