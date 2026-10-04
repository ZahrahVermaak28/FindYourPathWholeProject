package za.ac.cput.findyourpathwholeproject.domain;

public class IndustryDetail {

    private String detailId;
    private String industryId;
    private String type;
    private String value;
    private String orderNumber;

    public IndustryDetail() {
    }

    public IndustryDetail(Builder builder){
        this.detailId = builder.detailId;
        this.industryId = builder.industryId;
        this.type = builder.type;
        this.value = builder.value;
        this.orderNumber = builder.orderNumber;
    }

    public String getDetailId() {
        return detailId;
    }

    public String getIndustryId() {
        return industryId;
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    @Override
    public String toString() {
        return "IndustryDetail{" +
                "detailId='" + detailId + '\'' +
                ", industryId='" + industryId + '\'' +
                ", type='" + type + '\'' +
                ", value='" + value + '\'' +
                ", orderNumber='" + orderNumber + '\'' +
                '}';
    }

    public static class Builder{
        private String detailId;
        private String industryId;
        private String type;
        private String value;
        private String orderNumber;

        public Builder setDetailId(String detailId) {
            this.detailId = detailId;
            return this;
        }

        public Builder setIndustryId(String industryId) {
            this.industryId = industryId;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setValue(String value) {
            this.value = value;
            return this;
        }

        public Builder setOrderNumber(String orderNumber) {
            this.orderNumber = orderNumber;
            return this;
        }

        public IndustryDetail build(){
            return new IndustryDetail(this);
        }
    }

}
