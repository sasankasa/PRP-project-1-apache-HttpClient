package org.example;

public class Commune {
        private String communeName;

        public String getCommuneName() {
                return communeName;
        }

        public void setCommuneName(String communeName) {
                this.communeName = communeName;
        }

        public String getDistrictName() {
                return districtName;
        }

        public void setDistrictName(String districtName) {
                this.districtName = districtName;
        }

        public String getProvinceName() {
                return provinceName;
        }

        public void setProvinceName(String provinceName) {
                this.provinceName = provinceName;
        }

        private String districtName;
        private String provinceName;
}
