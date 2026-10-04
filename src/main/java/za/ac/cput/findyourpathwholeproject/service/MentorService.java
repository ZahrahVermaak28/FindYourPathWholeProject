package za.ac.cput.findyourpathwholeproject.service;

import za.ac.cput.findyourpathwholeproject.domain.Mentor;

import java.util.*;

public interface MentorService extends IService<Mentor, String> {

    Mentor create(Mentor mentor);

    Mentor read(String mentorId);

    Mentor update(Mentor mentor);

    boolean delete(String mentorId);

    List<Mentor> getAll();

    Mentor findByEmail(String email);

    List<Mentor> findByIndustryId(String industryId);


}
