package account;

//Profile.java
public class Profile {
 private String username;
 private String name;
 private String upassword;

 // Constructor
 public Profile(String username, String name, String upassword) {
     this.username = username;
     this.name = name;
     this.upassword = upassword;
 }

 // Getters and Setters
 public String getUsername() {
     return username;
 }

 public void setUsername(String username) {
     this.username = username;
 }

 public String getUpassword() {
     return upassword;
 }

 public void setUpassword(String upassword) {
     this.upassword = upassword;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 // Method to validate user credentials
 public boolean validateUser(String username, String password) {
     return this.username.equals(username) && this.upassword.equals(password);
 }
}

