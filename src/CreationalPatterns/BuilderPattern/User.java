package CreationalPatterns.BuilderPattern;

public class User {
    private final String name;
    private final String email;
    private final String lastName;
    private final String countryCode;
    private final String role;
    private final String birthDate;

    private User(Builder builder){
        this.name = builder.name;
        this.email = builder.email;
        this.lastName = builder.lastName;
        this.countryCode = builder.countryCode;
        this.role = builder.role;
        this.birthDate = builder.birthDate;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getRole() {
        return role;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public static class Builder{
        private String name;
        private final String email;
        private String lastName;
        private String countryCode;
        private String role;
        private String birthDate;

        public Builder(String email){
            this.email = email;
        }

        public Builder withName(String name){
            this.name = name;
            return this;
        }

        public Builder withLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder withCountryCode(String countryCode){
            this.countryCode = countryCode;
            return this;
        }

        public Builder withRole(String role){
            this.role = role;
            return this;
        }

        public Builder withBirthDate(String birthDate){
            this.birthDate = birthDate;
            return this;
        }

        public User build(){
            return new User(this);
        }

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", lastName='" + lastName + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", role='" + role + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }
}
