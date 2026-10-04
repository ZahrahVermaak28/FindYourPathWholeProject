package za.ac.cput.findyourpathwholeproject.domain;

public class Mentor {

    private String mentorId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String jobTitle;
    private String company;
    private String industryId;

    public Mentor() {
    }

    public Mentor(Builder builder){
        this.mentorId = builder.mentorId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.password = builder.password;
        this.jobTitle = builder.jobTitle;
        this.company = builder.company;
        this.industryId = builder.industryId;
    }

    public String getMentorId() {
        return mentorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public String getIndustryId() {
        return industryId;
    }

    @Override
    public String toString() {
        return "Mentor{" +
                "mentorId='" + mentorId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", company='" + company + '\'' +
                ", industryId='" + industryId + '\'' +
                '}';
    }

    public static class Builder{
        private String mentorId;
        private String firstName;
        private String lastName;
        private String email;
        private String password;
        private String jobTitle;
        private String company;
        private String industryId;

        public Builder setMentorId(String mentorId) {
            this.mentorId = mentorId;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
            return this;
        }

        public Builder setCompany(String company) {
            this.company = company;
            return this;
        }

        public Builder setIndustryId(String industryId) {
            this.industryId = industryId;
            return this;
        }

        public Mentor build(){
            return new Mentor(this);
        }
    }

}
