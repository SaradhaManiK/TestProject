package objectrepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.base;

public class Todopage extends base {
		public Todopage() {
			PageFactory.initElements(driver, this);
		}
		public WebElement getTodobox() {
			return todobox;
		}
		public void setTodobox(WebElement todobox) {
			this.todobox = todobox;
		}
		@CacheLookup
		@FindBy (xpath="//input[@placeholder='What needs to be done?']")
		private WebElement todobox;
		
		@FindBy (xpath="//span[@class='todo-count']//strong")
		private WebElement count;
		
		@FindBy (xpath="//a[text()='Active']")
		private WebElement Activetab;
		
		@FindBy (xpath="//a[text()='Completed']")
		private WebElement Completed;
				
		public WebElement getAllbtn() {
			return Allbtn;
		}
		public void setAllbtn(WebElement allbtn) {
			Allbtn = allbtn;
		}
		@FindBy (xpath="//a[text()='All']")
		private WebElement Allbtn;
		
		@FindBy (xpath="//label[@for='toggle-all']")
		private WebElement Toggleallbtn;
		
		@FindBy(xpath="//div[@class='view']")
		private List<WebElement> alllist;
		
		public List<WebElement> getEditlist() {
			return editlist;
		}
		public void setEditlist(List<WebElement> editlist) {
			this.editlist = editlist;
		}
		@FindBy(xpath="//input[@class='edit']")
		private List<WebElement> editlist;
		
		public List<WebElement> getAlllist() {
			return alllist;
		}
		public void setAlllist(List<WebElement> alllist) {
			this.alllist = alllist;
		}
		public WebElement getToggleallbtn() {
			return Toggleallbtn;
		}
		public void setToggleallbtn(WebElement toggleallbtn) {
			Toggleallbtn = toggleallbtn;
		}
		public WebElement getCompleted() {
			return Completed;
		}
		public void setCompleted(WebElement completed) {
			Completed = completed;
		}
		public WebElement getActivetab() {
			return Activetab;
		}
		public void setActivetab(WebElement activetab) {
			Activetab = activetab;
		}
		public WebElement getCount() {
			return count;
		}
		public void setCount(WebElement count) {
			this.count = count;
		}
		
		}

