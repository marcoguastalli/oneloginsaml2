/**
 * IpsApiServiceCallbackHandler.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.scene7.www.ipsapi;

/**
 *  IpsApiServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class IpsApiServiceCallbackHandler {

    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public IpsApiServiceCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public IpsApiServiceCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */

    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for setFolderPermissions method
     * override this method for handling normal response from setFolderPermissions operation
     */
    public void receiveResultsetFolderPermissions(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetFolderPermissionsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from setFolderPermissions operation
     */
    public void receiveErrorsetFolderPermissions(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for removeAssetPermissions method
     * override this method for handling normal response from removeAssetPermissions operation
     */
    public void receiveResultremoveAssetPermissions(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.RemoveAssetPermissionsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from removeAssetPermissions operation
     */
    public void receiveErrorremoveAssetPermissions(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for submitJob method
     * override this method for handling normal response from submitJob operation
     */
    public void receiveResultsubmitJob(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SubmitJobReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from submitJob operation
     */
    public void receiveErrorsubmitJob(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for replaceImage method
     * override this method for handling normal response from replaceImage operation
     */
    public void receiveResultreplaceImage(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.ReplaceImageReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from replaceImage operation
     */
    public void receiveErrorreplaceImage(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getAllCompanies method
     * override this method for handling normal response from getAllCompanies operation
     */
    public void receiveResultgetAllCompanies(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAllCompaniesReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getAllCompanies operation
     */
    public void receiveErrorgetAllCompanies(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for deleteAssetMetadata method
     * override this method for handling normal response from deleteAssetMetadata operation
     */
    public void receiveResultdeleteAssetMetadata(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteAssetMetadataReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from deleteAssetMetadata operation
     */
    public void receiveErrordeleteAssetMetadata(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for checkLogin method
     * override this method for handling normal response from checkLogin operation
     */
    public void receiveResultcheckLogin(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CheckLoginReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from checkLogin operation
     */
    public void receiveErrorcheckLogin(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getDistinctMetadataValues method
     * override this method for handling normal response from getDistinctMetadataValues operation
     */
    public void receiveResultgetDistinctMetadataValues(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetDistinctMetadataValuesReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getDistinctMetadataValues operation
     */
    public void receiveErrorgetDistinctMetadataValues(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for updateImageSet method
     * override this method for handling normal response from updateImageSet operation
     */
    public void receiveResultupdateImageSet(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateImageSetReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from updateImageSet operation
     */
    public void receiveErrorupdateImageSet(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getAssetPublishHistory method
     * override this method for handling normal response from getAssetPublishHistory operation
     */
    public void receiveResultgetAssetPublishHistory(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAssetPublishHistoryReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getAssetPublishHistory operation
     */
    public void receiveErrorgetAssetPublishHistory(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for setCompanySettings method
     * override this method for handling normal response from setCompanySettings operation
     */
    public void receiveResultsetCompanySettings(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetCompanySettingsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from setCompanySettings operation
     */
    public void receiveErrorsetCompanySettings(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getMetadataSchemaNamespaces method
     * override this method for handling normal response from getMetadataSchemaNamespaces operation
     */
    public void receiveResultgetMetadataSchemaNamespaces(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetMetadataSchemaNamespacesReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getMetadataSchemaNamespaces operation
     */
    public void receiveErrorgetMetadataSchemaNamespaces(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getPropertySets method
     * override this method for handling normal response from getPropertySets operation
     */
    public void receiveResultgetPropertySets(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetPropertySetsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getPropertySets operation
     */
    public void receiveErrorgetPropertySets(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for applyMetadataTemplate method
     * override this method for handling normal response from applyMetadataTemplate operation
     */
    public void receiveResultapplyMetadataTemplate(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.ApplyMetadataTemplateReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from applyMetadataTemplate operation
     */
    public void receiveErrorapplyMetadataTemplate(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for deleteGroup method
     * override this method for handling normal response from deleteGroup operation
     */
    public void receiveResultdeleteGroup(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteGroupReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from deleteGroup operation
     */
    public void receiveErrordeleteGroup(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getAssets method
     * override this method for handling normal response from getAssets operation
     */
    public void receiveResultgetAssets(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAssetsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getAssets operation
     */
    public void receiveErrorgetAssets(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getCompanySettings method
     * override this method for handling normal response from getCompanySettings operation
     */
    public void receiveResultgetCompanySettings(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetCompanySettingsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getCompanySettings operation
     */
    public void receiveErrorgetCompanySettings(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for deletePropertySet method
     * override this method for handling normal response from deletePropertySet operation
     */
    public void receiveResultdeletePropertySet(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeletePropertySetReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from deletePropertySet operation
     */
    public void receiveErrordeletePropertySet(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getActiveJobs method
     * override this method for handling normal response from getActiveJobs operation
     */
    public void receiveResultgetActiveJobs(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetActiveJobsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getActiveJobs operation
     */
    public void receiveErrorgetActiveJobs(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for copyImage method
     * override this method for handling normal response from copyImage operation
     */
    public void receiveResultcopyImage(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CopyImageReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from copyImage operation
     */
    public void receiveErrorcopyImage(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for batchSetFontFields method
     * override this method for handling normal response from batchSetFontFields operation
     */
    public void receiveResultbatchSetFontFields(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.BatchSetFontFieldsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from batchSetFontFields operation
     */
    public void receiveErrorbatchSetFontFields(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getPropertySetType method
     * override this method for handling normal response from getPropertySetType operation
     */
    public void receiveResultgetPropertySetType(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetPropertySetTypeReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getPropertySetType operation
     */
    public void receiveErrorgetPropertySetType(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for removeCompanyMembership method
     * override this method for handling normal response from removeCompanyMembership operation
     */
    public void receiveResultremoveCompanyMembership(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.RemoveCompanyMembershipReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from removeCompanyMembership operation
     */
    public void receiveErrorremoveCompanyMembership(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for batchSetImageFields method
     * override this method for handling normal response from batchSetImageFields operation
     */
    public void receiveResultbatchSetImageFields(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.BatchSetImageFieldsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from batchSetImageFields operation
     */
    public void receiveErrorbatchSetImageFields(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for saveImageMap method
     * override this method for handling normal response from saveImageMap operation
     */
    public void receiveResultsaveImageMap(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SaveImageMapReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from saveImageMap operation
     */
    public void receiveErrorsaveImageMap(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getScheduledJobs method
     * override this method for handling normal response from getScheduledJobs operation
     */
    public void receiveResultgetScheduledJobs(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetScheduledJobsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getScheduledJobs operation
     */
    public void receiveErrorgetScheduledJobs(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for setAssetsPublishState method
     * override this method for handling normal response from setAssetsPublishState operation
     */
    public void receiveResultsetAssetsPublishState(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetAssetsPublishStateReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from setAssetsPublishState operation
     */
    public void receiveErrorsetAssetsPublishState(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getUserInfo method
     * override this method for handling normal response from getUserInfo operation
     */
    public void receiveResultgetUserInfo(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetUserInfoReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getUserInfo operation
     */
    public void receiveErrorgetUserInfo(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for deleteAsset method
     * override this method for handling normal response from deleteAsset operation
     */
    public void receiveResultdeleteAsset(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteAssetReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from deleteAsset operation
     */
    public void receiveErrordeleteAsset(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getImageServingPublishSettings method
     * override this method for handling normal response from getImageServingPublishSettings operation
     */
    public void receiveResultgetImageServingPublishSettings(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetImageServingPublishSettingsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getImageServingPublishSettings operation
     */
    public void receiveErrorgetImageServingPublishSettings(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for setPassword method
     * override this method for handling normal response from setPassword operation
     */
    public void receiveResultsetPassword(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetPasswordReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from setPassword operation
     */
    public void receiveErrorsetPassword(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for setAssetsContextState method
     * override this method for handling normal response from setAssetsContextState operation
     */
    public void receiveResultsetAssetsContextState(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetAssetsContextStateReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from setAssetsContextState operation
     */
    public void receiveErrorsetAssetsContextState(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for updateCompanyMetadata method
     * override this method for handling normal response from updateCompanyMetadata operation
     */
    public void receiveResultupdateCompanyMetadata(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateCompanyMetadataReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from updateCompanyMetadata operation
     */
    public void receiveErrorupdateCompanyMetadata(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for deleteMetadataField method
     * override this method for handling normal response from deleteMetadataField operation
     */
    public void receiveResultdeleteMetadataField(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteMetadataFieldReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from deleteMetadataField operation
     */
    public void receiveErrordeleteMetadataField(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for updateAssetPermissions method
     * override this method for handling normal response from updateAssetPermissions operation
     */
    public void receiveResultupdateAssetPermissions(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateAssetPermissionsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from updateAssetPermissions operation
     */
    public void receiveErrorupdateAssetPermissions(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for setAssetSetDefinition method
     * override this method for handling normal response from setAssetSetDefinition operation
     */
    public void receiveResultsetAssetSetDefinition(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetAssetSetDefinitionReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from setAssetSetDefinition operation
     */
    public void receiveErrorsetAssetSetDefinition(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getUserChars method
     * override this method for handling normal response from getUserChars operation
     */
    public void receiveResultgetUserChars(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetUserCharsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getUserChars operation
     */
    public void receiveErrorgetUserChars(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for renameFolder method
     * override this method for handling normal response from renameFolder operation
     */
    public void receiveResultrenameFolder(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.RenameFolderReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from renameFolder operation
     */
    public void receiveErrorrenameFolder(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for batchSetIccProfileFields method
     * override this method for handling normal response from batchSetIccProfileFields operation
     */
    public void receiveResultbatchSetIccProfileFields(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.BatchSetIccProfileFieldsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from batchSetIccProfileFields operation
     */
    public void receiveErrorbatchSetIccProfileFields(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createProject method
     * override this method for handling normal response from createProject operation
     */
    public void receiveResultcreateProject(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateProjectReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createProject operation
     */
    public void receiveErrorcreateProject(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for updatePropertySetPermissions method
     * override this method for handling normal response from updatePropertySetPermissions operation
     */
    public void receiveResultupdatePropertySetPermissions(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdatePropertySetPermissionsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from updatePropertySetPermissions operation
     */
    public void receiveErrorupdatePropertySetPermissions(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createVignettePublishFormat method
     * override this method for handling normal response from createVignettePublishFormat operation
     */
    public void receiveResultcreateVignettePublishFormat(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateVignettePublishFormatReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createVignettePublishFormat operation
     */
    public void receiveErrorcreateVignettePublishFormat(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for setViewerConfigSettings method
     * override this method for handling normal response from setViewerConfigSettings operation
     */
    public void receiveResultsetViewerConfigSettings(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetViewerConfigSettingsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from setViewerConfigSettings operation
     */
    public void receiveErrorsetViewerConfigSettings(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for pauseJob method
     * override this method for handling normal response from pauseJob operation
     */
    public void receiveResultpauseJob(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.PauseJobReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from pauseJob operation
     */
    public void receiveErrorpauseJob(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for addTagFieldValues method
     * override this method for handling normal response from addTagFieldValues operation
     */
    public void receiveResultaddTagFieldValues(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AddTagFieldValuesReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from addTagFieldValues operation
     */
    public void receiveErroraddTagFieldValues(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getMediaPortalEvent method
     * override this method for handling normal response from getMediaPortalEvent operation
     */
    public void receiveResultgetMediaPortalEvent(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetMediaPortalEventReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getMediaPortalEvent operation
     */
    public void receiveErrorgetMediaPortalEvent(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getJobLogDetails method
     * override this method for handling normal response from getJobLogDetails operation
     */
    public void receiveResultgetJobLogDetails(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetJobLogDetailsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getJobLogDetails operation
     */
    public void receiveErrorgetJobLogDetails(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getSystemProperties method
     * override this method for handling normal response from getSystemProperties operation
     */
    public void receiveResultgetSystemProperties(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetSystemPropertiesReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getSystemProperties operation
     */
    public void receiveErrorgetSystemProperties(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for removePropertySetPermissions method
     * override this method for handling normal response from removePropertySetPermissions operation
     */
    public void receiveResultremovePropertySetPermissions(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.RemovePropertySetPermissionsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from removePropertySetPermissions operation
     */
    public void receiveErrorremovePropertySetPermissions(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getAssetCounts method
     * override this method for handling normal response from getAssetCounts operation
     */
    public void receiveResultgetAssetCounts(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAssetCountsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getAssetCounts operation
     */
    public void receiveErrorgetAssetCounts(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getGroupMembership method
     * override this method for handling normal response from getGroupMembership operation
     */
    public void receiveResultgetGroupMembership(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetGroupMembershipReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getGroupMembership operation
     */
    public void receiveErrorgetGroupMembership(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getGenerationInfo method
     * override this method for handling normal response from getGenerationInfo operation
     */
    public void receiveResultgetGenerationInfo(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetGenerationInfoReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getGenerationInfo operation
     */
    public void receiveErrorgetGenerationInfo(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getZipEntries method
     * override this method for handling normal response from getZipEntries operation
     */
    public void receiveResultgetZipEntries(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetZipEntriesReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getZipEntries operation
     */
    public void receiveErrorgetZipEntries(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getImageRenderingPublishSettings method
     * override this method for handling normal response from getImageRenderingPublishSettings operation
     */
    public void receiveResultgetImageRenderingPublishSettings(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetImageRenderingPublishSettingsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getImageRenderingPublishSettings operation
     */
    public void receiveErrorgetImageRenderingPublishSettings(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getUsers method
     * override this method for handling normal response from getUsers operation
     */
    public void receiveResultgetUsers(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetUsersReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getUsers operation
     */
    public void receiveErrorgetUsers(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getCompanyInfo method
     * override this method for handling normal response from getCompanyInfo operation
     */
    public void receiveResultgetCompanyInfo(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetCompanyInfoReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getCompanyInfo operation
     */
    public void receiveErrorgetCompanyInfo(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getUniqueMetadataValues method
     * override this method for handling normal response from getUniqueMetadataValues operation
     */
    public void receiveResultgetUniqueMetadataValues(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetUniqueMetadataValuesReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getUniqueMetadataValues operation
     */
    public void receiveErrorgetUniqueMetadataValues(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getImageSetMembers method
     * override this method for handling normal response from getImageSetMembers operation
     */
    public void receiveResultgetImageSetMembers(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetImageSetMembersReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getImageSetMembers operation
     */
    public void receiveErrorgetImageSetMembers(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for updateXMPPacket method
     * override this method for handling normal response from updateXMPPacket operation
     */
    public void receiveResultupdateXMPPacket(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateXMPPacketReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from updateXMPPacket operation
     */
    public void receiveErrorupdateXMPPacket(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for setImageRenderingPublishSettings method
     * override this method for handling normal response from setImageRenderingPublishSettings operation
     */
    public void receiveResultsetImageRenderingPublishSettings(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetImageRenderingPublishSettingsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from setImageRenderingPublishSettings operation
     */
    public void receiveErrorsetImageRenderingPublishSettings(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getAllUsers method
     * override this method for handling normal response from getAllUsers operation
     */
    public void receiveResultgetAllUsers(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAllUsersReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getAllUsers operation
     */
    public void receiveErrorgetAllUsers(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for deleteTagFieldValues method
     * override this method for handling normal response from deleteTagFieldValues operation
     */
    public void receiveResultdeleteTagFieldValues(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteTagFieldValuesReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from deleteTagFieldValues operation
     */
    public void receiveErrordeleteTagFieldValues(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getDiskUsage method
     * override this method for handling normal response from getDiskUsage operation
     */
    public void receiveResultgetDiskUsage(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetDiskUsageReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getDiskUsage operation
     */
    public void receiveErrorgetDiskUsage(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createViewerPreset method
     * override this method for handling normal response from createViewerPreset operation
     */
    public void receiveResultcreateViewerPreset(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateViewerPresetReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createViewerPreset operation
     */
    public void receiveErrorcreateViewerPreset(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for searchAssets method
     * override this method for handling normal response from searchAssets operation
     */
    public void receiveResultsearchAssets(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SearchAssetsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from searchAssets operation
     */
    public void receiveErrorsearchAssets(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for executeJob method
     * override this method for handling normal response from executeJob operation
     */
    public void receiveResultexecuteJob(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExecuteJobReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from executeJob operation
     */
    public void receiveErrorexecuteJob(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for forceRepublishAssets method
     * override this method for handling normal response from forceRepublishAssets operation
     */
    public void receiveResultforceRepublishAssets(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.ForceRepublishAssetsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from forceRepublishAssets operation
     */
    public void receiveErrorforceRepublishAssets(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getAssociatedAssets method
     * override this method for handling normal response from getAssociatedAssets operation
     */
    public void receiveResultgetAssociatedAssets(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAssociatedAssetsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getAssociatedAssets operation
     */
    public void receiveErrorgetAssociatedAssets(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for restoreAssetsFromTrash method
     * override this method for handling normal response from restoreAssetsFromTrash operation
     */
    public void receiveResultrestoreAssetsFromTrash(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.RestoreAssetsFromTrashReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from restoreAssetsFromTrash operation
     */
    public void receiveErrorrestoreAssetsFromTrash(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for setUserInfo method
     * override this method for handling normal response from setUserInfo operation
     */
    public void receiveResultsetUserInfo(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetUserInfoReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from setUserInfo operation
     */
    public void receiveErrorsetUserInfo(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getAutoCropRect method
     * override this method for handling normal response from getAutoCropRect operation
     */
    public void receiveResultgetAutoCropRect(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAutoCropRectReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getAutoCropRect operation
     */
    public void receiveErrorgetAutoCropRect(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for setImageMaps method
     * override this method for handling normal response from setImageMaps operation
     */
    public void receiveResultsetImageMaps(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetImageMapsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from setImageMaps operation
     */
    public void receiveErrorsetImageMaps(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for updatePropertySet method
     * override this method for handling normal response from updatePropertySet operation
     */
    public void receiveResultupdatePropertySet(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdatePropertySetReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from updatePropertySet operation
     */
    public void receiveErrorupdatePropertySet(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for deleteVignettePublishFormat method
     * override this method for handling normal response from deleteVignettePublishFormat operation
     */
    public void receiveResultdeleteVignettePublishFormat(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteVignettePublishFormatReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from deleteVignettePublishFormat operation
     */
    public void receiveErrordeleteVignettePublishFormat(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createDerivedAsset method
     * override this method for handling normal response from createDerivedAsset operation
     */
    public void receiveResultcreateDerivedAsset(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateDerivedAssetReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createDerivedAsset operation
     */
    public void receiveErrorcreateDerivedAsset(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for setCompanyMembership method
     * override this method for handling normal response from setCompanyMembership operation
     */
    public void receiveResultsetCompanyMembership(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetCompanyMembershipReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from setCompanyMembership operation
     */
    public void receiveErrorsetCompanyMembership(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for uploadPost method
     * override this method for handling normal response from uploadPost operation
     */
    public void receiveResultuploadPost(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.UploadPostReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from uploadPost operation
     */
    public void receiveErroruploadPost(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for addProjectAssets method
     * override this method for handling normal response from addProjectAssets operation
     */
    public void receiveResultaddProjectAssets(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AddProjectAssetsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from addProjectAssets operation
     */
    public void receiveErroraddProjectAssets(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getJobLogs method
     * override this method for handling normal response from getJobLogs operation
     */
    public void receiveResultgetJobLogs(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetJobLogsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getJobLogs operation
     */
    public void receiveErrorgetJobLogs(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for resumeJob method
     * override this method for handling normal response from resumeJob operation
     */
    public void receiveResultresumeJob(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.ResumeJobReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from resumeJob operation
     */
    public void receiveErrorresumeJob(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for deleteFolder method
     * override this method for handling normal response from deleteFolder operation
     */
    public void receiveResultdeleteFolder(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteFolderReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from deleteFolder operation
     */
    public void receiveErrordeleteFolder(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for removeMetadataSchema method
     * override this method for handling normal response from removeMetadataSchema operation
     */
    public void receiveResultremoveMetadataSchema(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.RemoveMetadataSchemaReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from removeMetadataSchema operation
     */
    public void receiveErrorremoveMetadataSchema(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for saveImageFormat method
     * override this method for handling normal response from saveImageFormat operation
     */
    public void receiveResultsaveImageFormat(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SaveImageFormatReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from saveImageFormat operation
     */
    public void receiveErrorsaveImageFormat(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getFolderTree method
     * override this method for handling normal response from getFolderTree operation
     */
    public void receiveResultgetFolderTree(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetFolderTreeReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getFolderTree operation
     */
    public void receiveErrorgetFolderTree(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for setZoomTargets method
     * override this method for handling normal response from setZoomTargets operation
     */
    public void receiveResultsetZoomTargets(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetZoomTargetsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from setZoomTargets operation
     */
    public void receiveErrorsetZoomTargets(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getAssetMetadataFields method
     * override this method for handling normal response from getAssetMetadataFields operation
     */
    public void receiveResultgetAssetMetadataFields(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAssetMetadataFieldsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getAssetMetadataFields operation
     */
    public void receiveErrorgetAssetMetadataFields(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for setTagFieldValues method
     * override this method for handling normal response from setTagFieldValues operation
     */
    public void receiveResultsetTagFieldValues(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetTagFieldValuesReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from setTagFieldValues operation
     */
    public void receiveErrorsetTagFieldValues(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for moveFolder method
     * override this method for handling normal response from moveFolder operation
     */
    public void receiveResultmoveFolder(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.MoveFolderReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from moveFolder operation
     */
    public void receiveErrormoveFolder(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getViewerConfigSettings method
     * override this method for handling normal response from getViewerConfigSettings operation
     */
    public void receiveResultgetViewerConfigSettings(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetViewerConfigSettingsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getViewerConfigSettings operation
     */
    public void receiveErrorgetViewerConfigSettings(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getImageFormats method
     * override this method for handling normal response from getImageFormats operation
     */
    public void receiveResultgetImageFormats(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetImageFormatsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getImageFormats operation
     */
    public void receiveErrorgetImageFormats(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for setImageSetMembers method
     * override this method for handling normal response from setImageSetMembers operation
     */
    public void receiveResultsetImageSetMembers(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetImageSetMembersReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from setImageSetMembers operation
     */
    public void receiveErrorsetImageSetMembers(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for saveZoomTarget method
     * override this method for handling normal response from saveZoomTarget operation
     */
    public void receiveResultsaveZoomTarget(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SaveZoomTargetReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from saveZoomTarget operation
     */
    public void receiveErrorsaveZoomTarget(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createAssetSet method
     * override this method for handling normal response from createAssetSet operation
     */
    public void receiveResultcreateAssetSet(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateAssetSetReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createAssetSet operation
     */
    public void receiveErrorcreateAssetSet(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for searchAssetsByMetadata method
     * override this method for handling normal response from searchAssetsByMetadata operation
     */
    public void receiveResultsearchAssetsByMetadata(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SearchAssetsByMetadataReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from searchAssetsByMetadata operation
     */
    public void receiveErrorsearchAssetsByMetadata(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for cdnCacheInvalidation method
     * override this method for handling normal response from cdnCacheInvalidation operation
     */
    public void receiveResultcdnCacheInvalidation(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CdnCacheInvalidationReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from cdnCacheInvalidation operation
     */
    public void receiveErrorcdnCacheInvalidation(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getPhotoshopPath method
     * override this method for handling normal response from getPhotoshopPath operation
     */
    public void receiveResultgetPhotoshopPath(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetPhotoshopPathReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getPhotoshopPath operation
     */
    public void receiveErrorgetPhotoshopPath(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for batchGetAssetPublishContexts method
     * override this method for handling normal response from batchGetAssetPublishContexts operation
     */
    public void receiveResultbatchGetAssetPublishContexts(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.BatchGetAssetPublishContextsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from batchGetAssetPublishContexts operation
     */
    public void receiveErrorbatchGetAssetPublishContexts(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for checkAssetNames method
     * override this method for handling normal response from checkAssetNames operation
     */
    public void receiveResultcheckAssetNames(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CheckAssetNamesReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from checkAssetNames operation
     */
    public void receiveErrorcheckAssetNames(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for setUrlModifier method
     * override this method for handling normal response from setUrlModifier operation
     */
    public void receiveResultsetUrlModifier(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetUrlModifierReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from setUrlModifier operation
     */
    public void receiveErrorsetUrlModifier(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createCompanyMetadata method
     * override this method for handling normal response from createCompanyMetadata operation
     */
    public void receiveResultcreateCompanyMetadata(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateCompanyMetadataReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createCompanyMetadata operation
     */
    public void receiveErrorcreateCompanyMetadata(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for setImageServingPublishSettings method
     * override this method for handling normal response from setImageServingPublishSettings operation
     */
    public void receiveResultsetImageServingPublishSettings(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetImageServingPublishSettingsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from setImageServingPublishSettings operation
     */
    public void receiveErrorsetImageServingPublishSettings(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for deleteZoomTarget method
     * override this method for handling normal response from deleteZoomTarget operation
     */
    public void receiveResultdeleteZoomTarget(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteZoomTargetReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from deleteZoomTarget operation
     */
    public void receiveErrordeleteZoomTarget(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for updateFolderPermissions method
     * override this method for handling normal response from updateFolderPermissions operation
     */
    public void receiveResultupdateFolderPermissions(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateFolderPermissionsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from updateFolderPermissions operation
     */
    public void receiveErrorupdateFolderPermissions(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createImageSet method
     * override this method for handling normal response from createImageSet operation
     */
    public void receiveResultcreateImageSet(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateImageSetReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createImageSet operation
     */
    public void receiveErrorcreateImageSet(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for deleteAssets method
     * override this method for handling normal response from deleteAssets operation
     */
    public void receiveResultdeleteAssets(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteAssetsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from deleteAssets operation
     */
    public void receiveErrordeleteAssets(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getProperty method
     * override this method for handling normal response from getProperty operation
     */
    public void receiveResultgetProperty(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetPropertyReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getProperty operation
     */
    public void receiveErrorgetProperty(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for saveMetadataSchema method
     * override this method for handling normal response from saveMetadataSchema operation
     */
    public void receiveResultsaveMetadataSchema(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SaveMetadataSchemaReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from saveMetadataSchema operation
     */
    public void receiveErrorsaveMetadataSchema(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getPublishContexts method
     * override this method for handling normal response from getPublishContexts operation
     */
    public void receiveResultgetPublishContexts(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetPublishContextsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getPublishContexts operation
     */
    public void receiveErrorgetPublishContexts(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getCompanyMembership method
     * override this method for handling normal response from getCompanyMembership operation
     */
    public void receiveResultgetCompanyMembership(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetCompanyMembershipReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getCompanyMembership operation
     */
    public void receiveErrorgetCompanyMembership(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for updateMetadataField method
     * override this method for handling normal response from updateMetadataField operation
     */
    public void receiveResultupdateMetadataField(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateMetadataFieldReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from updateMetadataField operation
     */
    public void receiveErrorupdateMetadataField(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for renameAsset method
     * override this method for handling normal response from renameAsset operation
     */
    public void receiveResultrenameAsset(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.RenameAssetReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from renameAsset operation
     */
    public void receiveErrorrenameAsset(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for removeMask method
     * override this method for handling normal response from removeMask operation
     */
    public void receiveResultremoveMask(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.RemoveMaskReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from removeMask operation
     */
    public void receiveErrorremoveMask(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getCompanyMetadata method
     * override this method for handling normal response from getCompanyMetadata operation
     */
    public void receiveResultgetCompanyMetadata(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetCompanyMetadataReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getCompanyMetadata operation
     */
    public void receiveErrorgetCompanyMetadata(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for setGroupMembers method
     * override this method for handling normal response from setGroupMembers operation
     */
    public void receiveResultsetGroupMembers(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetGroupMembersReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from setGroupMembers operation
     */
    public void receiveErrorsetGroupMembers(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for addGroupMembership method
     * override this method for handling normal response from addGroupMembership operation
     */
    public void receiveResultaddGroupMembership(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AddGroupMembershipReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from addGroupMembership operation
     */
    public void receiveErroraddGroupMembership(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for emptyAssetsFromTrash method
     * override this method for handling normal response from emptyAssetsFromTrash operation
     */
    public void receiveResultemptyAssetsFromTrash(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.EmptyAssetsFromTrashReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from emptyAssetsFromTrash operation
     */
    public void receiveErroremptyAssetsFromTrash(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getCdnCacheInvalidationStatus method
     * override this method for handling normal response from getCdnCacheInvalidationStatus operation
     */
    public void receiveResultgetCdnCacheInvalidationStatus(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetCdnCacheInvalidationStatusReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getCdnCacheInvalidationStatus operation
     */
    public void receiveErrorgetCdnCacheInvalidationStatus(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for batchSetThumbAsset method
     * override this method for handling normal response from batchSetThumbAsset operation
     */
    public void receiveResultbatchSetThumbAsset(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.BatchSetThumbAssetReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from batchSetThumbAsset operation
     */
    public void receiveErrorbatchSetThumbAsset(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getActivePublishContexts method
     * override this method for handling normal response from getActivePublishContexts operation
     */
    public void receiveResultgetActivePublishContexts(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetActivePublishContextsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getActivePublishContexts operation
     */
    public void receiveErrorgetActivePublishContexts(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for stopJob method
     * override this method for handling normal response from stopJob operation
     */
    public void receiveResultstopJob(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.StopJobReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from stopJob operation
     */
    public void receiveErrorstopJob(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getAssetJobLogs method
     * override this method for handling normal response from getAssetJobLogs operation
     */
    public void receiveResultgetAssetJobLogs(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAssetJobLogsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getAssetJobLogs operation
     */
    public void receiveErrorgetAssetJobLogs(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for addCompany method
     * override this method for handling normal response from addCompany operation
     */
    public void receiveResultaddCompany(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AddCompanyReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from addCompany operation
     */
    public void receiveErroraddCompany(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for removeProjectAssets method
     * override this method for handling normal response from removeProjectAssets operation
     */
    public void receiveResultremoveProjectAssets(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.RemoveProjectAssetsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from removeProjectAssets operation
     */
    public void receiveErrorremoveProjectAssets(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for batchSetAssetMetadata method
     * override this method for handling normal response from batchSetAssetMetadata operation
     */
    public void receiveResultbatchSetAssetMetadata(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.BatchSetAssetMetadataReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from batchSetAssetMetadata operation
     */
    public void receiveErrorbatchSetAssetMetadata(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for removeFolderPermissions method
     * override this method for handling normal response from removeFolderPermissions operation
     */
    public void receiveResultremoveFolderPermissions(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.RemoveFolderPermissionsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from removeFolderPermissions operation
     */
    public void receiveErrorremoveFolderPermissions(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getXMPPacket method
     * override this method for handling normal response from getXMPPacket operation
     */
    public void receiveResultgetXMPPacket(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetXMPPacketReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getXMPPacket operation
     */
    public void receiveErrorgetXMPPacket(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for listCompanyMetadata method
     * override this method for handling normal response from listCompanyMetadata operation
     */
    public void receiveResultlistCompanyMetadata(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.ListCompanyMetadataReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from listCompanyMetadata operation
     */
    public void receiveErrorlistCompanyMetadata(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getPhotoshopPathNames method
     * override this method for handling normal response from getPhotoshopPathNames operation
     */
    public void receiveResultgetPhotoshopPathNames(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetPhotoshopPathNamesReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getPhotoshopPathNames operation
     */
    public void receiveErrorgetPhotoshopPathNames(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getAssetsByName method
     * override this method for handling normal response from getAssetsByName operation
     */
    public void receiveResultgetAssetsByName(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAssetsByNameReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getAssetsByName operation
     */
    public void receiveErrorgetAssetsByName(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for addUser method
     * override this method for handling normal response from addUser operation
     */
    public void receiveResultaddUser(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AddUserReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from addUser operation
     */
    public void receiveErroraddUser(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for setPropertySetPermissions method
     * override this method for handling normal response from setPropertySetPermissions operation
     */
    public void receiveResultsetPropertySetPermissions(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetPropertySetPermissionsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from setPropertySetPermissions operation
     */
    public void receiveErrorsetPropertySetPermissions(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for updateViewerConfigSettings method
     * override this method for handling normal response from updateViewerConfigSettings operation
     */
    public void receiveResultupdateViewerConfigSettings(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateViewerConfigSettingsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from updateViewerConfigSettings operation
     */
    public void receiveErrorupdateViewerConfigSettings(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createPropertySetType method
     * override this method for handling normal response from createPropertySetType operation
     */
    public void receiveResultcreatePropertySetType(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreatePropertySetTypeReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createPropertySetType operation
     */
    public void receiveErrorcreatePropertySetType(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for deleteImageFormat method
     * override this method for handling normal response from deleteImageFormat operation
     */
    public void receiveResultdeleteImageFormat(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteImageFormatReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from deleteImageFormat operation
     */
    public void receiveErrordeleteImageFormat(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for deleteJob method
     * override this method for handling normal response from deleteJob operation
     */
    public void receiveResultdeleteJob(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteJobReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from deleteJob operation
     */
    public void receiveErrordeleteJob(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for setAssetPermissions method
     * override this method for handling normal response from setAssetPermissions operation
     */
    public void receiveResultsetAssetPermissions(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetAssetPermissionsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from setAssetPermissions operation
     */
    public void receiveErrorsetAssetPermissions(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for updateVignettePublishFormat method
     * override this method for handling normal response from updateVignettePublishFormat operation
     */
    public void receiveResultupdateVignettePublishFormat(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateVignettePublishFormatReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from updateVignettePublishFormat operation
     */
    public void receiveErrorupdateVignettePublishFormat(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for removeGroupMembers method
     * override this method for handling normal response from removeGroupMembers operation
     */
    public void receiveResultremoveGroupMembers(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.RemoveGroupMembersReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from removeGroupMembers operation
     */
    public void receiveErrorremoveGroupMembers(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getMetadataFields method
     * override this method for handling normal response from getMetadataFields operation
     */
    public void receiveResultgetMetadataFields(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetMetadataFieldsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getMetadataFields operation
     */
    public void receiveErrorgetMetadataFields(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getVignettePublishFormats method
     * override this method for handling normal response from getVignettePublishFormats operation
     */
    public void receiveResultgetVignettePublishFormats(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetVignettePublishFormatsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getVignettePublishFormats operation
     */
    public void receiveErrorgetVignettePublishFormats(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for saveMetadataField method
     * override this method for handling normal response from saveMetadataField operation
     */
    public void receiveResultsaveMetadataField(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SaveMetadataFieldReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from saveMetadataField operation
     */
    public void receiveErrorsaveMetadataField(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for addCompanyMembership method
     * override this method for handling normal response from addCompanyMembership operation
     */
    public void receiveResultaddCompanyMembership(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AddCompanyMembershipReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from addCompanyMembership operation
     */
    public void receiveErroraddCompanyMembership(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for setAssetMetadata method
     * override this method for handling normal response from setAssetMetadata operation
     */
    public void receiveResultsetAssetMetadata(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetAssetMetadataReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from setAssetMetadata operation
     */
    public void receiveErrorsetAssetMetadata(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for moveAsset method
     * override this method for handling normal response from moveAsset operation
     */
    public void receiveResultmoveAsset(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.MoveAssetReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from moveAsset operation
     */
    public void receiveErrormoveAsset(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createMetadataField method
     * override this method for handling normal response from createMetadataField operation
     */
    public void receiveResultcreateMetadataField(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateMetadataFieldReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createMetadataField operation
     */
    public void receiveErrorcreateMetadataField(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createFolder method
     * override this method for handling normal response from createFolder operation
     */
    public void receiveResultcreateFolder(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateFolderReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createFolder operation
     */
    public void receiveErrorcreateFolder(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getFolders method
     * override this method for handling normal response from getFolders operation
     */
    public void receiveResultgetFolders(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetFoldersReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getFolders operation
     */
    public void receiveErrorgetFolders(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getCompanyMembers method
     * override this method for handling normal response from getCompanyMembers operation
     */
    public void receiveResultgetCompanyMembers(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetCompanyMembersReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getCompanyMembers operation
     */
    public void receiveErrorgetCompanyMembers(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for generatePassword method
     * override this method for handling normal response from generatePassword operation
     */
    public void receiveResultgeneratePassword(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GeneratePasswordReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from generatePassword operation
     */
    public void receiveErrorgeneratePassword(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getGroups method
     * override this method for handling normal response from getGroups operation
     */
    public void receiveResultgetGroups(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetGroupsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getGroups operation
     */
    public void receiveErrorgetGroups(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for deleteCompanyMetadata method
     * override this method for handling normal response from deleteCompanyMetadata operation
     */
    public void receiveResultdeleteCompanyMetadata(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteCompanyMetadataReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from deleteCompanyMetadata operation
     */
    public void receiveErrordeleteCompanyMetadata(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for addGroupMembers method
     * override this method for handling normal response from addGroupMembers operation
     */
    public void receiveResultaddGroupMembers(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AddGroupMembersReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from addGroupMembers operation
     */
    public void receiveErroraddGroupMembers(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for updateTagFieldValues method
     * override this method for handling normal response from updateTagFieldValues operation
     */
    public void receiveResultupdateTagFieldValues(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateTagFieldValuesReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from updateTagFieldValues operation
     */
    public void receiveErrorupdateTagFieldValues(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getProjects method
     * override this method for handling normal response from getProjects operation
     */
    public void receiveResultgetProjects(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetProjectsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getProjects operation
     */
    public void receiveErrorgetProjects(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for saveGroup method
     * override this method for handling normal response from saveGroup operation
     */
    public void receiveResultsaveGroup(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SaveGroupReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from saveGroup operation
     */
    public void receiveErrorsaveGroup(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for updateAssetSet method
     * override this method for handling normal response from updateAssetSet operation
     */
    public void receiveResultupdateAssetSet(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateAssetSetReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from updateAssetSet operation
     */
    public void receiveErrorupdateAssetSet(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for addMediaPortalEvent method
     * override this method for handling normal response from addMediaPortalEvent operation
     */
    public void receiveResultaddMediaPortalEvent(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AddMediaPortalEventReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from addMediaPortalEvent operation
     */
    public void receiveErroraddMediaPortalEvent(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getOriginalFilePaths method
     * override this method for handling normal response from getOriginalFilePaths operation
     */
    public void receiveResultgetOriginalFilePaths(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetOriginalFilePathsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getOriginalFilePaths operation
     */
    public void receiveErrorgetOriginalFilePaths(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for deleteImageMap method
     * override this method for handling normal response from deleteImageMap operation
     */
    public void receiveResultdeleteImageMap(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteImageMapReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from deleteImageMap operation
     */
    public void receiveErrordeleteImageMap(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for removeGroupMembership method
     * override this method for handling normal response from removeGroupMembership operation
     */
    public void receiveResultremoveGroupMembership(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.RemoveGroupMembershipReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from removeGroupMembership operation
     */
    public void receiveErrorremoveGroupMembership(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for setProjectAssets method
     * override this method for handling normal response from setProjectAssets operation
     */
    public void receiveResultsetProjectAssets(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetProjectAssetsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from setProjectAssets operation
     */
    public void receiveErrorsetProjectAssets(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getPropertySetTypes method
     * override this method for handling normal response from getPropertySetTypes operation
     */
    public void receiveResultgetPropertySetTypes(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetPropertySetTypesReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getPropertySetTypes operation
     */
    public void receiveErrorgetPropertySetTypes(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getSearchStrings method
     * override this method for handling normal response from getSearchStrings operation
     */
    public void receiveResultgetSearchStrings(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetSearchStringsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getSearchStrings operation
     */
    public void receiveErrorgetSearchStrings(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getMetadataSchema method
     * override this method for handling normal response from getMetadataSchema operation
     */
    public void receiveResultgetMetadataSchema(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetMetadataSchemaReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getMetadataSchema operation
     */
    public void receiveErrorgetMetadataSchema(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createTemplate method
     * override this method for handling normal response from createTemplate operation
     */
    public void receiveResultcreateTemplate(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateTemplateReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createTemplate operation
     */
    public void receiveErrorcreateTemplate(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getTagFieldValues method
     * override this method for handling normal response from getTagFieldValues operation
     */
    public void receiveResultgetTagFieldValues(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetTagFieldValuesReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getTagFieldValues operation
     */
    public void receiveErrorgetTagFieldValues(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for deletePropertySetType method
     * override this method for handling normal response from deletePropertySetType operation
     */
    public void receiveResultdeletePropertySetType(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeletePropertySetTypeReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from deletePropertySetType operation
     */
    public void receiveErrordeletePropertySetType(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for renameProject method
     * override this method for handling normal response from renameProject operation
     */
    public void receiveResultrenameProject(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.RenameProjectReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from renameProject operation
     */
    public void receiveErrorrenameProject(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for moveAssets method
     * override this method for handling normal response from moveAssets operation
     */
    public void receiveResultmoveAssets(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.MoveAssetsReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from moveAssets operation
     */
    public void receiveErrormoveAssets(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for setGroupMembership method
     * override this method for handling normal response from setGroupMembership operation
     */
    public void receiveResultsetGroupMembership(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetGroupMembershipReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from setGroupMembership operation
     */
    public void receiveErrorsetGroupMembership(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for deleteProject method
     * override this method for handling normal response from deleteProject operation
     */
    public void receiveResultdeleteProject(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteProjectReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from deleteProject operation
     */
    public void receiveErrordeleteProject(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createPropertySet method
     * override this method for handling normal response from createPropertySet operation
     */
    public void receiveResultcreatePropertySet(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreatePropertySetReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createPropertySet operation
     */
    public void receiveErrorcreatePropertySet(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for setAssetPublishState method
     * override this method for handling normal response from setAssetPublishState operation
     */
    public void receiveResultsetAssetPublishState(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetAssetPublishStateReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from setAssetPublishState operation
     */
    public void receiveErrorsetAssetPublishState(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getGroupMembers method
     * override this method for handling normal response from getGroupMembers operation
     */
    public void receiveResultgetGroupMembers(
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetGroupMembersReturn result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getGroupMembers operation
     */
    public void receiveErrorgetGroupMembers(java.lang.Exception e) {
    }

}
    