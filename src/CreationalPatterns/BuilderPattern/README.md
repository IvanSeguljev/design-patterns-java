<h3>Builder pattern</h3>
<p>Builder pattern is used when complex object should be initialized, allowing better controll and readability:</p>
<b>
Case W/O builder:
</b><br/>
<i>User user = new User("mail@mail.com", "Test", "User", "US", "Admin", "12.5.1983.")</i>
<br><br>
<b>With builder:</b>
<br>
<i>User user = new User.Builder("mail@mail.com")<br>
.setName("Test")<br>
.setLastName("User")<br>
.setCountryCode("US")<br>
.setRole("Admin")<br>
.setBirthDate("12.5.1983.")<br>
.build();
</i>