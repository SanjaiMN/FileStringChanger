package model;
import java.util.List;

class Supplies 
{
        String lastUpdatedAt;
        Integer overallLevelStateCode;
        List<Object> consumables;
		public String getLastUpdatedAt() {
			return lastUpdatedAt;
		}
		public void setLastUpdatedAt(String lastUpdatedAt) {
			this.lastUpdatedAt = lastUpdatedAt;
		}
		public Integer getOverallLevelStateCode() {
			return overallLevelStateCode;
		}
		public void setOverallLevelStateCode(Integer overallLevelStateCode) {
			this.overallLevelStateCode = overallLevelStateCode;
		}
		public List<Object> getConsumables() {
			return consumables;
		}
		public void setConsumables(List<Object> consumables) {
			this.consumables = consumables;
		}
        
}