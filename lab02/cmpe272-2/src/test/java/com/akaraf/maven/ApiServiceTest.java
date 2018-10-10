//Test Case Contribution: Paramdeep Saini

package api;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.apache.camel.test.blueprint.CamelBlueprintTestSupport;
import org.junit.Assert;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ApiServiceTest extends CamelBlueprintTestSupport {

   @Test
   public void testAccountSetting() throws Exception {
       InitialService svc = context().getRegistry().lookupByNameAndType("ApiService", InitialService.class);

      // setup some pre-existing orders
       svc.setupInitialOrders();
       // use restlet component to get the order
       String response = template.requestBody("restlet:http://localhost:8080/orders/account_settings?restletMethod=GET", null, String.class);
       Assert.assertNotNull(response);
       
      Gson gson = new Gson();
       Type listType = new TypeToken<AccountSettings>(){}.getType();
       AccountSettings account = gson.fromJson(response, listType);
       Assert.assertNotNull(account);        
  }
}
