package com.example.mvvmdemo.entity;

import java.io.Serializable;
import java.util.List;

public class LoginResponseEntity {
    private String statusCode;
    private BodyBean body;
    private String msg;
    private String setCode;
    private int number;
    private String status;

    public static class BodyBean implements Serializable {

        /**
         * user : {"delFlag":0,"departId":0,"departModel":{"id":0},"email":"admin@qq.com","enableStatus":0,"id":-101,"name":"admin","passWord":"ZTEwYWRjMzk0OWJhNTlhYmJlNTZlMDU3ZjIwZjg4M2U=","qq":"123456789","surePassWord":"ZTEwYWRjMzk0OWJhNTlhYmJlNTZlMDU3ZjIwZjg4M2U=","telphone":"13521456987","tenantId":14,"tenantModel":{"companyAbstract":"北京","companyLicense":"一级资质","companyName":"鸿游科技","companySize":"100人","delFlag":0,"id":14,"name":"龙顺集团"},"token":"8fe8d391-16f3-402b-abf6-1c2f9c085a69","updateAt":1498802369000,"updateBy":-101}
         * function : [{"functionName":"项目信息","id":1,"permission":"info_project.html","settingFunctionFlg":1,"url":"http://192.168.0.113:18080/web/appImg/pcm_program.png"},{"functionName":"单位信息","id":6,"permission":"info_unit.html","settingFunctionFlg":1,"url":"http://192.168.0.113:18080/web/appImg/pcm_unit.png"},{"functionName":"材料信息","id":11,"permission":"info_material.html","settingFunctionFlg":1,"url":"http://192.168.0.113:18080/web/appImg/pcm_material.png"},{"functionName":"车辆信息","id":22,"permission":"info_car.html","settingFunctionFlg":1,"url":"http://192.168.0.113:18080/web/appImg/pcm_car.png"},{"functionName":"班组成员","id":28,"permission":"project_member","settingFunctionFlg":0},{"functionName":"工料机","id":34,"permission":"talent_machine","settingFunctionFlg":0},{"functionName":"项目文档","id":41,"permission":"project_file","settingFunctionFlg":0},{"functionName":"分部分项","id":45,"permission":"project_item_bill.html","settingFunctionFlg":2},{"functionName":"措施项目","id":51,"permission":"project_item_tech.html","settingFunctionFlg":2},{"functionName":"其他项目","id":57,"permission":"project_item_other.html","settingFunctionFlg":2},{"functionName":"管理费","id":63,"permission":"project_fee.html","settingFunctionFlg":2},{"functionName":"工程成本费用汇总","id":110,"permission":"project_item_sum.html","settingFunctionFlg":2},{"functionName":"工日消耗采集","id":128,"permission":"","settingFunctionFlg":-1},{"functionName":"材料消耗采集","id":130,"permission":"","settingFunctionFlg":-1},{"functionName":"油料消耗采集","id":132,"permission":"","settingFunctionFlg":-1},{"functionName":"设备消耗采集","id":134,"permission":"","settingFunctionFlg":-1},{"functionName":"工程量采集","id":136,"permission":"","settingFunctionFlg":-1},{"functionName":"车辆使用采集","id":138,"permission":"","settingFunctionFlg":-1},{"functionName":"工日消耗量统计","id":140,"permission":"","settingFunctionFlg":3},{"functionName":"材料消耗量统计","id":142,"permission":"","settingFunctionFlg":3},{"functionName":"油料消耗量统计","id":144,"permission":"","settingFunctionFlg":3},{"functionName":"设备消耗量统计","id":146,"permission":"","settingFunctionFlg":3},{"functionName":"工程量统计","id":148,"permission":"","settingFunctionFlg":3},{"functionName":"车辆使用统计","id":150,"permission":"","settingFunctionFlg":3}]
         */

        private UserBean user;
        private String setCode;
        private List<FunctionBean> function;
        private List<CompanyBean> company;

        public String getSetCode() {
            return setCode;
        }

        public void setSetCode(String setCode) {
            this.setCode = setCode;
        }

