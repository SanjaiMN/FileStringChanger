import java.util.List;

public class Device 
{
    private String deviceId;
    private String lastUpdatedAt;
    private String type;
    private Identity identity;
    private Tenancy tenancy;
    private Timestamp timestamp;
    private Network network;
    
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

	public Object getSoftware() {
		return software;
	}

	public void setSoftware(Object software) {
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

	public class Identity 
    {
        private String lastUpdatedAt;
        private String serialNumber;
        private String deviceUuid;
        private String firmwareVersion;
        private Object biosVersion;
        private String location;
        private String friendlyName;
        private String bizModel;
        private String benefitsControlModel;
        private String platformIdentifier;
        private String programLevel;
        private Object countryRegion;
        private Object language;
        private String supplyType;
        private String supplyDelivery;
        private String deviceSegment;
        private String displayProfile;
        private String bleHPSpecVersion;
        private boolean colorSupported;
        private MakeAndModel makeAndModel;
        private Object misc;
        private Object connectionType;
        private String assetNumber;
        private Object externalReference;
        private boolean completeIdentityAvailable;
        

        public String getLastUpdatedAt() {
			return lastUpdatedAt;
		}


		public void setLastUpdatedAt(String lastUpdatedAt) {
			this.lastUpdatedAt = lastUpdatedAt;
		}


		public String getSerialNumber() {
			return serialNumber;
		}


		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}


		public String getDeviceUuid() {
			return deviceUuid;
		}


		public void setDeviceUuid(String deviceUuid) {
			this.deviceUuid = deviceUuid;
		}


		public String getFirmwareVersion() {
			return firmwareVersion;
		}


		public void setFirmwareVersion(String firmwareVersion) {
			this.firmwareVersion = firmwareVersion;
		}


		public Object getBiosVersion() {
			return biosVersion;
		}


		public void setBiosVersion(Object biosVersion) {
			this.biosVersion = biosVersion;
		}


		public String getLocation() {
			return location;
		}


		public void setLocation(String location) {
			this.location = location;
		}


		public String getFriendlyName() {
			return friendlyName;
		}


		public void setFriendlyName(String friendlyName) {
			this.friendlyName = friendlyName;
		}


		public String getBizModel() {
			return bizModel;
		}


		public void setBizModel(String bizModel) {
			this.bizModel = bizModel;
		}


		public String getBenefitsControlModel() {
			return benefitsControlModel;
		}


		public void setBenefitsControlModel(String benefitsControlModel) {
			this.benefitsControlModel = benefitsControlModel;
		}


		public String getPlatformIdentifier() {
			return platformIdentifier;
		}


		public void setPlatformIdentifier(String platformIdentifier) {
			this.platformIdentifier = platformIdentifier;
		}


		public String getProgramLevel() {
			return programLevel;
		}


		public void setProgramLevel(String programLevel) {
			this.programLevel = programLevel;
		}


		public Object getCountryRegion() {
			return countryRegion;
		}


		public void setCountryRegion(Object countryRegion) {
			this.countryRegion = countryRegion;
		}


		public Object getLanguage() {
			return language;
		}


		public void setLanguage(Object language) {
			this.language = language;
		}


		public String getSupplyType() {
			return supplyType;
		}


		public void setSupplyType(String supplyType) {
			this.supplyType = supplyType;
		}


		public String getSupplyDelivery() {
			return supplyDelivery;
		}


		public void setSupplyDelivery(String supplyDelivery) {
			this.supplyDelivery = supplyDelivery;
		}


		public String getDeviceSegment() {
			return deviceSegment;
		}


		public void setDeviceSegment(String deviceSegment) {
			this.deviceSegment = deviceSegment;
		}


		public String getDisplayProfile() {
			return displayProfile;
		}


		public void setDisplayProfile(String displayProfile) {
			this.displayProfile = displayProfile;
		}


		public String getBleHPSpecVersion() {
			return bleHPSpecVersion;
		}


		public void setBleHPSpecVersion(String bleHPSpecVersion) {
			this.bleHPSpecVersion = bleHPSpecVersion;
		}


		public boolean isColorSupported() {
			return colorSupported;
		}


		public void setColorSupported(boolean colorSupported) {
			this.colorSupported = colorSupported;
		}


		public MakeAndModel getMakeAndModel() {
			return makeAndModel;
		}


		public void setMakeAndModel(MakeAndModel makeAndModel) {
			this.makeAndModel = makeAndModel;
		}


		public Object getMisc() {
			return misc;
		}


		public void setMisc(Object misc) {
			this.misc = misc;
		}


		public Object getConnectionType() {
			return connectionType;
		}


		public void setConnectionType(Object connectionType) {
			this.connectionType = connectionType;
		}


		public String getAssetNumber() {
			return assetNumber;
		}


		public void setAssetNumber(String assetNumber) {
			this.assetNumber = assetNumber;
		}


		public Object getExternalReference() {
			return externalReference;
		}


		public void setExternalReference(Object externalReference) {
			this.externalReference = externalReference;
		}


		public boolean isCompleteIdentityAvailable() {
			return completeIdentityAvailable;
		}


		public void setCompleteIdentityAvailable(boolean completeIdentityAvailable) {
			this.completeIdentityAvailable = completeIdentityAvailable;
		}


		public class MakeAndModel {
            private String name;
            private String number;
            private Object productId;
            private String series;
            private String code;
            private Object type;
            private Object manufacturer;
            private Object sku;
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getNumber() {
				return number;
			}
			public void setNumber(String number) {
				this.number = number;
			}
			public Object getProductId() {
				return productId;
			}
			public void setProductId(Object productId) {
				this.productId = productId;
			}
			public String getSeries() {
				return series;
			}
			public void setSeries(String series) {
				this.series = series;
			}
			public String getCode() {
				return code;
			}
			public void setCode(String code) {
				this.code = code;
			}
			public Object getType() {
				return type;
			}
			public void setType(Object type) {
				this.type = type;
			}
			public Object getManufacturer() {
				return manufacturer;
			}
			public void setManufacturer(Object manufacturer) {
				this.manufacturer = manufacturer;
			}
			public Object getSku() {
				return sku;
			}
			public void setSku(Object sku) {
				this.sku = sku;
			}
            
        }
    }

