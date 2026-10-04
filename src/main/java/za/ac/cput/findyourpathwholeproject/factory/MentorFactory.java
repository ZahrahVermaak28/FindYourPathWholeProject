package za.ac.cput.findyourpathwholeproject.factory;

import za.ac.cput.findyourpathwholeproject.domain.Mentor;

public class MentorFactory {

    public static Mentor createMentor(String mentorId, String firstName, String lastName, String email, String password, String jobTitle, String company, String industryId)
    {
        return new Mentor.Builder()
                .setMentorId(mentorId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setPassword(password)
                .setJobTitle(jobTitle)
                .setCompany(company)
                .setIndustryId(industryId)
                .build();
    }


}
