/**
 * SetCompanySettingsParam.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.scene7.www.ipsapi.xsd._2016_01_14_beta;

/**
 * SetCompanySettingsParam bean class
 */

public class SetCompanySettingsParam
        implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
            "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
            "setCompanySettingsParam",
            "ns1");

    /**
     * field for CompanyHandle
     */

    protected java.lang.String localCompanyHandle;
    /**
     * field for OverwriteMode
     */

    protected java.lang.String localOverwriteMode;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localOverwriteModeTracker = false;
    /**
     * field for RetainPublishState
     */

    protected boolean localRetainPublishState;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localRetainPublishStateTracker = false;
    /**
     * field for DefaultSourceProfileHandle
     */

    protected java.lang.String localDefaultSourceProfileHandle;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localDefaultSourceProfileHandleTracker = false;
    /**
     * field for DefaultDisplayProfileHandle
     */

    protected java.lang.String localDefaultDisplayProfileHandle;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localDefaultDisplayProfileHandleTracker = false;
    /**
     * field for IptcExifMappingXsltHandle
     */

    protected java.lang.String localIptcExifMappingXsltHandle;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localIptcExifMappingXsltHandleTracker = false;
    /**
     * field for XmpMappingXsltHandle
     */

    protected java.lang.String localXmpMappingXsltHandle;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localXmpMappingXsltHandleTracker = false;
    /**
     * field for DiskSpaceWarningMin
     */

    protected int localDiskSpaceWarningMin;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localDiskSpaceWarningMinTracker = false;
    /**
     * field for EmailTrashCleanupWarning
     */

    protected boolean localEmailTrashCleanupWarning;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localEmailTrashCleanupWarningTracker = false;
    /**
     * field for FileExtOpt
     */

    protected java.lang.String localFileExtOpt;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localFileExtOptTracker = false;

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

    public boolean isOverwriteModeSpecified() {
        return this.localOverwriteModeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getOverwriteMode() {
        return this.localOverwriteMode;
    }

    /**
     * Auto generated setter method
     *
     * @param param OverwriteMode
     */
    public void setOverwriteMode(java.lang.String param) {
        this.localOverwriteModeTracker = param != null;

        this.localOverwriteMode = param;

    }

    public boolean isRetainPublishStateSpecified() {
        return this.localRetainPublishStateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return boolean
     */
    public boolean getRetainPublishState() {
        return this.localRetainPublishState;
    }

    /**
     * Auto generated setter method
     *
     * @param param RetainPublishState
     */
    public void setRetainPublishState(boolean param) {

        // setting primitive attribute tracker to true
        this.localRetainPublishStateTracker =
                true;

        this.localRetainPublishState = param;

    }

    public boolean isDefaultSourceProfileHandleSpecified() {
        return this.localDefaultSourceProfileHandleTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getDefaultSourceProfileHandle() {
        return this.localDefaultSourceProfileHandle;
    }

    /**
     * Auto generated setter method
     *
     * @param param DefaultSourceProfileHandle
     */
    public void setDefaultSourceProfileHandle(java.lang.String param) {
        this.localDefaultSourceProfileHandleTracker = param != null;

        this.localDefaultSourceProfileHandle = param;

    }

    public boolean isDefaultDisplayProfileHandleSpecified() {
        return this.localDefaultDisplayProfileHandleTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getDefaultDisplayProfileHandle() {
        return this.localDefaultDisplayProfileHandle;
    }

    /**
     * Auto generated setter method
     *
     * @param param DefaultDisplayProfileHandle
     */
    public void setDefaultDisplayProfileHandle(java.lang.String param) {
        this.localDefaultDisplayProfileHandleTracker = param != null;

        this.localDefaultDisplayProfileHandle = param;

    }

    public boolean isIptcExifMappingXsltHandleSpecified() {
        return this.localIptcExifMappingXsltHandleTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getIptcExifMappingXsltHandle() {
        return this.localIptcExifMappingXsltHandle;
    }

    /**
     * Auto generated setter method
     *
     * @param param IptcExifMappingXsltHandle
     */
    public void setIptcExifMappingXsltHandle(java.lang.String param) {
        this.localIptcExifMappingXsltHandleTracker = param != null;

        this.localIptcExifMappingXsltHandle = param;

    }

    public boolean isXmpMappingXsltHandleSpecified() {
        return this.localXmpMappingXsltHandleTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getXmpMappingXsltHandle() {
        return this.localXmpMappingXsltHandle;
    }

    /**
     * Auto generated setter method
     *
     * @param param XmpMappingXsltHandle
     */
    public void setXmpMappingXsltHandle(java.lang.String param) {
        this.localXmpMappingXsltHandleTracker = param != null;

        this.localXmpMappingXsltHandle = param;

    }

    public boolean isDiskSpaceWarningMinSpecified() {
        return this.localDiskSpaceWarningMinTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getDiskSpaceWarningMin() {
        return this.localDiskSpaceWarningMin;
    }

    /**
     * Auto generated setter method
     *
     * @param param DiskSpaceWarningMin
     */
    public void setDiskSpaceWarningMin(int param) {

        // setting primitive attribute tracker to true
        this.localDiskSpaceWarningMinTracker =
                param != java.lang.Integer.MIN_VALUE;

        this.localDiskSpaceWarningMin = param;

    }

    public boolean isEmailTrashCleanupWarningSpecified() {
        return this.localEmailTrashCleanupWarningTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return boolean
     */
    public boolean getEmailTrashCleanupWarning() {
        return this.localEmailTrashCleanupWarning;
    }

    /**
     * Auto generated setter method
     *
     * @param param EmailTrashCleanupWarning
     */
    public void setEmailTrashCleanupWarning(boolean param) {

        // setting primitive attribute tracker to true
        this.localEmailTrashCleanupWarningTracker =
                true;

        this.localEmailTrashCleanupWarning = param;

    }

    public boolean isFileExtOptSpecified() {
        return this.localFileExtOptTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getFileExtOpt() {
        return this.localFileExtOpt;
    }

    /**
     * Auto generated setter method
     *
     * @param param FileExtOpt
     */
    public void setFileExtOpt(java.lang.String param) {
        this.localFileExtOptTracker = param != null;

        this.localFileExtOpt = param;

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
                        namespacePrefix + ":setCompanySettingsParam",
                        xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "setCompanySettingsParam",
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
        if (this.localOverwriteModeTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "overwriteMode", xmlWriter);

            if (this.localOverwriteMode == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("overwriteMode cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localOverwriteMode);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localRetainPublishStateTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "retainPublishState", xmlWriter);

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("retainPublishState cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localRetainPublishState));
            }

            xmlWriter.writeEndElement();
        }
        if (this.localDefaultSourceProfileHandleTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "defaultSourceProfileHandle", xmlWriter);

            if (this.localDefaultSourceProfileHandle == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("defaultSourceProfileHandle cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localDefaultSourceProfileHandle);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localDefaultDisplayProfileHandleTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "defaultDisplayProfileHandle", xmlWriter);

            if (this.localDefaultDisplayProfileHandle == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("defaultDisplayProfileHandle cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localDefaultDisplayProfileHandle);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localIptcExifMappingXsltHandleTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "iptcExifMappingXsltHandle", xmlWriter);

            if (this.localIptcExifMappingXsltHandle == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("iptcExifMappingXsltHandle cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localIptcExifMappingXsltHandle);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localXmpMappingXsltHandleTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "xmpMappingXsltHandle", xmlWriter);

            if (this.localXmpMappingXsltHandle == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("xmpMappingXsltHandle cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localXmpMappingXsltHandle);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localDiskSpaceWarningMinTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "diskSpaceWarningMin", xmlWriter);

            if (this.localDiskSpaceWarningMin == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("diskSpaceWarningMin cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localDiskSpaceWarningMin));
            }

            xmlWriter.writeEndElement();
        }
        if (this.localEmailTrashCleanupWarningTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "emailTrashCleanupWarning", xmlWriter);

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("emailTrashCleanupWarning cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        this.localEmailTrashCleanupWarning));
            }

            xmlWriter.writeEndElement();
        }
        if (this.localFileExtOptTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "fileExtOpt", xmlWriter);

            if (this.localFileExtOpt == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("fileExtOpt cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localFileExtOpt);

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
        if (this.localOverwriteModeTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "overwriteMode"));

            if (this.localOverwriteMode != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localOverwriteMode));
            } else {
                throw new org.apache.axis2.databinding.ADBException("overwriteMode cannot be null!!");
            }
        }
        if (this.localRetainPublishStateTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "retainPublishState"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localRetainPublishState));
        }
        if (this.localDefaultSourceProfileHandleTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "defaultSourceProfileHandle"));

            if (this.localDefaultSourceProfileHandle != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localDefaultSourceProfileHandle));
            } else {
                throw new org.apache.axis2.databinding.ADBException("defaultSourceProfileHandle cannot be null!!");
            }
        }
        if (this.localDefaultDisplayProfileHandleTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "defaultDisplayProfileHandle"));

            if (this.localDefaultDisplayProfileHandle != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localDefaultDisplayProfileHandle));
            } else {
                throw new org.apache.axis2.databinding.ADBException("defaultDisplayProfileHandle cannot be null!!");
            }
        }
        if (this.localIptcExifMappingXsltHandleTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "iptcExifMappingXsltHandle"));

            if (this.localIptcExifMappingXsltHandle != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localIptcExifMappingXsltHandle));
            } else {
                throw new org.apache.axis2.databinding.ADBException("iptcExifMappingXsltHandle cannot be null!!");
            }
        }
        if (this.localXmpMappingXsltHandleTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "xmpMappingXsltHandle"));

            if (this.localXmpMappingXsltHandle != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localXmpMappingXsltHandle));
            } else {
                throw new org.apache.axis2.databinding.ADBException("xmpMappingXsltHandle cannot be null!!");
            }
        }
        if (this.localDiskSpaceWarningMinTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "diskSpaceWarningMin"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localDiskSpaceWarningMin));
        }
        if (this.localEmailTrashCleanupWarningTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "emailTrashCleanupWarning"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localEmailTrashCleanupWarning));
        }
        if (this.localFileExtOptTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "fileExtOpt"));

            if (this.localFileExtOpt != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localFileExtOpt));
            } else {
                throw new org.apache.axis2.databinding.ADBException("fileExtOpt cannot be null!!");
            }
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
        public static SetCompanySettingsParam parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            SetCompanySettingsParam object =
                    new SetCompanySettingsParam();

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

                        if (!"setCompanySettingsParam".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (SetCompanySettingsParam) com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExtensionMapper.getTypeObject(
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
                        "overwriteMode").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "overwriteMode" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setOverwriteMode(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "retainPublishState").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "retainPublishState" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setRetainPublishState(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "defaultSourceProfileHandle").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "defaultSourceProfileHandle" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setDefaultSourceProfileHandle(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "defaultDisplayProfileHandle").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "defaultDisplayProfileHandle" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setDefaultDisplayProfileHandle(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "iptcExifMappingXsltHandle").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "iptcExifMappingXsltHandle" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setIptcExifMappingXsltHandle(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "xmpMappingXsltHandle").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "xmpMappingXsltHandle" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setXmpMappingXsltHandle(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "diskSpaceWarningMin").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "diskSpaceWarningMin" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setDiskSpaceWarningMin(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setDiskSpaceWarningMin(java.lang.Integer.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "emailTrashCleanupWarning").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "emailTrashCleanupWarning" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setEmailTrashCleanupWarning(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "fileExtOpt").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "fileExtOpt" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFileExtOpt(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

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
           
    