    public class Tenancy {
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

    public class Timestamp {
        private String lastUpdatedAt;
        private String lastSeenTime;
        private Object lastRegistrationTime;
        private String firstRegistrationTime;
        private String lastResetTime;
        private Object firmwareDate;
        private Object claimTime;
        private String lastTenantUpdatedTime;
        private Object claimRevokeTime;
        private Object deviceTime;
        private Object manufactureDate;
        private Object purchasedDate;
		public String getLastUpdatedAt() {
			return lastUpdatedAt;
		}
		public void setLastUpdatedAt(String lastUpdatedAt) {
			this.lastUpdatedAt = lastUpdatedAt;
		}
		public String getLastSeenTime() {
			return lastSeenTime;
		}
		public void setLastSeenTime(String lastSeenTime) {
			this.lastSeenTime = lastSeenTime;
		}
		public Object getLastRegistrationTime() {
			return lastRegistrationTime;
		}
		public void setLastRegistrationTime(Object lastRegistrationTime) {
			this.lastRegistrationTime = lastRegistrationTime;
		}
		public String getFirstRegistrationTime() {
			return firstRegistrationTime;
		}
		public void setFirstRegistrationTime(String firstRegistrationTime) {
			this.firstRegistrationTime = firstRegistrationTime;
		}
		public String getLastResetTime() {
			return lastResetTime;
		}
		public void setLastResetTime(String lastResetTime) {
			this.lastResetTime = lastResetTime;
		}
		public Object getFirmwareDate() {
			return firmwareDate;
		}
		public void setFirmwareDate(Object firmwareDate) {
			this.firmwareDate = firmwareDate;
		}
		public Object getClaimTime() {
			return claimTime;
		}
		public void setClaimTime(Object claimTime) {
			this.claimTime = claimTime;
		}
		public String getLastTenantUpdatedTime() {
			return lastTenantUpdatedTime;
		}
		public void setLastTenantUpdatedTime(String lastTenantUpdatedTime) {
			this.lastTenantUpdatedTime = lastTenantUpdatedTime;
		}
		public Object getClaimRevokeTime() {
			return claimRevokeTime;
		}
		public void setClaimRevokeTime(Object claimRevokeTime) {
			this.claimRevokeTime = claimRevokeTime;
		}
		public Object getDeviceTime() {
			return deviceTime;
		}
		public void setDeviceTime(Object deviceTime) {
			this.deviceTime = deviceTime;
		}
		public Object getManufactureDate() {
			return manufactureDate;
		}
		public void setManufactureDate(Object manufactureDate) {
			this.manufactureDate = manufactureDate;
		}
		public Object getPurchasedDate() {
			return purchasedDate;
		}
		public void setPurchasedDate(Object purchasedDate) {
			this.purchasedDate = purchasedDate;
		}
        
    }

    public class Network {
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


		public class Adapter {
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

				public class Address {
                    private String ip;

					public String getIp() {
						return ip;
					}

					public void setIp(String ip) {
						this.ip = ip;
					}
                    
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

				public class Address {
                    private String ip;

					public String getIp() {
						return ip;
					}

					public void setIp(String ip) {
						this.ip = ip;
					}
                    
                }
            }
        }
    }
    private Image[] images;
    private Object[] solutions;
    private Status status;
    private Object software;
    private Object hardware;
    private Supplies supplies;
    private SolutionConfig solutionConfig;
    private Ownership ownership;
    
    public static class Image {
        private String url;

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}
        
    }

    public static class Status {
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
    
    class Supplies {
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

    class SolutionConfig {
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

    class Ownership {
        String lastUpdatedAt;
        String accountId;
		public String getLastUpdatedAt() {
			return lastUpdatedAt;
		}
		public void setLastUpdatedAt(String lastUpdatedAt) {
			this.lastUpdatedAt = lastUpdatedAt;
		}
		public String getAccountId() {
			return accountId;
		}
		public void setAccountId(String accountId) {
			this.accountId = accountId;
		}
        
    }

}
