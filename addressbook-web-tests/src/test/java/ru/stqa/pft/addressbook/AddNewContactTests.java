package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class AddNewContactTests extends TestBase1 {

  @Test
  public void testAddNewContactTests() throws Exception {
    login1("admin", "secret");
    initNewContact();
    fillContactForm(new ContactData("firstname test2", "middle name test2", "lastname test2", "nickname2", "1234", "address1", "company1", "5667800", "email1", "1991", "address12", "123456", "January", "1"));
    submitNewContact();
    returnToHomePage();
  }

}
