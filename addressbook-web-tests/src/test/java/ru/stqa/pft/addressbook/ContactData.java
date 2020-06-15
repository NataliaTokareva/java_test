package ru.stqa.pft.addressbook;

public class ContactData {
  private final String firstname;
  private final String middlename;
  private final String lastname;
  private final String nickname;
  private final String title;
  private final String address;
  private final String company;
  private final String mobile;
  private final String email;
  private final String byear;
  private final String address2;
  private final String notes;
  private final String bmonth;
  private final String bday;

  public ContactData(String firstname, String middlename, String lastname, String nickname, String title, String address, String company, String mobile, String email, String byear, String address2, String notes, String bmonth, String bday) {
    this.firstname = firstname;
    this.middlename = middlename;
    this.lastname = lastname;
    this.nickname = nickname;
    this.title = title;
    this.address = address;
    this.company = company;
    this.mobile = mobile;
    this.email = email;
    this.byear = byear;
    this.address2 = address2;
    this.notes = notes;
    this.bmonth = bmonth;
    this.bday = bday;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getMiddlename() {
    return middlename;
  }

  public String getLastname() {
    return lastname;
  }

  public String getNickname() {
    return nickname;
  }

  public String getTitle() {
    return title;
  }

  public String getAddress() {
    return address;
  }

  public String getCompany() {
    return company;
  }

  public String getMobile() {
    return mobile;
  }

  public String getEmail() {
    return email;
  }

  public String getByear() {
    return byear;
  }

  public String getAddress2() {
    return address2;
  }

  public String getNotes() {
    return notes;
  }

  public String getBmonth() {
    return bmonth;
  }

  public String getBday() {
    return bday;
  }
}
