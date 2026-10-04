package za.ac.cput.findyourpathwholeproject.factory;

import za.ac.cput.findyourpathwholeproject.domain.IndustryDetail;

public class IndustryDetailFactory {

    public static IndustryDetail createIndustryDetail(String detailId, String industryId, String type, String value, String orderNumber){
        return new IndustryDetail.Builder()
                .setDetailId(detailId)
                .setIndustryId(industryId)
                .setType(type)
                .setValue(value)
                .setOrderNumber(orderNumber)
                .build();

    }

}
