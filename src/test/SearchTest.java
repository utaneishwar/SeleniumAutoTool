package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pagess.Search;
    // TestClass : here write test cases reg Page Class Webelement 
      public class SearchTest extends BaseTest
     {
     
    	  
      @Test (priority=1)
        public void verifyTitle() 
        {
    	  String title= search.getTitleofpage();
    	  boolean ispresent = title.contains("Order");
    	  Assert.assertEquals(ispresent, true);
	     }
     
      @Test (priority=2)
      public void searchProducts() 
      {
    	  search.searchItems("malt");
      }
      
      @Test  (priority=3)
      public void valiidateSearchResults() 
      {
    	  search.getSearchresults();
    	  
      }
}
