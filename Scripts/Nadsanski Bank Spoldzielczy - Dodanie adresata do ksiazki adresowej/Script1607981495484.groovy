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

WebUI.navigateToUrl('https://demo.sabaservice.pl/hb/auth/login.xhtml?return=doWeba')

WebUI.click(findTestObject('Object Repository/Page_I-BANK SYSTEM DEMONSTRACYJNY - Logowanie/input_Identyfikator_j_username'))

WebUI.setText(findTestObject('Object Repository/Page_I-BANK SYSTEM DEMONSTRACYJNY - Logowanie/input_Identyfikator_j_username'), 
    dana_1)

WebUI.click(findTestObject('Object Repository/Page_I-BANK SYSTEM DEMONSTRACYJNY - Logowanie/input_Haso_j_password'), FailureHandling.STOP_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_I-BANK SYSTEM DEMONSTRACYJNY - Logowanie/input_Haso_j_password'), 
    dana_2)

WebUI.click(findTestObject('Object Repository/Page_I-BANK SYSTEM DEMONSTRACYJNY - Logowanie/button_Zaloguj si'))

WebUI.click(findTestObject('Object Repository/Page_I-BANK SYSTEM DEMONSTRACYJNY - Start/span_Ksika adresowa'))

WebUI.click(findTestObject('Object Repository/Page_I-BANK SYSTEM DEMONSTRACYJNY - Lista k_aa9ff4/span_Nowy adresat'))

WebUI.setText(findTestObject('Object Repository/Page_I-BANK SYSTEM DEMONSTRACYJNY - Dodanie_a7ddec/input__ibankFormedytujKontrahentatabViewnaz_70963e'), 
    dana_3)

WebUI.setText(findTestObject('Object Repository/Page_I-BANK SYSTEM DEMONSTRACYJNY - Dodanie_a7ddec/input__ibankFormedytujKontrahentatabViewnaz_6d9b5d'), 
    dana_4)

WebUI.setText(findTestObject('Object Repository/Page_I-BANK SYSTEM DEMONSTRACYJNY - Dodanie_a7ddec/input_Domylny tytu_ibankFormedytujKontrahen_77c7f9'), 
    dana_5)

WebUI.setText(findTestObject('Object Repository/Page_I-BANK SYSTEM DEMONSTRACYJNY - Dodanie_a7ddec/input__ibankFormedytujKontrahentatabViewnum_33bfcd'), 
    dana_6)

WebUI.setText(findTestObject('Object Repository/Page_I-BANK SYSTEM DEMONSTRACYJNY - Dodanie_a7ddec/input_Ulica_ibankFormedytujKontrahentatabVi_24a4a3'), 
    dana_7)

WebUI.click(findTestObject('Object Repository/Page_I-BANK SYSTEM DEMONSTRACYJNY - Dodanie_a7ddec/a_Dowizania'))

WebUI.click(findTestObject('Object Repository/Page_I-BANK SYSTEM DEMONSTRACYJNY - Dodanie_a7ddec/span_Nazwa_ui-chkbox-icon ui-icon ui-icon-b_fda50f'))

WebUI.click(findTestObject('Object Repository/Page_I-BANK SYSTEM DEMONSTRACYJNY - Dodanie_a7ddec/span_Zatwierd'))

WebUI.click(findTestObject('Object Repository/Page_I-BANK SYSTEM DEMONSTRACYJNY - Potwier_ba3ec8/span_Zrezygnuj'))

WebUI.click(findTestObject('Object Repository/Page_I-BANK SYSTEM DEMONSTRACYJNY - Lista k_aa9ff4/a_WYLOGUJ'))

