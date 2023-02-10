package model;
import java.util.List;


public class Network 
{
        private String lastUpdatedAt;
        private List<Adapter> adapters;
        

        public String getLastUpdatedAt() {
			return lastUpdatedAt;
		}


		public void setLastUpdatedAt(String lastUpdatedAt) {
			this.lastUpdatedAt = lastUpdatedAt;
		}


		public List<Adapter> getAdapters() {
			return adapters;
		}


		public void setAdapters(List<Adapter> adapters) {
			this.adapters = adapters;
		}
}