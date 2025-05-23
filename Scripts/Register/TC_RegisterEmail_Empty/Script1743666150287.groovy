import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://kasirdemo.belajarqa.com')

WebUI.verifyElementVisible(findTestObject('Object Repository/Authentication/Login/h2_hai, kasirAja'))

WebUI.click(findTestObject('Object Repository/Authentication/Register/a_ingin mencoba, daftar'))

WebUI.verifyElementText(findTestObject('Object Repository/Authentication/Login/h2_hai, kasirAja'), 'hai, kasirAja')

WebUI.click(findTestObject('Object Repository/Authentication/Register/a_ingin mencoba, daftar'))

WebUI.setText(findTestObject('Object Repository/Authentication/Register/input_nama toko_name'), 'Toko Abadai Jaya')

WebUI.setText(findTestObject('Object Repository/Authentication/Register/input_email_email'), '')

WebUI.setEncryptedText(findTestObject('Object Repository/Authentication/Register/input_password_password'), 'p4y+y39Ir5MWc5UfklkyHA==')

WebUI.click(findTestObject('Object Repository/Authentication/Register/button_daftar'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Authentication/Register/div_email is not allowed to be empty'))

WebUI.closeBrowser()