        public List<CompanyBean> getCompany() {
            return company;
        }

        public void setCompany(List<CompanyBean> company) {
            this.company = company;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public List<FunctionBean> getFunction() {
            return function;
        }

        public void setFunction(List<FunctionBean> function) {
            this.function = function;
        }

        public static class UserBean implements Serializable{

            /**
             * delFlag : 0
             * departId : 0
             * departModel : {"id":0}
             * email : admin@qq.com
             * enableStatus : 0
             * id : -101
             * name : admin
             * passWord : ZTEwYWRjMzk0OWJhNTlhYmJlNTZlMDU3ZjIwZjg4M2U=
             * qq : 123456789
             * surePassWord : ZTEwYWRjMzk0OWJhNTlhYmJlNTZlMDU3ZjIwZjg4M2U=
             * telphone : 13521456987
             * tenantId : 14
             * tenantModel : {"companyAbstract":"北京","companyLicense":"一级资质","companyName":"鸿游科技","companySize":"100人","delFlag":0,"id":14,"name":"龙顺集团"}
             * token : 8fe8d391-16f3-402b-abf6-1c2f9c085a69
             * updateAt : 1498802369000
             * updateBy : -101
             * "defaultProjectId":36,"defaultProjectName":"鸿游软件"
             */

            private int defaultProjectId;
            private String defaultProjectName;
            private int departId;
            private DepartModelBean departModel;
            private int id;
            private String name;
            private int tenantId;
            private String setCode;
            private TenantModelBean tenantModel;
            private String token;
            private String industryTypeCode; //行业类型设置
            private String pricingCode; //清单项、定额项
            private String rongCloudToken;
            private String industryTypeName;
            private String dutyName;//默认岗位

            public String getDutyName() {
                return dutyName;
            }

            public void setDutyName(String dutyName) {
                this.dutyName = dutyName;
            }

            public String getIndustryTypeName() {
                return industryTypeName;
            }

            public void setIndustryTypeName(String industryTypeName) {
                this.industryTypeName = industryTypeName;
            }

            public String getRongCloudToken() {
                return rongCloudToken;
            }

            public void setRongCloudToken(String rongCloudToken) {
                this.rongCloudToken = rongCloudToken;
            }

            public String getIndustryTypeCode() {
                return industryTypeCode;
            }

            public void setIndustryTypeCode(String industryTypeCode) {
                this.industryTypeCode = industryTypeCode;
            }

            public String getPricingCode() {
                return pricingCode;
            }

            public void setPricingCode(String pricingCode) {
                this.pricingCode = pricingCode;
            }

            public String getSetCode() {
                return setCode;
            }

            public void setSetCode(String setCode) {
                this.setCode = setCode;
            }

            public int getDefaultProjectId() {
                return defaultProjectId;
            }

            public void setDefaultProjectId(int defaultProjectId) {
                this.defaultProjectId = defaultProjectId;
            }

            public String getDefaultProjectName() {
                return defaultProjectName;
            }

            public void setDefaultProjectName(String defaultProjectName) {
                this.defaultProjectName = defaultProjectName;
            }

            public int getDepartId() {
                return departId;
            }

            public void setDepartId(int departId) {
                this.departId = departId;
            }

            public DepartModelBean getDepartModel() {
                return departModel;
            }

            public void setDepartModel(DepartModelBean departModel) {
                this.departModel = departModel;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getTenantId() {
                return tenantId;
            }

            public void setTenantId(int tenantId) {
                this.tenantId = tenantId;
            }

            public TenantModelBean getTenantModel() {
                return tenantModel;
            }

            public void setTenantModel(TenantModelBean tenantModel) {
                this.tenantModel = tenantModel;
            }

            public String getToken() {
                return token;
            }

            public void setToken(String token) {
                this.token = token;
            }

            public static class DepartModelBean implements Serializable{

                private String name;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

            }

            public static class TenantModelBean implements Serializable{

                /**
                 * companyAbstract : 北京
                 * companyLicense : 一级资质
                 * companyName : 鸿游科技
                 * companySize : 100人
                 * delFlag : 0
                 * id : 14
                 * name : 龙顺集团
                 */

                private String companyName;

                private String tenantType;

                public String getTenantType() {
                    return tenantType;
                }

                public void setTenantType(String tenantType) {
                    this.tenantType = tenantType;
                }

                public String getCompanyName() {
                    return companyName;
                }

                public void setCompanyName(String companyName) {
                    this.companyName = companyName;
                }

            }

        }

        public static class CompanyBean implements Serializable{

            /**
             * departId : 180
             * departModel : {"name":"全公司"}
             * enableStatus : 0
             * id : 542
             * name : dong
             * tenantId : 107
             * tenantModel : {"companyName":"company1"}
             * "defaultProjectId":561,
             * "defaultProjectName":"示例工程",
             * "departId":438,
             * "departModel":{
             * 	"name":"全公司"
             * },
             * "enableStatus":0,
             * "id":957,
             * "name":"admin",
             * "setCode":1,
             */

            private int departId;
            private UserBean.DepartModelBean departModel;
            private int enableStatus;
            private int id;
            private String name;
            private int tenantId;
            private int defaultProjectId;
            private String defaultProjectName;
            private String setCode;
            private UserBean.TenantModelBean tenantModel;

            public int getDefaultProjectId() {
                return defaultProjectId;
            }

            public void setDefaultProjectId(int defaultProjectId) {
                this.defaultProjectId = defaultProjectId;
            }

            public String getDefaultProjectName() {
                return defaultProjectName;
            }

            public void setDefaultProjectName(String defaultProjectName) {
                this.defaultProjectName = defaultProjectName;
            }

            public String getSetCode() {
                return setCode;
            }

            public void setSetCode(String setCode) {
                this.setCode = setCode;
            }

            public int getDepartId() {
                return departId;
            }

            public void setDepartId(int departId) {
                this.departId = departId;
            }

            public UserBean.DepartModelBean getDepartModel() {
                return departModel;
            }

            public void setDepartModel(UserBean.DepartModelBean departModel) {
                this.departModel = departModel;
            }

            public int getEnableStatus() {
                return enableStatus;
            }

            public void setEnableStatus(int enableStatus) {
                this.enableStatus = enableStatus;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getTenantId() {
                return tenantId;
            }

            public void setTenantId(int tenantId) {
                this.tenantId = tenantId;
            }

            public UserBean.TenantModelBean getTenantModel() {
                return tenantModel;
            }

            public void setTenantModel(UserBean.TenantModelBean tenantModel) {
                this.tenantModel = tenantModel;
            }

            public static class DepartModelBean implements Serializable{

                /**
                 * name : 全公司
                 */

                private String name;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

            }

            public static class TenantModelBean implements Serializable{
                /**
                 * companyName : company1
                 */

                private String companyName;

                private String tenantType;

                public String getTenantType() {
                    return tenantType;
                }

                public void setTenantType(String tenantType) {
                    this.tenantType = tenantType;
                }

                public String getCompanyName() {
                    return companyName;
                }

                public void setCompanyName(String companyName) {
                    this.companyName = companyName;
                }

            }

        }

        public static class FunctionBean implements Serializable{

            /**
             * functionName : 项目信息
             * id : 1
             * permission : info_project.html
             * settingFunctionFlg : 1
             * url : http://192.168.0.113:18080/web/appImg/pcm_program.png
             */

            private String functionName;
            private int id;
            private int settingFunctionFlg;
            private String url;
            private String licenseControlFunctionId;

            public String getLicenseControlFunctionId() {
                return licenseControlFunctionId;
            }

            public void setLicenseControlFunctionId(String licenseControlFunctionId) {
                this.licenseControlFunctionId = licenseControlFunctionId;
            }

            public String getFunctionName() {
                return functionName;
            }

            public void setFunctionName(String functionName) {
                this.functionName = functionName;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getSettingFunctionFlg() {
                return settingFunctionFlg;
            }

            public void setSettingFunctionFlg(int settingFunctionFlg) {
                this.settingFunctionFlg = settingFunctionFlg;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

        }

    }

}
