package model;

public class Tenancy 
{
        private String lastUpdatedAt;
        private String fqResourceIdPath;
		public String getLastUpdatedAt() {
			return lastUpdatedAt;
		}
		public void setLastUpdatedAt(String lastUpdatedAt) {
			this.lastUpdatedAt = lastUpdatedAt;
		}
		public String getFqResourceIdPath() {
			return fqResourceIdPath;
		}
		public void setFqResourceIdPath(String fqResourceIdPath) {
			this.fqResourceIdPath = fqResourceIdPath;
		}
        
}