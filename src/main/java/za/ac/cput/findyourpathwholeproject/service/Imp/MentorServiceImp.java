package za.ac.cput.findyourpathwholeproject.service.Imp;

import org.springframework.stereotype.Service;
import za.ac.cput.findyourpathwholeproject.domain.Mentor;
import za.ac.cput.findyourpathwholeproject.repository.MentorRepository;
import za.ac.cput.findyourpathwholeproject.service.MentorService;

import java.util.*;

@Service
public class MentorServiceImp implements MentorService {

    //private static MentorService mentorService = null;

    private final MentorRepository mentorRepository;

    public MentorServiceImp(MentorRepository mentorRepository) {
        this.mentorRepository = mentorRepository;
    }

    @Override
    public Mentor create(Mentor mentor) {
        if (mentor == null) {
            return null;
        }
        return mentorRepository.create(mentor);
    }

    @Override
    public Mentor read(String mentorId) {
        if (mentorId == null || mentorId.trim().isEmpty()) {
            return null;
        }
        return mentorRepository.read(mentorId);
    }

    @Override
    public Mentor update(Mentor mentor) {
        if (mentor == null) {
            return null;
        }
        return mentorRepository.update(mentor);
    }

    @Override
    public boolean delete(String mentorId) {
        if (mentorId == null || mentorId.trim().isEmpty()) {
            return false;
        }
        return mentorRepository.delete(mentorId);
    }

    @Override
    public List<Mentor> getAll() {
        return mentorRepository.getAll();
    }

    @Override
    public Mentor findByEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            return null;
        }
        return mentorRepository.findByEmail(email);
    }

    @Override
    public List<Mentor> findByIndustryId(String industryId) {
        if (industryId == null || industryId.trim().isEmpty()) {
            return List.of();
        }
        return mentorRepository.findByIndustryId(industryId);
    }
}
