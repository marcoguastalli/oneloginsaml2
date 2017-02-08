/**
 * SearchFilter.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.scene7.www.ipsapi.xsd._2016_01_14_beta;

/**
 * SearchFilter bean class
 */

public class SearchFilter
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = SearchFilter
                Namespace URI = http://www.scene7.com/IpsApi/xsd/2016-01-14-beta
                Namespace Prefix = ns1
                */

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
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localIncludeSubfoldersTracker = false;
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
     * field for ProjectHandle
     */

    protected java.lang.String localProjectHandle;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localProjectHandleTracker = false;
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

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta")) {
            return "ns1";
        }
        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
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

    public boolean isIncludeSubfoldersSpecified() {
        return this.localIncludeSubfoldersTracker;
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

        // setting primitive attribute tracker to true
        this.localIncludeSubfoldersTracker =
                true;

        this.localIncludeSubfolders = param;

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
                        namespacePrefix + ":SearchFilter",
                        xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "SearchFilter",
                        xmlWriter);
            }

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
        if (this.localIncludeSubfoldersTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "includeSubfolders", xmlWriter);

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("includeSubfolders cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localIncludeSubfolders));
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

        if (this.localFolderTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "folder"));

            if (this.localFolder != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localFolder));
            } else {
                throw new org.apache.axis2.databinding.ADBException("folder cannot be null!!");
            }
        }
        if (this.localIncludeSubfoldersTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "includeSubfolders"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localIncludeSubfolders));
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
        if (this.localProjectHandleTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "projectHandle"));

            if (this.localProjectHandle != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localProjectHandle));
            } else {
                throw new org.apache.axis2.databinding.ADBException("projectHandle cannot be null!!");
            }
        }
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
        public static SearchFilter parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            SearchFilter object =
                    new SearchFilter();

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

                        if (!"SearchFilter".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (SearchFilter) com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExtensionMapper.getTypeObject(
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
           
    