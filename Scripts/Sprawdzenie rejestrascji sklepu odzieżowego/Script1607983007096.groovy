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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://bohomoss.com/pl/client-new.html?register')

WebUI.setText(findTestObject('Object Repository/Page_Bohomoss. Najpikniejsze satynowe piamy_3954a1/input_NIP_client_firstname'), 
    dana_1)

WebUI.setText(findTestObject('Object Repository/Page_Bohomoss. Najpikniejsze satynowe piamy_3954a1/input_Imi_client_lastname'), 
    dana_2)

WebUI.setText(findTestObject('Object Repository/Page_Bohomoss. Najpikniejsze satynowe piamy_3954a1/input_Nazwisko_client_street'), 
    dana_3)

WebUI.setText(findTestObject('Object Repository/Page_Bohomoss. Najpikniejsze satynowe piamy_3954a1/input_Ulica i numer_client_zipcode'), 
    dana_4)

WebUI.setText(findTestObject('Object Repository/Page_Bohomoss. Najpikniejsze satynowe piamy_3954a1/input_Kod pocztowy_client_city'), 
    dana_5)

WebUI.setText(findTestObject('Object Repository/Page_Bohomoss. Najpikniejsze satynowe piamy_3954a1/input_Prowincja_client_phone'), 
    dana_6)

WebUI.setText(findTestObject('Object Repository/Page_Bohomoss. Najpikniejsze satynowe piamy_3954a1/input_Telefon_client_email'), 
    dana_7)

WebUI.setText(findTestObject('Object Repository/Page_Bohomoss. Najpikniejsze satynowe piamy_3954a1/input_Adres e-mail_client_email_confirmation'), 
    dana_8)

WebUI.setText(findTestObject('Object Repository/Page_Bohomoss. Najpikniejsze satynowe piamy_3954a1/input_Twoje konto_client_login'), 
    dana_9)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Bohomoss. Najpikniejsze satynowe piamy_3954a1/input_Login musi mie minimum 3, a maksimum _0c855d'), 
    dana_10)

WebUI.click(findTestObject('Object Repository/Page_Bohomoss. Najpikniejsze satynowe piamy_3954a1/input_Akceptuj warunkii._terms_agree'))

WebUI.click(findTestObject('Object Repository/Page_Bohomoss. Najpikniejsze satynowe piamy_3954a1/button_Zarejestruj konto'))

WebUI.closeBrowser()

