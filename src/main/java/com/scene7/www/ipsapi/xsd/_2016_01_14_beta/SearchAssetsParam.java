/**
 * SearchAssetsParam.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.scene7.www.ipsapi.xsd._2016_01_14_beta;

/**
 * SearchAssetsParam bean class
 */

public class SearchAssetsParam
        implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
            "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
            "searchAssetsParam",
            "ns1");

    /**
     * field for CompanyHandle
     */

    protected java.lang.String localCompanyHandle;
    /**
     * field for AccessUserHandle
     */

    protected java.lang.String localAccessUserHandle;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localAccessUserHandleTracker = false;
    /**
     * field for AccessGroupHandle
     */

    protected java.lang.String localAccessGroupHandle;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localAccessGroupHandleTracker = false;
    /**
     * field for Folder
     */

    protected java.lang.String localFolder;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localFolderTracker = false;
    /**
     * field for IncludeSubfolders
     */

    protected boolean localIncludeSubfolders;
    /**
     * field for PublishState
     */

    protected java.lang.String localPublishState;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localPublishStateTracker = false;
    /**
     * field for TrashState
     */

    protected java.lang.String localTrashState;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localTrashStateTracker = false;
    /**
     * field for ConditionMatchMode
     */

    protected java.lang.String localConditionMatchMode;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localConditionMatchModeTracker = false;
    /**
     * field for KeywordArray
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray localKeywordArray;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localKeywordArrayTracker = false;
    /**
     * field for SystemFieldMatchMode
     */

    protected java.lang.String localSystemFieldMatchMode;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localSystemFieldMatchModeTracker = false;
    /**
     * field for SystemFieldConditionArray
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.SystemFieldConditionArray localSystemFieldConditionArray;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localSystemFieldConditionArrayTracker = false;
    /**
     * field for TagMatchMode
     */

    protected java.lang.String localTagMatchMode;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localTagMatchModeTracker = false;
    /**
     * field for TagConditionArray
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.TagConditionArray localTagConditionArray;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localTagConditionArrayTracker = false;
    /**
     * field for MetadataMatchMode
     */

    protected java.lang.String localMetadataMatchMode;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localMetadataMatchModeTracker = false;
    /**
     * field for MetadataConditionArray
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.MetadataConditionArray localMetadataConditionArray;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localMetadataConditionArrayTracker = false;
    /**
     * field for AssetTypeArray
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray localAssetTypeArray;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localAssetTypeArrayTracker = false;
    /**
     * field for ExcludeAssetTypeArray
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray localExcludeAssetTypeArray;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localExcludeAssetTypeArrayTracker = false;
    /**
     * field for AssetSubTypeArray
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray localAssetSubTypeArray;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localAssetSubTypeArrayTracker = false;
    /**
     * field for StrictSubTypeCheck
     */

    protected boolean localStrictSubTypeCheck;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localStrictSubTypeCheckTracker = false;
    /**
     * field for ExcludeByproducts
     */

    protected boolean localExcludeByproducts;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localExcludeByproductsTracker = false;
    /**
     * field for ExcludeByproductArray
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExcludeByproductArray localExcludeByproductArray;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localExcludeByproductArrayTracker = false;
    /**
     * field for ProjectHandle
     */

    protected java.lang.String localProjectHandle;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localProjectHandleTracker = false;
    /**
     * field for RecordsPerPage
     */

    protected int localRecordsPerPage;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localRecordsPerPageTracker = false;
    /**
     * field for ResultsPage
     */

    protected int localResultsPage;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localResultsPageTracker = false;
    /**
     * field for SortBy
     */

    protected java.lang.String localSortBy;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localSortByTracker = false;
    /**
     * field for SortDirection
     */

    protected java.lang.String localSortDirection;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localSortDirectionTracker = false;
    /**
     * field for ResponseFieldArray
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray localResponseFieldArray;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localResponseFieldArrayTracker = false;
    /**
     * field for ExcludeFieldArray
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray localExcludeFieldArray;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localExcludeFieldArrayTracker = false;

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta")) {
            return "ns1";
        }
        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCompanyHandle() {
        return this.localCompanyHandle;
    }

    /**
     * Auto generated setter method
     *
     * @param param CompanyHandle
     */
    public void setCompanyHandle(java.lang.String param) {

        this.localCompanyHandle = param;

    }

    public boolean isAccessUserHandleSpecified() {
        return this.localAccessUserHandleTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAccessUserHandle() {
        return this.localAccessUserHandle;
    }

    /**
     * Auto generated setter method
     *
     * @param param AccessUserHandle
     */
    public void setAccessUserHandle(java.lang.String param) {
        this.localAccessUserHandleTracker = param != null;

        this.localAccessUserHandle = param;

    }

    public boolean isAccessGroupHandleSpecified() {
        return this.localAccessGroupHandleTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAccessGroupHandle() {
        return this.localAccessGroupHandle;
    }

    /**
     * Auto generated setter method
     *
     * @param param AccessGroupHandle
     */
    public void setAccessGroupHandle(java.lang.String param) {
        this.localAccessGroupHandleTracker = param != null;

        this.localAccessGroupHandle = param;

    }

    public boolean isFolderSpecified() {
        return this.localFolderTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getFolder() {
        return this.localFolder;
    }

    /**
     * Auto generated setter method
     *
     * @param param Folder
     */
    public void setFolder(java.lang.String param) {
        this.localFolderTracker = param != null;

        this.localFolder = param;

    }

    /**
     * Auto generated getter method
     *
     * @return boolean
     */
    public boolean getIncludeSubfolders() {
        return this.localIncludeSubfolders;
    }

    /**
     * Auto generated setter method
     *
     * @param param IncludeSubfolders
     */
    public void setIncludeSubfolders(boolean param) {

        this.localIncludeSubfolders = param;

    }

    public boolean isPublishStateSpecified() {
        return this.localPublishStateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getPublishState() {
        return this.localPublishState;
    }

    /**
     * Auto generated setter method
     *
     * @param param PublishState
     */
    public void setPublishState(java.lang.String param) {
        this.localPublishStateTracker = param != null;

        this.localPublishState = param;

    }

    public boolean isTrashStateSpecified() {
        return this.localTrashStateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getTrashState() {
        return this.localTrashState;
    }

    /**
     * Auto generated setter method
     *
     * @param param TrashState
     */
    public void setTrashState(java.lang.String param) {
        this.localTrashStateTracker = param != null;

        this.localTrashState = param;

    }

    public boolean isConditionMatchModeSpecified() {
        return this.localConditionMatchModeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getConditionMatchMode() {
        return this.localConditionMatchMode;
    }

    /**
     * Auto generated setter method
     *
     * @param param ConditionMatchMode
     */
    public void setConditionMatchMode(java.lang.String param) {
        this.localConditionMatchModeTracker = param != null;

        this.localConditionMatchMode = param;

    }

    public boolean isKeywordArraySpecified() {
        return this.localKeywordArrayTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray getKeywordArray() {
        return this.localKeywordArray;
    }

    /**
     * Auto generated setter method
     *
     * @param param KeywordArray
     */
    public void setKeywordArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray param) {
        this.localKeywordArrayTracker = param != null;

        this.localKeywordArray = param;

    }

    public boolean isSystemFieldMatchModeSpecified() {
        return this.localSystemFieldMatchModeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSystemFieldMatchMode() {
        return this.localSystemFieldMatchMode;
    }

    /**
     * Auto generated setter method
     *
     * @param param SystemFieldMatchMode
     */
    public void setSystemFieldMatchMode(java.lang.String param) {
        this.localSystemFieldMatchModeTracker = param != null;

        this.localSystemFieldMatchMode = param;

    }

    public boolean isSystemFieldConditionArraySpecified() {
        return this.localSystemFieldConditionArrayTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.SystemFieldConditionArray
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.SystemFieldConditionArray getSystemFieldConditionArray() {
        return this.localSystemFieldConditionArray;
    }

    /**
     * Auto generated setter method
     *
     * @param param SystemFieldConditionArray
     */
    public void setSystemFieldConditionArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.SystemFieldConditionArray param) {
        this.localSystemFieldConditionArrayTracker = param != null;

        this.localSystemFieldConditionArray = param;

    }

    public boolean isTagMatchModeSpecified() {
        return this.localTagMatchModeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getTagMatchMode() {
        return this.localTagMatchMode;
    }

    /**
     * Auto generated setter method
     *
     * @param param TagMatchMode
     */
    public void setTagMatchMode(java.lang.String param) {
        this.localTagMatchModeTracker = param != null;

        this.localTagMatchMode = param;

    }

    public boolean isTagConditionArraySpecified() {
        return this.localTagConditionArrayTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.TagConditionArray
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.TagConditionArray getTagConditionArray() {
        return this.localTagConditionArray;
    }

    /**
     * Auto generated setter method
     *
     * @param param TagConditionArray
     */
    public void setTagConditionArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.TagConditionArray param) {
        this.localTagConditionArrayTracker = param != null;

        this.localTagConditionArray = param;

    }

    public boolean isMetadataMatchModeSpecified() {
        return this.localMetadataMatchModeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getMetadataMatchMode() {
        return this.localMetadataMatchMode;
    }

    /**
     * Auto generated setter method
     *
     * @param param MetadataMatchMode
     */
    public void setMetadataMatchMode(java.lang.String param) {
        this.localMetadataMatchModeTracker = param != null;

        this.localMetadataMatchMode = param;

    }

    public boolean isMetadataConditionArraySpecified() {
        return this.localMetadataConditionArrayTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.MetadataConditionArray
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.MetadataConditionArray getMetadataConditionArray() {
        return this.localMetadataConditionArray;
    }

    /**
     * Auto generated setter method
     *
     * @param param MetadataConditionArray
     */
    public void setMetadataConditionArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.MetadataConditionArray param) {
        this.localMetadataConditionArrayTracker = param != null;

        this.localMetadataConditionArray = param;

    }

    public boolean isAssetTypeArraySpecified() {
        return this.localAssetTypeArrayTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray getAssetTypeArray() {
        return this.localAssetTypeArray;
    }

    /**
     * Auto generated setter method
     *
     * @param param AssetTypeArray
     */
    public void setAssetTypeArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray param) {
        this.localAssetTypeArrayTracker = param != null;

        this.localAssetTypeArray = param;

    }

    public boolean isExcludeAssetTypeArraySpecified() {
        return this.localExcludeAssetTypeArrayTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray getExcludeAssetTypeArray() {
        return this.localExcludeAssetTypeArray;
    }

    /**
     * Auto generated setter method
     *
     * @param param ExcludeAssetTypeArray
     */
    public void setExcludeAssetTypeArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray param) {
        this.localExcludeAssetTypeArrayTracker = param != null;

        this.localExcludeAssetTypeArray = param;

    }

    public boolean isAssetSubTypeArraySpecified() {
        return this.localAssetSubTypeArrayTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray getAssetSubTypeArray() {
        return this.localAssetSubTypeArray;
    }

    /**
     * Auto generated setter method
     *
     * @param param AssetSubTypeArray
     */
    public void setAssetSubTypeArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray param) {
        this.localAssetSubTypeArrayTracker = param != null;

        this.localAssetSubTypeArray = param;

    }

    public boolean isStrictSubTypeCheckSpecified() {
        return this.localStrictSubTypeCheckTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return boolean
     */
    public boolean getStrictSubTypeCheck() {
        return this.localStrictSubTypeCheck;
    }

    /**
     * Auto generated setter method
     *
     * @param param StrictSubTypeCheck
     */
    public void setStrictSubTypeCheck(boolean param) {

        // setting primitive attribute tracker to true
        this.localStrictSubTypeCheckTracker =
                true;

        this.localStrictSubTypeCheck = param;

    }

    public boolean isExcludeByproductsSpecified() {
        return this.localExcludeByproductsTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return boolean
     */
    public boolean getExcludeByproducts() {
        return this.localExcludeByproducts;
    }

    /**
     * Auto generated setter method
     *
     * @param param ExcludeByproducts
     */
    public void setExcludeByproducts(boolean param) {

        // setting primitive attribute tracker to true
        this.localExcludeByproductsTracker =
                true;

        this.localExcludeByproducts = param;

    }

    public boolean isExcludeByproductArraySpecified() {
        return this.localExcludeByproductArrayTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExcludeByproductArray
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExcludeByproductArray getExcludeByproductArray() {
        return this.localExcludeByproductArray;
    }

    /**
     * Auto generated setter method
     *
     * @param param ExcludeByproductArray
     */
    public void setExcludeByproductArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExcludeByproductArray param) {
        this.localExcludeByproductArrayTracker = param != null;

        this.localExcludeByproductArray = param;

    }

    public boolean isProjectHandleSpecified() {
        return this.localProjectHandleTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getProjectHandle() {
        return this.localProjectHandle;
    }

    /**
     * Auto generated setter method
     *
     * @param param ProjectHandle
     */
    public void setProjectHandle(java.lang.String param) {
        this.localProjectHandleTracker = param != null;

        this.localProjectHandle = param;

    }

    public boolean isRecordsPerPageSpecified() {
        return this.localRecordsPerPageTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getRecordsPerPage() {
        return this.localRecordsPerPage;
    }

    /**
     * Auto generated setter method
     *
     * @param param RecordsPerPage
     */
    public void setRecordsPerPage(int param) {

        // setting primitive attribute tracker to true
        this.localRecordsPerPageTracker =
                param != java.lang.Integer.MIN_VALUE;

        this.localRecordsPerPage = param;

    }

    public boolean isResultsPageSpecified() {
        return this.localResultsPageTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getResultsPage() {
        return this.localResultsPage;
    }

    /**
     * Auto generated setter method
     *
     * @param param ResultsPage
     */
    public void setResultsPage(int param) {

        // setting primitive attribute tracker to true
        this.localResultsPageTracker =
                param != java.lang.Integer.MIN_VALUE;

        this.localResultsPage = param;

    }

    public boolean isSortBySpecified() {
        return this.localSortByTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSortBy() {
        return this.localSortBy;
    }

    /**
     * Auto generated setter method
     *
     * @param param SortBy
     */
    public void setSortBy(java.lang.String param) {
        this.localSortByTracker = param != null;

        this.localSortBy = param;

    }

    public boolean isSortDirectionSpecified() {
        return this.localSortDirectionTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSortDirection() {
        return this.localSortDirection;
    }

    /**
     * Auto generated setter method
     *
     * @param param SortDirection
     */
    public void setSortDirection(java.lang.String param) {
        this.localSortDirectionTracker = param != null;

        this.localSortDirection = param;

    }

    public boolean isResponseFieldArraySpecified() {
        return this.localResponseFieldArrayTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray getResponseFieldArray() {
        return this.localResponseFieldArray;
    }

    /**
     * Auto generated setter method
     *
     * @param param ResponseFieldArray
     */
    public void setResponseFieldArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray param) {
        this.localResponseFieldArrayTracker = param != null;

        this.localResponseFieldArray = param;

    }

    public boolean isExcludeFieldArraySpecified() {
        return this.localExcludeFieldArrayTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray getExcludeFieldArray() {
        return this.localExcludeFieldArray;
    }

    /**
     * Auto generated setter method
     *
     * @param param ExcludeFieldArray
     */
    public void setExcludeFieldArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray param) {
        this.localExcludeFieldArrayTracker = param != null;

        this.localExcludeFieldArray = param;

    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

        org.apache.axiom.om.OMDataSource dataSource =
                new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
        return factory.createOMElement(dataSource, MY_QNAME);

    }

    public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
        serialize(parentQName, xmlWriter, false);
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter,
            boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

        java.lang.String prefix = null;
        java.lang.String namespace = null;

        prefix = parentQName.getPrefix();
        namespace = parentQName.getNamespaceURI();
        writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

        if (serializeType) {

            java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta");
            if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":searchAssetsParam",
                        xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "searchAssetsParam",
                        xmlWriter);
            }

        }

        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "companyHandle", xmlWriter);

        if (this.localCompanyHandle == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("companyHandle cannot be null!!");

        } else {

            xmlWriter.writeCharacters(this.localCompanyHandle);

        }

        xmlWriter.writeEndElement();
        if (this.localAccessUserHandleTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "accessUserHandle", xmlWriter);

            if (this.localAccessUserHandle == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("accessUserHandle cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localAccessUserHandle);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localAccessGroupHandleTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "accessGroupHandle", xmlWriter);

            if (this.localAccessGroupHandle == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("accessGroupHandle cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localAccessGroupHandle);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localFolderTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "folder", xmlWriter);

            if (this.localFolder == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("folder cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localFolder);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "includeSubfolders", xmlWriter);

        if (false) {

            throw new org.apache.axis2.databinding.ADBException("includeSubfolders cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localIncludeSubfolders));
        }

        xmlWriter.writeEndElement();
        if (this.localPublishStateTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "publishState", xmlWriter);

            if (this.localPublishState == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("publishState cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localPublishState);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localTrashStateTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "trashState", xmlWriter);

            if (this.localTrashState == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("trashState cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localTrashState);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localConditionMatchModeTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "conditionMatchMode", xmlWriter);

            if (this.localConditionMatchMode == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("conditionMatchMode cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localConditionMatchMode);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localKeywordArrayTracker) {
            if (this.localKeywordArray == null) {
                throw new org.apache.axis2.databinding.ADBException("keywordArray cannot be null!!");
            }
            this.localKeywordArray
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "keywordArray"),
                            xmlWriter);
        }
        if (this.localSystemFieldMatchModeTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "systemFieldMatchMode", xmlWriter);

            if (this.localSystemFieldMatchMode == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("systemFieldMatchMode cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localSystemFieldMatchMode);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localSystemFieldConditionArrayTracker) {
            if (this.localSystemFieldConditionArray == null) {
                throw new org.apache.axis2.databinding.ADBException("systemFieldConditionArray cannot be null!!");
            }
            this.localSystemFieldConditionArray.serialize(
                    new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "systemFieldConditionArray"),
                    xmlWriter);
        }
        if (this.localTagMatchModeTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "tagMatchMode", xmlWriter);

            if (this.localTagMatchMode == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("tagMatchMode cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localTagMatchMode);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localTagConditionArrayTracker) {
            if (this.localTagConditionArray == null) {
                throw new org.apache.axis2.databinding.ADBException("tagConditionArray cannot be null!!");
            }
            this.localTagConditionArray
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "tagConditionArray"),
                            xmlWriter);
        }
        if (this.localMetadataMatchModeTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "metadataMatchMode", xmlWriter);

            if (this.localMetadataMatchMode == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("metadataMatchMode cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localMetadataMatchMode);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localMetadataConditionArrayTracker) {
            if (this.localMetadataConditionArray == null) {
                throw new org.apache.axis2.databinding.ADBException("metadataConditionArray cannot be null!!");
            }
            this.localMetadataConditionArray
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "metadataConditionArray"),
                            xmlWriter);
        }
        if (this.localAssetTypeArrayTracker) {
            if (this.localAssetTypeArray == null) {
                throw new org.apache.axis2.databinding.ADBException("assetTypeArray cannot be null!!");
            }
            this.localAssetTypeArray
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "assetTypeArray"),
                            xmlWriter);
        }
        if (this.localExcludeAssetTypeArrayTracker) {
            if (this.localExcludeAssetTypeArray == null) {
                throw new org.apache.axis2.databinding.ADBException("excludeAssetTypeArray cannot be null!!");
            }
            this.localExcludeAssetTypeArray
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "excludeAssetTypeArray"),
                            xmlWriter);
        }
        if (this.localAssetSubTypeArrayTracker) {
            if (this.localAssetSubTypeArray == null) {
                throw new org.apache.axis2.databinding.ADBException("assetSubTypeArray cannot be null!!");
            }
            this.localAssetSubTypeArray
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "assetSubTypeArray"),
                            xmlWriter);
        }
        if (this.localStrictSubTypeCheckTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "strictSubTypeCheck", xmlWriter);

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("strictSubTypeCheck cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localStrictSubTypeCheck));
            }

            xmlWriter.writeEndElement();
        }
        if (this.localExcludeByproductsTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "excludeByproducts", xmlWriter);

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("excludeByproducts cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localExcludeByproducts));
            }

            xmlWriter.writeEndElement();
        }
        if (this.localExcludeByproductArrayTracker) {
            if (this.localExcludeByproductArray == null) {
                throw new org.apache.axis2.databinding.ADBException("excludeByproductArray cannot be null!!");
            }
            this.localExcludeByproductArray
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "excludeByproductArray"),
                            xmlWriter);
        }
        if (this.localProjectHandleTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "projectHandle", xmlWriter);

            if (this.localProjectHandle == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("projectHandle cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localProjectHandle);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localRecordsPerPageTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "recordsPerPage", xmlWriter);

            if (this.localRecordsPerPage == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("recordsPerPage cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localRecordsPerPage));
            }

            xmlWriter.writeEndElement();
        }
        if (this.localResultsPageTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "resultsPage", xmlWriter);

            if (this.localResultsPage == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("resultsPage cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localResultsPage));
            }

            xmlWriter.writeEndElement();
        }
        if (this.localSortByTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "sortBy", xmlWriter);

            if (this.localSortBy == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("sortBy cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localSortBy);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localSortDirectionTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "sortDirection", xmlWriter);

            if (this.localSortDirection == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("sortDirection cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localSortDirection);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localResponseFieldArrayTracker) {
            if (this.localResponseFieldArray == null) {
                throw new org.apache.axis2.databinding.ADBException("responseFieldArray cannot be null!!");
            }
            this.localResponseFieldArray
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "responseFieldArray"),
                            xmlWriter);
        }
        if (this.localExcludeFieldArrayTracker) {
            if (this.localExcludeFieldArray == null) {
                throw new org.apache.axis2.databinding.ADBException("excludeFieldArray cannot be null!!");
            }
            this.localExcludeFieldArray
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "excludeFieldArray"),
                            xmlWriter);
        }
        xmlWriter.writeEndElement();

    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
        if (writerPrefix != null) {
            xmlWriter.writeStartElement(namespace, localPart);
        } else {
            if (namespace.length() == 0) {
                prefix = "";
            } else if (prefix == null) {
                prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        if (xmlWriter.getPrefix(namespace) == null) {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
        xmlWriter.writeAttribute(namespace, attName, attValue);
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
            javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }

    /**
     * method to handle Qnames
     */

    private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        java.lang.String namespaceURI = qname.getNamespaceURI();
        if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
            if (prefix == null) {
                prefix = generatePrefix(namespaceURI);
                xmlWriter.writeNamespace(prefix, namespaceURI);
                xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
                xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                // i.e this is the default namespace
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }
    }

    private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
                if (i > 0) {
                    stringToWrite.append(" ");
                }
                namespaceURI = qnames[i].getNamespaceURI();
                if (namespaceURI != null) {
                    prefix = xmlWriter.getPrefix(namespaceURI);
                    if ((prefix == null) || (prefix.length() == 0)) {
                        prefix = generatePrefix(namespaceURI);
                        xmlWriter.writeNamespace(prefix, namespaceURI);
                        xmlWriter.setPrefix(prefix, namespaceURI);
                    }

                    if (prefix.trim().length() > 0) {
                        stringToWrite.append(prefix).append(":")
                                .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            }
            xmlWriter.writeCharacters(stringToWrite.toString());
        }

    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
        java.lang.String prefix = xmlWriter.getPrefix(namespace);
        if (prefix == null) {
            prefix = generatePrefix(namespace);
            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
            while (true) {
                java.lang.String uri = nsContext.getNamespaceURI(prefix);
                if (uri == null || uri.length() == 0) {
                    break;
                }
                prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
        return prefix;
    }

    /**
     * databinding method to get an XML representation of this object
     */
    public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException {

        java.util.ArrayList elementList = new java.util.ArrayList();
        java.util.ArrayList attribList = new java.util.ArrayList();

        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "companyHandle"));

        if (this.localCompanyHandle != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localCompanyHandle));
        } else {
            throw new org.apache.axis2.databinding.ADBException("companyHandle cannot be null!!");
        }
        if (this.localAccessUserHandleTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "accessUserHandle"));

            if (this.localAccessUserHandle != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localAccessUserHandle));
            } else {
                throw new org.apache.axis2.databinding.ADBException("accessUserHandle cannot be null!!");
            }
        }
        if (this.localAccessGroupHandleTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "accessGroupHandle"));

            if (this.localAccessGroupHandle != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localAccessGroupHandle));
            } else {
                throw new org.apache.axis2.databinding.ADBException("accessGroupHandle cannot be null!!");
            }
        }
        if (this.localFolderTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "folder"));

            if (this.localFolder != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localFolder));
            } else {
                throw new org.apache.axis2.databinding.ADBException("folder cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "includeSubfolders"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localIncludeSubfolders));
        if (this.localPublishStateTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "publishState"));

            if (this.localPublishState != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localPublishState));
            } else {
                throw new org.apache.axis2.databinding.ADBException("publishState cannot be null!!");
            }
        }
        if (this.localTrashStateTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "trashState"));

            if (this.localTrashState != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localTrashState));
            } else {
                throw new org.apache.axis2.databinding.ADBException("trashState cannot be null!!");
            }
        }
        if (this.localConditionMatchModeTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "conditionMatchMode"));

            if (this.localConditionMatchMode != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localConditionMatchMode));
            } else {
                throw new org.apache.axis2.databinding.ADBException("conditionMatchMode cannot be null!!");
            }
        }
        if (this.localKeywordArrayTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "keywordArray"));

            if (this.localKeywordArray == null) {
                throw new org.apache.axis2.databinding.ADBException("keywordArray cannot be null!!");
            }
            elementList.add(this.localKeywordArray);
        }
        if (this.localSystemFieldMatchModeTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "systemFieldMatchMode"));

            if (this.localSystemFieldMatchMode != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localSystemFieldMatchMode));
            } else {
                throw new org.apache.axis2.databinding.ADBException("systemFieldMatchMode cannot be null!!");
            }
        }
        if (this.localSystemFieldConditionArrayTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "systemFieldConditionArray"));

            if (this.localSystemFieldConditionArray == null) {
                throw new org.apache.axis2.databinding.ADBException("systemFieldConditionArray cannot be null!!");
            }
            elementList.add(this.localSystemFieldConditionArray);
        }
        if (this.localTagMatchModeTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "tagMatchMode"));

            if (this.localTagMatchMode != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localTagMatchMode));
            } else {
                throw new org.apache.axis2.databinding.ADBException("tagMatchMode cannot be null!!");
            }
        }
        if (this.localTagConditionArrayTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "tagConditionArray"));

            if (this.localTagConditionArray == null) {
                throw new org.apache.axis2.databinding.ADBException("tagConditionArray cannot be null!!");
            }
            elementList.add(this.localTagConditionArray);
        }
        if (this.localMetadataMatchModeTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "metadataMatchMode"));

            if (this.localMetadataMatchMode != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localMetadataMatchMode));
            } else {
                throw new org.apache.axis2.databinding.ADBException("metadataMatchMode cannot be null!!");
            }
        }
        if (this.localMetadataConditionArrayTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "metadataConditionArray"));

            if (this.localMetadataConditionArray == null) {
                throw new org.apache.axis2.databinding.ADBException("metadataConditionArray cannot be null!!");
            }
            elementList.add(this.localMetadataConditionArray);
        }
        if (this.localAssetTypeArrayTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "assetTypeArray"));

            if (this.localAssetTypeArray == null) {
                throw new org.apache.axis2.databinding.ADBException("assetTypeArray cannot be null!!");
            }
            elementList.add(this.localAssetTypeArray);
        }
        if (this.localExcludeAssetTypeArrayTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "excludeAssetTypeArray"));

            if (this.localExcludeAssetTypeArray == null) {
                throw new org.apache.axis2.databinding.ADBException("excludeAssetTypeArray cannot be null!!");
            }
            elementList.add(this.localExcludeAssetTypeArray);
        }
        if (this.localAssetSubTypeArrayTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "assetSubTypeArray"));

            if (this.localAssetSubTypeArray == null) {
                throw new org.apache.axis2.databinding.ADBException("assetSubTypeArray cannot be null!!");
            }
            elementList.add(this.localAssetSubTypeArray);
        }
        if (this.localStrictSubTypeCheckTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "strictSubTypeCheck"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localStrictSubTypeCheck));
        }
        if (this.localExcludeByproductsTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "excludeByproducts"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localExcludeByproducts));
        }
        if (this.localExcludeByproductArrayTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "excludeByproductArray"));

            if (this.localExcludeByproductArray == null) {
                throw new org.apache.axis2.databinding.ADBException("excludeByproductArray cannot be null!!");
            }
            elementList.add(this.localExcludeByproductArray);
        }
        if (this.localProjectHandleTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "projectHandle"));

            if (this.localProjectHandle != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localProjectHandle));
            } else {
                throw new org.apache.axis2.databinding.ADBException("projectHandle cannot be null!!");
            }
        }
        if (this.localRecordsPerPageTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "recordsPerPage"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localRecordsPerPage));
        }
        if (this.localResultsPageTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "resultsPage"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localResultsPage));
        }
        if (this.localSortByTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "sortBy"));

            if (this.localSortBy != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localSortBy));
            } else {
                throw new org.apache.axis2.databinding.ADBException("sortBy cannot be null!!");
            }
        }
        if (this.localSortDirectionTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "sortDirection"));

            if (this.localSortDirection != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localSortDirection));
            } else {
                throw new org.apache.axis2.databinding.ADBException("sortDirection cannot be null!!");
            }
        }
        if (this.localResponseFieldArrayTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "responseFieldArray"));

            if (this.localResponseFieldArray == null) {
                throw new org.apache.axis2.databinding.ADBException("responseFieldArray cannot be null!!");
            }
            elementList.add(this.localResponseFieldArray);
        }
        if (this.localExcludeFieldArrayTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "excludeFieldArray"));

            if (this.localExcludeFieldArray == null) {
                throw new org.apache.axis2.databinding.ADBException("excludeFieldArray cannot be null!!");
            }
            elementList.add(this.localExcludeFieldArray);
        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());

    }

    /**
     * Factory class that keeps the parse method
     */
    public static class Factory {

        /**
         * static method to create the object
         * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
         * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
         * Postcondition: If this object is an element, the reader is positioned at its end element
         * If this object is a complex type, the reader is positioned at the end element of its outer element
         */
        public static SearchAssetsParam parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            SearchAssetsParam object =
                    new SearchAssetsParam();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";
            try {

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                    java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "type");
                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;
                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                        }
                        nsPrefix = nsPrefix == null ? "" : nsPrefix;

                        java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                        if (!"searchAssetsParam".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (SearchAssetsParam) com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExtensionMapper.getTypeObject(
                                    nsUri, type, reader);
                        }

                    }

                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "companyHandle").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "companyHandle" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCompanyHandle(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "accessUserHandle").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "accessUserHandle" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setAccessUserHandle(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "accessGroupHandle").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "accessGroupHandle" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setAccessGroupHandle(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "folder")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "folder" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFolder(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "includeSubfolders").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "includeSubfolders" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setIncludeSubfolders(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "publishState").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "publishState" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPublishState(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "trashState").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "trashState" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTrashState(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "conditionMatchMode").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "conditionMatchMode" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setConditionMatchMode(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "keywordArray").equals(reader.getName())) {

                    object.setKeywordArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "systemFieldMatchMode").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "systemFieldMatchMode" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSystemFieldMatchMode(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "systemFieldConditionArray").equals(reader.getName())) {

                    object.setSystemFieldConditionArray(
                            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SystemFieldConditionArray.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "tagMatchMode").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "tagMatchMode" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTagMatchMode(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "tagConditionArray").equals(reader.getName())) {

                    object.setTagConditionArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.TagConditionArray.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "metadataMatchMode").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "metadataMatchMode" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMetadataMatchMode(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "metadataConditionArray").equals(reader.getName())) {

                    object.setMetadataConditionArray(
                            com.scene7.www.ipsapi.xsd._2016_01_14_beta.MetadataConditionArray.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "assetTypeArray").equals(reader.getName())) {

                    object.setAssetTypeArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "excludeAssetTypeArray").equals(reader.getName())) {

                    object.setExcludeAssetTypeArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "assetSubTypeArray").equals(reader.getName())) {

                    object.setAssetSubTypeArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "strictSubTypeCheck").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "strictSubTypeCheck" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setStrictSubTypeCheck(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "excludeByproducts").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "excludeByproducts" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setExcludeByproducts(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "excludeByproductArray").equals(reader.getName())) {

                    object.setExcludeByproductArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExcludeByproductArray.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "projectHandle").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "projectHandle" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setProjectHandle(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "recordsPerPage").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "recordsPerPage" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setRecordsPerPage(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setRecordsPerPage(java.lang.Integer.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "resultsPage").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "resultsPage" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setResultsPage(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setResultsPage(java.lang.Integer.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "sortBy")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "sortBy" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSortBy(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "sortDirection").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "sortDirection" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSortDirection(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "responseFieldArray").equals(reader.getName())) {

                    object.setResponseFieldArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "excludeFieldArray").equals(reader.getName())) {

                    object.setExcludeFieldArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement())
                    // A start element we are not expecting indicates a trailing invalid property
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());

            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

    }//end of factory class

}
           
    