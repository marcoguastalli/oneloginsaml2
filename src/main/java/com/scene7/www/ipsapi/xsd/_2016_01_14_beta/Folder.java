/**
 * Folder.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.scene7.www.ipsapi.xsd._2016_01_14_beta;

/**
 * Folder bean class
 */

public class Folder
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = Folder
                Namespace URI = http://www.scene7.com/IpsApi/xsd/2016-01-14-beta
                Namespace Prefix = ns1
                */

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
     * field for Path
     */

    protected java.lang.String localPath;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localPathTracker = false;
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
     * field for ChildLastModified
     */

    protected java.util.Calendar localChildLastModified;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localChildLastModifiedTracker = false;
    /**
     * field for PermissionSetHandle
     */

    protected java.lang.String localPermissionSetHandle;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localPermissionSetHandleTracker = false;
    /**
     * field for HasSubfolders
     */

    protected boolean localHasSubfolders;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localHasSubfoldersTracker = false;
    /**
     * field for SubfolderArray
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.FolderArray localSubfolderArray;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localSubfolderArrayTracker = false;

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta")) {
            return "ns1";
        }
        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
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

    public boolean isPathSpecified() {
        return this.localPathTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getPath() {
        return this.localPath;
    }

    /**
     * Auto generated setter method
     *
     * @param param Path
     */
    public void setPath(java.lang.String param) {
        this.localPathTracker = param != null;

        this.localPath = param;

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

    public boolean isChildLastModifiedSpecified() {
        return this.localChildLastModifiedTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getChildLastModified() {
        return this.localChildLastModified;
    }

    /**
     * Auto generated setter method
     *
     * @param param ChildLastModified
     */
    public void setChildLastModified(java.util.Calendar param) {
        this.localChildLastModifiedTracker = param != null;

        this.localChildLastModified = param;

    }

    public boolean isPermissionSetHandleSpecified() {
        return this.localPermissionSetHandleTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getPermissionSetHandle() {
        return this.localPermissionSetHandle;
    }

    /**
     * Auto generated setter method
     *
     * @param param PermissionSetHandle
     */
    public void setPermissionSetHandle(java.lang.String param) {
        this.localPermissionSetHandleTracker = param != null;

        this.localPermissionSetHandle = param;

    }

    public boolean isHasSubfoldersSpecified() {
        return this.localHasSubfoldersTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return boolean
     */
    public boolean getHasSubfolders() {
        return this.localHasSubfolders;
    }

    /**
     * Auto generated setter method
     *
     * @param param HasSubfolders
     */
    public void setHasSubfolders(boolean param) {

        // setting primitive attribute tracker to true
        this.localHasSubfoldersTracker =
                true;

        this.localHasSubfolders = param;

    }

    public boolean isSubfolderArraySpecified() {
        return this.localSubfolderArrayTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.FolderArray
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.FolderArray getSubfolderArray() {
        return this.localSubfolderArray;
    }

    /**
     * Auto generated setter method
     *
     * @param param SubfolderArray
     */
    public void setSubfolderArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.FolderArray param) {
        this.localSubfolderArrayTracker = param != null;

        this.localSubfolderArray = param;

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
                        namespacePrefix + ":Folder",
                        xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "Folder",
                        xmlWriter);
            }

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
        if (this.localPathTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "path", xmlWriter);

            if (this.localPath == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("path cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localPath);

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
        if (this.localChildLastModifiedTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "childLastModified", xmlWriter);

            if (this.localChildLastModified == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("childLastModified cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localChildLastModified));

            }

            xmlWriter.writeEndElement();
        }
        if (this.localPermissionSetHandleTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "permissionSetHandle", xmlWriter);

            if (this.localPermissionSetHandle == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("permissionSetHandle cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localPermissionSetHandle);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localHasSubfoldersTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "hasSubfolders", xmlWriter);

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("hasSubfolders cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localHasSubfolders));
            }

            xmlWriter.writeEndElement();
        }
        if (this.localSubfolderArrayTracker) {
            if (this.localSubfolderArray == null) {
                throw new org.apache.axis2.databinding.ADBException("subfolderArray cannot be null!!");
            }
            this.localSubfolderArray
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "subfolderArray"),
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

        if (this.localFolderHandleTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "folderHandle"));

            if (this.localFolderHandle != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localFolderHandle));
            } else {
                throw new org.apache.axis2.databinding.ADBException("folderHandle cannot be null!!");
            }
        }
        if (this.localPathTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "path"));

            if (this.localPath != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localPath));
            } else {
                throw new org.apache.axis2.databinding.ADBException("path cannot be null!!");
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
        if (this.localChildLastModifiedTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "childLastModified"));

            if (this.localChildLastModified != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localChildLastModified));
            } else {
                throw new org.apache.axis2.databinding.ADBException("childLastModified cannot be null!!");
            }
        }
        if (this.localPermissionSetHandleTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "permissionSetHandle"));

            if (this.localPermissionSetHandle != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localPermissionSetHandle));
            } else {
                throw new org.apache.axis2.databinding.ADBException("permissionSetHandle cannot be null!!");
            }
        }
        if (this.localHasSubfoldersTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "hasSubfolders"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localHasSubfolders));
        }
        if (this.localSubfolderArrayTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "subfolderArray"));

            if (this.localSubfolderArray == null) {
                throw new org.apache.axis2.databinding.ADBException("subfolderArray cannot be null!!");
            }
            elementList.add(this.localSubfolderArray);
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
        public static Folder parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            Folder object =
                    new Folder();

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

                        if (!"Folder".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (Folder) com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExtensionMapper.getTypeObject(
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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "path")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "path" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPath(
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
                        "childLastModified").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "childLastModified" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setChildLastModified(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "permissionSetHandle").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "permissionSetHandle" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPermissionSetHandle(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "hasSubfolders").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "hasSubfolders" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setHasSubfolders(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "subfolderArray").equals(reader.getName())) {

                    object.setSubfolderArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.FolderArray.Factory.parse(reader));

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
           
    