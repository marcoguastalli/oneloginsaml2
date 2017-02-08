/**
 * SearchAssetsByMetadataParam.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.scene7.www.ipsapi.xsd._2016_01_14_beta;

/**
 * SearchAssetsByMetadataParam bean class
 */

public class SearchAssetsByMetadataParam
        implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
            "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
            "searchAssetsByMetadataParam",
            "ns1");

    /**
     * field for CompanyHandle
     */

    protected java.lang.String localCompanyHandle;
    /**
     * field for Filters
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.SearchFilter localFilters;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localFiltersTracker = false;
    /**
     * field for MetadataConditionArray
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.MetadataConditionArray localMetadataConditionArray;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localMetadataConditionArrayTracker = false;
    /**
     * field for MetadataConditionMatchMode
     */

    protected java.lang.String localMetadataConditionMatchMode;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localMetadataConditionMatchModeTracker = false;
    /**
     * field for ResponseMetadataArray
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray localResponseMetadataArray;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localResponseMetadataArrayTracker = false;
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
     * field for SortDirection
     */

    protected java.lang.String localSortDirection;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localSortDirectionTracker = false;
    /**
     * field for HaystackSearch
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.HaystackSearch_type0 localHaystackSearch;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localHaystackSearchTracker = false;

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

    public boolean isFiltersSpecified() {
        return this.localFiltersTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.SearchFilter
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.SearchFilter getFilters() {
        return this.localFilters;
    }

    /**
     * Auto generated setter method
     *
     * @param param Filters
     */
    public void setFilters(com.scene7.www.ipsapi.xsd._2016_01_14_beta.SearchFilter param) {
        this.localFiltersTracker = param != null;

        this.localFilters = param;

    }

    public boolean isMetadataConditionArraySpecified() {
        return this.localMetadataConditionArrayTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.MetadataConditionArray
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.MetadataConditionArray getMetadataConditionArray() {
        return this.localMetadataConditionArray;
    }

    /**
     * Auto generated setter method
     *
     * @param param MetadataConditionArray
     */
    public void setMetadataConditionArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.MetadataConditionArray param) {
        this.localMetadataConditionArrayTracker = param != null;

        this.localMetadataConditionArray = param;

    }

    public boolean isMetadataConditionMatchModeSpecified() {
        return this.localMetadataConditionMatchModeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getMetadataConditionMatchMode() {
        return this.localMetadataConditionMatchMode;
    }

    /**
     * Auto generated setter method
     *
     * @param param MetadataConditionMatchMode
     */
    public void setMetadataConditionMatchMode(java.lang.String param) {
        this.localMetadataConditionMatchModeTracker = param != null;

        this.localMetadataConditionMatchMode = param;

    }

    public boolean isResponseMetadataArraySpecified() {
        return this.localResponseMetadataArrayTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray getResponseMetadataArray() {
        return this.localResponseMetadataArray;
    }

    /**
     * Auto generated setter method
     *
     * @param param ResponseMetadataArray
     */
    public void setResponseMetadataArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray param) {
        this.localResponseMetadataArrayTracker = param != null;

        this.localResponseMetadataArray = param;

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

    public boolean isSortDirectionSpecified() {
        return this.localSortDirectionTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSortDirection() {
        return this.localSortDirection;
    }

    /**
     * Auto generated setter method
     *
     * @param param SortDirection
     */
    public void setSortDirection(java.lang.String param) {
        this.localSortDirectionTracker = param != null;

        this.localSortDirection = param;

    }

    public boolean isHaystackSearchSpecified() {
        return this.localHaystackSearchTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.HaystackSearch_type0
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.HaystackSearch_type0 getHaystackSearch() {
        return this.localHaystackSearch;
    }

    /**
     * Auto generated setter method
     *
     * @param param HaystackSearch
     */
    public void setHaystackSearch(com.scene7.www.ipsapi.xsd._2016_01_14_beta.HaystackSearch_type0 param) {
        this.localHaystackSearchTracker = param != null;

        this.localHaystackSearch = param;

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
                        namespacePrefix + ":searchAssetsByMetadataParam",
                        xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "searchAssetsByMetadataParam",
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
        if (this.localFiltersTracker) {
            if (this.localFilters == null) {
                throw new org.apache.axis2.databinding.ADBException("filters cannot be null!!");
            }
            this.localFilters.serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "filters"),
                    xmlWriter);
        }
        if (this.localMetadataConditionArrayTracker) {
            if (this.localMetadataConditionArray == null) {
                throw new org.apache.axis2.databinding.ADBException("metadataConditionArray cannot be null!!");
            }
            this.localMetadataConditionArray
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "metadataConditionArray"),
                            xmlWriter);
        }
        if (this.localMetadataConditionMatchModeTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "metadataConditionMatchMode", xmlWriter);

            if (this.localMetadataConditionMatchMode == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("metadataConditionMatchMode cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localMetadataConditionMatchMode);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localResponseMetadataArrayTracker) {
            if (this.localResponseMetadataArray == null) {
                throw new org.apache.axis2.databinding.ADBException("responseMetadataArray cannot be null!!");
            }
            this.localResponseMetadataArray
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "responseMetadataArray"),
                            xmlWriter);
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
        if (this.localSortDirectionTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "sortDirection", xmlWriter);

            if (this.localSortDirection == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("sortDirection cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localSortDirection);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localHaystackSearchTracker) {
            if (this.localHaystackSearch == null) {
                throw new org.apache.axis2.databinding.ADBException("haystackSearch cannot be null!!");
            }
            this.localHaystackSearch
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "haystackSearch"),
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
        if (this.localFiltersTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "filters"));

            if (this.localFilters == null) {
                throw new org.apache.axis2.databinding.ADBException("filters cannot be null!!");
            }
            elementList.add(this.localFilters);
        }
        if (this.localMetadataConditionArrayTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "metadataConditionArray"));

            if (this.localMetadataConditionArray == null) {
                throw new org.apache.axis2.databinding.ADBException("metadataConditionArray cannot be null!!");
            }
            elementList.add(this.localMetadataConditionArray);
        }
        if (this.localMetadataConditionMatchModeTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "metadataConditionMatchMode"));

            if (this.localMetadataConditionMatchMode != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localMetadataConditionMatchMode));
            } else {
                throw new org.apache.axis2.databinding.ADBException("metadataConditionMatchMode cannot be null!!");
            }
        }
        if (this.localResponseMetadataArrayTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "responseMetadataArray"));

            if (this.localResponseMetadataArray == null) {
                throw new org.apache.axis2.databinding.ADBException("responseMetadataArray cannot be null!!");
            }
            elementList.add(this.localResponseMetadataArray);
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
        if (this.localSortByTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "sortBy"));

            if (this.localSortBy != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localSortBy));
            } else {
                throw new org.apache.axis2.databinding.ADBException("sortBy cannot be null!!");
            }
        }
        if (this.localSortDirectionTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "sortDirection"));

            if (this.localSortDirection != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localSortDirection));
            } else {
                throw new org.apache.axis2.databinding.ADBException("sortDirection cannot be null!!");
            }
        }
        if (this.localHaystackSearchTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "haystackSearch"));

            if (this.localHaystackSearch == null) {
                throw new org.apache.axis2.databinding.ADBException("haystackSearch cannot be null!!");
            }
            elementList.add(this.localHaystackSearch);
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
        public static SearchAssetsByMetadataParam parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            SearchAssetsByMetadataParam object =
                    new SearchAssetsByMetadataParam();

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

                        if (!"searchAssetsByMetadataParam".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (SearchAssetsByMetadataParam) com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExtensionMapper.getTypeObject(
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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "filters")
                        .equals(reader.getName())) {

                    object.setFilters(com.scene7.www.ipsapi.xsd._2016_01_14_beta.SearchFilter.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "metadataConditionArray").equals(reader.getName())) {

                    object.setMetadataConditionArray(
                            com.scene7.www.ipsapi.xsd._2016_01_14_beta.MetadataConditionArray.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "metadataConditionMatchMode").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "metadataConditionMatchMode" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMetadataConditionMatchMode(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "responseMetadataArray").equals(reader.getName())) {

                    object.setResponseMetadataArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray.Factory.parse(reader));

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
                        "sortDirection").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "sortDirection" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSortDirection(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "haystackSearch").equals(reader.getName())) {

                    object.setHaystackSearch(com.scene7.www.ipsapi.xsd._2016_01_14_beta.HaystackSearch_type0.Factory.parse(reader));

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
           
    