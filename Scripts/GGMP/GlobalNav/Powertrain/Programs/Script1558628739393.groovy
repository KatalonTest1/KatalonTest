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

WebUI.click(findTestObject('Object Repository/Global Nav/Powertrain/Programs and Offers/li_Powertrain'))

WebUI.click(findTestObject('Object Repository/Global Nav/Powertrain/Programs and Offers/a_Programs  Offers'))

WebUI.click(findTestObject('Object Repository/Global Nav/Powertrain/Programs and Offers/a_concat(id(  ttpopclose1  ))_ttpopclose1'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Global Nav/Powertrain/Programs and Offers/p_Shops that choose 100 GM Genuine Parts can earn rewards and help get the job done right the first time'), 
    'Shops that choose 100% GM Genuine Parts can earn rewards and help get the job done right the first time.')

WebUI.closeBrowser()

