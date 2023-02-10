package model;
public class Adapter 
{
            private Object enabled;
            private String type;
            private String name;
            private String macAddress;
            private String hostname;
            private Ipv4 ipv4;
            private Ipv6 ipv6;
            

            public Object getEnabled() {
				return enabled;
			}

			public void setEnabled(Object enabled) {
				this.enabled = enabled;
			}

			public String getType() {
				return type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getMacAddress() {
				return macAddress;
			}

			public void setMacAddress(String macAddress) {
				this.macAddress = macAddress;
			}

			public String getHostname() {
				return hostname;
			}

			public void setHostname(String hostname) {
				this.hostname = hostname;
			}

			public Ipv4 getIpv4() {
				return ipv4;
			}

			public void setIpv4(Ipv4 ipv4) {
				this.ipv4 = ipv4;
			}

			public Ipv6 getIpv6() {
				return ipv6;
			}

			public void setIpv6(Ipv6 ipv6) {
				this.ipv6 = ipv6;
			}

			public class Ipv4 {
                private Object enabled;
                private Address address;
                
                public Object getEnabled() {
					return enabled;
				}

				public void setEnabled(Object enabled) {
					this.enabled = enabled;
				}

				public Address getAddress() {
					return address;
				}

				public void setAddress(Address address) {
					this.address = address;
				}
            }

            public class Ipv6 {
                private Object enabled;
                private Address address;
                
                public Object getEnabled() {
					return enabled;
				}

				public void setEnabled(Object enabled) {
					this.enabled = enabled;
				}

				public Address getAddress() {
					return address;
				}

				public void setAddress(Address address) {
					this.address = address;
				}

            }
}
class Address {
    private String ip;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
    
}