import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.Rectangle

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


WebUI.openBrowser('https://platform.qa.katalon.com')

// Define area to capture (x=100, y=200, width=300, height=150)
Rectangle captureArea = new Rectangle(100, 200, 300, 150)

WebUI.takeAreaScreenshotAsCheckpoint('areaCheckpoint', captureArea)

WebUI.click(findTestObject('TestOpsPage/ContinueWithEmail'))

WebUI.takeElementScreenshotAsCheckpoint('elementCheckpoint', findTestObject('TestOpsPage/email'))

WebUI.setEncryptedText(findTestObject('TestOpsPage/email'), '')

WebUI.setEncryptedText(findTestObject('TestOpsPage/pwd'), '')

WebUI.takeFullPageScreenshotAsCheckpoint('fullCheckpoint')

