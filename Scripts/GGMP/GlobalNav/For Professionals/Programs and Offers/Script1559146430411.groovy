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

WebUI.click(findTestObject('Object Repository/Global Nav/For Professionals/Programs and Offers/li_Forprofessionals'))

WebUI.click(findTestObject('Object Repository/Global Nav/For Professionals/Programs and Offers/span_Programs  Offers'))

WebUI.click(findTestObject('Object Repository/Global Nav/For Professionals/Programs and Offers/a_concat(id(  ttpopclose1  ))_ttpopclose1'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Global Nav/For Professionals/Programs and Offers/img_GO_img-responsive'), 
    0)

WebUI.closeBrowser()

