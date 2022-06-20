package week2.day2.classroomassesment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadCrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//set browser--initialization
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();

//launch browser
driver.get("http://leaftaps.com/opentaps/control/main");

//find elements --username
WebElement user=driver.findElement(By.id("username"));
user.sendKeys("Demosalesmanager");


//password
WebElement pass=driver.findElement(By.id("password"));
pass.sendKeys("crmsfa");

//login
WebElement log=driver.findElement(By.className("decorativeSubmit"));
log.click();

//crm
WebElement crLogo=driver.findElement(By.linkText("CRM/SFA"));
crLogo.click();

//LEAD
WebElement lead=driver.findElement(By.linkText("Leads"));
lead.click();

//create lead
WebElement cl=driver.findElement(By.linkText("Create Lead"));
cl.click();

//company name
WebElement company=driver.findElement(By.id("createLeadForm_companyName"));
company.sendKeys("TCS");

//first name
WebElement firstName=driver.findElement(By.id("createLeadForm_firstName"));
firstName.sendKeys("Evangelin");

//last name
WebElement lastName=driver.findElement(By.id("createLeadForm_lastName"));
lastName.sendKeys(" Davidson");

//first name local
//id=createLeadForm_firstNameLocal
WebElement firstNameLocal=driver.findElement(By.id("createLeadForm_firstNameLocal"));
firstName.sendKeys("Flora");

//department field
WebElement depart=driver.findElement(By.id("createLeadForm_departmentName"));
depart.sendKeys("Software");

//description
WebElement desc=driver.findElement(By.name("description"));
desc.sendKeys("God is good to all, his grace is enough");

//email
WebElement em=driver.findElement(By.id("createLeadForm_primaryEmail"));
em.sendKeys("evangelinlora93@gmail.com");

//state province
WebElement stat=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
Select stateselect=new Select(stat);
stateselect.selectByVisibleText("New York");

//source
WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
Select sourcedrop=new Select(source);
sourcedrop.selectByIndex(3);

//industry
WebElement indus=driver.findElement(By.id("createLeadForm_industryEnumId"));
Select indusdrop=new Select(indus);
indusdrop.selectByValue("IND_AEROSPACE");

//ownership
WebElement owner=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
Select ownerdrop=new Select(owner);
ownerdrop.selectByVisibleText("Partnership");

//marketing compaign
WebElement marketing=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
marketing.sendKeys("Automobile");

//click create
WebElement create=driver.findElement(By.className("smallSubmit"));
create.click();



	}

}
