package za.ac.cput.findyourpathwholeproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.findyourpathwholeproject.domain.IndustryDetail;

import java.util.*;

@Repository
public interface IndustryDetailRepository extends JpaRepository<IndustryDetail, String> {

    IndustryDetail create(IndustryDetail industryDetail);

    IndustryDetail read(String detailId);

    IndustryDetail update(IndustryDetail industryDetail);

    boolean delete(String detailId);

    List<IndustryDetail> getAll();

    List<IndustryDetail> findByIndustryId(String industryId);

    List<IndustryDetail> findByType(String type);


}
