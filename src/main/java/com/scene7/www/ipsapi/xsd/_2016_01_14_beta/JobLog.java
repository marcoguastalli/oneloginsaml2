/**
 * JobLog.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.scene7.www.ipsapi.xsd._2016_01_14_beta;

/**
 * JobLog bean class
 */

public class JobLog
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = JobLog
                Namespace URI = http://www.scene7.com/IpsApi/xsd/2016-01-14-beta
                Namespace Prefix = ns1
                */

    /**
     * field for CompanyHandle
     */

    protected java.lang.String localCompanyHandle;
    /**
     * field for JobHandle
     */

    protected java.lang.String localJobHandle;
    /**
     * field for JobName
     */

    protected java.lang.String localJobName;
    /**
     * field for OriginalJobName
     */

    protected java.lang.String localOriginalJobName;
    /**
     * field for SubmitUserEmail
     */

    protected java.lang.String localSubmitUserEmail;
    /**
     * field for LogType
     */

    protected java.lang.String localLogType;
    /**
     * field for JobSubType
     */

    protected java.lang.String localJobSubType;
    /**
     * field for StartDate
     */

    protected java.util.Calendar localStartDate;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localStartDateTracker = false;
    /**
     * field for EndDate
     */

    protected java.util.Calendar localEndDate;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localEndDateTracker = false;
    /**
     * field for Description
     */

    protected java.lang.String localDescription;
    /**
     * field for FileSuccessCount
     */

    protected int localFileSuccessCount;
    /**
     * field for FileErrorCount
     */

    protected int localFileErrorCount;
    /**
     * field for FileWarningCount
     */

    protected int localFileWarningCount;
    /**
     * field for FileDuplicateCount
     */

    protected int localFileDuplicateCount;
    /**
     * field for FileUpdateCount
     */

    protected int localFileUpdateCount;
    /**
     * field for TotalFileCount
     */

    protected int localTotalFileCount;
    /**
     * field for TransferSuccessCount
     */

    protected int localTransferSuccessCount;
    /**
     * field for TransferErrorCount
     */

    protected int localTransferErrorCount;
    /**
     * field for TransferWarningCount
     */

    protected int localTransferWarningCount;
    /**
     * field for FatalError
     */

    protected boolean localFatalError;
    /**
     * field for DetailTotalRows
     */

    protected int localDetailTotalRows;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localDetailTotalRowsTracker = false;
    /**
     * field for DetailArray
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.JobLogDetailArray localDetailArray;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localDetailArrayTracker = false;

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

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getJobHandle() {
        return this.localJobHandle;
    }

    /**
     * Auto generated setter method
     *
     * @param param JobHandle
     */
    public void setJobHandle(java.lang.String param) {

        this.localJobHandle = param;

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

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getOriginalJobName() {
        return this.localOriginalJobName;
    }

    /**
     * Auto generated setter method
     *
     * @param param OriginalJobName
     */
    public void setOriginalJobName(java.lang.String param) {

        this.localOriginalJobName = param;

    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSubmitUserEmail() {
        return this.localSubmitUserEmail;
    }

    /**
     * Auto generated setter method
     *
     * @param param SubmitUserEmail
     */
    public void setSubmitUserEmail(java.lang.String param) {

        this.localSubmitUserEmail = param;

    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getLogType() {
        return this.localLogType;
    }

    /**
     * Auto generated setter method
     *
     * @param param LogType
     */
    public void setLogType(java.lang.String param) {

        this.localLogType = param;

    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getJobSubType() {
        return this.localJobSubType;
    }

    /**
     * Auto generated setter method
     *
     * @param param JobSubType
     */
    public void setJobSubType(java.lang.String param) {

        this.localJobSubType = param;

    }

    public boolean isStartDateSpecified() {
        return this.localStartDateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getStartDate() {
        return this.localStartDate;
    }

    /**
     * Auto generated setter method
     *
     * @param param StartDate
     */
    public void setStartDate(java.util.Calendar param) {
        this.localStartDateTracker = param != null;

        this.localStartDate = param;

    }

    public boolean isEndDateSpecified() {
        return this.localEndDateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getEndDate() {
        return this.localEndDate;
    }

    /**
     * Auto generated setter method
     *
     * @param param EndDate
     */
    public void setEndDate(java.util.Calendar param) {
        this.localEndDateTracker = param != null;

        this.localEndDate = param;

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

        this.localDescription = param;

    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getFileSuccessCount() {
        return this.localFileSuccessCount;
    }

    /**
     * Auto generated setter method
     *
     * @param param FileSuccessCount
     */
    public void setFileSuccessCount(int param) {

        this.localFileSuccessCount = param;

    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getFileErrorCount() {
        return this.localFileErrorCount;
    }

    /**
     * Auto generated setter method
     *
     * @param param FileErrorCount
     */
    public void setFileErrorCount(int param) {

        this.localFileErrorCount = param;

    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getFileWarningCount() {
        return this.localFileWarningCount;
    }

    /**
     * Auto generated setter method
     *
     * @param param FileWarningCount
     */
    public void setFileWarningCount(int param) {

        this.localFileWarningCount = param;

    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getFileDuplicateCount() {
        return this.localFileDuplicateCount;
    }

    /**
     * Auto generated setter method
     *
     * @param param FileDuplicateCount
     */
    public void setFileDuplicateCount(int param) {

        this.localFileDuplicateCount = param;

    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getFileUpdateCount() {
        return this.localFileUpdateCount;
    }

    /**
     * Auto generated setter method
     *
     * @param param FileUpdateCount
     */
    public void setFileUpdateCount(int param) {

        this.localFileUpdateCount = param;

    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getTotalFileCount() {
        return this.localTotalFileCount;
    }

    /**
     * Auto generated setter method
     *
     * @param param TotalFileCount
     */
    public void setTotalFileCount(int param) {

        this.localTotalFileCount = param;

    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getTransferSuccessCount() {
        return this.localTransferSuccessCount;
    }

    /**
     * Auto generated setter method
     *
     * @param param TransferSuccessCount
     */
    public void setTransferSuccessCount(int param) {

        this.localTransferSuccessCount = param;

    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getTransferErrorCount() {
        return this.localTransferErrorCount;
    }

    /**
     * Auto generated setter method
     *
     * @param param TransferErrorCount
     */
    public void setTransferErrorCount(int param) {

        this.localTransferErrorCount = param;

    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getTransferWarningCount() {
        return this.localTransferWarningCount;
    }

    /**
     * Auto generated setter method
     *
     * @param param TransferWarningCount
     */
    public void setTransferWarningCount(int param) {

        this.localTransferWarningCount = param;

    }

    /**
     * Auto generated getter method
     *
     * @return boolean
     */
    public boolean getFatalError() {
        return this.localFatalError;
    }

    /**
     * Auto generated setter method
     *
     * @param param FatalError
     */
    public void setFatalError(boolean param) {

        this.localFatalError = param;

    }

    public boolean isDetailTotalRowsSpecified() {
        return this.localDetailTotalRowsTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getDetailTotalRows() {
        return this.localDetailTotalRows;
    }

    /**
     * Auto generated setter method
     *
     * @param param DetailTotalRows
     */
    public void setDetailTotalRows(int param) {

        // setting primitive attribute tracker to true
        this.localDetailTotalRowsTracker =
                param != java.lang.Integer.MIN_VALUE;

        this.localDetailTotalRows = param;

    }

    public boolean isDetailArraySpecified() {
        return this.localDetailArrayTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.JobLogDetailArray
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.JobLogDetailArray getDetailArray() {
        return this.localDetailArray;
    }

    /**
     * Auto generated setter method
     *
     * @param param DetailArray
     */
    public void setDetailArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.JobLogDetailArray param) {
        this.localDetailArrayTracker = param != null;

        this.localDetailArray = param;

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
                        namespacePrefix + ":JobLog",
                        xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "JobLog",
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

        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "jobHandle", xmlWriter);

        if (this.localJobHandle == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("jobHandle cannot be null!!");

        } else {

            xmlWriter.writeCharacters(this.localJobHandle);

        }

        xmlWriter.writeEndElement();

        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "jobName", xmlWriter);

        if (this.localJobName == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("jobName cannot be null!!");

        } else {

            xmlWriter.writeCharacters(this.localJobName);

        }

        xmlWriter.writeEndElement();

        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "originalJobName", xmlWriter);

        if (this.localOriginalJobName == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("originalJobName cannot be null!!");

        } else {

            xmlWriter.writeCharacters(this.localOriginalJobName);

        }

        xmlWriter.writeEndElement();

        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "submitUserEmail", xmlWriter);

        if (this.localSubmitUserEmail == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("submitUserEmail cannot be null!!");

        } else {

            xmlWriter.writeCharacters(this.localSubmitUserEmail);

        }

        xmlWriter.writeEndElement();

        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "logType", xmlWriter);

        if (this.localLogType == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("logType cannot be null!!");

        } else {

            xmlWriter.writeCharacters(this.localLogType);

        }

        xmlWriter.writeEndElement();

        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "jobSubType", xmlWriter);

        if (this.localJobSubType == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("jobSubType cannot be null!!");

        } else {

            xmlWriter.writeCharacters(this.localJobSubType);

        }

        xmlWriter.writeEndElement();
        if (this.localStartDateTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "startDate", xmlWriter);

            if (this.localStartDate == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("startDate cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localStartDate));

            }

            xmlWriter.writeEndElement();
        }
        if (this.localEndDateTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "endDate", xmlWriter);

            if (this.localEndDate == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("endDate cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localEndDate));

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "description", xmlWriter);

        if (this.localDescription == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("description cannot be null!!");

        } else {

            xmlWriter.writeCharacters(this.localDescription);

        }

        xmlWriter.writeEndElement();

        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "fileSuccessCount", xmlWriter);

        if (this.localFileSuccessCount == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("fileSuccessCount cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localFileSuccessCount));
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "fileErrorCount", xmlWriter);

        if (this.localFileErrorCount == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("fileErrorCount cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localFileErrorCount));
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "fileWarningCount", xmlWriter);

        if (this.localFileWarningCount == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("fileWarningCount cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localFileWarningCount));
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "fileDuplicateCount", xmlWriter);

        if (this.localFileDuplicateCount == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("fileDuplicateCount cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localFileDuplicateCount));
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "fileUpdateCount", xmlWriter);

        if (this.localFileUpdateCount == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("fileUpdateCount cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localFileUpdateCount));
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "totalFileCount", xmlWriter);

        if (this.localTotalFileCount == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("totalFileCount cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localTotalFileCount));
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "transferSuccessCount", xmlWriter);

        if (this.localTransferSuccessCount == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("transferSuccessCount cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localTransferSuccessCount));
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "transferErrorCount", xmlWriter);

        if (this.localTransferErrorCount == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("transferErrorCount cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localTransferErrorCount));
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "transferWarningCount", xmlWriter);

        if (this.localTransferWarningCount == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("transferWarningCount cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localTransferWarningCount));
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "fatalError", xmlWriter);

        if (false) {

            throw new org.apache.axis2.databinding.ADBException("fatalError cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localFatalError));
        }

        xmlWriter.writeEndElement();
        if (this.localDetailTotalRowsTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "detailTotalRows", xmlWriter);

            if (this.localDetailTotalRows == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("detailTotalRows cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localDetailTotalRows));
            }

            xmlWriter.writeEndElement();
        }
        if (this.localDetailArrayTracker) {
            if (this.localDetailArray == null) {
                throw new org.apache.axis2.databinding.ADBException("detailArray cannot be null!!");
            }
            this.localDetailArray
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "detailArray"),
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

        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "jobHandle"));

        if (this.localJobHandle != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localJobHandle));
        } else {
            throw new org.apache.axis2.databinding.ADBException("jobHandle cannot be null!!");
        }

        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "jobName"));

        if (this.localJobName != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localJobName));
        } else {
            throw new org.apache.axis2.databinding.ADBException("jobName cannot be null!!");
        }

        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "originalJobName"));

        if (this.localOriginalJobName != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localOriginalJobName));
        } else {
            throw new org.apache.axis2.databinding.ADBException("originalJobName cannot be null!!");
        }

        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "submitUserEmail"));

        if (this.localSubmitUserEmail != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localSubmitUserEmail));
        } else {
            throw new org.apache.axis2.databinding.ADBException("submitUserEmail cannot be null!!");
        }

        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "logType"));

        if (this.localLogType != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localLogType));
        } else {
            throw new org.apache.axis2.databinding.ADBException("logType cannot be null!!");
        }

        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "jobSubType"));

        if (this.localJobSubType != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localJobSubType));
        } else {
            throw new org.apache.axis2.databinding.ADBException("jobSubType cannot be null!!");
        }
        if (this.localStartDateTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "startDate"));

            if (this.localStartDate != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localStartDate));
            } else {
                throw new org.apache.axis2.databinding.ADBException("startDate cannot be null!!");
            }
        }
        if (this.localEndDateTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "endDate"));

            if (this.localEndDate != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localEndDate));
            } else {
                throw new org.apache.axis2.databinding.ADBException("endDate cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "description"));

        if (this.localDescription != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localDescription));
        } else {
            throw new org.apache.axis2.databinding.ADBException("description cannot be null!!");
        }

        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "fileSuccessCount"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localFileSuccessCount));

        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "fileErrorCount"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localFileErrorCount));

        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "fileWarningCount"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localFileWarningCount));

        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "fileDuplicateCount"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localFileDuplicateCount));

        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "fileUpdateCount"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localFileUpdateCount));

        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "totalFileCount"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localTotalFileCount));

        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "transferSuccessCount"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localTransferSuccessCount));

        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "transferErrorCount"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localTransferErrorCount));

        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "transferWarningCount"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localTransferWarningCount));

        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "fatalError"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localFatalError));
        if (this.localDetailTotalRowsTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "detailTotalRows"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localDetailTotalRows));
        }
        if (this.localDetailArrayTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "detailArray"));

            if (this.localDetailArray == null) {
                throw new org.apache.axis2.databinding.ADBException("detailArray cannot be null!!");
            }
            elementList.add(this.localDetailArray);
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
        public static JobLog parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            JobLog object =
                    new JobLog();

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

                        if (!"JobLog".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (JobLog) com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExtensionMapper.getTypeObject(
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
                        "jobHandle").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "jobHandle" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setJobHandle(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "originalJobName").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "originalJobName" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setOriginalJobName(
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
                        "submitUserEmail").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "submitUserEmail" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSubmitUserEmail(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "logType")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "logType" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setLogType(
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
                        "jobSubType").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "jobSubType" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setJobSubType(
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
                        "startDate").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "startDate" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setStartDate(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "endDate")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "endDate" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setEndDate(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

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
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "fileSuccessCount").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "fileSuccessCount" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFileSuccessCount(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "fileErrorCount").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "fileErrorCount" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFileErrorCount(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "fileWarningCount").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "fileWarningCount" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFileWarningCount(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "fileDuplicateCount").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "fileDuplicateCount" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFileDuplicateCount(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "fileUpdateCount").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "fileUpdateCount" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFileUpdateCount(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "totalFileCount").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "totalFileCount" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTotalFileCount(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "transferSuccessCount").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "transferSuccessCount" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTransferSuccessCount(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "transferErrorCount").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "transferErrorCount" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTransferErrorCount(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "transferWarningCount").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "transferWarningCount" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTransferWarningCount(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "fatalError").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "fatalError" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFatalError(
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
                        "detailTotalRows").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "detailTotalRows" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setDetailTotalRows(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setDetailTotalRows(java.lang.Integer.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "detailArray").equals(reader.getName())) {

                    object.setDetailArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.JobLogDetailArray.Factory.parse(reader));

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
           
    