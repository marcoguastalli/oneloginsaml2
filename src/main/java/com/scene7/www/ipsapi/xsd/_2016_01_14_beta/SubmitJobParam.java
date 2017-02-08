/**
 * SubmitJobParam.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.scene7.www.ipsapi.xsd._2016_01_14_beta;

/**
 * SubmitJobParam bean class
 */

public class SubmitJobParam
        implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
            "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
            "submitJobParam",
            "ns1");

    /**
     * field for CompanyHandle
     */

    protected java.lang.String localCompanyHandle;
    /**
     * field for UserHandle
     */

    protected java.lang.String localUserHandle;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localUserHandleTracker = false;
    /**
     * field for JobName
     */

    protected java.lang.String localJobName;
    /**
     * field for Locale
     */

    protected java.lang.String localLocale;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localLocaleTracker = false;
    /**
     * field for ExecTime
     */

    protected java.util.Calendar localExecTime;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localExecTimeTracker = false;
    /**
     * field for ExecSchedule
     */

    protected java.lang.String localExecSchedule;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localExecScheduleTracker = false;
    /**
     * field for Description
     */

    protected java.lang.String localDescription;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localDescriptionTracker = false;
    /**
     * field for ImageServingPublishJob
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.ImageServingPublishJob localImageServingPublishJob;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localImageServingPublishJobTracker = false;
    /**
     * field for ImageRenderingPublishJob
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.ImageRenderingPublishJob localImageRenderingPublishJob;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localImageRenderingPublishJobTracker = false;
    /**
     * field for VideoPublishJob
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.VideoPublishJob localVideoPublishJob;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localVideoPublishJobTracker = false;
    /**
     * field for ServerDirectoryPublishJob
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.ServerDirectoryPublishJob localServerDirectoryPublishJob;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localServerDirectoryPublishJobTracker = false;
    /**
     * field for MetadataPublishJob
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.MetadataPublishJob localMetadataPublishJob;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localMetadataPublishJobTracker = false;
    /**
     * field for UploadDirectoryJob
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.UploadDirectoryJob localUploadDirectoryJob;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localUploadDirectoryJobTracker = false;
    /**
     * field for UploadUrlsJob
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.UploadUrlsJob localUploadUrlsJob;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localUploadUrlsJobTracker = false;
    /**
     * field for OptimizeImagesJob
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.OptimizeImagesJob localOptimizeImagesJob;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localOptimizeImagesJobTracker = false;
    /**
     * field for RipPdfsJob
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.RipPdfsJob localRipPdfsJob;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localRipPdfsJobTracker = false;
    /**
     * field for ReprocessAssetsJob
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.ReprocessAssetsJob localReprocessAssetsJob;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localReprocessAssetsJobTracker = false;
    /**
     * field for CreateVideoSitemapJob
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateVideoSitemapJob localCreateVideoSitemapJob;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localCreateVideoSitemapJobTracker = false;
    /**
     * field for ExportJob
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExportJob localExportJob;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localExportJobTracker = false;
    /**
     * field for AutomatedSetGenerationJob
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.AutomatedSetGenerationJob localAutomatedSetGenerationJob;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localAutomatedSetGenerationJobTracker = false;

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

    public boolean isUserHandleSpecified() {
        return this.localUserHandleTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getUserHandle() {
        return this.localUserHandle;
    }

    /**
     * Auto generated setter method
     *
     * @param param UserHandle
     */
    public void setUserHandle(java.lang.String param) {
        this.localUserHandleTracker = param != null;

        this.localUserHandle = param;

    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getJobName() {
        return this.localJobName;
    }

    /**
     * Auto generated setter method
     *
     * @param param JobName
     */
    public void setJobName(java.lang.String param) {

        this.localJobName = param;

    }

    public boolean isLocaleSpecified() {
        return this.localLocaleTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getLocale() {
        return this.localLocale;
    }

    /**
     * Auto generated setter method
     *
     * @param param Locale
     */
    public void setLocale(java.lang.String param) {
        this.localLocaleTracker = param != null;

        this.localLocale = param;

    }

    public boolean isExecTimeSpecified() {
        return this.localExecTimeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getExecTime() {
        return this.localExecTime;
    }

    /**
     * Auto generated setter method
     *
     * @param param ExecTime
     */
    public void setExecTime(java.util.Calendar param) {
        this.localExecTimeTracker = param != null;

        this.localExecTime = param;

    }

    public boolean isExecScheduleSpecified() {
        return this.localExecScheduleTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getExecSchedule() {
        return this.localExecSchedule;
    }

    /**
     * Auto generated setter method
     *
     * @param param ExecSchedule
     */
    public void setExecSchedule(java.lang.String param) {
        this.localExecScheduleTracker = param != null;

        this.localExecSchedule = param;

    }

    public boolean isDescriptionSpecified() {
        return this.localDescriptionTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getDescription() {
        return this.localDescription;
    }

    /**
     * Auto generated setter method
     *
     * @param param Description
     */
    public void setDescription(java.lang.String param) {
        this.localDescriptionTracker = param != null;

        this.localDescription = param;

    }

    public boolean isImageServingPublishJobSpecified() {
        return this.localImageServingPublishJobTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.ImageServingPublishJob
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.ImageServingPublishJob getImageServingPublishJob() {
        return this.localImageServingPublishJob;
    }

    /**
     * Auto generated setter method
     *
     * @param param ImageServingPublishJob
     */
    public void setImageServingPublishJob(com.scene7.www.ipsapi.xsd._2016_01_14_beta.ImageServingPublishJob param) {
        this.localImageServingPublishJobTracker = param != null;

        this.localImageServingPublishJob = param;

    }

    public boolean isImageRenderingPublishJobSpecified() {
        return this.localImageRenderingPublishJobTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.ImageRenderingPublishJob
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.ImageRenderingPublishJob getImageRenderingPublishJob() {
        return this.localImageRenderingPublishJob;
    }

    /**
     * Auto generated setter method
     *
     * @param param ImageRenderingPublishJob
     */
    public void setImageRenderingPublishJob(com.scene7.www.ipsapi.xsd._2016_01_14_beta.ImageRenderingPublishJob param) {
        this.localImageRenderingPublishJobTracker = param != null;

        this.localImageRenderingPublishJob = param;

    }

    public boolean isVideoPublishJobSpecified() {
        return this.localVideoPublishJobTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.VideoPublishJob
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.VideoPublishJob getVideoPublishJob() {
        return this.localVideoPublishJob;
    }

    /**
     * Auto generated setter method
     *
     * @param param VideoPublishJob
     */
    public void setVideoPublishJob(com.scene7.www.ipsapi.xsd._2016_01_14_beta.VideoPublishJob param) {
        this.localVideoPublishJobTracker = param != null;

        this.localVideoPublishJob = param;

    }

    public boolean isServerDirectoryPublishJobSpecified() {
        return this.localServerDirectoryPublishJobTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.ServerDirectoryPublishJob
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.ServerDirectoryPublishJob getServerDirectoryPublishJob() {
        return this.localServerDirectoryPublishJob;
    }

    /**
     * Auto generated setter method
     *
     * @param param ServerDirectoryPublishJob
     */
    public void setServerDirectoryPublishJob(com.scene7.www.ipsapi.xsd._2016_01_14_beta.ServerDirectoryPublishJob param) {
        this.localServerDirectoryPublishJobTracker = param != null;

        this.localServerDirectoryPublishJob = param;

    }

    public boolean isMetadataPublishJobSpecified() {
        return this.localMetadataPublishJobTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.MetadataPublishJob
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.MetadataPublishJob getMetadataPublishJob() {
        return this.localMetadataPublishJob;
    }

    /**
     * Auto generated setter method
     *
     * @param param MetadataPublishJob
     */
    public void setMetadataPublishJob(com.scene7.www.ipsapi.xsd._2016_01_14_beta.MetadataPublishJob param) {
        this.localMetadataPublishJobTracker = param != null;

        this.localMetadataPublishJob = param;

    }

    public boolean isUploadDirectoryJobSpecified() {
        return this.localUploadDirectoryJobTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.UploadDirectoryJob
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.UploadDirectoryJob getUploadDirectoryJob() {
        return this.localUploadDirectoryJob;
    }

    /**
     * Auto generated setter method
     *
     * @param param UploadDirectoryJob
     */
    public void setUploadDirectoryJob(com.scene7.www.ipsapi.xsd._2016_01_14_beta.UploadDirectoryJob param) {
        this.localUploadDirectoryJobTracker = param != null;

        this.localUploadDirectoryJob = param;

    }

    public boolean isUploadUrlsJobSpecified() {
        return this.localUploadUrlsJobTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.UploadUrlsJob
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.UploadUrlsJob getUploadUrlsJob() {
        return this.localUploadUrlsJob;
    }

    /**
     * Auto generated setter method
     *
     * @param param UploadUrlsJob
     */
    public void setUploadUrlsJob(com.scene7.www.ipsapi.xsd._2016_01_14_beta.UploadUrlsJob param) {
        this.localUploadUrlsJobTracker = param != null;

        this.localUploadUrlsJob = param;

    }

    public boolean isOptimizeImagesJobSpecified() {
        return this.localOptimizeImagesJobTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.OptimizeImagesJob
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.OptimizeImagesJob getOptimizeImagesJob() {
        return this.localOptimizeImagesJob;
    }

    /**
     * Auto generated setter method
     *
     * @param param OptimizeImagesJob
     */
    public void setOptimizeImagesJob(com.scene7.www.ipsapi.xsd._2016_01_14_beta.OptimizeImagesJob param) {
        this.localOptimizeImagesJobTracker = param != null;

        this.localOptimizeImagesJob = param;

    }

    public boolean isRipPdfsJobSpecified() {
        return this.localRipPdfsJobTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.RipPdfsJob
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.RipPdfsJob getRipPdfsJob() {
        return this.localRipPdfsJob;
    }

    /**
     * Auto generated setter method
     *
     * @param param RipPdfsJob
     */
    public void setRipPdfsJob(com.scene7.www.ipsapi.xsd._2016_01_14_beta.RipPdfsJob param) {
        this.localRipPdfsJobTracker = param != null;

        this.localRipPdfsJob = param;

    }

    public boolean isReprocessAssetsJobSpecified() {
        return this.localReprocessAssetsJobTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.ReprocessAssetsJob
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.ReprocessAssetsJob getReprocessAssetsJob() {
        return this.localReprocessAssetsJob;
    }

    /**
     * Auto generated setter method
     *
     * @param param ReprocessAssetsJob
     */
    public void setReprocessAssetsJob(com.scene7.www.ipsapi.xsd._2016_01_14_beta.ReprocessAssetsJob param) {
        this.localReprocessAssetsJobTracker = param != null;

        this.localReprocessAssetsJob = param;

    }

    public boolean isCreateVideoSitemapJobSpecified() {
        return this.localCreateVideoSitemapJobTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateVideoSitemapJob
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateVideoSitemapJob getCreateVideoSitemapJob() {
        return this.localCreateVideoSitemapJob;
    }

    /**
     * Auto generated setter method
     *
     * @param param CreateVideoSitemapJob
     */
    public void setCreateVideoSitemapJob(com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateVideoSitemapJob param) {
        this.localCreateVideoSitemapJobTracker = param != null;

        this.localCreateVideoSitemapJob = param;

    }

    public boolean isExportJobSpecified() {
        return this.localExportJobTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExportJob
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExportJob getExportJob() {
        return this.localExportJob;
    }

    /**
     * Auto generated setter method
     *
     * @param param ExportJob
     */
    public void setExportJob(com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExportJob param) {
        this.localExportJobTracker = param != null;

        this.localExportJob = param;

    }

    public boolean isAutomatedSetGenerationJobSpecified() {
        return this.localAutomatedSetGenerationJobTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.AutomatedSetGenerationJob
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.AutomatedSetGenerationJob getAutomatedSetGenerationJob() {
        return this.localAutomatedSetGenerationJob;
    }

    /**
     * Auto generated setter method
     *
     * @param param AutomatedSetGenerationJob
     */
    public void setAutomatedSetGenerationJob(com.scene7.www.ipsapi.xsd._2016_01_14_beta.AutomatedSetGenerationJob param) {
        this.localAutomatedSetGenerationJobTracker = param != null;

        this.localAutomatedSetGenerationJob = param;

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
                        namespacePrefix + ":submitJobParam",
                        xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "submitJobParam",
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
        if (this.localUserHandleTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "userHandle", xmlWriter);

            if (this.localUserHandle == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("userHandle cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localUserHandle);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "jobName", xmlWriter);

        if (this.localJobName == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("jobName cannot be null!!");

        } else {

            xmlWriter.writeCharacters(this.localJobName);

        }

        xmlWriter.writeEndElement();
        if (this.localLocaleTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "locale", xmlWriter);

            if (this.localLocale == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("locale cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localLocale);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localExecTimeTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "execTime", xmlWriter);

            if (this.localExecTime == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("execTime cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localExecTime));

            }

            xmlWriter.writeEndElement();
        }
        if (this.localExecScheduleTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "execSchedule", xmlWriter);

            if (this.localExecSchedule == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("execSchedule cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localExecSchedule);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localDescriptionTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "description", xmlWriter);

            if (this.localDescription == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("description cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localDescription);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localImageServingPublishJobTracker) {
            if (this.localImageServingPublishJob == null) {
                throw new org.apache.axis2.databinding.ADBException("imageServingPublishJob cannot be null!!");
            }
            this.localImageServingPublishJob
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "imageServingPublishJob"),
                            xmlWriter);
        }
        if (this.localImageRenderingPublishJobTracker) {
            if (this.localImageRenderingPublishJob == null) {
                throw new org.apache.axis2.databinding.ADBException("imageRenderingPublishJob cannot be null!!");
            }
            this.localImageRenderingPublishJob.serialize(
                    new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "imageRenderingPublishJob"),
                    xmlWriter);
        }
        if (this.localVideoPublishJobTracker) {
            if (this.localVideoPublishJob == null) {
                throw new org.apache.axis2.databinding.ADBException("videoPublishJob cannot be null!!");
            }
            this.localVideoPublishJob
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "videoPublishJob"),
                            xmlWriter);
        }
        if (this.localServerDirectoryPublishJobTracker) {
            if (this.localServerDirectoryPublishJob == null) {
                throw new org.apache.axis2.databinding.ADBException("serverDirectoryPublishJob cannot be null!!");
            }
            this.localServerDirectoryPublishJob.serialize(
                    new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "serverDirectoryPublishJob"),
                    xmlWriter);
        }
        if (this.localMetadataPublishJobTracker) {
            if (this.localMetadataPublishJob == null) {
                throw new org.apache.axis2.databinding.ADBException("metadataPublishJob cannot be null!!");
            }
            this.localMetadataPublishJob
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "metadataPublishJob"),
                            xmlWriter);
        }
        if (this.localUploadDirectoryJobTracker) {
            if (this.localUploadDirectoryJob == null) {
                throw new org.apache.axis2.databinding.ADBException("uploadDirectoryJob cannot be null!!");
            }
            this.localUploadDirectoryJob
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "uploadDirectoryJob"),
                            xmlWriter);
        }
        if (this.localUploadUrlsJobTracker) {
            if (this.localUploadUrlsJob == null) {
                throw new org.apache.axis2.databinding.ADBException("uploadUrlsJob cannot be null!!");
            }
            this.localUploadUrlsJob
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "uploadUrlsJob"),
                            xmlWriter);
        }
        if (this.localOptimizeImagesJobTracker) {
            if (this.localOptimizeImagesJob == null) {
                throw new org.apache.axis2.databinding.ADBException("optimizeImagesJob cannot be null!!");
            }
            this.localOptimizeImagesJob
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "optimizeImagesJob"),
                            xmlWriter);
        }
        if (this.localRipPdfsJobTracker) {
            if (this.localRipPdfsJob == null) {
                throw new org.apache.axis2.databinding.ADBException("ripPdfsJob cannot be null!!");
            }
            this.localRipPdfsJob.serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "ripPdfsJob"),
                    xmlWriter);
        }
        if (this.localReprocessAssetsJobTracker) {
            if (this.localReprocessAssetsJob == null) {
                throw new org.apache.axis2.databinding.ADBException("reprocessAssetsJob cannot be null!!");
            }
            this.localReprocessAssetsJob
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "reprocessAssetsJob"),
                            xmlWriter);
        }
        if (this.localCreateVideoSitemapJobTracker) {
            if (this.localCreateVideoSitemapJob == null) {
                throw new org.apache.axis2.databinding.ADBException("createVideoSitemapJob cannot be null!!");
            }
            this.localCreateVideoSitemapJob
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "createVideoSitemapJob"),
                            xmlWriter);
        }
        if (this.localExportJobTracker) {
            if (this.localExportJob == null) {
                throw new org.apache.axis2.databinding.ADBException("exportJob cannot be null!!");
            }
            this.localExportJob.serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "exportJob"),
                    xmlWriter);
        }
        if (this.localAutomatedSetGenerationJobTracker) {
            if (this.localAutomatedSetGenerationJob == null) {
                throw new org.apache.axis2.databinding.ADBException("automatedSetGenerationJob cannot be null!!");
            }
            this.localAutomatedSetGenerationJob.serialize(
                    new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "automatedSetGenerationJob"),
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
        if (this.localUserHandleTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "userHandle"));

            if (this.localUserHandle != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localUserHandle));
            } else {
                throw new org.apache.axis2.databinding.ADBException("userHandle cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "jobName"));

        if (this.localJobName != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localJobName));
        } else {
            throw new org.apache.axis2.databinding.ADBException("jobName cannot be null!!");
        }
        if (this.localLocaleTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "locale"));

            if (this.localLocale != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localLocale));
            } else {
                throw new org.apache.axis2.databinding.ADBException("locale cannot be null!!");
            }
        }
        if (this.localExecTimeTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "execTime"));

            if (this.localExecTime != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localExecTime));
            } else {
                throw new org.apache.axis2.databinding.ADBException("execTime cannot be null!!");
            }
        }
        if (this.localExecScheduleTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "execSchedule"));

            if (this.localExecSchedule != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localExecSchedule));
            } else {
                throw new org.apache.axis2.databinding.ADBException("execSchedule cannot be null!!");
            }
        }
        if (this.localDescriptionTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "description"));

            if (this.localDescription != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localDescription));
            } else {
                throw new org.apache.axis2.databinding.ADBException("description cannot be null!!");
            }
        }
        if (this.localImageServingPublishJobTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "imageServingPublishJob"));

            if (this.localImageServingPublishJob == null) {
                throw new org.apache.axis2.databinding.ADBException("imageServingPublishJob cannot be null!!");
            }
            elementList.add(this.localImageServingPublishJob);
        }
        if (this.localImageRenderingPublishJobTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "imageRenderingPublishJob"));

            if (this.localImageRenderingPublishJob == null) {
                throw new org.apache.axis2.databinding.ADBException("imageRenderingPublishJob cannot be null!!");
            }
            elementList.add(this.localImageRenderingPublishJob);
        }
        if (this.localVideoPublishJobTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "videoPublishJob"));

            if (this.localVideoPublishJob == null) {
                throw new org.apache.axis2.databinding.ADBException("videoPublishJob cannot be null!!");
            }
            elementList.add(this.localVideoPublishJob);
        }
        if (this.localServerDirectoryPublishJobTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "serverDirectoryPublishJob"));

            if (this.localServerDirectoryPublishJob == null) {
                throw new org.apache.axis2.databinding.ADBException("serverDirectoryPublishJob cannot be null!!");
            }
            elementList.add(this.localServerDirectoryPublishJob);
        }
        if (this.localMetadataPublishJobTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "metadataPublishJob"));

            if (this.localMetadataPublishJob == null) {
                throw new org.apache.axis2.databinding.ADBException("metadataPublishJob cannot be null!!");
            }
            elementList.add(this.localMetadataPublishJob);
        }
        if (this.localUploadDirectoryJobTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "uploadDirectoryJob"));

            if (this.localUploadDirectoryJob == null) {
                throw new org.apache.axis2.databinding.ADBException("uploadDirectoryJob cannot be null!!");
            }
            elementList.add(this.localUploadDirectoryJob);
        }
        if (this.localUploadUrlsJobTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "uploadUrlsJob"));

            if (this.localUploadUrlsJob == null) {
                throw new org.apache.axis2.databinding.ADBException("uploadUrlsJob cannot be null!!");
            }
            elementList.add(this.localUploadUrlsJob);
        }
        if (this.localOptimizeImagesJobTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "optimizeImagesJob"));

            if (this.localOptimizeImagesJob == null) {
                throw new org.apache.axis2.databinding.ADBException("optimizeImagesJob cannot be null!!");
            }
            elementList.add(this.localOptimizeImagesJob);
        }
        if (this.localRipPdfsJobTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "ripPdfsJob"));

            if (this.localRipPdfsJob == null) {
                throw new org.apache.axis2.databinding.ADBException("ripPdfsJob cannot be null!!");
            }
            elementList.add(this.localRipPdfsJob);
        }
        if (this.localReprocessAssetsJobTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "reprocessAssetsJob"));

            if (this.localReprocessAssetsJob == null) {
                throw new org.apache.axis2.databinding.ADBException("reprocessAssetsJob cannot be null!!");
            }
            elementList.add(this.localReprocessAssetsJob);
        }
        if (this.localCreateVideoSitemapJobTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "createVideoSitemapJob"));

            if (this.localCreateVideoSitemapJob == null) {
                throw new org.apache.axis2.databinding.ADBException("createVideoSitemapJob cannot be null!!");
            }
            elementList.add(this.localCreateVideoSitemapJob);
        }
        if (this.localExportJobTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "exportJob"));

            if (this.localExportJob == null) {
                throw new org.apache.axis2.databinding.ADBException("exportJob cannot be null!!");
            }
            elementList.add(this.localExportJob);
        }
        if (this.localAutomatedSetGenerationJobTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "automatedSetGenerationJob"));

            if (this.localAutomatedSetGenerationJob == null) {
                throw new org.apache.axis2.databinding.ADBException("automatedSetGenerationJob cannot be null!!");
            }
            elementList.add(this.localAutomatedSetGenerationJob);
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
        public static SubmitJobParam parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            SubmitJobParam object =
                    new SubmitJobParam();

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

                        if (!"submitJobParam".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (SubmitJobParam) com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExtensionMapper.getTypeObject(
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
                        "userHandle").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "userHandle" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setUserHandle(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "jobName")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "jobName" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setJobName(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "locale")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "locale" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setLocale(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "execTime")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "execTime" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setExecTime(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "execSchedule").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "execSchedule" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setExecSchedule(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "description").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "description" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setDescription(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "imageServingPublishJob").equals(reader.getName())) {

                    object.setImageServingPublishJob(
                            com.scene7.www.ipsapi.xsd._2016_01_14_beta.ImageServingPublishJob.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "imageRenderingPublishJob").equals(reader.getName())) {

                    object.setImageRenderingPublishJob(
                            com.scene7.www.ipsapi.xsd._2016_01_14_beta.ImageRenderingPublishJob.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "videoPublishJob").equals(reader.getName())) {

                    object.setVideoPublishJob(com.scene7.www.ipsapi.xsd._2016_01_14_beta.VideoPublishJob.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "serverDirectoryPublishJob").equals(reader.getName())) {

                    object.setServerDirectoryPublishJob(
                            com.scene7.www.ipsapi.xsd._2016_01_14_beta.ServerDirectoryPublishJob.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "metadataPublishJob").equals(reader.getName())) {

                    object.setMetadataPublishJob(com.scene7.www.ipsapi.xsd._2016_01_14_beta.MetadataPublishJob.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "uploadDirectoryJob").equals(reader.getName())) {

                    object.setUploadDirectoryJob(com.scene7.www.ipsapi.xsd._2016_01_14_beta.UploadDirectoryJob.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "uploadUrlsJob").equals(reader.getName())) {

                    object.setUploadUrlsJob(com.scene7.www.ipsapi.xsd._2016_01_14_beta.UploadUrlsJob.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "optimizeImagesJob").equals(reader.getName())) {

                    object.setOptimizeImagesJob(com.scene7.www.ipsapi.xsd._2016_01_14_beta.OptimizeImagesJob.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "ripPdfsJob").equals(reader.getName())) {

                    object.setRipPdfsJob(com.scene7.www.ipsapi.xsd._2016_01_14_beta.RipPdfsJob.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "reprocessAssetsJob").equals(reader.getName())) {

                    object.setReprocessAssetsJob(com.scene7.www.ipsapi.xsd._2016_01_14_beta.ReprocessAssetsJob.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "createVideoSitemapJob").equals(reader.getName())) {

                    object.setCreateVideoSitemapJob(com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateVideoSitemapJob.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "exportJob").equals(reader.getName())) {

                    object.setExportJob(com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExportJob.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "automatedSetGenerationJob").equals(reader.getName())) {

                    object.setAutomatedSetGenerationJob(
                            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AutomatedSetGenerationJob.Factory.parse(reader));

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
           
    