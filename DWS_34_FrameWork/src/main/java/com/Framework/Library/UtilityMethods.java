package com.Framework.Library;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UtilityMethods extends BaseTest {

	/*
	 * @author Vijay
	 */

	public static Select select;
	public static Actions act = new Actions(driver);

	public static void clickMethod(WebElement ele) {
		ele.click();
	}

	public static void sendKeysMethod(WebElement ele, CharSequence keysToSend) {
		ele.sendKeys(keysToSend);
	}

	public static void selectByVisibleText(WebElement ele, String visibleText) {
		select = new Select(ele);
		select.selectByVisibleText(visibleText);
	}

	public static void selectByIndex(WebElement ele, int index) {
		select = new Select(ele);
		select.selectByIndex(index);
	}

	public static void selectByValue(WebElement ele, String value) {
		select = new Select(ele);
		select.selectByValue(value);
	}

	public static List<WebElement> selectGetOptions(WebElement ele, String value) {
		select = new Select(ele);
		return select.getOptions();
	}

	public static void actionsMoveToElement(WebElement ele) {
		act.moveToElement(ele).build().perform();
	}

	public static void actionsClick(WebElement ele) {
		act.moveToElement(ele).click().build().perform();
	}

	public static void actionsClickWebTarget(WebElement ele) {
		act.click(ele).build().perform();
	}

	public static void actionsClickAndHold(WebElement ele) {
		act.moveToElement(ele).clickAndHold().build().perform();
	}

	public static void actionsClickAndHoldWebTarget(WebElement ele) {
		act.clickAndHold(ele).build().perform();
	}

	public static void actionsContextClick(WebElement ele) {
		act.moveToElement(ele).contextClick().build().perform();
	}

	public static void actionsContextClickWebTarget(WebElement ele) {
		act.contextClick(ele).build().perform();
	}

	public static void actionsDoubleClick(WebElement ele) {
		act.moveToElement(ele).doubleClick().build().perform();
	}

	public static void actionsDoubleClickWebTarget(WebElement ele) {
		act.doubleClick(ele).build().perform();
	}

	public static void actionsDragAndDrop(WebElement source, WebElement target) {
		act.dragAndDrop(source, target).build().perform();
	}

	public static void actionsRelease(WebElement ele) {
		act.release(ele).build().perform();
	}

	public static void actionsSendKeys(WebElement ele, CharSequence keys) {
		act.moveToElement(ele).sendKeys(keys).build().perform();
	}

	public static void actionsSendKeysWebTarget(WebElement ele, CharSequence keys) {
		act.sendKeys(ele, keys).build().perform();
	}

	public static void actionsKeysUp(WebElement ele, CharSequence Keys) {
		act.keyUp(ele, Keys).build().perform();
	}

	public static void actionsKeysDown(WebElement ele, CharSequence Keys) {
		act.keyDown(ele, Keys).build().perform();
	}
}
