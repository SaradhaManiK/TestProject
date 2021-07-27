package stepdefinition;

import java.util.List;
//import java.util.logging.Logger;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;


import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objectrepository.Todopage;
import utilities.base;

public class firstpagestepdefinition extends base {
	Logger log=Logger.getLogger(firstpagestepdefinition.class);
	@Given("^the user is in homepage$")
	public void the_user_is_in_homepage() throws Exception {
	    base b=new base();
	    //Logger log=Logger.getLogger(firstpagestepdefinition.class);
	    log.info("******************Starting*********************************");
		b.launchbrowser("http://todomvc.com/examples/vue/");
	}

	@When("^the user enters the data$")
	public void the_user_enters_the_data(DataTable data) throws Throwable {
		Todopage firstpage=new Todopage();
		base b=new base();
		log.info("******************Entering values*********************************");
		b.btnclick(firstpage.getTodobox());
		List<String> data_todolist = data.asList(String.class);
		b.sendtext(firstpage.getTodobox(), data_todolist.get(0));
		b.enterkey();
		b.sendtext(firstpage.getTodobox(), data_todolist.get(1));
		b.enterkey();
		b.sendtext(firstpage.getTodobox(), data_todolist.get(2));
		b.enterkey();   	
		}
	

	@Then("^the user verifies the data is updated$")
	public void the_user_verifies_the_data_is_updated() throws Throwable {
		Todopage firstpage=new Todopage();
		for(int i=0;i<firstpage.getAlllist().size();i++) {
			Assert.assertEquals("Wakeup",firstpage.getAlllist().get(0).getText());
			Assert.assertEquals("Refresh",firstpage.getAlllist().get(1).getText());
			Assert.assertEquals("EatFruits",firstpage.getAlllist().get(2).getText());     
		}
	}
	
	@Given("^the user retrieves the list count and check it matches$")
	public void the_user_retrieves_the_list_count() throws Throwable {
		Todopage firstpage=new Todopage();
	    Assert.assertEquals("3", firstpage.getCount().getText());
	}

	@And("^the user clicks Active tab$")
	public void the_user_clicks_Active_tab() throws Throwable {
		base b=new base();
		Todopage firstpage=new Todopage();
		b.btnclick(firstpage.getActivetab());
	}

	@When("^the user clicks completed tab$")
	public void the_user_clicks_completed_tab() throws Throwable {
		base b=new base();
		Todopage firstpage=new Todopage();
		b.btnclick(firstpage.getCompleted());
		}

	@Then("^verifies the data is empty$")
	public void verifies_the_data_is_empty() throws Throwable {
		Todopage firstpage=new Todopage();
		Assert.assertTrue(firstpage.getAlllist().isEmpty());
	}
	
	@Given("^the user doubleclicks and edits todo$")
	public void the_user_doubleclicks_and_edits_todo() throws Throwable {
		base b=new base();
		Todopage firstpage=new Todopage();
		b.btnclick(firstpage.getAllbtn());
		Actions act=new Actions(driver);
		act.doubleClick(firstpage.getAlllist().get(0)).perform();
		for(int i1=0;i1<firstpage.getEditlist().size();) {
		b.sendtext(firstpage.getEditlist().get(0), "at6am");
		b.enterkey();
		break;
	}
	}

	@Then("^verifies the todolist is updated$")
	public void verifies_the_todolist_is_updated() throws Throwable {
		Todopage firstpage=new Todopage();
		Assert.assertEquals("Wakeupat6am",firstpage.getAlllist().get(0).getText());
	   	}
	
	@When("^the user clicks the toggle icon$")
	public void the_user_clicks_the_toggle_icon() throws Throwable {
			base b=new base();
			Todopage firstpage=new Todopage();
			if (firstpage.getToggleallbtn().isDisplayed()) {
				b.btnclick(firstpage.getToggleallbtn());
					}
		}

	@Then("^verify the todo is marked completed$")
	public void verify_the_todo_is_marked_completed() throws Throwable {
			Todopage firstpage=new Todopage();
		    Assert.assertEquals("0", firstpage.getCount().getText());
		}

	@Then("^click the toggle icon again$")
	public void click_the_toggle_icon_again() throws Throwable {
			base b=new base();
			Todopage firstpage=new Todopage();
			if (firstpage.getToggleallbtn().isDisplayed()) {
				b.btnclick(firstpage.getToggleallbtn());
			}
		}

	@Then("^verify the todo items are still active$")
	public void verify_the_todo_items_are_still_active() throws Throwable {
			base b=new base();
			Todopage firstpage=new Todopage();
			Assert.assertEquals("3", firstpage.getCount().getText());
			log.info("******************Closing*********************************");
		    b.quitbrowser();
		}
		}



