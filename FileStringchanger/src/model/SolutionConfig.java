package model;
public class SolutionConfig {
        boolean cloudShortcutsEnabled;
        boolean eprintSupported;
        String eprintEmailAddress;
        String printOnTheGoSupport;
		public boolean isCloudShortcutsEnabled() {
			return cloudShortcutsEnabled;
		}
		public void setCloudShortcutsEnabled(boolean cloudShortcutsEnabled) {
			this.cloudShortcutsEnabled = cloudShortcutsEnabled;
		}
		public boolean isEprintSupported() {
			return eprintSupported;
		}
		public void setEprintSupported(boolean eprintSupported) {
			this.eprintSupported = eprintSupported;
		}
		public String getEprintEmailAddress() {
			return eprintEmailAddress;
		}
		public void setEprintEmailAddress(String eprintEmailAddress) {
			this.eprintEmailAddress = eprintEmailAddress;
		}
		public String getPrintOnTheGoSupport() {
			return printOnTheGoSupport;
		}
		public void setPrintOnTheGoSupport(String printOnTheGoSupport) {
			this.printOnTheGoSupport = printOnTheGoSupport;
		}
        
    }