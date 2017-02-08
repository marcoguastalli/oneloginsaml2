/**
 * AssetSummary.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.scene7.www.ipsapi.xsd._2016_01_14_beta;

/**
 * AssetSummary bean class
 */

public class AssetSummary
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = AssetSummary
                Namespace URI = http://www.scene7.com/IpsApi/xsd/2016-01-14-beta
                Namespace Prefix = ns1
                */

    /**
     * field for AssetHandle
     */

    protected java.lang.String localAssetHandle;
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
     * field for Name
     */

    protected java.lang.String localName;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localNameTracker = false;
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
     * field for Filename
     */

    protected java.lang.String localFilename;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localFilenameTracker = false;
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
     * field for Score
     */

    protected double localScore;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localScoreTracker = false;
    /**
     * field for ScoreDetail
     */

    protected java.lang.String localScoreDetail;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localScoreDetailTracker = false;

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
    public java.lang.String getAssetHandle() {
        return this.localAssetHandle;
    }

    /**
     * Auto generated setter method
     *
     * @param param AssetHandle
     */
    public void setAssetHandle(java.lang.String param) {

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

    public boolean isFilenameSpecified() {
        return this.localFilenameTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getFilename() {
        return this.localFilename;
    }

    /**
     * Auto generated setter method
     *
     * @param param Filename
     */
    public void setFilename(java.lang.String param) {
        this.localFilenameTracker = param != null;

        this.localFilename = param;

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

    public boolean isScoreSpecified() {
        return this.localScoreTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return double
     */
    public double getScore() {
        return this.localScore;
    }

    /**
     * Auto generated setter method
     *
     * @param param Score
     */
    public void setScore(double param) {

        // setting primitive attribute tracker to true
        this.localScoreTracker =
                !java.lang.Double.isNaN(param);

        this.localScore = param;

    }

    public boolean isScoreDetailSpecified() {
        return this.localScoreDetailTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getScoreDetail() {
        return this.localScoreDetail;
    }

    /**
     * Auto generated setter method
     *
     * @param param ScoreDetail
     */
    public void setScoreDetail(java.lang.String param) {
        this.localScoreDetailTracker = param != null;

        this.localScoreDetail = param;

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
                        namespacePrefix + ":AssetSummary",
                        xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "AssetSummary",
                        xmlWriter);
            }

        }

        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "assetHandle", xmlWriter);

        if (this.localAssetHandle == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("assetHandle cannot be null!!");

        } else {

            xmlWriter.writeCharacters(this.localAssetHandle);

        }

        xmlWriter.writeEndElement();
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
        if (this.localFilenameTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "filename", xmlWriter);

            if (this.localFilename == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("filename cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localFilename);

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
        if (this.localScoreTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "score", xmlWriter);

            if (java.lang.Double.isNaN(this.localScore)) {

                throw new org.apache.axis2.databinding.ADBException("score cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localScore));
            }

            xmlWriter.writeEndElement();
        }
        if (this.localScoreDetailTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "scoreDetail", xmlWriter);

            if (this.localScoreDetail == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("scoreDetail cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localScoreDetail);

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
                "assetHandle"));

        if (this.localAssetHandle != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localAssetHandle));
        } else {
            throw new org.apache.axis2.databinding.ADBException("assetHandle cannot be null!!");
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
        if (this.localNameTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "name"));

            if (this.localName != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localName));
            } else {
                throw new org.apache.axis2.databinding.ADBException("name cannot be null!!");
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
        if (this.localFilenameTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "filename"));

            if (this.localFilename != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localFilename));
            } else {
                throw new org.apache.axis2.databinding.ADBException("filename cannot be null!!");
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
        if (this.localScoreTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "score"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localScore));
        }
        if (this.localScoreDetailTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "scoreDetail"));

            if (this.localScoreDetail != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localScoreDetail));
            } else {
                throw new org.apache.axis2.databinding.ADBException("scoreDetail cannot be null!!");
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
        public static AssetSummary parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            AssetSummary object =
                    new AssetSummary();

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

                        if (!"AssetSummary".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (AssetSummary) com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExtensionMapper.getTypeObject(
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
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "filename")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "filename" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFilename(
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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "score")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "score" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setScore(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setScore(java.lang.Double.NaN);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "scoreDetail").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "scoreDetail" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setScoreDetail(
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
           
    