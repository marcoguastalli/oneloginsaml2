/**
 * UploadPostJob.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.scene7.www.ipsapi.xsd._2016_01_14_beta;

/**
 *  UploadPostJob bean class
 */
@SuppressWarnings({ "unchecked", "unused" })

public class UploadPostJob
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = UploadPostJob
                Namespace URI = http://www.scene7.com/IpsApi/xsd/2016-01-14-beta
                Namespace Prefix = ns1
                */

    /**
     * field for Overwrite
     */

    protected boolean localOverwrite;
    /**
     * field for ReadyForPublish
     */

    protected boolean localReadyForPublish;
    /**
     * field for PreservePublishState
     */

    protected boolean localPreservePublishState;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localPreservePublishStateTracker = false;
    /**
     * field for CreateMask
     */

    protected boolean localCreateMask;
    /**
     * field for PreserveCrop
     */

    protected boolean localPreserveCrop;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localPreserveCropTracker = false;
    /**
     * field for KnockoutBackgroundOptions
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.KnockoutBackgroundOptions localKnockoutBackgroundOptions;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localKnockoutBackgroundOptionsTracker = false;
    /**
     * field for ManualCropOptions
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.ManualCropOptions localManualCropOptions;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localManualCropOptionsTracker = false;
    /**
     * field for AutoColorCropOptions
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.AutoColorCropOptions localAutoColorCropOptions;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localAutoColorCropOptionsTracker = false;
    /**
     * field for AutoTransparentCropOptions
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.AutoTransparentCropOptions localAutoTransparentCropOptions;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localAutoTransparentCropOptionsTracker = false;
    /**
     * field for PhotoshopOptions
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.PhotoshopOptions localPhotoshopOptions;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localPhotoshopOptionsTracker = false;
    /**
     * field for PostScriptOptions
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.PostScriptOptions localPostScriptOptions;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localPostScriptOptionsTracker = false;
    /**
     * field for PdfOptions
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.PDFOptions localPdfOptions;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localPdfOptionsTracker = false;
    /**
     * field for IllustratorOptions
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.IllustratorOptions localIllustratorOptions;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localIllustratorOptionsTracker = false;
    /**
     * field for ColorManagementOptions
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.ColorManagementOptions localColorManagementOptions;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localColorManagementOptionsTracker = false;
    /**
     * field for AutoSetCreationOptions
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.AutoSetCreationOptions localAutoSetCreationOptions;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localAutoSetCreationOptionsTracker = false;
    /**
     * field for ProjectHandleArray
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.HandleArray localProjectHandleArray;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localProjectHandleArrayTracker = false;
    /**
     * field for EmailSetting
     */

    protected java.lang.String localEmailSetting;
    /**
     * field for PostHttpUrl
     */

    protected java.lang.String localPostHttpUrl;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localPostHttpUrlTracker = false;
    /**
     * field for MediaOptions
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.MediaOptions localMediaOptions;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localMediaOptionsTracker = false;
    /**
     * field for InDesignOptions
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.InDesignOptions localInDesignOptions;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localInDesignOptionsTracker = false;
    /**
     * field for XmpKeywords
     */

    protected java.lang.String localXmpKeywords;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localXmpKeywordsTracker = false;
    /**
     * field for UnsharpMaskOptions
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.UnsharpMaskOptions localUnsharpMaskOptions;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localUnsharpMaskOptionsTracker = false;
    /**
     * field for UnCompressOptions
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.UnCompressOptions localUnCompressOptions;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localUnCompressOptionsTracker = false;
    /**
     * field for ExcludeMasterVideoFromAVS
     */

    protected boolean localExcludeMasterVideoFromAVS;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localExcludeMasterVideoFromAVSTracker = false;

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta")) {
            return "ns1";
        }
        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getOverwrite() {
        return localOverwrite;
    }

    /**
     * Auto generated setter method
     * @param param Overwrite
     */
    public void setOverwrite(boolean param) {

        this.localOverwrite = param;

    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getReadyForPublish() {
        return localReadyForPublish;
    }

    /**
     * Auto generated setter method
     * @param param ReadyForPublish
     */
    public void setReadyForPublish(boolean param) {

        this.localReadyForPublish = param;

    }

    public boolean isPreservePublishStateSpecified() {
        return localPreservePublishStateTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getPreservePublishState() {
        return localPreservePublishState;
    }

    /**
     * Auto generated setter method
     * @param param PreservePublishState
     */
    public void setPreservePublishState(boolean param) {

        // setting primitive attribute tracker to true
        localPreservePublishStateTracker =
                true;

        this.localPreservePublishState = param;

    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getCreateMask() {
        return localCreateMask;
    }

    /**
     * Auto generated setter method
     * @param param CreateMask
     */
    public void setCreateMask(boolean param) {

        this.localCreateMask = param;

    }

    public boolean isPreserveCropSpecified() {
        return localPreserveCropTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getPreserveCrop() {
        return localPreserveCrop;
    }

    /**
     * Auto generated setter method
     * @param param PreserveCrop
     */
    public void setPreserveCrop(boolean param) {

        // setting primitive attribute tracker to true
        localPreserveCropTracker =
                true;

        this.localPreserveCrop = param;

    }

    public boolean isKnockoutBackgroundOptionsSpecified() {
        return localKnockoutBackgroundOptionsTracker;
    }

    /**
     * Auto generated getter method
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.KnockoutBackgroundOptions
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.KnockoutBackgroundOptions getKnockoutBackgroundOptions() {
        return localKnockoutBackgroundOptions;
    }

    /**
     * Auto generated setter method
     * @param param KnockoutBackgroundOptions
     */
    public void setKnockoutBackgroundOptions(com.scene7.www.ipsapi.xsd._2016_01_14_beta.KnockoutBackgroundOptions param) {
        localKnockoutBackgroundOptionsTracker = param != null;

        this.localKnockoutBackgroundOptions = param;

    }

    public boolean isManualCropOptionsSpecified() {
        return localManualCropOptionsTracker;
    }

    /**
     * Auto generated getter method
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.ManualCropOptions
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.ManualCropOptions getManualCropOptions() {
        return localManualCropOptions;
    }

    /**
     * Auto generated setter method
     * @param param ManualCropOptions
     */
    public void setManualCropOptions(com.scene7.www.ipsapi.xsd._2016_01_14_beta.ManualCropOptions param) {
        localManualCropOptionsTracker = param != null;

        this.localManualCropOptions = param;

    }

    public boolean isAutoColorCropOptionsSpecified() {
        return localAutoColorCropOptionsTracker;
    }

    /**
     * Auto generated getter method
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.AutoColorCropOptions
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.AutoColorCropOptions getAutoColorCropOptions() {
        return localAutoColorCropOptions;
    }

    /**
     * Auto generated setter method
     * @param param AutoColorCropOptions
     */
    public void setAutoColorCropOptions(com.scene7.www.ipsapi.xsd._2016_01_14_beta.AutoColorCropOptions param) {
        localAutoColorCropOptionsTracker = param != null;

        this.localAutoColorCropOptions = param;

    }

    public boolean isAutoTransparentCropOptionsSpecified() {
        return localAutoTransparentCropOptionsTracker;
    }

    /**
     * Auto generated getter method
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.AutoTransparentCropOptions
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.AutoTransparentCropOptions getAutoTransparentCropOptions() {
        return localAutoTransparentCropOptions;
    }

    /**
     * Auto generated setter method
     * @param param AutoTransparentCropOptions
     */
    public void setAutoTransparentCropOptions(com.scene7.www.ipsapi.xsd._2016_01_14_beta.AutoTransparentCropOptions param) {
        localAutoTransparentCropOptionsTracker = param != null;

        this.localAutoTransparentCropOptions = param;

    }

    public boolean isPhotoshopOptionsSpecified() {
        return localPhotoshopOptionsTracker;
    }

    /**
     * Auto generated getter method
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.PhotoshopOptions
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.PhotoshopOptions getPhotoshopOptions() {
        return localPhotoshopOptions;
    }

    /**
     * Auto generated setter method
     * @param param PhotoshopOptions
     */
    public void setPhotoshopOptions(com.scene7.www.ipsapi.xsd._2016_01_14_beta.PhotoshopOptions param) {
        localPhotoshopOptionsTracker = param != null;

        this.localPhotoshopOptions = param;

    }

    public boolean isPostScriptOptionsSpecified() {
        return localPostScriptOptionsTracker;
    }

    /**
     * Auto generated getter method
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.PostScriptOptions
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.PostScriptOptions getPostScriptOptions() {
        return localPostScriptOptions;
    }

    /**
     * Auto generated setter method
     * @param param PostScriptOptions
     */
    public void setPostScriptOptions(com.scene7.www.ipsapi.xsd._2016_01_14_beta.PostScriptOptions param) {
        localPostScriptOptionsTracker = param != null;

        this.localPostScriptOptions = param;

    }

    public boolean isPdfOptionsSpecified() {
        return localPdfOptionsTracker;
    }

    /**
     * Auto generated getter method
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.PDFOptions
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.PDFOptions getPdfOptions() {
        return localPdfOptions;
    }

    /**
     * Auto generated setter method
     * @param param PdfOptions
     */
    public void setPdfOptions(com.scene7.www.ipsapi.xsd._2016_01_14_beta.PDFOptions param) {
        localPdfOptionsTracker = param != null;

        this.localPdfOptions = param;

    }

    public boolean isIllustratorOptionsSpecified() {
        return localIllustratorOptionsTracker;
    }

    /**
     * Auto generated getter method
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.IllustratorOptions
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.IllustratorOptions getIllustratorOptions() {
        return localIllustratorOptions;
    }

    /**
     * Auto generated setter method
     * @param param IllustratorOptions
     */
    public void setIllustratorOptions(com.scene7.www.ipsapi.xsd._2016_01_14_beta.IllustratorOptions param) {
        localIllustratorOptionsTracker = param != null;

        this.localIllustratorOptions = param;

    }

    public boolean isColorManagementOptionsSpecified() {
        return localColorManagementOptionsTracker;
    }

    /**
     * Auto generated getter method
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.ColorManagementOptions
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.ColorManagementOptions getColorManagementOptions() {
        return localColorManagementOptions;
    }

    /**
     * Auto generated setter method
     * @param param ColorManagementOptions
     */
    public void setColorManagementOptions(com.scene7.www.ipsapi.xsd._2016_01_14_beta.ColorManagementOptions param) {
        localColorManagementOptionsTracker = param != null;

        this.localColorManagementOptions = param;

    }

    public boolean isAutoSetCreationOptionsSpecified() {
        return localAutoSetCreationOptionsTracker;
    }

    /**
     * Auto generated getter method
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.AutoSetCreationOptions
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.AutoSetCreationOptions getAutoSetCreationOptions() {
        return localAutoSetCreationOptions;
    }

    /**
     * Auto generated setter method
     * @param param AutoSetCreationOptions
     */
    public void setAutoSetCreationOptions(com.scene7.www.ipsapi.xsd._2016_01_14_beta.AutoSetCreationOptions param) {
        localAutoSetCreationOptionsTracker = param != null;

        this.localAutoSetCreationOptions = param;

    }

    public boolean isProjectHandleArraySpecified() {
        return localProjectHandleArrayTracker;
    }

    /**
     * Auto generated getter method
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.HandleArray
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.HandleArray getProjectHandleArray() {
        return localProjectHandleArray;
    }

    /**
     * Auto generated setter method
     * @param param ProjectHandleArray
     */
    public void setProjectHandleArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.HandleArray param) {
        localProjectHandleArrayTracker = param != null;

        this.localProjectHandleArray = param;

    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEmailSetting() {
        return localEmailSetting;
    }

    /**
     * Auto generated setter method
     * @param param EmailSetting
     */
    public void setEmailSetting(java.lang.String param) {

        this.localEmailSetting = param;

    }

    public boolean isPostHttpUrlSpecified() {
        return localPostHttpUrlTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPostHttpUrl() {
        return localPostHttpUrl;
    }

    /**
     * Auto generated setter method
     * @param param PostHttpUrl
     */
    public void setPostHttpUrl(java.lang.String param) {
        localPostHttpUrlTracker = param != null;

        this.localPostHttpUrl = param;

    }

    public boolean isMediaOptionsSpecified() {
        return localMediaOptionsTracker;
    }

    /**
     * Auto generated getter method
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.MediaOptions
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.MediaOptions getMediaOptions() {
        return localMediaOptions;
    }

    /**
     * Auto generated setter method
     * @param param MediaOptions
     */
    public void setMediaOptions(com.scene7.www.ipsapi.xsd._2016_01_14_beta.MediaOptions param) {
        localMediaOptionsTracker = param != null;

        this.localMediaOptions = param;

    }

    public boolean isInDesignOptionsSpecified() {
        return localInDesignOptionsTracker;
    }

    /**
     * Auto generated getter method
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.InDesignOptions
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.InDesignOptions getInDesignOptions() {
        return localInDesignOptions;
    }

    /**
     * Auto generated setter method
     * @param param InDesignOptions
     */
    public void setInDesignOptions(com.scene7.www.ipsapi.xsd._2016_01_14_beta.InDesignOptions param) {
        localInDesignOptionsTracker = param != null;

        this.localInDesignOptions = param;

    }

    public boolean isXmpKeywordsSpecified() {
        return localXmpKeywordsTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getXmpKeywords() {
        return localXmpKeywords;
    }

    /**
     * Auto generated setter method
     * @param param XmpKeywords
     */
    public void setXmpKeywords(java.lang.String param) {
        localXmpKeywordsTracker = param != null;

        this.localXmpKeywords = param;

    }

    public boolean isUnsharpMaskOptionsSpecified() {
        return localUnsharpMaskOptionsTracker;
    }

    /**
     * Auto generated getter method
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.UnsharpMaskOptions
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.UnsharpMaskOptions getUnsharpMaskOptions() {
        return localUnsharpMaskOptions;
    }

    /**
     * Auto generated setter method
     * @param param UnsharpMaskOptions
     */
    public void setUnsharpMaskOptions(com.scene7.www.ipsapi.xsd._2016_01_14_beta.UnsharpMaskOptions param) {
        localUnsharpMaskOptionsTracker = param != null;

        this.localUnsharpMaskOptions = param;

    }

    public boolean isUnCompressOptionsSpecified() {
        return localUnCompressOptionsTracker;
    }

    /**
     * Auto generated getter method
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.UnCompressOptions
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.UnCompressOptions getUnCompressOptions() {
        return localUnCompressOptions;
    }

    /**
     * Auto generated setter method
     * @param param UnCompressOptions
     */
    public void setUnCompressOptions(com.scene7.www.ipsapi.xsd._2016_01_14_beta.UnCompressOptions param) {
        localUnCompressOptionsTracker = param != null;

        this.localUnCompressOptions = param;

    }

    public boolean isExcludeMasterVideoFromAVSSpecified() {
        return localExcludeMasterVideoFromAVSTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getExcludeMasterVideoFromAVS() {
        return localExcludeMasterVideoFromAVS;
    }

    /**
     * Auto generated setter method
     * @param param ExcludeMasterVideoFromAVS
     */
    public void setExcludeMasterVideoFromAVS(boolean param) {

        // setting primitive attribute tracker to true
        localExcludeMasterVideoFromAVSTracker =
                true;

        this.localExcludeMasterVideoFromAVS = param;

    }

    /**
     *
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
                        namespacePrefix + ":UploadPostJob",
                        xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "UploadPostJob",
                        xmlWriter);
            }

        }

        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "overwrite", xmlWriter);

        if (false) {

            throw new org.apache.axis2.databinding.ADBException("overwrite cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOverwrite));
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "readyForPublish", xmlWriter);

        if (false) {

            throw new org.apache.axis2.databinding.ADBException("readyForPublish cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReadyForPublish));
        }

        xmlWriter.writeEndElement();
        if (localPreservePublishStateTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "preservePublishState", xmlWriter);

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("preservePublishState cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPreservePublishState));
            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "createMask", xmlWriter);

        if (false) {

            throw new org.apache.axis2.databinding.ADBException("createMask cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreateMask));
        }

        xmlWriter.writeEndElement();
        if (localPreserveCropTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "preserveCrop", xmlWriter);

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("preserveCrop cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPreserveCrop));
            }

            xmlWriter.writeEndElement();
        }
        if (localKnockoutBackgroundOptionsTracker) {
            if (localKnockoutBackgroundOptions == null) {
                throw new org.apache.axis2.databinding.ADBException("knockoutBackgroundOptions cannot be null!!");
            }
            localKnockoutBackgroundOptions.serialize(
                    new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "knockoutBackgroundOptions"),
                    xmlWriter);
        }
        if (localManualCropOptionsTracker) {
            if (localManualCropOptions == null) {
                throw new org.apache.axis2.databinding.ADBException("manualCropOptions cannot be null!!");
            }
            localManualCropOptions
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "manualCropOptions"),
                            xmlWriter);
        }
        if (localAutoColorCropOptionsTracker) {
            if (localAutoColorCropOptions == null) {
                throw new org.apache.axis2.databinding.ADBException("autoColorCropOptions cannot be null!!");
            }
            localAutoColorCropOptions
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "autoColorCropOptions"),
                            xmlWriter);
        }
        if (localAutoTransparentCropOptionsTracker) {
            if (localAutoTransparentCropOptions == null) {
                throw new org.apache.axis2.databinding.ADBException("autoTransparentCropOptions cannot be null!!");
            }
            localAutoTransparentCropOptions.serialize(
                    new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "autoTransparentCropOptions"),
                    xmlWriter);
        }
        if (localPhotoshopOptionsTracker) {
            if (localPhotoshopOptions == null) {
                throw new org.apache.axis2.databinding.ADBException("photoshopOptions cannot be null!!");
            }
            localPhotoshopOptions
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "photoshopOptions"),
                            xmlWriter);
        }
        if (localPostScriptOptionsTracker) {
            if (localPostScriptOptions == null) {
                throw new org.apache.axis2.databinding.ADBException("postScriptOptions cannot be null!!");
            }
            localPostScriptOptions
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "postScriptOptions"),
                            xmlWriter);
        }
        if (localPdfOptionsTracker) {
            if (localPdfOptions == null) {
                throw new org.apache.axis2.databinding.ADBException("pdfOptions cannot be null!!");
            }
            localPdfOptions.serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "pdfOptions"),
                    xmlWriter);
        }
        if (localIllustratorOptionsTracker) {
            if (localIllustratorOptions == null) {
                throw new org.apache.axis2.databinding.ADBException("illustratorOptions cannot be null!!");
            }
            localIllustratorOptions
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "illustratorOptions"),
                            xmlWriter);
        }
        if (localColorManagementOptionsTracker) {
            if (localColorManagementOptions == null) {
                throw new org.apache.axis2.databinding.ADBException("colorManagementOptions cannot be null!!");
            }
            localColorManagementOptions
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "colorManagementOptions"),
                            xmlWriter);
        }
        if (localAutoSetCreationOptionsTracker) {
            if (localAutoSetCreationOptions == null) {
                throw new org.apache.axis2.databinding.ADBException("autoSetCreationOptions cannot be null!!");
            }
            localAutoSetCreationOptions
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "autoSetCreationOptions"),
                            xmlWriter);
        }
        if (localProjectHandleArrayTracker) {
            if (localProjectHandleArray == null) {
                throw new org.apache.axis2.databinding.ADBException("projectHandleArray cannot be null!!");
            }
            localProjectHandleArray
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "projectHandleArray"),
                            xmlWriter);
        }
        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "emailSetting", xmlWriter);

        if (localEmailSetting == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("emailSetting cannot be null!!");

        } else {

            xmlWriter.writeCharacters(localEmailSetting);

        }

        xmlWriter.writeEndElement();
        if (localPostHttpUrlTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "postHttpUrl", xmlWriter);

            if (localPostHttpUrl == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("postHttpUrl cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localPostHttpUrl);

            }

            xmlWriter.writeEndElement();
        }
        if (localMediaOptionsTracker) {
            if (localMediaOptions == null) {
                throw new org.apache.axis2.databinding.ADBException("mediaOptions cannot be null!!");
            }
            localMediaOptions.serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "mediaOptions"),
                    xmlWriter);
        }
        if (localInDesignOptionsTracker) {
            if (localInDesignOptions == null) {
                throw new org.apache.axis2.databinding.ADBException("inDesignOptions cannot be null!!");
            }
            localInDesignOptions
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "inDesignOptions"),
                            xmlWriter);
        }
        if (localXmpKeywordsTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "xmpKeywords", xmlWriter);

            if (localXmpKeywords == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("xmpKeywords cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localXmpKeywords);

            }

            xmlWriter.writeEndElement();
        }
        if (localUnsharpMaskOptionsTracker) {
            if (localUnsharpMaskOptions == null) {
                throw new org.apache.axis2.databinding.ADBException("unsharpMaskOptions cannot be null!!");
            }
            localUnsharpMaskOptions
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "unsharpMaskOptions"),
                            xmlWriter);
        }
        if (localUnCompressOptionsTracker) {
            if (localUnCompressOptions == null) {
                throw new org.apache.axis2.databinding.ADBException("unCompressOptions cannot be null!!");
            }
            localUnCompressOptions
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "unCompressOptions"),
                            xmlWriter);
        }
        if (localExcludeMasterVideoFromAVSTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "excludeMasterVideoFromAVS", xmlWriter);

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("excludeMasterVideoFromAVS cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExcludeMasterVideoFromAVS));
            }

            xmlWriter.writeEndElement();
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
     *  method to handle Qnames
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
     *
     */
    public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException {

        java.util.ArrayList elementList = new java.util.ArrayList();
        java.util.ArrayList attribList = new java.util.ArrayList();

        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "overwrite"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOverwrite));

        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "readyForPublish"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReadyForPublish));
        if (localPreservePublishStateTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "preservePublishState"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPreservePublishState));
        }
        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "createMask"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreateMask));
        if (localPreserveCropTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "preserveCrop"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPreserveCrop));
        }
        if (localKnockoutBackgroundOptionsTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "knockoutBackgroundOptions"));

            if (localKnockoutBackgroundOptions == null) {
                throw new org.apache.axis2.databinding.ADBException("knockoutBackgroundOptions cannot be null!!");
            }
            elementList.add(localKnockoutBackgroundOptions);
        }
        if (localManualCropOptionsTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "manualCropOptions"));

            if (localManualCropOptions == null) {
                throw new org.apache.axis2.databinding.ADBException("manualCropOptions cannot be null!!");
            }
            elementList.add(localManualCropOptions);
        }
        if (localAutoColorCropOptionsTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "autoColorCropOptions"));

            if (localAutoColorCropOptions == null) {
                throw new org.apache.axis2.databinding.ADBException("autoColorCropOptions cannot be null!!");
            }
            elementList.add(localAutoColorCropOptions);
        }
        if (localAutoTransparentCropOptionsTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "autoTransparentCropOptions"));

            if (localAutoTransparentCropOptions == null) {
                throw new org.apache.axis2.databinding.ADBException("autoTransparentCropOptions cannot be null!!");
            }
            elementList.add(localAutoTransparentCropOptions);
        }
        if (localPhotoshopOptionsTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "photoshopOptions"));

            if (localPhotoshopOptions == null) {
                throw new org.apache.axis2.databinding.ADBException("photoshopOptions cannot be null!!");
            }
            elementList.add(localPhotoshopOptions);
        }
        if (localPostScriptOptionsTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "postScriptOptions"));

            if (localPostScriptOptions == null) {
                throw new org.apache.axis2.databinding.ADBException("postScriptOptions cannot be null!!");
            }
            elementList.add(localPostScriptOptions);
        }
        if (localPdfOptionsTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "pdfOptions"));

            if (localPdfOptions == null) {
                throw new org.apache.axis2.databinding.ADBException("pdfOptions cannot be null!!");
            }
            elementList.add(localPdfOptions);
        }
        if (localIllustratorOptionsTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "illustratorOptions"));

            if (localIllustratorOptions == null) {
                throw new org.apache.axis2.databinding.ADBException("illustratorOptions cannot be null!!");
            }
            elementList.add(localIllustratorOptions);
        }
        if (localColorManagementOptionsTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "colorManagementOptions"));

            if (localColorManagementOptions == null) {
                throw new org.apache.axis2.databinding.ADBException("colorManagementOptions cannot be null!!");
            }
            elementList.add(localColorManagementOptions);
        }
        if (localAutoSetCreationOptionsTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "autoSetCreationOptions"));

            if (localAutoSetCreationOptions == null) {
                throw new org.apache.axis2.databinding.ADBException("autoSetCreationOptions cannot be null!!");
            }
            elementList.add(localAutoSetCreationOptions);
        }
        if (localProjectHandleArrayTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "projectHandleArray"));

            if (localProjectHandleArray == null) {
                throw new org.apache.axis2.databinding.ADBException("projectHandleArray cannot be null!!");
            }
            elementList.add(localProjectHandleArray);
        }
        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "emailSetting"));

        if (localEmailSetting != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmailSetting));
        } else {
            throw new org.apache.axis2.databinding.ADBException("emailSetting cannot be null!!");
        }
        if (localPostHttpUrlTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "postHttpUrl"));

            if (localPostHttpUrl != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPostHttpUrl));
            } else {
                throw new org.apache.axis2.databinding.ADBException("postHttpUrl cannot be null!!");
            }
        }
        if (localMediaOptionsTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "mediaOptions"));

            if (localMediaOptions == null) {
                throw new org.apache.axis2.databinding.ADBException("mediaOptions cannot be null!!");
            }
            elementList.add(localMediaOptions);
        }
        if (localInDesignOptionsTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "inDesignOptions"));

            if (localInDesignOptions == null) {
                throw new org.apache.axis2.databinding.ADBException("inDesignOptions cannot be null!!");
            }
            elementList.add(localInDesignOptions);
        }
        if (localXmpKeywordsTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "xmpKeywords"));

            if (localXmpKeywords != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localXmpKeywords));
            } else {
                throw new org.apache.axis2.databinding.ADBException("xmpKeywords cannot be null!!");
            }
        }
        if (localUnsharpMaskOptionsTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "unsharpMaskOptions"));

            if (localUnsharpMaskOptions == null) {
                throw new org.apache.axis2.databinding.ADBException("unsharpMaskOptions cannot be null!!");
            }
            elementList.add(localUnsharpMaskOptions);
        }
        if (localUnCompressOptionsTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "unCompressOptions"));

            if (localUnCompressOptions == null) {
                throw new org.apache.axis2.databinding.ADBException("unCompressOptions cannot be null!!");
            }
            elementList.add(localUnCompressOptions);
        }
        if (localExcludeMasterVideoFromAVSTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "excludeMasterVideoFromAVS"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExcludeMasterVideoFromAVS));
        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());

    }

    /**
     *  Factory class that keeps the parse method
     */
    public static class Factory {

        /**
         * static method to create the object
         * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
         *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
         * Postcondition: If this object is an element, the reader is positioned at its end element
         *                If this object is a complex type, the reader is positioned at the end element of its outer element
         */
        public static UploadPostJob parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            UploadPostJob object =
                    new UploadPostJob();

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

                        if (!"UploadPostJob".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (UploadPostJob) com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExtensionMapper.getTypeObject(
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
                        "overwrite").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "overwrite" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setOverwrite(
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
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "preservePublishState").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "preservePublishState" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPreservePublishState(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "createMask").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "createMask" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCreateMask(
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
                        "preserveCrop").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "preserveCrop" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPreserveCrop(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "knockoutBackgroundOptions").equals(reader.getName())) {

                    object.setKnockoutBackgroundOptions(
                            com.scene7.www.ipsapi.xsd._2016_01_14_beta.KnockoutBackgroundOptions.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "manualCropOptions").equals(reader.getName())) {

                    object.setManualCropOptions(com.scene7.www.ipsapi.xsd._2016_01_14_beta.ManualCropOptions.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "autoColorCropOptions").equals(reader.getName())) {

                    object.setAutoColorCropOptions(com.scene7.www.ipsapi.xsd._2016_01_14_beta.AutoColorCropOptions.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "autoTransparentCropOptions").equals(reader.getName())) {

                    object.setAutoTransparentCropOptions(
                            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AutoTransparentCropOptions.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "photoshopOptions").equals(reader.getName())) {

                    object.setPhotoshopOptions(com.scene7.www.ipsapi.xsd._2016_01_14_beta.PhotoshopOptions.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "postScriptOptions").equals(reader.getName())) {

                    object.setPostScriptOptions(com.scene7.www.ipsapi.xsd._2016_01_14_beta.PostScriptOptions.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "pdfOptions").equals(reader.getName())) {

                    object.setPdfOptions(com.scene7.www.ipsapi.xsd._2016_01_14_beta.PDFOptions.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "illustratorOptions").equals(reader.getName())) {

                    object.setIllustratorOptions(com.scene7.www.ipsapi.xsd._2016_01_14_beta.IllustratorOptions.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "colorManagementOptions").equals(reader.getName())) {

                    object.setColorManagementOptions(
                            com.scene7.www.ipsapi.xsd._2016_01_14_beta.ColorManagementOptions.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "autoSetCreationOptions").equals(reader.getName())) {

                    object.setAutoSetCreationOptions(
                            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AutoSetCreationOptions.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "projectHandleArray").equals(reader.getName())) {

                    object.setProjectHandleArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.HandleArray.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "emailSetting").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "emailSetting" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setEmailSetting(
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
                        "postHttpUrl").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "postHttpUrl" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPostHttpUrl(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "mediaOptions").equals(reader.getName())) {

                    object.setMediaOptions(com.scene7.www.ipsapi.xsd._2016_01_14_beta.MediaOptions.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "inDesignOptions").equals(reader.getName())) {

                    object.setInDesignOptions(com.scene7.www.ipsapi.xsd._2016_01_14_beta.InDesignOptions.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "xmpKeywords").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "xmpKeywords" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setXmpKeywords(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "unsharpMaskOptions").equals(reader.getName())) {

                    object.setUnsharpMaskOptions(com.scene7.www.ipsapi.xsd._2016_01_14_beta.UnsharpMaskOptions.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "unCompressOptions").equals(reader.getName())) {

                    object.setUnCompressOptions(com.scene7.www.ipsapi.xsd._2016_01_14_beta.UnCompressOptions.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "excludeMasterVideoFromAVS").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "excludeMasterVideoFromAVS" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setExcludeMasterVideoFromAVS(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

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
           
    