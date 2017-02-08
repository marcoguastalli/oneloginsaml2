/**
 * Asset.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.scene7.www.ipsapi.xsd._2016_01_14_beta;

/**
 * Asset bean class
 */

public class Asset
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = Asset
                Namespace URI = http://www.scene7.com/IpsApi/xsd/2016-01-14-beta
                Namespace Prefix = ns1
                */

    /**
     * field for AssetHandle
     */

    protected java.lang.String localAssetHandle;

    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localAssetHandleTracker = false;
    /**
     * field for Type
     */

    protected java.lang.String localType;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localTypeTracker = false;
    /**
     * field for SubType
     */

    protected java.lang.String localSubType;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localSubTypeTracker = false;
    /**
     * field for Name
     */

    protected java.lang.String localName;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localNameTracker = false;
    /**
     * field for FileName
     */

    protected java.lang.String localFileName;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localFileNameTracker = false;
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
     * field for FolderHandle
     */

    protected java.lang.String localFolderHandle;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localFolderHandleTracker = false;
    /**
     * field for ReadyForPublish
     */

    protected boolean localReadyForPublish;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localReadyForPublishTracker = false;
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
     * field for Projects
     */

    protected java.lang.String localProjects;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localProjectsTracker = false;
    /**
     * field for IpsImageUrl
     */

    protected java.lang.String localIpsImageUrl;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localIpsImageUrlTracker = false;
    /**
     * field for Created
     */

    protected java.util.Calendar localCreated;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localCreatedTracker = false;
    /**
     * field for CreateUser
     */

    protected java.lang.String localCreateUser;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localCreateUserTracker = false;
    /**
     * field for LastModified
     */

    protected java.util.Calendar localLastModified;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localLastModifiedTracker = false;
    /**
     * field for LastModifyUser
     */

    protected java.lang.String localLastModifyUser;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localLastModifyUserTracker = false;
    /**
     * field for MetadataArray
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.MetadataArray localMetadataArray;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localMetadataArrayTracker = false;
    /**
     * field for ImageInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.ImageInfo localImageInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localImageInfoTracker = false;
    /**
     * field for LayerViewInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.LayerViewInfo localLayerViewInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localLayerViewInfoTracker = false;
    /**
     * field for TemplateInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.TemplateInfo localTemplateInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localTemplateInfoTracker = false;
    /**
     * field for WatermarkInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.WatermarkInfo localWatermarkInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localWatermarkInfoTracker = false;
    /**
     * field for RenderSceneInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.RenderSceneInfo localRenderSceneInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localRenderSceneInfoTracker = false;
    /**
     * field for VignetteInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.VignetteInfo localVignetteInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localVignetteInfoTracker = false;
    /**
     * field for CabinetInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.CabinetInfo localCabinetInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localCabinetInfoTracker = false;
    /**
     * field for WindowCoveringInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.WindowCoveringInfo localWindowCoveringInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localWindowCoveringInfoTracker = false;
    /**
     * field for IccProfileInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.IccProfileInfo localIccProfileInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localIccProfileInfoTracker = false;
    /**
     * field for FontInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.FontInfo localFontInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localFontInfoTracker = false;
    /**
     * field for XslInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.XslInfo localXslInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localXslInfoTracker = false;
    /**
     * field for ViewerPresetInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.ViewerPresetInfo localViewerPresetInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localViewerPresetInfoTracker = false;
    /**
     * field for ViewerSwfInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.ViewerSwfInfo localViewerSwfInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localViewerSwfInfoTracker = false;
    /**
     * field for XmlInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.XmlInfo localXmlInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localXmlInfoTracker = false;
    /**
     * field for SvgInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.SvgInfo localSvgInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localSvgInfoTracker = false;
    /**
     * field for FxgInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.FxgInfo localFxgInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localFxgInfoTracker = false;
    /**
     * field for PdfSettingsInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.PdfSettingsInfo localPdfSettingsInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localPdfSettingsInfoTracker = false;
    /**
     * field for ZipInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.ZipInfo localZipInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localZipInfoTracker = false;
    /**
     * field for VideoInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.VideoInfo localVideoInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localVideoInfoTracker = false;
    /**
     * field for AcoInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.AcoInfo localAcoInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localAcoInfoTracker = false;
    /**
     * field for PdfInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.PdfInfo localPdfInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localPdfInfoTracker = false;
    /**
     * field for PsdInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.PsdInfo localPsdInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localPsdInfoTracker = false;
    /**
     * field for FlashInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.FlashInfo localFlashInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localFlashInfoTracker = false;
    /**
     * field for InDesignInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.InDesignInfo localInDesignInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localInDesignInfoTracker = false;
    /**
     * field for PostScriptInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.PostScriptInfo localPostScriptInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localPostScriptInfoTracker = false;
    /**
     * field for IllustratorInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.IllustratorInfo localIllustratorInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localIllustratorInfoTracker = false;
    /**
     * field for WordInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.WordInfo localWordInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localWordInfoTracker = false;
    /**
     * field for ExcelInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExcelInfo localExcelInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localExcelInfoTracker = false;
    /**
     * field for PowerPointInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.PowerPointInfo localPowerPointInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localPowerPointInfoTracker = false;
    /**
     * field for RtfInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.RTFInfo localRtfInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localRtfInfoTracker = false;
    /**
     * field for MaskInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.MaskInfo localMaskInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localMaskInfoTracker = false;
    /**
     * field for PremiereExpressRemixInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.PremiereExpressRemixInfo localPremiereExpressRemixInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localPremiereExpressRemixInfoTracker = false;
    /**
     * field for CuePointInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.CuePointInfo localCuePointInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localCuePointInfoTracker = false;
    /**
     * field for AudioInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.AudioInfo localAudioInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localAudioInfoTracker = false;
    /**
     * field for AssetSetInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.AssetSetInfo localAssetSetInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localAssetSetInfoTracker = false;
    /**
     * field for MasterVideoInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.MasterVideoInfo localMasterVideoInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localMasterVideoInfoTracker = false;
    /**
     * field for AnimatedGifInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.AnimatedGifInfo localAnimatedGifInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localAnimatedGifInfoTracker = false;
    /**
     * field for SwcInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.SwcInfo localSwcInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localSwcInfoTracker = false;
    /**
     * field for CssInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.CssInfo localCssInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localCssInfoTracker = false;
    /**
     * field for JavascriptInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.JavascriptInfo localJavascriptInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localJavascriptInfoTracker = false;
    /**
     * field for VideoCaptionInfo
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.VideoCaptionInfo localVideoCaptionInfo;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localVideoCaptionInfoTracker = false;
    /**
     * field for Permissions
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.PermissionArray localPermissions;
    /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
    protected boolean localPermissionsTracker = false;

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta")) {
            return "ns1";
        }
        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    public boolean isAssetHandleSpecified() {
        return this.localAssetHandleTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAssetHandle() {
        return this.localAssetHandle;
    }

    /**
     * Auto generated setter method
     *
     * @param param AssetHandle
     */
    public void setAssetHandle(java.lang.String param) {
        this.localAssetHandleTracker = param != null;

        this.localAssetHandle = param;

    }

    public boolean isTypeSpecified() {
        return this.localTypeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getType() {
        return this.localType;
    }

    /**
     * Auto generated setter method
     *
     * @param param Type
     */
    public void setType(java.lang.String param) {
        this.localTypeTracker = param != null;

        this.localType = param;

    }

    public boolean isSubTypeSpecified() {
        return this.localSubTypeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSubType() {
        return this.localSubType;
    }

    /**
     * Auto generated setter method
     *
     * @param param SubType
     */
    public void setSubType(java.lang.String param) {
        this.localSubTypeTracker = param != null;

        this.localSubType = param;

    }

    public boolean isNameSpecified() {
        return this.localNameTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getName() {
        return this.localName;
    }

    /**
     * Auto generated setter method
     *
     * @param param Name
     */
    public void setName(java.lang.String param) {
        this.localNameTracker = param != null;

        this.localName = param;

    }

    public boolean isFileNameSpecified() {
        return this.localFileNameTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getFileName() {
        return this.localFileName;
    }

    /**
     * Auto generated setter method
     *
     * @param param FileName
     */
    public void setFileName(java.lang.String param) {
        this.localFileNameTracker = param != null;

        this.localFileName = param;

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

    public boolean isFolderHandleSpecified() {
        return this.localFolderHandleTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getFolderHandle() {
        return this.localFolderHandle;
    }

    /**
     * Auto generated setter method
     *
     * @param param FolderHandle
     */
    public void setFolderHandle(java.lang.String param) {
        this.localFolderHandleTracker = param != null;

        this.localFolderHandle = param;

    }

    public boolean isReadyForPublishSpecified() {
        return this.localReadyForPublishTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return boolean
     */
    public boolean getReadyForPublish() {
        return this.localReadyForPublish;
    }

    /**
     * Auto generated setter method
     *
     * @param param ReadyForPublish
     */
    public void setReadyForPublish(boolean param) {

        // setting primitive attribute tracker to true
        this.localReadyForPublishTracker =
                true;

        this.localReadyForPublish = param;

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

    public boolean isProjectsSpecified() {
        return this.localProjectsTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getProjects() {
        return this.localProjects;
    }

    /**
     * Auto generated setter method
     *
     * @param param Projects
     */
    public void setProjects(java.lang.String param) {
        this.localProjectsTracker = param != null;

        this.localProjects = param;

    }

    public boolean isIpsImageUrlSpecified() {
        return this.localIpsImageUrlTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getIpsImageUrl() {
        return this.localIpsImageUrl;
    }

    /**
     * Auto generated setter method
     *
     * @param param IpsImageUrl
     */
    public void setIpsImageUrl(java.lang.String param) {
        this.localIpsImageUrlTracker = param != null;

        this.localIpsImageUrl = param;

    }

    public boolean isCreatedSpecified() {
        return this.localCreatedTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getCreated() {
        return this.localCreated;
    }

    /**
     * Auto generated setter method
     *
     * @param param Created
     */
    public void setCreated(java.util.Calendar param) {
        this.localCreatedTracker = param != null;

        this.localCreated = param;

    }

    public boolean isCreateUserSpecified() {
        return this.localCreateUserTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCreateUser() {
        return this.localCreateUser;
    }

    /**
     * Auto generated setter method
     *
     * @param param CreateUser
     */
    public void setCreateUser(java.lang.String param) {
        this.localCreateUserTracker = param != null;

        this.localCreateUser = param;

    }

    public boolean isLastModifiedSpecified() {
        return this.localLastModifiedTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getLastModified() {
        return this.localLastModified;
    }

    /**
     * Auto generated setter method
     *
     * @param param LastModified
     */
    public void setLastModified(java.util.Calendar param) {
        this.localLastModifiedTracker = param != null;

        this.localLastModified = param;

    }

    public boolean isLastModifyUserSpecified() {
        return this.localLastModifyUserTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getLastModifyUser() {
        return this.localLastModifyUser;
    }

    /**
     * Auto generated setter method
     *
     * @param param LastModifyUser
     */
    public void setLastModifyUser(java.lang.String param) {
        this.localLastModifyUserTracker = param != null;

        this.localLastModifyUser = param;

    }

    public boolean isMetadataArraySpecified() {
        return this.localMetadataArrayTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.MetadataArray
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.MetadataArray getMetadataArray() {
        return this.localMetadataArray;
    }

    /**
     * Auto generated setter method
     *
     * @param param MetadataArray
     */
    public void setMetadataArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.MetadataArray param) {
        this.localMetadataArrayTracker = param != null;

        this.localMetadataArray = param;

    }

    public boolean isImageInfoSpecified() {
        return this.localImageInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.ImageInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.ImageInfo getImageInfo() {
        return this.localImageInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param ImageInfo
     */
    public void setImageInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.ImageInfo param) {
        this.localImageInfoTracker = param != null;

        this.localImageInfo = param;

    }

    public boolean isLayerViewInfoSpecified() {
        return this.localLayerViewInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.LayerViewInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.LayerViewInfo getLayerViewInfo() {
        return this.localLayerViewInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param LayerViewInfo
     */
    public void setLayerViewInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.LayerViewInfo param) {
        this.localLayerViewInfoTracker = param != null;

        this.localLayerViewInfo = param;

    }

    public boolean isTemplateInfoSpecified() {
        return this.localTemplateInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.TemplateInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.TemplateInfo getTemplateInfo() {
        return this.localTemplateInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param TemplateInfo
     */
    public void setTemplateInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.TemplateInfo param) {
        this.localTemplateInfoTracker = param != null;

        this.localTemplateInfo = param;

    }

    public boolean isWatermarkInfoSpecified() {
        return this.localWatermarkInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.WatermarkInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.WatermarkInfo getWatermarkInfo() {
        return this.localWatermarkInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param WatermarkInfo
     */
    public void setWatermarkInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.WatermarkInfo param) {
        this.localWatermarkInfoTracker = param != null;

        this.localWatermarkInfo = param;

    }

    public boolean isRenderSceneInfoSpecified() {
        return this.localRenderSceneInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.RenderSceneInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.RenderSceneInfo getRenderSceneInfo() {
        return this.localRenderSceneInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param RenderSceneInfo
     */
    public void setRenderSceneInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.RenderSceneInfo param) {
        this.localRenderSceneInfoTracker = param != null;

        this.localRenderSceneInfo = param;

    }

    public boolean isVignetteInfoSpecified() {
        return this.localVignetteInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.VignetteInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.VignetteInfo getVignetteInfo() {
        return this.localVignetteInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param VignetteInfo
     */
    public void setVignetteInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.VignetteInfo param) {
        this.localVignetteInfoTracker = param != null;

        this.localVignetteInfo = param;

    }

    public boolean isCabinetInfoSpecified() {
        return this.localCabinetInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.CabinetInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.CabinetInfo getCabinetInfo() {
        return this.localCabinetInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param CabinetInfo
     */
    public void setCabinetInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.CabinetInfo param) {
        this.localCabinetInfoTracker = param != null;

        this.localCabinetInfo = param;

    }

    public boolean isWindowCoveringInfoSpecified() {
        return this.localWindowCoveringInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.WindowCoveringInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.WindowCoveringInfo getWindowCoveringInfo() {
        return this.localWindowCoveringInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param WindowCoveringInfo
     */
    public void setWindowCoveringInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.WindowCoveringInfo param) {
        this.localWindowCoveringInfoTracker = param != null;

        this.localWindowCoveringInfo = param;

    }

    public boolean isIccProfileInfoSpecified() {
        return this.localIccProfileInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.IccProfileInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.IccProfileInfo getIccProfileInfo() {
        return this.localIccProfileInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param IccProfileInfo
     */
    public void setIccProfileInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.IccProfileInfo param) {
        this.localIccProfileInfoTracker = param != null;

        this.localIccProfileInfo = param;

    }

    public boolean isFontInfoSpecified() {
        return this.localFontInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.FontInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.FontInfo getFontInfo() {
        return this.localFontInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param FontInfo
     */
    public void setFontInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.FontInfo param) {
        this.localFontInfoTracker = param != null;

        this.localFontInfo = param;

    }

    public boolean isXslInfoSpecified() {
        return this.localXslInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.XslInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.XslInfo getXslInfo() {
        return this.localXslInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param XslInfo
     */
    public void setXslInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.XslInfo param) {
        this.localXslInfoTracker = param != null;

        this.localXslInfo = param;

    }

    public boolean isViewerPresetInfoSpecified() {
        return this.localViewerPresetInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.ViewerPresetInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.ViewerPresetInfo getViewerPresetInfo() {
        return this.localViewerPresetInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param ViewerPresetInfo
     */
    public void setViewerPresetInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.ViewerPresetInfo param) {
        this.localViewerPresetInfoTracker = param != null;

        this.localViewerPresetInfo = param;

    }

    public boolean isViewerSwfInfoSpecified() {
        return this.localViewerSwfInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.ViewerSwfInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.ViewerSwfInfo getViewerSwfInfo() {
        return this.localViewerSwfInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param ViewerSwfInfo
     */
    public void setViewerSwfInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.ViewerSwfInfo param) {
        this.localViewerSwfInfoTracker = param != null;

        this.localViewerSwfInfo = param;

    }

    public boolean isXmlInfoSpecified() {
        return this.localXmlInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.XmlInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.XmlInfo getXmlInfo() {
        return this.localXmlInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param XmlInfo
     */
    public void setXmlInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.XmlInfo param) {
        this.localXmlInfoTracker = param != null;

        this.localXmlInfo = param;

    }

    public boolean isSvgInfoSpecified() {
        return this.localSvgInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.SvgInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.SvgInfo getSvgInfo() {
        return this.localSvgInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param SvgInfo
     */
    public void setSvgInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.SvgInfo param) {
        this.localSvgInfoTracker = param != null;

        this.localSvgInfo = param;

    }

    public boolean isFxgInfoSpecified() {
        return this.localFxgInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.FxgInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.FxgInfo getFxgInfo() {
        return this.localFxgInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param FxgInfo
     */
    public void setFxgInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.FxgInfo param) {
        this.localFxgInfoTracker = param != null;

        this.localFxgInfo = param;

    }

    public boolean isPdfSettingsInfoSpecified() {
        return this.localPdfSettingsInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.PdfSettingsInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.PdfSettingsInfo getPdfSettingsInfo() {
        return this.localPdfSettingsInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param PdfSettingsInfo
     */
    public void setPdfSettingsInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.PdfSettingsInfo param) {
        this.localPdfSettingsInfoTracker = param != null;

        this.localPdfSettingsInfo = param;

    }

    public boolean isZipInfoSpecified() {
        return this.localZipInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.ZipInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.ZipInfo getZipInfo() {
        return this.localZipInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param ZipInfo
     */
    public void setZipInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.ZipInfo param) {
        this.localZipInfoTracker = param != null;

        this.localZipInfo = param;

    }

    public boolean isVideoInfoSpecified() {
        return this.localVideoInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.VideoInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.VideoInfo getVideoInfo() {
        return this.localVideoInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param VideoInfo
     */
    public void setVideoInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.VideoInfo param) {
        this.localVideoInfoTracker = param != null;

        this.localVideoInfo = param;

    }

    public boolean isAcoInfoSpecified() {
        return this.localAcoInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.AcoInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.AcoInfo getAcoInfo() {
        return this.localAcoInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param AcoInfo
     */
    public void setAcoInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.AcoInfo param) {
        this.localAcoInfoTracker = param != null;

        this.localAcoInfo = param;

    }

    public boolean isPdfInfoSpecified() {
        return this.localPdfInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.PdfInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.PdfInfo getPdfInfo() {
        return this.localPdfInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param PdfInfo
     */
    public void setPdfInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.PdfInfo param) {
        this.localPdfInfoTracker = param != null;

        this.localPdfInfo = param;

    }

    public boolean isPsdInfoSpecified() {
        return this.localPsdInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.PsdInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.PsdInfo getPsdInfo() {
        return this.localPsdInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param PsdInfo
     */
    public void setPsdInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.PsdInfo param) {
        this.localPsdInfoTracker = param != null;

        this.localPsdInfo = param;

    }

    public boolean isFlashInfoSpecified() {
        return this.localFlashInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.FlashInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.FlashInfo getFlashInfo() {
        return this.localFlashInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param FlashInfo
     */
    public void setFlashInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.FlashInfo param) {
        this.localFlashInfoTracker = param != null;

        this.localFlashInfo = param;

    }

    public boolean isInDesignInfoSpecified() {
        return this.localInDesignInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.InDesignInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.InDesignInfo getInDesignInfo() {
        return this.localInDesignInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param InDesignInfo
     */
    public void setInDesignInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.InDesignInfo param) {
        this.localInDesignInfoTracker = param != null;

        this.localInDesignInfo = param;

    }

    public boolean isPostScriptInfoSpecified() {
        return this.localPostScriptInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.PostScriptInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.PostScriptInfo getPostScriptInfo() {
        return this.localPostScriptInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param PostScriptInfo
     */
    public void setPostScriptInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.PostScriptInfo param) {
        this.localPostScriptInfoTracker = param != null;

        this.localPostScriptInfo = param;

    }

    public boolean isIllustratorInfoSpecified() {
        return this.localIllustratorInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.IllustratorInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.IllustratorInfo getIllustratorInfo() {
        return this.localIllustratorInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param IllustratorInfo
     */
    public void setIllustratorInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.IllustratorInfo param) {
        this.localIllustratorInfoTracker = param != null;

        this.localIllustratorInfo = param;

    }

    public boolean isWordInfoSpecified() {
        return this.localWordInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.WordInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.WordInfo getWordInfo() {
        return this.localWordInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param WordInfo
     */
    public void setWordInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.WordInfo param) {
        this.localWordInfoTracker = param != null;

        this.localWordInfo = param;

    }

    public boolean isExcelInfoSpecified() {
        return this.localExcelInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExcelInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExcelInfo getExcelInfo() {
        return this.localExcelInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param ExcelInfo
     */
    public void setExcelInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExcelInfo param) {
        this.localExcelInfoTracker = param != null;

        this.localExcelInfo = param;

    }

    public boolean isPowerPointInfoSpecified() {
        return this.localPowerPointInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.PowerPointInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.PowerPointInfo getPowerPointInfo() {
        return this.localPowerPointInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param PowerPointInfo
     */
    public void setPowerPointInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.PowerPointInfo param) {
        this.localPowerPointInfoTracker = param != null;

        this.localPowerPointInfo = param;

    }

    public boolean isRtfInfoSpecified() {
        return this.localRtfInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.RTFInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.RTFInfo getRtfInfo() {
        return this.localRtfInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param RtfInfo
     */
    public void setRtfInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.RTFInfo param) {
        this.localRtfInfoTracker = param != null;

        this.localRtfInfo = param;

    }

    public boolean isMaskInfoSpecified() {
        return this.localMaskInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.MaskInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.MaskInfo getMaskInfo() {
        return this.localMaskInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param MaskInfo
     */
    public void setMaskInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.MaskInfo param) {
        this.localMaskInfoTracker = param != null;

        this.localMaskInfo = param;

    }

    public boolean isPremiereExpressRemixInfoSpecified() {
        return this.localPremiereExpressRemixInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.PremiereExpressRemixInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.PremiereExpressRemixInfo getPremiereExpressRemixInfo() {
        return this.localPremiereExpressRemixInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param PremiereExpressRemixInfo
     */
    public void setPremiereExpressRemixInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.PremiereExpressRemixInfo param) {
        this.localPremiereExpressRemixInfoTracker = param != null;

        this.localPremiereExpressRemixInfo = param;

    }

    public boolean isCuePointInfoSpecified() {
        return this.localCuePointInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.CuePointInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.CuePointInfo getCuePointInfo() {
        return this.localCuePointInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param CuePointInfo
     */
    public void setCuePointInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.CuePointInfo param) {
        this.localCuePointInfoTracker = param != null;

        this.localCuePointInfo = param;

    }

    public boolean isAudioInfoSpecified() {
        return this.localAudioInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.AudioInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.AudioInfo getAudioInfo() {
        return this.localAudioInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param AudioInfo
     */
    public void setAudioInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.AudioInfo param) {
        this.localAudioInfoTracker = param != null;

        this.localAudioInfo = param;

    }

    public boolean isAssetSetInfoSpecified() {
        return this.localAssetSetInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.AssetSetInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.AssetSetInfo getAssetSetInfo() {
        return this.localAssetSetInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param AssetSetInfo
     */
    public void setAssetSetInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.AssetSetInfo param) {
        this.localAssetSetInfoTracker = param != null;

        this.localAssetSetInfo = param;

    }

    public boolean isMasterVideoInfoSpecified() {
        return this.localMasterVideoInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.MasterVideoInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.MasterVideoInfo getMasterVideoInfo() {
        return this.localMasterVideoInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param MasterVideoInfo
     */
    public void setMasterVideoInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.MasterVideoInfo param) {
        this.localMasterVideoInfoTracker = param != null;

        this.localMasterVideoInfo = param;

    }

    public boolean isAnimatedGifInfoSpecified() {
        return this.localAnimatedGifInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.AnimatedGifInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.AnimatedGifInfo getAnimatedGifInfo() {
        return this.localAnimatedGifInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param AnimatedGifInfo
     */
    public void setAnimatedGifInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.AnimatedGifInfo param) {
        this.localAnimatedGifInfoTracker = param != null;

        this.localAnimatedGifInfo = param;

    }

    public boolean isSwcInfoSpecified() {
        return this.localSwcInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.SwcInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.SwcInfo getSwcInfo() {
        return this.localSwcInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param SwcInfo
     */
    public void setSwcInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.SwcInfo param) {
        this.localSwcInfoTracker = param != null;

        this.localSwcInfo = param;

    }

    public boolean isCssInfoSpecified() {
        return this.localCssInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.CssInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.CssInfo getCssInfo() {
        return this.localCssInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param CssInfo
     */
    public void setCssInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.CssInfo param) {
        this.localCssInfoTracker = param != null;

        this.localCssInfo = param;

    }

    public boolean isJavascriptInfoSpecified() {
        return this.localJavascriptInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.JavascriptInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.JavascriptInfo getJavascriptInfo() {
        return this.localJavascriptInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param JavascriptInfo
     */
    public void setJavascriptInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.JavascriptInfo param) {
        this.localJavascriptInfoTracker = param != null;

        this.localJavascriptInfo = param;

    }

    public boolean isVideoCaptionInfoSpecified() {
        return this.localVideoCaptionInfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.VideoCaptionInfo
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.VideoCaptionInfo getVideoCaptionInfo() {
        return this.localVideoCaptionInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param VideoCaptionInfo
     */
    public void setVideoCaptionInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.VideoCaptionInfo param) {
        this.localVideoCaptionInfoTracker = param != null;

        this.localVideoCaptionInfo = param;

    }

    public boolean isPermissionsSpecified() {
        return this.localPermissionsTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.PermissionArray
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.PermissionArray getPermissions() {
        return this.localPermissions;
    }

    /**
     * Auto generated setter method
     *
     * @param param Permissions
     */
    public void setPermissions(com.scene7.www.ipsapi.xsd._2016_01_14_beta.PermissionArray param) {
        this.localPermissionsTracker = param != null;

        this.localPermissions = param;

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
                new org.apache.axis2.databinding.ADBDataSource(this, parentQName);
        return factory.createOMElement(dataSource, parentQName);

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
                        namespacePrefix + ":Asset",
                        xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "Asset",
                        xmlWriter);
            }

        }
        if (this.localAssetHandleTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "assetHandle", xmlWriter);

            if (this.localAssetHandle == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("assetHandle cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localAssetHandle);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localTypeTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "type", xmlWriter);

            if (this.localType == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("type cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localType);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localSubTypeTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "subType", xmlWriter);

            if (this.localSubType == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("subType cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localSubType);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localNameTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "name", xmlWriter);

            if (this.localName == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("name cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localName);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localFileNameTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "fileName", xmlWriter);

            if (this.localFileName == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("fileName cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localFileName);

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
        if (this.localFolderHandleTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "folderHandle", xmlWriter);

            if (this.localFolderHandle == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("folderHandle cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localFolderHandle);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localReadyForPublishTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "readyForPublish", xmlWriter);

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("readyForPublish cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localReadyForPublish));
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
        if (this.localProjectsTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "projects", xmlWriter);

            if (this.localProjects == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("projects cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localProjects);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localIpsImageUrlTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "ipsImageUrl", xmlWriter);

            if (this.localIpsImageUrl == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("ipsImageUrl cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localIpsImageUrl);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localCreatedTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "created", xmlWriter);

            if (this.localCreated == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("created cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localCreated));

            }

            xmlWriter.writeEndElement();
        }
        if (this.localCreateUserTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "createUser", xmlWriter);

            if (this.localCreateUser == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("createUser cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localCreateUser);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localLastModifiedTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "lastModified", xmlWriter);

            if (this.localLastModified == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("lastModified cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localLastModified));

            }

            xmlWriter.writeEndElement();
        }
        if (this.localLastModifyUserTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "lastModifyUser", xmlWriter);

            if (this.localLastModifyUser == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("lastModifyUser cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localLastModifyUser);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localMetadataArrayTracker) {
            if (this.localMetadataArray == null) {
                throw new org.apache.axis2.databinding.ADBException("metadataArray cannot be null!!");
            }
            this.localMetadataArray
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "metadataArray"),
                            xmlWriter);
        }
        if (this.localImageInfoTracker) {
            if (this.localImageInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("imageInfo cannot be null!!");
            }
            this.localImageInfo.serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "imageInfo"),
                    xmlWriter);
        }
        if (this.localLayerViewInfoTracker) {
            if (this.localLayerViewInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("layerViewInfo cannot be null!!");
            }
            this.localLayerViewInfo
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "layerViewInfo"),
                            xmlWriter);
        }
        if (this.localTemplateInfoTracker) {
            if (this.localTemplateInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("templateInfo cannot be null!!");
            }
            this.localTemplateInfo
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "templateInfo"),
                            xmlWriter);
        }
        if (this.localWatermarkInfoTracker) {
            if (this.localWatermarkInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("watermarkInfo cannot be null!!");
            }
            this.localWatermarkInfo
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "watermarkInfo"),
                            xmlWriter);
        }
        if (this.localRenderSceneInfoTracker) {
            if (this.localRenderSceneInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("renderSceneInfo cannot be null!!");
            }
            this.localRenderSceneInfo
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "renderSceneInfo"),
                            xmlWriter);
        }
        if (this.localVignetteInfoTracker) {
            if (this.localVignetteInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("vignetteInfo cannot be null!!");
            }
            this.localVignetteInfo
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "vignetteInfo"),
                            xmlWriter);
        }
        if (this.localCabinetInfoTracker) {
            if (this.localCabinetInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("cabinetInfo cannot be null!!");
            }
            this.localCabinetInfo
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "cabinetInfo"),
                            xmlWriter);
        }
        if (this.localWindowCoveringInfoTracker) {
            if (this.localWindowCoveringInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("windowCoveringInfo cannot be null!!");
            }
            this.localWindowCoveringInfo
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "windowCoveringInfo"),
                            xmlWriter);
        }
        if (this.localIccProfileInfoTracker) {
            if (this.localIccProfileInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("iccProfileInfo cannot be null!!");
            }
            this.localIccProfileInfo
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "iccProfileInfo"),
                            xmlWriter);
        }
        if (this.localFontInfoTracker) {
            if (this.localFontInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("fontInfo cannot be null!!");
            }
            this.localFontInfo.serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "fontInfo"),
                    xmlWriter);
        }
        if (this.localXslInfoTracker) {
            if (this.localXslInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("xslInfo cannot be null!!");
            }
            this.localXslInfo.serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "xslInfo"),
                    xmlWriter);
        }
        if (this.localViewerPresetInfoTracker) {
            if (this.localViewerPresetInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("viewerPresetInfo cannot be null!!");
            }
            this.localViewerPresetInfo
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "viewerPresetInfo"),
                            xmlWriter);
        }
        if (this.localViewerSwfInfoTracker) {
            if (this.localViewerSwfInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("viewerSwfInfo cannot be null!!");
            }
            this.localViewerSwfInfo
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "viewerSwfInfo"),
                            xmlWriter);
        }
        if (this.localXmlInfoTracker) {
            if (this.localXmlInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("xmlInfo cannot be null!!");
            }
            this.localXmlInfo.serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "xmlInfo"),
                    xmlWriter);
        }
        if (this.localSvgInfoTracker) {
            if (this.localSvgInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("svgInfo cannot be null!!");
            }
            this.localSvgInfo.serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "svgInfo"),
                    xmlWriter);
        }
        if (this.localFxgInfoTracker) {
            if (this.localFxgInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("fxgInfo cannot be null!!");
            }
            this.localFxgInfo.serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "fxgInfo"),
                    xmlWriter);
        }
        if (this.localPdfSettingsInfoTracker) {
            if (this.localPdfSettingsInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("pdfSettingsInfo cannot be null!!");
            }
            this.localPdfSettingsInfo
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "pdfSettingsInfo"),
                            xmlWriter);
        }
        if (this.localZipInfoTracker) {
            if (this.localZipInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("zipInfo cannot be null!!");
            }
            this.localZipInfo.serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "zipInfo"),
                    xmlWriter);
        }
        if (this.localVideoInfoTracker) {
            if (this.localVideoInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("videoInfo cannot be null!!");
            }
            this.localVideoInfo.serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "videoInfo"),
                    xmlWriter);
        }
        if (this.localAcoInfoTracker) {
            if (this.localAcoInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("acoInfo cannot be null!!");
            }
            this.localAcoInfo.serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "acoInfo"),
                    xmlWriter);
        }
        if (this.localPdfInfoTracker) {
            if (this.localPdfInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("pdfInfo cannot be null!!");
            }
            this.localPdfInfo.serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "pdfInfo"),
                    xmlWriter);
        }
        if (this.localPsdInfoTracker) {
            if (this.localPsdInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("psdInfo cannot be null!!");
            }
            this.localPsdInfo.serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "psdInfo"),
                    xmlWriter);
        }
        if (this.localFlashInfoTracker) {
            if (this.localFlashInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("flashInfo cannot be null!!");
            }
            this.localFlashInfo.serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "flashInfo"),
                    xmlWriter);
        }
        if (this.localInDesignInfoTracker) {
            if (this.localInDesignInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("inDesignInfo cannot be null!!");
            }
            this.localInDesignInfo
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "inDesignInfo"),
                            xmlWriter);
        }
        if (this.localPostScriptInfoTracker) {
            if (this.localPostScriptInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("postScriptInfo cannot be null!!");
            }
            this.localPostScriptInfo
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "postScriptInfo"),
                            xmlWriter);
        }
        if (this.localIllustratorInfoTracker) {
            if (this.localIllustratorInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("illustratorInfo cannot be null!!");
            }
            this.localIllustratorInfo
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "illustratorInfo"),
                            xmlWriter);
        }
        if (this.localWordInfoTracker) {
            if (this.localWordInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("wordInfo cannot be null!!");
            }
            this.localWordInfo.serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "wordInfo"),
                    xmlWriter);
        }
        if (this.localExcelInfoTracker) {
            if (this.localExcelInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("excelInfo cannot be null!!");
            }
            this.localExcelInfo.serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "excelInfo"),
                    xmlWriter);
        }
        if (this.localPowerPointInfoTracker) {
            if (this.localPowerPointInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("powerPointInfo cannot be null!!");
            }
            this.localPowerPointInfo
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "powerPointInfo"),
                            xmlWriter);
        }
        if (this.localRtfInfoTracker) {
            if (this.localRtfInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("rtfInfo cannot be null!!");
            }
            this.localRtfInfo.serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "rtfInfo"),
                    xmlWriter);
        }
        if (this.localMaskInfoTracker) {
            if (this.localMaskInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("maskInfo cannot be null!!");
            }
            this.localMaskInfo.serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "maskInfo"),
                    xmlWriter);
        }
        if (this.localPremiereExpressRemixInfoTracker) {
            if (this.localPremiereExpressRemixInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("premiereExpressRemixInfo cannot be null!!");
            }
            this.localPremiereExpressRemixInfo.serialize(
                    new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "premiereExpressRemixInfo"),
                    xmlWriter);
        }
        if (this.localCuePointInfoTracker) {
            if (this.localCuePointInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("cuePointInfo cannot be null!!");
            }
            this.localCuePointInfo
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "cuePointInfo"),
                            xmlWriter);
        }
        if (this.localAudioInfoTracker) {
            if (this.localAudioInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("audioInfo cannot be null!!");
            }
            this.localAudioInfo.serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "audioInfo"),
                    xmlWriter);
        }
        if (this.localAssetSetInfoTracker) {
            if (this.localAssetSetInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("assetSetInfo cannot be null!!");
            }
            this.localAssetSetInfo
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "assetSetInfo"),
                            xmlWriter);
        }
        if (this.localMasterVideoInfoTracker) {
            if (this.localMasterVideoInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("masterVideoInfo cannot be null!!");
            }
            this.localMasterVideoInfo
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "masterVideoInfo"),
                            xmlWriter);
        }
        if (this.localAnimatedGifInfoTracker) {
            if (this.localAnimatedGifInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("animatedGifInfo cannot be null!!");
            }
            this.localAnimatedGifInfo
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "animatedGifInfo"),
                            xmlWriter);
        }
        if (this.localSwcInfoTracker) {
            if (this.localSwcInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("swcInfo cannot be null!!");
            }
            this.localSwcInfo.serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "swcInfo"),
                    xmlWriter);
        }
        if (this.localCssInfoTracker) {
            if (this.localCssInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("cssInfo cannot be null!!");
            }
            this.localCssInfo.serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "cssInfo"),
                    xmlWriter);
        }
        if (this.localJavascriptInfoTracker) {
            if (this.localJavascriptInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("javascriptInfo cannot be null!!");
            }
            this.localJavascriptInfo
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "javascriptInfo"),
                            xmlWriter);
        }
        if (this.localVideoCaptionInfoTracker) {
            if (this.localVideoCaptionInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("videoCaptionInfo cannot be null!!");
            }
            this.localVideoCaptionInfo
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "videoCaptionInfo"),
                            xmlWriter);
        }
        if (this.localPermissionsTracker) {
            if (this.localPermissions == null) {
                throw new org.apache.axis2.databinding.ADBException("permissions cannot be null!!");
            }
            this.localPermissions
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "permissions"),
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

        if (this.localAssetHandleTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "assetHandle"));

            if (this.localAssetHandle != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localAssetHandle));
            } else {
                throw new org.apache.axis2.databinding.ADBException("assetHandle cannot be null!!");
            }
        }
        if (this.localTypeTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "type"));

            if (this.localType != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localType));
            } else {
                throw new org.apache.axis2.databinding.ADBException("type cannot be null!!");
            }
        }
        if (this.localSubTypeTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "subType"));

            if (this.localSubType != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localSubType));
            } else {
                throw new org.apache.axis2.databinding.ADBException("subType cannot be null!!");
            }
        }
        if (this.localNameTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "name"));

            if (this.localName != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localName));
            } else {
                throw new org.apache.axis2.databinding.ADBException("name cannot be null!!");
            }
        }
        if (this.localFileNameTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "fileName"));

            if (this.localFileName != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localFileName));
            } else {
                throw new org.apache.axis2.databinding.ADBException("fileName cannot be null!!");
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
        if (this.localFolderHandleTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "folderHandle"));

            if (this.localFolderHandle != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localFolderHandle));
            } else {
                throw new org.apache.axis2.databinding.ADBException("folderHandle cannot be null!!");
            }
        }
        if (this.localReadyForPublishTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "readyForPublish"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localReadyForPublish));
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
        if (this.localProjectsTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "projects"));

            if (this.localProjects != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localProjects));
            } else {
                throw new org.apache.axis2.databinding.ADBException("projects cannot be null!!");
            }
        }
        if (this.localIpsImageUrlTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "ipsImageUrl"));

            if (this.localIpsImageUrl != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localIpsImageUrl));
            } else {
                throw new org.apache.axis2.databinding.ADBException("ipsImageUrl cannot be null!!");
            }
        }
        if (this.localCreatedTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "created"));

            if (this.localCreated != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localCreated));
            } else {
                throw new org.apache.axis2.databinding.ADBException("created cannot be null!!");
            }
        }
        if (this.localCreateUserTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "createUser"));

            if (this.localCreateUser != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localCreateUser));
            } else {
                throw new org.apache.axis2.databinding.ADBException("createUser cannot be null!!");
            }
        }
        if (this.localLastModifiedTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "lastModified"));

            if (this.localLastModified != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localLastModified));
            } else {
                throw new org.apache.axis2.databinding.ADBException("lastModified cannot be null!!");
            }
        }
        if (this.localLastModifyUserTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "lastModifyUser"));

            if (this.localLastModifyUser != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localLastModifyUser));
            } else {
                throw new org.apache.axis2.databinding.ADBException("lastModifyUser cannot be null!!");
            }
        }
        if (this.localMetadataArrayTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "metadataArray"));

            if (this.localMetadataArray == null) {
                throw new org.apache.axis2.databinding.ADBException("metadataArray cannot be null!!");
            }
            elementList.add(this.localMetadataArray);
        }
        if (this.localImageInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "imageInfo"));

            if (this.localImageInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("imageInfo cannot be null!!");
            }
            elementList.add(this.localImageInfo);
        }
        if (this.localLayerViewInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "layerViewInfo"));

            if (this.localLayerViewInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("layerViewInfo cannot be null!!");
            }
            elementList.add(this.localLayerViewInfo);
        }
        if (this.localTemplateInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "templateInfo"));

            if (this.localTemplateInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("templateInfo cannot be null!!");
            }
            elementList.add(this.localTemplateInfo);
        }
        if (this.localWatermarkInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "watermarkInfo"));

            if (this.localWatermarkInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("watermarkInfo cannot be null!!");
            }
            elementList.add(this.localWatermarkInfo);
        }
        if (this.localRenderSceneInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "renderSceneInfo"));

            if (this.localRenderSceneInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("renderSceneInfo cannot be null!!");
            }
            elementList.add(this.localRenderSceneInfo);
        }
        if (this.localVignetteInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "vignetteInfo"));

            if (this.localVignetteInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("vignetteInfo cannot be null!!");
            }
            elementList.add(this.localVignetteInfo);
        }
        if (this.localCabinetInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "cabinetInfo"));

            if (this.localCabinetInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("cabinetInfo cannot be null!!");
            }
            elementList.add(this.localCabinetInfo);
        }
        if (this.localWindowCoveringInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "windowCoveringInfo"));

            if (this.localWindowCoveringInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("windowCoveringInfo cannot be null!!");
            }
            elementList.add(this.localWindowCoveringInfo);
        }
        if (this.localIccProfileInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "iccProfileInfo"));

            if (this.localIccProfileInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("iccProfileInfo cannot be null!!");
            }
            elementList.add(this.localIccProfileInfo);
        }
        if (this.localFontInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "fontInfo"));

            if (this.localFontInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("fontInfo cannot be null!!");
            }
            elementList.add(this.localFontInfo);
        }
        if (this.localXslInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "xslInfo"));

            if (this.localXslInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("xslInfo cannot be null!!");
            }
            elementList.add(this.localXslInfo);
        }
        if (this.localViewerPresetInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "viewerPresetInfo"));

            if (this.localViewerPresetInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("viewerPresetInfo cannot be null!!");
            }
            elementList.add(this.localViewerPresetInfo);
        }
        if (this.localViewerSwfInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "viewerSwfInfo"));

            if (this.localViewerSwfInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("viewerSwfInfo cannot be null!!");
            }
            elementList.add(this.localViewerSwfInfo);
        }
        if (this.localXmlInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "xmlInfo"));

            if (this.localXmlInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("xmlInfo cannot be null!!");
            }
            elementList.add(this.localXmlInfo);
        }
        if (this.localSvgInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "svgInfo"));

            if (this.localSvgInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("svgInfo cannot be null!!");
            }
            elementList.add(this.localSvgInfo);
        }
        if (this.localFxgInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "fxgInfo"));

            if (this.localFxgInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("fxgInfo cannot be null!!");
            }
            elementList.add(this.localFxgInfo);
        }
        if (this.localPdfSettingsInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "pdfSettingsInfo"));

            if (this.localPdfSettingsInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("pdfSettingsInfo cannot be null!!");
            }
            elementList.add(this.localPdfSettingsInfo);
        }
        if (this.localZipInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "zipInfo"));

            if (this.localZipInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("zipInfo cannot be null!!");
            }
            elementList.add(this.localZipInfo);
        }
        if (this.localVideoInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "videoInfo"));

            if (this.localVideoInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("videoInfo cannot be null!!");
            }
            elementList.add(this.localVideoInfo);
        }
        if (this.localAcoInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "acoInfo"));

            if (this.localAcoInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("acoInfo cannot be null!!");
            }
            elementList.add(this.localAcoInfo);
        }
        if (this.localPdfInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "pdfInfo"));

            if (this.localPdfInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("pdfInfo cannot be null!!");
            }
            elementList.add(this.localPdfInfo);
        }
        if (this.localPsdInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "psdInfo"));

            if (this.localPsdInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("psdInfo cannot be null!!");
            }
            elementList.add(this.localPsdInfo);
        }
        if (this.localFlashInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "flashInfo"));

            if (this.localFlashInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("flashInfo cannot be null!!");
            }
            elementList.add(this.localFlashInfo);
        }
        if (this.localInDesignInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "inDesignInfo"));

            if (this.localInDesignInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("inDesignInfo cannot be null!!");
            }
            elementList.add(this.localInDesignInfo);
        }
        if (this.localPostScriptInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "postScriptInfo"));

            if (this.localPostScriptInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("postScriptInfo cannot be null!!");
            }
            elementList.add(this.localPostScriptInfo);
        }
        if (this.localIllustratorInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "illustratorInfo"));

            if (this.localIllustratorInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("illustratorInfo cannot be null!!");
            }
            elementList.add(this.localIllustratorInfo);
        }
        if (this.localWordInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "wordInfo"));

            if (this.localWordInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("wordInfo cannot be null!!");
            }
            elementList.add(this.localWordInfo);
        }
        if (this.localExcelInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "excelInfo"));

            if (this.localExcelInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("excelInfo cannot be null!!");
            }
            elementList.add(this.localExcelInfo);
        }
        if (this.localPowerPointInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "powerPointInfo"));

            if (this.localPowerPointInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("powerPointInfo cannot be null!!");
            }
            elementList.add(this.localPowerPointInfo);
        }
        if (this.localRtfInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "rtfInfo"));

            if (this.localRtfInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("rtfInfo cannot be null!!");
            }
            elementList.add(this.localRtfInfo);
        }
        if (this.localMaskInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "maskInfo"));

            if (this.localMaskInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("maskInfo cannot be null!!");
            }
            elementList.add(this.localMaskInfo);
        }
        if (this.localPremiereExpressRemixInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "premiereExpressRemixInfo"));

            if (this.localPremiereExpressRemixInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("premiereExpressRemixInfo cannot be null!!");
            }
            elementList.add(this.localPremiereExpressRemixInfo);
        }
        if (this.localCuePointInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "cuePointInfo"));

            if (this.localCuePointInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("cuePointInfo cannot be null!!");
            }
            elementList.add(this.localCuePointInfo);
        }
        if (this.localAudioInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "audioInfo"));

            if (this.localAudioInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("audioInfo cannot be null!!");
            }
            elementList.add(this.localAudioInfo);
        }
        if (this.localAssetSetInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "assetSetInfo"));

            if (this.localAssetSetInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("assetSetInfo cannot be null!!");
            }
            elementList.add(this.localAssetSetInfo);
        }
        if (this.localMasterVideoInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "masterVideoInfo"));

            if (this.localMasterVideoInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("masterVideoInfo cannot be null!!");
            }
            elementList.add(this.localMasterVideoInfo);
        }
        if (this.localAnimatedGifInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "animatedGifInfo"));

            if (this.localAnimatedGifInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("animatedGifInfo cannot be null!!");
            }
            elementList.add(this.localAnimatedGifInfo);
        }
        if (this.localSwcInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "swcInfo"));

            if (this.localSwcInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("swcInfo cannot be null!!");
            }
            elementList.add(this.localSwcInfo);
        }
        if (this.localCssInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "cssInfo"));

            if (this.localCssInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("cssInfo cannot be null!!");
            }
            elementList.add(this.localCssInfo);
        }
        if (this.localJavascriptInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "javascriptInfo"));

            if (this.localJavascriptInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("javascriptInfo cannot be null!!");
            }
            elementList.add(this.localJavascriptInfo);
        }
        if (this.localVideoCaptionInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "videoCaptionInfo"));

            if (this.localVideoCaptionInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("videoCaptionInfo cannot be null!!");
            }
            elementList.add(this.localVideoCaptionInfo);
        }
        if (this.localPermissionsTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "permissions"));

            if (this.localPermissions == null) {
                throw new org.apache.axis2.databinding.ADBException("permissions cannot be null!!");
            }
            elementList.add(this.localPermissions);
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
        public static Asset parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            Asset object =
                    new Asset();

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

                        if (!"Asset".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (Asset) com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExtensionMapper.getTypeObject(
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
                        "assetHandle").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "assetHandle" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setAssetHandle(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "type")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "type" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setType(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "subType")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "subType" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSubType(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "name")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "name" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setName(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "fileName")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "fileName" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFileName(
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
                        "folderHandle").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "folderHandle" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFolderHandle(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "readyForPublish").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "readyForPublish" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setReadyForPublish(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "projects")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "projects" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setProjects(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "ipsImageUrl").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "ipsImageUrl" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setIpsImageUrl(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "created")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "created" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCreated(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "createUser").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "createUser" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCreateUser(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "lastModified").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "lastModified" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setLastModified(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "lastModifyUser").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "lastModifyUser" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setLastModifyUser(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "metadataArray").equals(reader.getName())) {

                    object.setMetadataArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.MetadataArray.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "imageInfo").equals(reader.getName())) {

                    object.setImageInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.ImageInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "layerViewInfo").equals(reader.getName())) {

                    object.setLayerViewInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.LayerViewInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "templateInfo").equals(reader.getName())) {

                    object.setTemplateInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.TemplateInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "watermarkInfo").equals(reader.getName())) {

                    object.setWatermarkInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.WatermarkInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "renderSceneInfo").equals(reader.getName())) {

                    object.setRenderSceneInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.RenderSceneInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "vignetteInfo").equals(reader.getName())) {

                    object.setVignetteInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.VignetteInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "cabinetInfo").equals(reader.getName())) {

                    object.setCabinetInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.CabinetInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "windowCoveringInfo").equals(reader.getName())) {

                    object.setWindowCoveringInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.WindowCoveringInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "iccProfileInfo").equals(reader.getName())) {

                    object.setIccProfileInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.IccProfileInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "fontInfo")
                        .equals(reader.getName())) {

                    object.setFontInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.FontInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "xslInfo")
                        .equals(reader.getName())) {

                    object.setXslInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.XslInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "viewerPresetInfo").equals(reader.getName())) {

                    object.setViewerPresetInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.ViewerPresetInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "viewerSwfInfo").equals(reader.getName())) {

                    object.setViewerSwfInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.ViewerSwfInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "xmlInfo")
                        .equals(reader.getName())) {

                    object.setXmlInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.XmlInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "svgInfo")
                        .equals(reader.getName())) {

                    object.setSvgInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.SvgInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "fxgInfo")
                        .equals(reader.getName())) {

                    object.setFxgInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.FxgInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "pdfSettingsInfo").equals(reader.getName())) {

                    object.setPdfSettingsInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.PdfSettingsInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "zipInfo")
                        .equals(reader.getName())) {

                    object.setZipInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.ZipInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "videoInfo").equals(reader.getName())) {

                    object.setVideoInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.VideoInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "acoInfo")
                        .equals(reader.getName())) {

                    object.setAcoInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.AcoInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "pdfInfo")
                        .equals(reader.getName())) {

                    object.setPdfInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.PdfInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "psdInfo")
                        .equals(reader.getName())) {

                    object.setPsdInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.PsdInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "flashInfo").equals(reader.getName())) {

                    object.setFlashInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.FlashInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "inDesignInfo").equals(reader.getName())) {

                    object.setInDesignInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.InDesignInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "postScriptInfo").equals(reader.getName())) {

                    object.setPostScriptInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.PostScriptInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "illustratorInfo").equals(reader.getName())) {

                    object.setIllustratorInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.IllustratorInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "wordInfo")
                        .equals(reader.getName())) {

                    object.setWordInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.WordInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "excelInfo").equals(reader.getName())) {

                    object.setExcelInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExcelInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "powerPointInfo").equals(reader.getName())) {

                    object.setPowerPointInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.PowerPointInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "rtfInfo")
                        .equals(reader.getName())) {

                    object.setRtfInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.RTFInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "maskInfo")
                        .equals(reader.getName())) {

                    object.setMaskInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.MaskInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "premiereExpressRemixInfo").equals(reader.getName())) {

                    object.setPremiereExpressRemixInfo(
                            com.scene7.www.ipsapi.xsd._2016_01_14_beta.PremiereExpressRemixInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "cuePointInfo").equals(reader.getName())) {

                    object.setCuePointInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.CuePointInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "audioInfo").equals(reader.getName())) {

                    object.setAudioInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.AudioInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "assetSetInfo").equals(reader.getName())) {

                    object.setAssetSetInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.AssetSetInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "masterVideoInfo").equals(reader.getName())) {

                    object.setMasterVideoInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.MasterVideoInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "animatedGifInfo").equals(reader.getName())) {

                    object.setAnimatedGifInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.AnimatedGifInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "swcInfo")
                        .equals(reader.getName())) {

                    object.setSwcInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.SwcInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "cssInfo")
                        .equals(reader.getName())) {

                    object.setCssInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.CssInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "javascriptInfo").equals(reader.getName())) {

                    object.setJavascriptInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.JavascriptInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "videoCaptionInfo").equals(reader.getName())) {

                    object.setVideoCaptionInfo(com.scene7.www.ipsapi.xsd._2016_01_14_beta.VideoCaptionInfo.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "permissions").equals(reader.getName())) {

                    object.setPermissions(com.scene7.www.ipsapi.xsd._2016_01_14_beta.PermissionArray.Factory.parse(reader));

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
           
    