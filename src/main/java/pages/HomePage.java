package pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import tests.ExamTest;

public class HomePage {

	
	WebDriver driver;
	public HomePage (WebDriver driver) {
		this.driver= driver ;
	}

	

	@FindBy (how = How.XPATH , using= "/html/body/div[3]/input[3]") WebElement Toggle_All_Checkbox ;
	@FindBy (how = How.XPATH , using= "//*[@id=\"todos-content\"]/form/ul/li[1]/input") WebElement Toggle_Checkbox ;
	
	public void clickOnToggleAllCheckBox () {
		
		Toggle_All_Checkbox.click();
	}
	public ArrayList<WebElement> CheckBoxVerification() {
		
		ArrayList<WebElement> fileData = new ArrayList<WebElement>();
		int i =2;
		
		try {
			while(Toggle_Checkbox.isDisplayed()) {
				
				fileData.add(Toggle_Checkbox);
			Toggle_Checkbox = driver.findElement(By.xpath("//*[@id=\"todos-content\"]/form/ul/li["+i+"]/input"));
			
			i++;}}catch (Exception e) {System.out.println(i);}
		
		

			
		return fileData;
	
	}
	public void CheckBoxVerification2() {
		
		
		ArrayList<WebElement> fileData= CheckBoxVerification();
		fileData.get(0).click();
		for(int j=0;j<fileData.size();j++) {
				fileData.get(j).isDisplayed();
				if (fileData.get(j).isSelected()) {
					System.out.println("checkbox"+j+"is selected");
				}
				else {
					System.out.println("checkbox"+j+"is not selected");
				}
			}
	}
	}
	
