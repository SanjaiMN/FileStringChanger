package model;

public class Device 
{
    private String deviceId;
    private String lastUpdatedAt;
    private String type;
    private Identity identity;
    private Tenancy tenancy;
    private Timestamp timestamp;
    private Network network;
    private Image[] images;
    private Object[] solutions;
    private Status status;
    private String software;
    private Object hardware;
    private Supplies supplies;
    private SolutionConfig solutionConfig;
    private Ownership ownership;
    
    public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getLastUpdatedAt() {
		return lastUpdatedAt;
	}

	public void setLastUpdatedAt(String lastUpdatedAt) {
		this.lastUpdatedAt = lastUpdatedAt;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Identity getIdentity() {
		return identity;
	}

	public void setIdentity(Identity identity) {
		this.identity = identity;
	}

	public Tenancy getTenancy() {
		return tenancy;
	}

	public void setTenancy(Tenancy tenancy) {
		this.tenancy = tenancy;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public Network getNetwork() {
		return network;
	}

	public void setNetwork(Network network) {
		this.network = network;
	}

	public Image[] getImages() {
		return images;
	}

	public void setImages(Image[] images) {
		this.images = images;
	}

	public Object[] getSolutions() {
		return solutions;
	}

	public void setSolutions(Object[] solutions) {
		this.solutions = solutions;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getSoftware() {
		return software;
	}

	public void setSoftware(String software) {
		this.software = software;
	}

	public Object getHardware() {
		return hardware;
	}

	public void setHardware(Object hardware) {
		this.hardware = hardware;
	}

	public Supplies getSupplies() {
		return supplies;
	}

	public void setSupplies(Supplies supplies) {
		this.supplies = supplies;
	}

	public SolutionConfig getSolutionConfig() {
		return solutionConfig;
	}

	public void setSolutionConfig(SolutionConfig solutionConfig) {
		this.solutionConfig = solutionConfig;
	}

	public Ownership getOwnership() {
		return ownership;
	}

	public void setOwnership(Ownership ownership) {
		this.ownership = ownership;
	}
		
    
    public static class Image {
        private String url;

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}
    }


}
