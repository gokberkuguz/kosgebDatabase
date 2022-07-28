public class CoorparateEntrepreneurs extends Entreprenurs{
    private String companyName;
    private String taxNo;

    public CoorparateEntrepreneurs(long id, String phoneNumber, String email, String password, long entreprenursId, int creditScore, boolean applicable, String companyName, String taxNo) {
        super(id, phoneNumber, email, password, entreprenursId, creditScore, applicable);
        this.companyName = companyName;
        this.taxNo = taxNo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTaxNo() {
        return taxNo;
    }

    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo;
    }
}
