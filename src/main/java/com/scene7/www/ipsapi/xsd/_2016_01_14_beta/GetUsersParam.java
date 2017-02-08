/**
 * GetUsersParam.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.scene7.www.ipsapi.xsd._2016_01_14_beta;

/**
 * GetUsersParam bean class
 */

public class GetUsersParam
        implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
            "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
            "getUsersParam",
            "ns1");

    /**
     * field for IncludeInvalid
     */

    protected boolean localIncludeInvalid;

    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localIncludeInvalidTracker = false;
    /**
     * field for IncludeInactive
     */

    protected boolean localIncludeInactive;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localIncludeInactiveTracker = false;
    /**
     * field for CompanyHandleArray
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.HandleArray localCompanyHandleArray;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localCompanyHandleArrayTracker = false;
    /**
     * field for GroupHandleArray
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.HandleArray localGroupHandleArray;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localGroupHandleArrayTracker = false;
    /**
     * field for UserRoleArray
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray localUserRoleArray;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localUserRoleArrayTracker = false;
    /**
     * field for CharFilterField
     */

    protected java.lang.String localCharFilterField;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localCharFilterFieldTracker = false;
    /**
     * field for CharFilter
     */

    protected java.lang.String localCharFilter;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localCharFilterTracker = false;
    /**
     * field for SortBy
     */

    protected java.lang.String localSortBy;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localSortByTracker = false;
    /**
     * field for RecordsPerPage
     */

    protected int localRecordsPerPage;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localRecordsPerPageTracker = false;
    /**
     * field for ResultsPage
     */

    protected int localResultsPage;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localResultsPageTracker = false;

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta")) {
            return "ns1";
        }
        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    public boolean isIncludeInvalidSpecified() {
        return this.localIncludeInvalidTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return boolean
     */
    public boolean getIncludeInvalid() {
        return this.localIncludeInvalid;
    }

    /**
     * Auto generated setter method
     *
     * @param param IncludeInvalid
     */
    public void setIncludeInvalid(boolean param) {

        // setting primitive attribute tracker to true
        this.localIncludeInvalidTracker =
                true;

        this.localIncludeInvalid = param;

    }

    public boolean isIncludeInactiveSpecified() {
        return this.localIncludeInactiveTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return boolean
     */
    public boolean getIncludeInactive() {
        return this.localIncludeInactive;
    }

    /**
     * Auto generated setter method
     *
     * @param param IncludeInactive
     */
    public void setIncludeInactive(boolean param) {

        // setting primitive attribute tracker to true
        this.localIncludeInactiveTracker =
                true;

        this.localIncludeInactive = param;

    }

    public boolean isCompanyHandleArraySpecified() {
        return this.localCompanyHandleArrayTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.HandleArray
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.HandleArray getCompanyHandleArray() {
        return this.localCompanyHandleArray;
    }

    /**
     * Auto generated setter method
     *
     * @param param CompanyHandleArray
     */
    public void setCompanyHandleArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.HandleArray param) {
        this.localCompanyHandleArrayTracker = param != null;

        this.localCompanyHandleArray = param;

    }

    public boolean isGroupHandleArraySpecified() {
        return this.localGroupHandleArrayTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.HandleArray
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.HandleArray getGroupHandleArray() {
        return this.localGroupHandleArray;
    }

    /**
     * Auto generated setter method
     *
     * @param param GroupHandleArray
     */
    public void setGroupHandleArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.HandleArray param) {
        this.localGroupHandleArrayTracker = param != null;

        this.localGroupHandleArray = param;

    }

    public boolean isUserRoleArraySpecified() {
        return this.localUserRoleArrayTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray getUserRoleArray() {
        return this.localUserRoleArray;
    }

    /**
     * Auto generated setter method
     *
     * @param param UserRoleArray
     */
    public void setUserRoleArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray param) {
        this.localUserRoleArrayTracker = param != null;

        this.localUserRoleArray = param;

    }

    public boolean isCharFilterFieldSpecified() {
        return this.localCharFilterFieldTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCharFilterField() {
        return this.localCharFilterField;
    }

    /**
     * Auto generated setter method
     *
     * @param param CharFilterField
     */
    public void setCharFilterField(java.lang.String param) {
        this.localCharFilterFieldTracker = param != null;

        this.localCharFilterField = param;

    }

    public boolean isCharFilterSpecified() {
        return this.localCharFilterTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCharFilter() {
        return this.localCharFilter;
    }

    /**
     * Auto generated setter method
     *
     * @param param CharFilter
     */
    public void setCharFilter(java.lang.String param) {
        this.localCharFilterTracker = param != null;

        this.localCharFilter = param;

    }

    public boolean isSortBySpecified() {
        return this.localSortByTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSortBy() {
        return this.localSortBy;
    }

    /**
     * Auto generated setter method
     *
     * @param param SortBy
     */
    public void setSortBy(java.lang.String param) {
        this.localSortByTracker = param != null;

        this.localSortBy = param;

    }

    public boolean isRecordsPerPageSpecified() {
        return this.localRecordsPerPageTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getRecordsPerPage() {
        return this.localRecordsPerPage;
    }

    /**
     * Auto generated setter method
     *
     * @param param RecordsPerPage
     */
    public void setRecordsPerPage(int param) {

        // setting primitive attribute tracker to true
        this.localRecordsPerPageTracker =
                param != java.lang.Integer.MIN_VALUE;

        this.localRecordsPerPage = param;

    }

    public boolean isResultsPageSpecified() {
        return this.localResultsPageTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getResultsPage() {
        return this.localResultsPage;
    }

    /**
     * Auto generated setter method
     *
     * @param param ResultsPage
     */
    public void setResultsPage(int param) {

        // setting primitive attribute tracker to true
        this.localResultsPageTracker =
                param != java.lang.Integer.MIN_VALUE;

        this.localResultsPage = param;

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
                        namespacePrefix + ":getUsersParam",
                        xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "getUsersParam",
                        xmlWriter);
            }

        }
        if (this.localIncludeInvalidTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "includeInvalid", xmlWriter);

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("includeInvalid cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localIncludeInvalid));
            }

            xmlWriter.writeEndElement();
        }
        if (this.localIncludeInactiveTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "includeInactive", xmlWriter);

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("includeInactive cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localIncludeInactive));
            }

            xmlWriter.writeEndElement();
        }
        if (this.localCompanyHandleArrayTracker) {
            if (this.localCompanyHandleArray == null) {
                throw new org.apache.axis2.databinding.ADBException("companyHandleArray cannot be null!!");
            }
            this.localCompanyHandleArray
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "companyHandleArray"),
                            xmlWriter);
        }
        if (this.localGroupHandleArrayTracker) {
            if (this.localGroupHandleArray == null) {
                throw new org.apache.axis2.databinding.ADBException("groupHandleArray cannot be null!!");
            }
            this.localGroupHandleArray
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "groupHandleArray"),
                            xmlWriter);
        }
        if (this.localUserRoleArrayTracker) {
            if (this.localUserRoleArray == null) {
                throw new org.apache.axis2.databinding.ADBException("userRoleArray cannot be null!!");
            }
            this.localUserRoleArray
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "userRoleArray"),
                            xmlWriter);
        }
        if (this.localCharFilterFieldTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "charFilterField", xmlWriter);

            if (this.localCharFilterField == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("charFilterField cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localCharFilterField);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localCharFilterTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "charFilter", xmlWriter);

            if (this.localCharFilter == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("charFilter cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localCharFilter);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localSortByTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "sortBy", xmlWriter);

            if (this.localSortBy == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("sortBy cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localSortBy);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localRecordsPerPageTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "recordsPerPage", xmlWriter);

            if (this.localRecordsPerPage == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("recordsPerPage cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localRecordsPerPage));
            }

            xmlWriter.writeEndElement();
        }
        if (this.localResultsPageTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "resultsPage", xmlWriter);

            if (this.localResultsPage == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("resultsPage cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localResultsPage));
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

        if (this.localIncludeInvalidTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "includeInvalid"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localIncludeInvalid));
        }
        if (this.localIncludeInactiveTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "includeInactive"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localIncludeInactive));
        }
        if (this.localCompanyHandleArrayTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "companyHandleArray"));

            if (this.localCompanyHandleArray == null) {
                throw new org.apache.axis2.databinding.ADBException("companyHandleArray cannot be null!!");
            }
            elementList.add(this.localCompanyHandleArray);
        }
        if (this.localGroupHandleArrayTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "groupHandleArray"));

            if (this.localGroupHandleArray == null) {
                throw new org.apache.axis2.databinding.ADBException("groupHandleArray cannot be null!!");
            }
            elementList.add(this.localGroupHandleArray);
        }
        if (this.localUserRoleArrayTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "userRoleArray"));

            if (this.localUserRoleArray == null) {
                throw new org.apache.axis2.databinding.ADBException("userRoleArray cannot be null!!");
            }
            elementList.add(this.localUserRoleArray);
        }
        if (this.localCharFilterFieldTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "charFilterField"));

            if (this.localCharFilterField != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localCharFilterField));
            } else {
                throw new org.apache.axis2.databinding.ADBException("charFilterField cannot be null!!");
            }
        }
        if (this.localCharFilterTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "charFilter"));

            if (this.localCharFilter != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localCharFilter));
            } else {
                throw new org.apache.axis2.databinding.ADBException("charFilter cannot be null!!");
            }
        }
        if (this.localSortByTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "sortBy"));

            if (this.localSortBy != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localSortBy));
            } else {
                throw new org.apache.axis2.databinding.ADBException("sortBy cannot be null!!");
            }
        }
        if (this.localRecordsPerPageTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "recordsPerPage"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localRecordsPerPage));
        }
        if (this.localResultsPageTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "resultsPage"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localResultsPage));
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
        public static GetUsersParam parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            GetUsersParam object =
                    new GetUsersParam();

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

                        if (!"getUsersParam".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (GetUsersParam) com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExtensionMapper.getTypeObject(
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
                        "includeInvalid").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "includeInvalid" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setIncludeInvalid(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "includeInactive").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "includeInactive" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setIncludeInactive(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "companyHandleArray").equals(reader.getName())) {

                    object.setCompanyHandleArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.HandleArray.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "groupHandleArray").equals(reader.getName())) {

                    object.setGroupHandleArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.HandleArray.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "userRoleArray").equals(reader.getName())) {

                    object.setUserRoleArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "charFilterField").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "charFilterField" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCharFilterField(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "charFilter").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "charFilter" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCharFilter(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "sortBy")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "sortBy" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSortBy(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "recordsPerPage").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "recordsPerPage" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setRecordsPerPage(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setRecordsPerPage(java.lang.Integer.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "resultsPage").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "resultsPage" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setResultsPage(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setResultsPage(java.lang.Integer.MIN_VALUE);

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
           
    