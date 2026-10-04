package za.ac.cput.findyourpathwholeproject.service;

import za.ac.cput.findyourpathwholeproject.domain.IndustryDetail;

import java.util.*;

public interface IndustryDetailService extends IService<IndustryDetail, String> {

    IndustryDetail create(IndustryDetail industryDetail);

    IndustryDetail read(String detailId);

    IndustryDetail update(IndustryDetail industryDetail);

    boolean delete(String detailId);

    List<IndustryDetail> getAll();

    List<IndustryDetail> findByIndustryId(String industryId);

    List<IndustryDetail> findByType(String type);
}
