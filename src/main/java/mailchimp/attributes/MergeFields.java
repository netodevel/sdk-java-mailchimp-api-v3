package mailchimp.attributes;

import com.google.gson.annotations.SerializedName;

public class MergeFields {

	@SerializedName("FNAME")
    private String fNAME;
	
	@SerializedName("LNAME")
    private String lNAME;

    /**
     * No args constructor for use in serialization
     * 
     */
    public MergeFields() {
    }

    /**
     * 
     * @param lNAME
     * @param fNAME
     */
    public MergeFields(String fNAME, String lNAME) {
        this.fNAME = fNAME;
        this.lNAME = lNAME;
    }

    /**
     * 
     * @return
     *     The fNAME
     */
    public String getFNAME() {
        return fNAME;
    }

    /**
     * 
     * @param fNAME
     *     The FNAME
     */
    public void setFNAME(String fNAME) {
        this.fNAME = fNAME;
    }

    public MergeFields withFNAME(String fNAME) {
        this.fNAME = fNAME;
        return this;
    }

    /**
     * 
     * @return
     *     The lNAME
     */
    public String getLNAME() {
        return lNAME;
    }

    /**
     * 
     * @param lNAME
     *     The LNAME
     */
    public void setLNAME(String lNAME) {
        this.lNAME = lNAME;
    }

    public MergeFields withLNAME(String lNAME) {
        this.lNAME = lNAME;
        return this;
    }

}
