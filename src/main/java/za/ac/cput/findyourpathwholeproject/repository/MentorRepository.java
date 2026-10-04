package za.ac.cput.findyourpathwholeproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.findyourpathwholeproject.domain.Mentor;

import java.util.*;

@Repository
public interface MentorRepository extends JpaRepository<Mentor, String> {
    Mentor create(Mentor mentor);

    Mentor read(String mentorId);

    Mentor update(Mentor mentor);

    boolean delete(String mentorId);

    List<Mentor> getAll();

    Mentor findByEmail(String email);

    List<Mentor> findByIndustryId(String industryId);
}
