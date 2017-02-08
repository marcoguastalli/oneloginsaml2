/**
 * UpdateVignettePublishFormatParam.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.scene7.www.ipsapi.xsd._2016_01_14_beta;

/**
 *  UpdateVignettePublishFormatParam bean class
 */
@SuppressWarnings({ "unchecked", "unused" })

public class UpdateVignettePublishFormatParam
        implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
            "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
            "updateVignettePublishFormatParam",
            "ns1");

    /**
     * field for CompanyHandle
     */

    protected java.lang.String localCompanyHandle;
    /**
     * field for VignetteFormatHandle
     */

    protected java.lang.String localVignetteFormatHandle;
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
     * field for TargetWidth
     */

    protected int localTargetWidth;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localTargetWidthTracker = false;
    /**
     * field for TargetHeight
     */

    protected int localTargetHeight;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localTargetHeightTracker = false;
    /**
     * field for CreatePyramid
     */

    protected boolean localCreatePyramid;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localCreatePyramidTracker = false;
    /**
     * field for ThumbWidth
     */

    protected int localThumbWidth;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localThumbWidthTracker = false;
    /**
     * field for SaveAsVersion
     */

    protected int localSaveAsVersion;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localSaveAsVersionTracker = false;
    /**
     * field for SizeSuffixSeparator
     */

    protected java.lang.String localSizeSuffixSeparator;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localSizeSuffixSeparatorTracker = false;
    /**
     * field for Sharpen
     */

    protected int localSharpen;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localSharpenTracker = false;
    /**
     * field for UsmAmount
     */

    protected double localUsmAmount;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localUsmAmountTracker = false;
    /**
     * field for UsmRadius
     */

    protected double localUsmRadius;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localUsmRadiusTracker = false;
    /**
     * field for UsmThreshold
     */

    protected int localUsmThreshold;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localUsmThresholdTracker = false;

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta")) {
            return "ns1";
        }
        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCompanyHandle() {
        return localCompanyHandle;
    }

    /**
     * Auto generated setter method
     * @param param CompanyHandle
     */
    public void setCompanyHandle(java.lang.String param) {

        this.localCompanyHandle = param;

    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getVignetteFormatHandle() {
        return localVignetteFormatHandle;
    }

    /**
     * Auto generated setter method
     * @param param VignetteFormatHandle
     */
    public void setVignetteFormatHandle(java.lang.String param) {

        this.localVignetteFormatHandle = param;

    }

    public boolean isNameSpecified() {
        return localNameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getName() {
        return localName;
    }

    /**
     * Auto generated setter method
     * @param param Name
     */
    public void setName(java.lang.String param) {
        localNameTracker = param != null;

        this.localName = param;

    }

    public boolean isTargetWidthSpecified() {
        return localTargetWidthTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getTargetWidth() {
        return localTargetWidth;
    }

    /**
     * Auto generated setter method
     * @param param TargetWidth
     */
    public void setTargetWidth(int param) {

        // setting primitive attribute tracker to true
        localTargetWidthTracker =
                param != java.lang.Integer.MIN_VALUE;

        this.localTargetWidth = param;

    }

    public boolean isTargetHeightSpecified() {
        return localTargetHeightTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getTargetHeight() {
        return localTargetHeight;
    }

    /**
     * Auto generated setter method
     * @param param TargetHeight
     */
    public void setTargetHeight(int param) {

        // setting primitive attribute tracker to true
        localTargetHeightTracker =
                param != java.lang.Integer.MIN_VALUE;

        this.localTargetHeight = param;

    }

    public boolean isCreatePyramidSpecified() {
        return localCreatePyramidTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getCreatePyramid() {
        return localCreatePyramid;
    }

    /**
     * Auto generated setter method
     * @param param CreatePyramid
     */
    public void setCreatePyramid(boolean param) {

        // setting primitive attribute tracker to true
        localCreatePyramidTracker =
                true;

        this.localCreatePyramid = param;

    }

    public boolean isThumbWidthSpecified() {
        return localThumbWidthTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getThumbWidth() {
        return localThumbWidth;
    }

    /**
     * Auto generated setter method
     * @param param ThumbWidth
     */
    public void setThumbWidth(int param) {

        // setting primitive attribute tracker to true
        localThumbWidthTracker =
                param != java.lang.Integer.MIN_VALUE;

        this.localThumbWidth = param;

    }

    public boolean isSaveAsVersionSpecified() {
        return localSaveAsVersionTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getSaveAsVersion() {
        return localSaveAsVersion;
    }

    /**
     * Auto generated setter method
     * @param param SaveAsVersion
     */
    public void setSaveAsVersion(int param) {

        // setting primitive attribute tracker to true
        localSaveAsVersionTracker =
                param != java.lang.Integer.MIN_VALUE;

        this.localSaveAsVersion = param;

    }

    public boolean isSizeSuffixSeparatorSpecified() {
        return localSizeSuffixSeparatorTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getSizeSuffixSeparator() {
        return localSizeSuffixSeparator;
    }

    /**
     * Auto generated setter method
     * @param param SizeSuffixSeparator
     */
    public void setSizeSuffixSeparator(java.lang.String param) {
        localSizeSuffixSeparatorTracker = param != null;

        this.localSizeSuffixSeparator = param;

    }

    public boolean isSharpenSpecified() {
        return localSharpenTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getSharpen() {
        return localSharpen;
    }

    /**
     * Auto generated setter method
     * @param param Sharpen
     */
    public void setSharpen(int param) {

        // setting primitive attribute tracker to true
        localSharpenTracker =
                param != java.lang.Integer.MIN_VALUE;

        this.localSharpen = param;

    }

    public boolean isUsmAmountSpecified() {
        return localUsmAmountTracker;
    }

    /**
     * Auto generated getter method
     * @return double
     */
    public double getUsmAmount() {
        return localUsmAmount;
    }

    /**
     * Auto generated setter method
     * @param param UsmAmount
     */
    public void setUsmAmount(double param) {

        // setting primitive attribute tracker to true
        localUsmAmountTracker =
                !java.lang.Double.isNaN(param);

        this.localUsmAmount = param;

    }

    public boolean isUsmRadiusSpecified() {
        return localUsmRadiusTracker;
    }

    /**
     * Auto generated getter method
     * @return double
     */
    public double getUsmRadius() {
        return localUsmRadius;
    }

    /**
     * Auto generated setter method
     * @param param UsmRadius
     */
    public void setUsmRadius(double param) {

        // setting primitive attribute tracker to true
        localUsmRadiusTracker =
                !java.lang.Double.isNaN(param);

        this.localUsmRadius = param;

    }

    public boolean isUsmThresholdSpecified() {
        return localUsmThresholdTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getUsmThreshold() {
        return localUsmThreshold;
    }

    /**
     * Auto generated setter method
     * @param param UsmThreshold
     */
    public void setUsmThreshold(int param) {

        // setting primitive attribute tracker to true
        localUsmThresholdTracker =
                param != java.lang.Integer.MIN_VALUE;

        this.localUsmThreshold = param;

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
                        namespacePrefix + ":updateVignettePublishFormatParam",
                        xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "updateVignettePublishFormatParam",
                        xmlWriter);
            }

        }

        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "companyHandle", xmlWriter);

        if (localCompanyHandle == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("companyHandle cannot be null!!");

        } else {

            xmlWriter.writeCharacters(localCompanyHandle);

        }

        xmlWriter.writeEndElement();

        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "vignetteFormatHandle", xmlWriter);

        if (localVignetteFormatHandle == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("vignetteFormatHandle cannot be null!!");

        } else {

            xmlWriter.writeCharacters(localVignetteFormatHandle);

        }

        xmlWriter.writeEndElement();
        if (localNameTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "name", xmlWriter);

            if (localName == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("name cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localName);

            }

            xmlWriter.writeEndElement();
        }
        if (localTargetWidthTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "targetWidth", xmlWriter);

            if (localTargetWidth == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("targetWidth cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTargetWidth));
            }

            xmlWriter.writeEndElement();
        }
        if (localTargetHeightTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "targetHeight", xmlWriter);

            if (localTargetHeight == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("targetHeight cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTargetHeight));
            }

            xmlWriter.writeEndElement();
        }
        if (localCreatePyramidTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "createPyramid", xmlWriter);

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("createPyramid cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreatePyramid));
            }

            xmlWriter.writeEndElement();
        }
        if (localThumbWidthTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "thumbWidth", xmlWriter);

            if (localThumbWidth == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("thumbWidth cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localThumbWidth));
            }

            xmlWriter.writeEndElement();
        }
        if (localSaveAsVersionTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "saveAsVersion", xmlWriter);

            if (localSaveAsVersion == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("saveAsVersion cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSaveAsVersion));
            }

            xmlWriter.writeEndElement();
        }
        if (localSizeSuffixSeparatorTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "sizeSuffixSeparator", xmlWriter);

            if (localSizeSuffixSeparator == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("sizeSuffixSeparator cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localSizeSuffixSeparator);

            }

            xmlWriter.writeEndElement();
        }
        if (localSharpenTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "sharpen", xmlWriter);

            if (localSharpen == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("sharpen cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSharpen));
            }

            xmlWriter.writeEndElement();
        }
        if (localUsmAmountTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "usmAmount", xmlWriter);

            if (java.lang.Double.isNaN(localUsmAmount)) {

                throw new org.apache.axis2.databinding.ADBException("usmAmount cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUsmAmount));
            }

            xmlWriter.writeEndElement();
        }
        if (localUsmRadiusTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "usmRadius", xmlWriter);

            if (java.lang.Double.isNaN(localUsmRadius)) {

                throw new org.apache.axis2.databinding.ADBException("usmRadius cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUsmRadius));
            }

            xmlWriter.writeEndElement();
        }
        if (localUsmThresholdTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "usmThreshold", xmlWriter);

            if (localUsmThreshold == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("usmThreshold cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUsmThreshold));
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
                "companyHandle"));

        if (localCompanyHandle != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCompanyHandle));
        } else {
            throw new org.apache.axis2.databinding.ADBException("companyHandle cannot be null!!");
        }

        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "vignetteFormatHandle"));

        if (localVignetteFormatHandle != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVignetteFormatHandle));
        } else {
            throw new org.apache.axis2.databinding.ADBException("vignetteFormatHandle cannot be null!!");
        }
        if (localNameTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "name"));

            if (localName != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
            } else {
                throw new org.apache.axis2.databinding.ADBException("name cannot be null!!");
            }
        }
        if (localTargetWidthTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "targetWidth"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTargetWidth));
        }
        if (localTargetHeightTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "targetHeight"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTargetHeight));
        }
        if (localCreatePyramidTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "createPyramid"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreatePyramid));
        }
        if (localThumbWidthTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "thumbWidth"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localThumbWidth));
        }
        if (localSaveAsVersionTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "saveAsVersion"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSaveAsVersion));
        }
        if (localSizeSuffixSeparatorTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "sizeSuffixSeparator"));

            if (localSizeSuffixSeparator != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSizeSuffixSeparator));
            } else {
                throw new org.apache.axis2.databinding.ADBException("sizeSuffixSeparator cannot be null!!");
            }
        }
        if (localSharpenTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "sharpen"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSharpen));
        }
        if (localUsmAmountTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "usmAmount"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUsmAmount));
        }
        if (localUsmRadiusTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "usmRadius"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUsmRadius));
        }
        if (localUsmThresholdTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "usmThreshold"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUsmThreshold));
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
        public static UpdateVignettePublishFormatParam parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            UpdateVignettePublishFormatParam object =
                    new UpdateVignettePublishFormatParam();

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

                        if (!"updateVignettePublishFormatParam".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (UpdateVignettePublishFormatParam) com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExtensionMapper
                                    .getTypeObject(
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
                        "vignetteFormatHandle").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "vignetteFormatHandle" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setVignetteFormatHandle(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "targetWidth").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "targetWidth" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTargetWidth(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setTargetWidth(java.lang.Integer.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "targetHeight").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "targetHeight" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTargetHeight(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setTargetHeight(java.lang.Integer.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "createPyramid").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "createPyramid" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCreatePyramid(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "thumbWidth").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "thumbWidth" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setThumbWidth(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setThumbWidth(java.lang.Integer.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "saveAsVersion").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "saveAsVersion" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSaveAsVersion(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setSaveAsVersion(java.lang.Integer.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "sizeSuffixSeparator").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "sizeSuffixSeparator" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSizeSuffixSeparator(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "sharpen")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "sharpen" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSharpen(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setSharpen(java.lang.Integer.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "usmAmount").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "usmAmount" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setUsmAmount(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setUsmAmount(java.lang.Double.NaN);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "usmRadius").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "usmRadius" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setUsmRadius(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setUsmRadius(java.lang.Double.NaN);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "usmThreshold").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "usmThreshold" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setUsmThreshold(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setUsmThreshold(java.lang.Integer.MIN_VALUE);

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
           
    