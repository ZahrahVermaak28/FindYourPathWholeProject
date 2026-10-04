package za.ac.cput.findyourpathwholeproject.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.findyourpathwholeproject.domain.IndustryDetail;
import za.ac.cput.findyourpathwholeproject.service.IndustryDetailService;

import java.util.List;

@RestController
@RequestMapping("/api/industry-details")
@CrossOrigin(origins = "*")
public class IndustryDetailController {

    private final IndustryDetailService industryDetailService;

    public IndustryDetailController(IndustryDetailService industryDetailService) {
        this.industryDetailService = industryDetailService;
    }

    // CREATE
    @PostMapping("/create")
    public ResponseEntity<IndustryDetail> create(
            @RequestBody IndustryDetail industryDetail) {

        IndustryDetail createdIndustryDetail =
                industryDetailService.create(industryDetail);

        return ResponseEntity.ok(createdIndustryDetail);
    }


    // READ BY ID
    @GetMapping("/read/{detailId}")
    public ResponseEntity<IndustryDetail> read(
            @PathVariable String detailId) {

        IndustryDetail industryDetail =
                industryDetailService.read(detailId);

        if (industryDetail == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(industryDetail);
    }


    // UPDATE
    @PutMapping("/update")
    public ResponseEntity<IndustryDetail> update(
            @RequestBody IndustryDetail industryDetail) {

        IndustryDetail updatedIndustryDetail =
                industryDetailService.update(industryDetail);

        if (updatedIndustryDetail == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(updatedIndustryDetail);
    }


    // DELETE
    @DeleteMapping("/delete/{detailId}")
    public ResponseEntity<Void> delete(
            @PathVariable String detailId) {

        boolean deleted =
                industryDetailService.delete(detailId);

        if (!deleted) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.noContent().build();
    }


    // GET ALL
    @GetMapping("/all")
    public ResponseEntity<List<IndustryDetail>> getAll() {

        List<IndustryDetail> industryDetails =
                industryDetailService.getAll();

        return ResponseEntity.ok(industryDetails);
    }


    // GET DETAILS BY INDUSTRY ID
    @GetMapping("/industry/{industryId}")
    public ResponseEntity<List<IndustryDetail>> findByIndustryId(
            @PathVariable String industryId) {

        List<IndustryDetail> industryDetails =
                industryDetailService.findByIndustryId(industryId);

        return ResponseEntity.ok(industryDetails);
    }


    // GET DETAILS BY TYPE
    @GetMapping("/type/{type}")
    public ResponseEntity<List<IndustryDetail>> findByType(
            @PathVariable String type) {

        List<IndustryDetail> industryDetails =
                industryDetailService.findByType(type);

        return ResponseEntity.ok(industryDetails);
    }
}