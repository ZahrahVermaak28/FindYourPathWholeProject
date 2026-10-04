package za.ac.cput.findyourpathwholeproject.service.Imp;


import org.springframework.stereotype.Service;
import za.ac.cput.findyourpathwholeproject.domain.IndustryDetail;
import za.ac.cput.findyourpathwholeproject.repository.IndustryDetailRepository;
import za.ac.cput.findyourpathwholeproject.service.IndustryDetailService;

import java.util.*;

@Service
public class IndustryDetailServiceImp implements IndustryDetailService {

    private static IndustryDetailService industryDetailService = null;
    private final IndustryDetailRepository industryDetailRepository;

    public IndustryDetailServiceImp(IndustryDetailRepository industryDetailRepository) {
        this.industryDetailRepository = industryDetailRepository;
    }

    @Override
    public IndustryDetail create(IndustryDetail industryDetail) {
        if (industryDetail == null) {
            return null;
        }
        return industryDetailRepository.create(industryDetail);
    }

    @Override
    public IndustryDetail read(String detailId) {
        if (detailId == null || detailId.trim().isEmpty()) {
            return null;
        }
        return industryDetailRepository.read(detailId);
    }

    @Override
    public IndustryDetail update(IndustryDetail industryDetail) {
        if (industryDetail == null) {
            return null;
        }
        return industryDetailRepository.update(industryDetail);
    }

    @Override
    public boolean delete(String detailId) {
        if (detailId == null || detailId.trim().isEmpty()) {
            return false;
        }
        return industryDetailRepository.delete(detailId);
    }

    @Override
    public List<IndustryDetail> getAll() {
        return industryDetailRepository.getAll();
    }

    @Override
    public List<IndustryDetail> findByIndustryId(String industryId) {
        if (industryId == null || industryId.trim().isEmpty()) {
            return List.of();
        }
        return industryDetailRepository.findByIndustryId(industryId);
    }

    @Override
    public List<IndustryDetail> findByType(String type) {
        if (type == null || type.trim().isEmpty()) {
            return List.of();
        }
        return industryDetailRepository.findByType(type);
    }
}
