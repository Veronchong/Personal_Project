package account;

//User.java
public class User {
 private String username;
 private String userPassword;
 private Report report;
 private Profile profile;

 // Constructor
 public User(String username, String userPassword) {
     this.username = username;
     this.userPassword = userPassword;
     this.profile = new Profile(username, "", userPassword); // Creating a profile with default values
 }

 // Method to view report
 public String viewReport() {
     if (report != null) {
         return report.toString();
     } else {
         return "No report available";
     }
 }

 // Getters and Setters
 public Report getReport() {
     return report;
 }

 public void setReport(Report report) {
     this.report = report;
 }

 // Method to login
 public boolean login(String username, String password) {
     return profile.validateUser(username, password);
 }
}
