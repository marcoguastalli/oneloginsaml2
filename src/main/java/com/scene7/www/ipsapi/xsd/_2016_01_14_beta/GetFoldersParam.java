/**
 * GetFoldersParam.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.scene7.www.ipsapi.xsd._2016_01_14_beta;

/**
 * GetFoldersParam bean class
 */

public class GetFoldersParam
        implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
            "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
            "getFoldersParam",
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
     * field for FolderPath
     */

    protected java.lang.String localFolderPath;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localFolderPathTracker = false;
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

    public boolean isFolderPathSpecified() {
        return this.localFolderPathTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getFolderPath() {
        return this.localFolderPath;
    }

    /**
     * Auto generated setter method
     *
     * @param param FolderPath
     */
    public void setFolderPath(java.lang.String param) {
        this.localFolderPathTracker = param != null;

        this.localFolderPath = param;

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
                        namespacePrefix + ":getFoldersParam",
                        xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "getFoldersParam",
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
        if (this.localFolderPathTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "folderPath", xmlWriter);

            if (this.localFolderPath == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("folderPath cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localFolderPath);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localAssetTypeArrayTracker) {
            if (this.localAssetTypeArray == null) {
                throw new org.apache.axis2.databinding.ADBException("assetTypeArray cannot be null!!");
            }
            this.localAssetTypeArray
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "assetTypeArray"),
                            xmlWriter);
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
        if (this.localFolderPathTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "folderPath"));

            if (this.localFolderPath != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localFolderPath));
            } else {
                throw new org.apache.axis2.databinding.ADBException("folderPath cannot be null!!");
            }
        }
        if (this.localAssetTypeArrayTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "assetTypeArray"));

            if (this.localAssetTypeArray == null) {
                throw new org.apache.axis2.databinding.ADBException("assetTypeArray cannot be null!!");
            }
            elementList.add(this.localAssetTypeArray);
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
        public static GetFoldersParam parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            GetFoldersParam object =
                    new GetFoldersParam();

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

                        if (!"getFoldersParam".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (GetFoldersParam) com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExtensionMapper.getTypeObject(
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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "folderPath").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "folderPath" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFolderPath(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

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
           
    