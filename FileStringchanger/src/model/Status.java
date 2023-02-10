package model;
  public  class Status 
  {
        private String lastUpdatedAt;
        private String connectionStateLastUpdatedAt;
        private String connectionState;
        private int connectionStateCode;
        private boolean acceptingJobs;
        private String[] printerStateReasons;
        private String printerStateSeverity;
        private String printerState;
        private String scanState;
        private String scanADFState;
        private String powerState;
		public String getLastUpdatedAt() {
			return lastUpdatedAt;
		}
		public void setLastUpdatedAt(String lastUpdatedAt) {
			this.lastUpdatedAt = lastUpdatedAt;
		}
		public String getConnectionStateLastUpdatedAt() {
			return connectionStateLastUpdatedAt;
		}
		public void setConnectionStateLastUpdatedAt(String connectionStateLastUpdatedAt) {
			this.connectionStateLastUpdatedAt = connectionStateLastUpdatedAt;
		}
		public String getConnectionState() {
			return connectionState;
		}
		public void setConnectionState(String connectionState) {
			this.connectionState = connectionState;
		}
		public int getConnectionStateCode() {
			return connectionStateCode;
		}
		public void setConnectionStateCode(int connectionStateCode) {
			this.connectionStateCode = connectionStateCode;
		}
		public boolean isAcceptingJobs() {
			return acceptingJobs;
		}
		public void setAcceptingJobs(boolean acceptingJobs) {
			this.acceptingJobs = acceptingJobs;
		}
		public String[] getPrinterStateReasons() {
			return printerStateReasons;
		}
		public void setPrinterStateReasons(String[] printerStateReasons) {
			this.printerStateReasons = printerStateReasons;
		}
		public String getPrinterStateSeverity() {
			return printerStateSeverity;
		}
		public void setPrinterStateSeverity(String printerStateSeverity) {
			this.printerStateSeverity = printerStateSeverity;
		}
		public String getPrinterState() {
			return printerState;
		}
		public void setPrinterState(String printerState) {
			this.printerState = printerState;
		}
		public String getScanState() {
			return scanState;
		}
		public void setScanState(String scanState) {
			this.scanState = scanState;
		}
		public String getScanADFState() {
			return scanADFState;
		}
		public void setScanADFState(String scanADFState) {
			this.scanADFState = scanADFState;
		}
		public String getPowerState() {
			return powerState;
		}
		public void setPowerState(String powerState) {
			this.powerState = powerState;
		}
        
    }