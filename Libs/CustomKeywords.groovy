
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject

import java.lang.String

import org.openqa.selenium.WebElement

import com.applitools.eyes.selenium.Eyes

import com.applitools.eyes.RectangleSize


 /**
	 * Check if element present in timeout
	 * @param to Katalon test object
	 * @param timeout time to wait for element to show up 
	 * @return true if element present, otherwise false
	 */ 
def static "com.example.WebUICustomKeywords.isElementPresent"(
    	TestObject to	
     , 	int timeout	) {
    (new com.example.WebUICustomKeywords()).isElementPresent(
        	to
         , 	timeout)
}

 /**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table 
	 */ 
def static "com.example.WebUICustomKeywords.getHtmlTableRows"(
    	TestObject table	
     , 	String outerTagName	) {
    (new com.example.WebUICustomKeywords()).getHtmlTableRows(
        	table
         , 	outerTagName)
}

 /**
	 * Get all cells of HTML table row
	 * @param row a WebElement instance represent for HTML table row 
	 * @param tagName HTML column tag name, usually is TD/TH
	 * @return All cells inside HTML table row 
	 */ 
def static "com.example.WebUICustomKeywords.getHtmlTableColumns"(
    	WebElement row	
     , 	String tagName	) {
    (new com.example.WebUICustomKeywords()).getHtmlTableColumns(
        	row
         , 	tagName)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkElement"(
    	Eyes eyes	
     , 	WebElement element	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkElement(
        	eyes
         , 	element)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkTestObject"(
    	TestObject testObject	
     , 	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkTestObject(
        	testObject
         , 	testName)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkWindow"(
    	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkWindow(
        	testName)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpen"(
    	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpen(
        	testName
         , 	viewportSize)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesInit"() {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesInit()
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpenWithBaseline"(
    	String baselineName	
     , 	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpenWithBaseline(
        	baselineName
         , 	testName
         , 	viewportSize)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesClose"(
    	Eyes eyes	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesClose(
        	eyes)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.selectRadio"(
    	String label	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).selectRadio(
        	label)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.selectRadio"(
    	WebElement parentElement	
     , 	String label	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).selectRadio(
        	parentElement
         , 	label)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.isChecked"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).isChecked(
        	element)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.findElement"(
    	String cssSelector	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).findElement(
        	cssSelector)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getParentElement"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getParentElement(
        	element)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.isDisabled"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).isDisabled(
        	element)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.findElements"(
    	String cssSelector	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).findElements(
        	cssSelector)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.isVisible"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).isVisible(
        	element)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.scrollTo"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).scrollTo(
        	element)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getPreviousSiblingElement"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getPreviousSiblingElement(
        	element)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.selectDropdown"(
    	String label	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).selectDropdown(
        	label)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.selectDropdown"(
    	WebElement parentElement	
     , 	String label	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).selectDropdown(
        	parentElement
         , 	label)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getSiblingElement"(
    	WebElement element	
     , 	String selector	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getSiblingElement(
        	element
         , 	selector)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getShadowElement"(
    	WebElement parent	
     , 	String selector	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getShadowElement(
        	parent
         , 	selector)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.setExplicitWait"(
    	int seconds	
     , 	int pollingTime	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).setExplicitWait(
        	seconds
         , 	pollingTime)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getChildElements"(
    	WebElement parent	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getChildElements(
        	parent)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getSiblingElements"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getSiblingElements(
        	element)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.selectCheckbox"(
    	String label	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).selectCheckbox(
        	label)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.selectCheckbox"(
    	WebElement parentElement	
     , 	String label	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).selectCheckbox(
        	parentElement
         , 	label)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.findElementInsideParent"(
    	WebElement parent	
     , 	String cssSelector	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).findElementInsideParent(
        	parent
         , 	cssSelector)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.setImplicitWait"(
    	int seconds	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).setImplicitWait(
        	seconds)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.findElementsInsideParent"(
    	WebElement parent	
     , 	String cssSelector	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).findElementsInsideParent(
        	parent
         , 	cssSelector)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getAllShadowElement"(
    	WebElement parent	
     , 	String selector	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getAllShadowElement(
        	parent
         , 	selector)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getNextSiblingElement"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getNextSiblingElement(
        	element)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getAttribute"(
    	WebElement element	
     , 	String attribute	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getAttribute(
        	element
         , 	attribute)
}
