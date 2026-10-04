package za.ac.cput.findyourpathwholeproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.findyourpathwholeproject.domain.Mentor;
import za.ac.cput.findyourpathwholeproject.service.MentorService;

import java.util.List;

@RestController
@RequestMapping("/mentor")
public class MentorController {

    private MentorService mentorService;

    @Autowired
    public MentorController(MentorService mentorService) {
        this.mentorService = mentorService;
    }

    @PostMapping("/create")
    public Mentor createMentor(@RequestBody Mentor mentor) {
        return mentorService.create(mentor);
    }

    @GetMapping("/read/{mentorId}")
    public Mentor readMentor(@PathVariable("mentorId") String mentorId) {
        return mentorService.read(mentorId);
    }

    @PutMapping("/update")
    public Mentor updateMentor(@RequestBody Mentor mentor) {
        return mentorService.update(mentor);
    }

    @DeleteMapping("/delete/{mentorId}")
    public boolean deleteMentor(@PathVariable("mentorId") String mentorId) {
        return mentorService.delete(mentorId);
    }

    @GetMapping("/getall")
    public List<Mentor> getAllMentors() {
        return mentorService.getAll();
    }

    @GetMapping("/email/{email}")
    public Mentor findByEmail(@PathVariable("email") String email) {
        return mentorService.findByEmail(email);
    }

    @GetMapping("/industry/{industryId}")
    public List<Mentor> findByIndustryId(
            @PathVariable("industryId") String industryId) {
        return mentorService.findByIndustryId(industryId);
    }
}