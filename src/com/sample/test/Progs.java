package com.sample.test;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Progs {

public static void main(String[] args) throws Exception
	{
		WebDriver drvr;
		ChromeOptions options = new ChromeOptions();
		options.addArguments("chrome.switches","--disable-extensions");
		System.setProperty("webdriver.chrome.driver", "F:/Test_Maven/AutotstCDP/Libs/chromedriver.exe");
	    drvr = new ChromeDriver();
		drvr.get("https://www.mailinator.com/");
		drvr.findElement(By.id("inboxfield")).sendKeys("testmail09072017112910@mailinator.com");
		drvr.findElement(By.xpath("//button[@class='btn btn-dark']")).click();
		Thread.sleep(7000);
		drvr.findElement(By.xpath("//div[text()='Reset your  password']")).click();
		Thread.sleep(7000);
		((JavascriptExecutor) drvr).executeScript("window.scrollBy(0,500)");
		drvr.switchTo().frame("msg_body");
		((JavascriptExecutor) drvr).executeScript("window.scrollBy(0,300)");
		String oldTab = drvr.getWindowHandle();
		drvr.findElement(By.linkText("Reset my password")).click();
		ArrayList<String> newTab = new ArrayList<String>(drvr.getWindowHandles());
		newTab.remove(oldTab);
		drvr.switchTo().window(newTab.get(0));
		Thread.sleep(7000);
		((JavascriptExecutor) drvr).executeScript("window.scrollBy(0,300)");
		Thread.sleep(7000);
		drvr.findElement(By.id("capture_resetPasswordRequestCode_traditionalSignIn_emailAddress")).click();
		drvr.findElement(By.id("capture_resetPasswordRequestCode_traditionalSignIn_emailAddress")).sendKeys("testmail09072017112910@mailinator.com");
		drvr.findElement(By.id("capture_resetPasswordRequestCode_forgotPassword_sendButton")).click();
		
			drvr.get("https://www.mailinator.com/");
			drvr.findElement(By.id("inboxfield")).sendKeys("testmail09072017112910@mailinator.com");
			drvr.findElement(By.xpath("//button[@class='btn btn-dark']")).click();
			Thread.sleep(7000);
			drvr.findElement(By.xpath("//div[text()='Reset your Philips password']")).click();
			Thread.sleep(7000);
			((JavascriptExecutor) drvr).executeScript("window.scrollBy(0,500)");
			drvr.switchTo().frame("msg_body");
			((JavascriptExecutor) drvr).executeScript("window.scrollBy(0,300)");
			Thread.sleep(7000);
			drvr.findElement(By.linkText("Reset my password")).click();
			ArrayList<String> newTabone = new ArrayList<String>(drvr.getWindowHandles());
			newTabone.remove(oldTab);
			drvr.switchTo().window(newTabone.get(0));
			Thread.sleep(7000);
			((JavascriptExecutor) drvr).executeScript("window.scrollBy(0,300)");
			Thread.sleep(7000);
			drvr.findElement(By.id("capture_resetPassword_newPassword")).click();
			drvr.findElement(By.id("capture_resetPassword_newPassword")).sendKeys("philips@123");
			drvr.findElement(By.id("capture_resetPassword_newPasswordConfirm")).click();
			drvr.findElement(By.id("capture_resetPassword_newPasswordConfirm")).sendKeys("philips@123");
			((JavascriptExecutor) drvr).executeScript("window.scrollBy(0,100)");
			Thread.sleep(7000);
			drvr.findElement(By.id("capture_resetPassword_submitButton")).click();
			}
}