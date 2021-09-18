package Domain;

public class WallSearch {
    private int owenerId;

    public int getOwenerId() {
        return owenerId;
    }

    public void setOwenerId(int owenerId) {
        this.owenerId = owenerId;
    }

    private String Domain;

    public String getDomain() {
        return Domain;
    }

    public void setDomain(String domain) {
        Domain = domain;
    }

   private String query;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    private int ownersOnly;

    public int getOwnersOnly() {
        return ownersOnly;
    }

    public void setOwnersOnly(int ownersOnly) {
        this.ownersOnly = ownersOnly;
    }

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private int offset;

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    private int extended;

    public int getExtended() {
        return extended;
    }

    public void setExtended(int extended) {
        this.extended = extended;
    }

    private String fields;

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }
}
