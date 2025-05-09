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

WebUI.verifyElementVisible(findTestObject('Authentication/Login/h2_hai, kasirAja'))

WebUI.verifyElementVisible(findTestObject('Authentication/Login/p_kasirAja sebuah sistem POS simple, mudah, cepat, dan modern'))

WebUI.verifyElementVisible(findTestObject('Authentication/Login/p_sistem penjualan dan pembelian yang simple dengan pengelolan produk multi user. modern dengan dibangun diatas rest api dengan menggunakan nodejs, dapat diakses melalui web maupun perangkat mobile dengan aplikasi yang t'))

WebUI.setText(findTestObject('Authentication/Login/input_email_email'), 'admin')

WebUI.setEncryptedText(findTestObject('Authentication/Login/input_password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Authentication/Login/button_login'))

WebUI.verifyElementText(findTestObject('Authentication/Login/div_email must be a valid email'), 'Kredensial yang Anda berikan salah')

WebUI.closeBrowser()

