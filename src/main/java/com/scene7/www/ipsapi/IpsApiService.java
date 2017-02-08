/**
 * IpsApiService.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.scene7.www.ipsapi;

    /*
     *  IpsApiService java interface
     */

public interface IpsApiService {

    /**
     * Auto generated method signature
     *
     * @param setFolderPermissionsParam173
     * @param authHeader174
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetFolderPermissionsReturn setFolderPermissions(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetFolderPermissionsParam setFolderPermissionsParam173,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader174)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param setFolderPermissionsParam173
     * @param authHeader174
     */
    public void startsetFolderPermissions(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetFolderPermissionsParam setFolderPermissionsParam173,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader174,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param removeAssetPermissionsParam176
     * @param authHeader177
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.RemoveAssetPermissionsReturn removeAssetPermissions(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.RemoveAssetPermissionsParam removeAssetPermissionsParam176,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader177)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param removeAssetPermissionsParam176
     * @param authHeader177
     */
    public void startremoveAssetPermissions(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.RemoveAssetPermissionsParam removeAssetPermissionsParam176,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader177,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param submitJobParam179
     * @param authHeader180
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.SubmitJobReturn submitJob(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SubmitJobParam submitJobParam179,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader180)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param submitJobParam179
     * @param authHeader180
     */
    public void startsubmitJob(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SubmitJobParam submitJobParam179,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader180,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param replaceImageParam182
     * @param authHeader183
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.ReplaceImageReturn replaceImage(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.ReplaceImageParam replaceImageParam182,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader183)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param replaceImageParam182
     * @param authHeader183
     */
    public void startreplaceImage(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.ReplaceImageParam replaceImageParam182,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader183,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getAllCompaniesParam185
     * @param authHeader186
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAllCompaniesReturn getAllCompanies(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAllCompaniesParam getAllCompaniesParam185,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader186)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getAllCompaniesParam185
     * @param authHeader186
     */
    public void startgetAllCompanies(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAllCompaniesParam getAllCompaniesParam185,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader186,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param deleteAssetMetadataParam188
     * @param authHeader189
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteAssetMetadataReturn deleteAssetMetadata(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteAssetMetadataParam deleteAssetMetadataParam188,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader189)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param deleteAssetMetadataParam188
     * @param authHeader189
     */
    public void startdeleteAssetMetadata(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteAssetMetadataParam deleteAssetMetadataParam188,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader189,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param checkLoginParam191
     * @param authHeader192
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.CheckLoginReturn checkLogin(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CheckLoginParam checkLoginParam191,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader192)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param checkLoginParam191
     * @param authHeader192
     */
    public void startcheckLogin(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CheckLoginParam checkLoginParam191,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader192,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getDistinctMetadataValuesParam194
     * @param authHeader195
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetDistinctMetadataValuesReturn getDistinctMetadataValues(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetDistinctMetadataValuesParam getDistinctMetadataValuesParam194,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader195)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getDistinctMetadataValuesParam194
     * @param authHeader195
     */
    public void startgetDistinctMetadataValues(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetDistinctMetadataValuesParam getDistinctMetadataValuesParam194,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader195,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param updateImageSetParam197
     * @param authHeader198
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateImageSetReturn updateImageSet(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateImageSetParam updateImageSetParam197,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader198)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param updateImageSetParam197
     * @param authHeader198
     */
    public void startupdateImageSet(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateImageSetParam updateImageSetParam197,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader198,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getAssetPublishHistoryParam200
     * @param authHeader201
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAssetPublishHistoryReturn getAssetPublishHistory(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAssetPublishHistoryParam getAssetPublishHistoryParam200,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader201)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getAssetPublishHistoryParam200
     * @param authHeader201
     */
    public void startgetAssetPublishHistory(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAssetPublishHistoryParam getAssetPublishHistoryParam200,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader201,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param setCompanySettingsParam203
     * @param authHeader204
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetCompanySettingsReturn setCompanySettings(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetCompanySettingsParam setCompanySettingsParam203,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader204)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param setCompanySettingsParam203
     * @param authHeader204
     */
    public void startsetCompanySettings(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetCompanySettingsParam setCompanySettingsParam203,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader204,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getMetadataSchemaNamespacesParam206
     * @param authHeader207
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetMetadataSchemaNamespacesReturn getMetadataSchemaNamespaces(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetMetadataSchemaNamespacesParam getMetadataSchemaNamespacesParam206,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader207)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getMetadataSchemaNamespacesParam206
     * @param authHeader207
     */
    public void startgetMetadataSchemaNamespaces(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetMetadataSchemaNamespacesParam getMetadataSchemaNamespacesParam206,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader207,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getPropertySetsParam209
     * @param authHeader210
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetPropertySetsReturn getPropertySets(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetPropertySetsParam getPropertySetsParam209,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader210)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getPropertySetsParam209
     * @param authHeader210
     */
    public void startgetPropertySets(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetPropertySetsParam getPropertySetsParam209,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader210,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param applyMetadataTemplateParam212
     * @param authHeader213
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.ApplyMetadataTemplateReturn applyMetadataTemplate(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.ApplyMetadataTemplateParam applyMetadataTemplateParam212,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader213)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param applyMetadataTemplateParam212
     * @param authHeader213
     */
    public void startapplyMetadataTemplate(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.ApplyMetadataTemplateParam applyMetadataTemplateParam212,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader213,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param deleteGroupParam215
     * @param authHeader216
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteGroupReturn deleteGroup(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteGroupParam deleteGroupParam215,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader216)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param deleteGroupParam215
     * @param authHeader216
     */
    public void startdeleteGroup(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteGroupParam deleteGroupParam215,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader216,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getAssetsParam218
     * @param authHeader219
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAssetsReturn getAssets(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAssetsParam getAssetsParam218,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader219)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getAssetsParam218
     * @param authHeader219
     */
    public void startgetAssets(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAssetsParam getAssetsParam218,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader219,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getCompanySettingsParam221
     * @param authHeader222
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetCompanySettingsReturn getCompanySettings(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetCompanySettingsParam getCompanySettingsParam221,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader222)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getCompanySettingsParam221
     * @param authHeader222
     */
    public void startgetCompanySettings(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetCompanySettingsParam getCompanySettingsParam221,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader222,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param deletePropertySetParam224
     * @param authHeader225
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeletePropertySetReturn deletePropertySet(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeletePropertySetParam deletePropertySetParam224,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader225)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param deletePropertySetParam224
     * @param authHeader225
     */
    public void startdeletePropertySet(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeletePropertySetParam deletePropertySetParam224,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader225,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getActiveJobsParam227
     * @param authHeader228
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetActiveJobsReturn getActiveJobs(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetActiveJobsParam getActiveJobsParam227,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader228)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getActiveJobsParam227
     * @param authHeader228
     */
    public void startgetActiveJobs(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetActiveJobsParam getActiveJobsParam227,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader228,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param copyImageParam230
     * @param authHeader231
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.CopyImageReturn copyImage(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CopyImageParam copyImageParam230,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader231)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param copyImageParam230
     * @param authHeader231
     */
    public void startcopyImage(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CopyImageParam copyImageParam230,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader231,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param batchSetFontFieldsParam233
     * @param authHeader234
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.BatchSetFontFieldsReturn batchSetFontFields(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.BatchSetFontFieldsParam batchSetFontFieldsParam233,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader234)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param batchSetFontFieldsParam233
     * @param authHeader234
     */
    public void startbatchSetFontFields(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.BatchSetFontFieldsParam batchSetFontFieldsParam233,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader234,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getPropertySetTypeParam236
     * @param authHeader237
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetPropertySetTypeReturn getPropertySetType(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetPropertySetTypeParam getPropertySetTypeParam236,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader237)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getPropertySetTypeParam236
     * @param authHeader237
     */
    public void startgetPropertySetType(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetPropertySetTypeParam getPropertySetTypeParam236,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader237,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param removeCompanyMembershipParam239
     * @param authHeader240
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.RemoveCompanyMembershipReturn removeCompanyMembership(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.RemoveCompanyMembershipParam removeCompanyMembershipParam239,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader240)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param removeCompanyMembershipParam239
     * @param authHeader240
     */
    public void startremoveCompanyMembership(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.RemoveCompanyMembershipParam removeCompanyMembershipParam239,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader240,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param batchSetImageFieldsParam242
     * @param authHeader243
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.BatchSetImageFieldsReturn batchSetImageFields(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.BatchSetImageFieldsParam batchSetImageFieldsParam242,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader243)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param batchSetImageFieldsParam242
     * @param authHeader243
     */
    public void startbatchSetImageFields(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.BatchSetImageFieldsParam batchSetImageFieldsParam242,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader243,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param saveImageMapParam245
     * @param authHeader246
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.SaveImageMapReturn saveImageMap(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SaveImageMapParam saveImageMapParam245,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader246)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param saveImageMapParam245
     * @param authHeader246
     */
    public void startsaveImageMap(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SaveImageMapParam saveImageMapParam245,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader246,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getScheduledJobsParam248
     * @param authHeader249
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetScheduledJobsReturn getScheduledJobs(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetScheduledJobsParam getScheduledJobsParam248,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader249)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getScheduledJobsParam248
     * @param authHeader249
     */
    public void startgetScheduledJobs(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetScheduledJobsParam getScheduledJobsParam248,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader249,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param setAssetsPublishStateParam251
     * @param authHeader252
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetAssetsPublishStateReturn setAssetsPublishState(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetAssetsPublishStateParam setAssetsPublishStateParam251,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader252)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param setAssetsPublishStateParam251
     * @param authHeader252
     */
    public void startsetAssetsPublishState(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetAssetsPublishStateParam setAssetsPublishStateParam251,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader252,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getUserInfoParam254
     * @param authHeader255
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetUserInfoReturn getUserInfo(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetUserInfoParam getUserInfoParam254,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader255)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getUserInfoParam254
     * @param authHeader255
     */
    public void startgetUserInfo(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetUserInfoParam getUserInfoParam254,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader255,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param deleteAssetParam257
     * @param authHeader258
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteAssetReturn deleteAsset(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteAssetParam deleteAssetParam257,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader258)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param deleteAssetParam257
     * @param authHeader258
     */
    public void startdeleteAsset(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteAssetParam deleteAssetParam257,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader258,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getImageServingPublishSettingsParam260
     * @param authHeader261
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetImageServingPublishSettingsReturn getImageServingPublishSettings(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetImageServingPublishSettingsParam getImageServingPublishSettingsParam260,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader261)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getImageServingPublishSettingsParam260
     * @param authHeader261
     */
    public void startgetImageServingPublishSettings(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetImageServingPublishSettingsParam getImageServingPublishSettingsParam260,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader261,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param setPasswordParam263
     * @param authHeader264
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetPasswordReturn setPassword(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetPasswordParam setPasswordParam263,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader264)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param setPasswordParam263
     * @param authHeader264
     */
    public void startsetPassword(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetPasswordParam setPasswordParam263,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader264,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param setAssetsContextStateParam266
     * @param authHeader267
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetAssetsContextStateReturn setAssetsContextState(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetAssetsContextStateParam setAssetsContextStateParam266,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader267)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param setAssetsContextStateParam266
     * @param authHeader267
     */
    public void startsetAssetsContextState(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetAssetsContextStateParam setAssetsContextStateParam266,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader267,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param updateCompanyMetadataParam269
     * @param authHeader270
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateCompanyMetadataReturn updateCompanyMetadata(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateCompanyMetadataParam updateCompanyMetadataParam269,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader270)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param updateCompanyMetadataParam269
     * @param authHeader270
     */
    public void startupdateCompanyMetadata(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateCompanyMetadataParam updateCompanyMetadataParam269,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader270,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param deleteMetadataFieldParam272
     * @param authHeader273
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteMetadataFieldReturn deleteMetadataField(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteMetadataFieldParam deleteMetadataFieldParam272,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader273)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param deleteMetadataFieldParam272
     * @param authHeader273
     */
    public void startdeleteMetadataField(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteMetadataFieldParam deleteMetadataFieldParam272,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader273,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param updateAssetPermissionsParam275
     * @param authHeader276
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateAssetPermissionsReturn updateAssetPermissions(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateAssetPermissionsParam updateAssetPermissionsParam275,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader276)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param updateAssetPermissionsParam275
     * @param authHeader276
     */
    public void startupdateAssetPermissions(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateAssetPermissionsParam updateAssetPermissionsParam275,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader276,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param setAssetSetDefinitionParam278
     * @param authHeader279
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetAssetSetDefinitionReturn setAssetSetDefinition(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetAssetSetDefinitionParam setAssetSetDefinitionParam278,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader279)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param setAssetSetDefinitionParam278
     * @param authHeader279
     */
    public void startsetAssetSetDefinition(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetAssetSetDefinitionParam setAssetSetDefinitionParam278,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader279,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getUserCharsParam281
     * @param authHeader282
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetUserCharsReturn getUserChars(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetUserCharsParam getUserCharsParam281,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader282)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getUserCharsParam281
     * @param authHeader282
     */
    public void startgetUserChars(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetUserCharsParam getUserCharsParam281,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader282,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param renameFolderParam284
     * @param authHeader285
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.RenameFolderReturn renameFolder(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.RenameFolderParam renameFolderParam284,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader285)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param renameFolderParam284
     * @param authHeader285
     */
    public void startrenameFolder(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.RenameFolderParam renameFolderParam284,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader285,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param batchSetIccProfileFieldsParam287
     * @param authHeader288
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.BatchSetIccProfileFieldsReturn batchSetIccProfileFields(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.BatchSetIccProfileFieldsParam batchSetIccProfileFieldsParam287,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader288)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param batchSetIccProfileFieldsParam287
     * @param authHeader288
     */
    public void startbatchSetIccProfileFields(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.BatchSetIccProfileFieldsParam batchSetIccProfileFieldsParam287,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader288,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param createProjectParam290
     * @param authHeader291
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateProjectReturn createProject(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateProjectParam createProjectParam290,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader291)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param createProjectParam290
     * @param authHeader291
     */
    public void startcreateProject(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateProjectParam createProjectParam290,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader291,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param updatePropertySetPermissionsParam293
     * @param authHeader294
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdatePropertySetPermissionsReturn updatePropertySetPermissions(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdatePropertySetPermissionsParam updatePropertySetPermissionsParam293,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader294)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param updatePropertySetPermissionsParam293
     * @param authHeader294
     */
    public void startupdatePropertySetPermissions(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdatePropertySetPermissionsParam updatePropertySetPermissionsParam293,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader294,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param createVignettePublishFormatParam296
     * @param authHeader297
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateVignettePublishFormatReturn createVignettePublishFormat(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateVignettePublishFormatParam createVignettePublishFormatParam296,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader297)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param createVignettePublishFormatParam296
     * @param authHeader297
     */
    public void startcreateVignettePublishFormat(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateVignettePublishFormatParam createVignettePublishFormatParam296,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader297,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param setViewerConfigSettingsParam299
     * @param authHeader300
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetViewerConfigSettingsReturn setViewerConfigSettings(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetViewerConfigSettingsParam setViewerConfigSettingsParam299,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader300)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param setViewerConfigSettingsParam299
     * @param authHeader300
     */
    public void startsetViewerConfigSettings(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetViewerConfigSettingsParam setViewerConfigSettingsParam299,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader300,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param pauseJobParam302
     * @param authHeader303
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.PauseJobReturn pauseJob(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.PauseJobParam pauseJobParam302,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader303)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param pauseJobParam302
     * @param authHeader303
     */
    public void startpauseJob(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.PauseJobParam pauseJobParam302,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader303,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param addTagFieldValuesParam305
     * @param authHeader306
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.AddTagFieldValuesReturn addTagFieldValues(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AddTagFieldValuesParam addTagFieldValuesParam305,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader306)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param addTagFieldValuesParam305
     * @param authHeader306
     */
    public void startaddTagFieldValues(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AddTagFieldValuesParam addTagFieldValuesParam305,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader306,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getMediaPortalEventParam308
     * @param authHeader309
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetMediaPortalEventReturn getMediaPortalEvent(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetMediaPortalEventParam getMediaPortalEventParam308,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader309)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getMediaPortalEventParam308
     * @param authHeader309
     */
    public void startgetMediaPortalEvent(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetMediaPortalEventParam getMediaPortalEventParam308,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader309,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getJobLogDetailsParam311
     * @param authHeader312
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetJobLogDetailsReturn getJobLogDetails(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetJobLogDetailsParam getJobLogDetailsParam311,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader312)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getJobLogDetailsParam311
     * @param authHeader312
     */
    public void startgetJobLogDetails(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetJobLogDetailsParam getJobLogDetailsParam311,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader312,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getSystemPropertiesParam314
     * @param authHeader315
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetSystemPropertiesReturn getSystemProperties(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetSystemPropertiesParam getSystemPropertiesParam314,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader315)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getSystemPropertiesParam314
     * @param authHeader315
     */
    public void startgetSystemProperties(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetSystemPropertiesParam getSystemPropertiesParam314,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader315,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param removePropertySetPermissionsParam317
     * @param authHeader318
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.RemovePropertySetPermissionsReturn removePropertySetPermissions(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.RemovePropertySetPermissionsParam removePropertySetPermissionsParam317,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader318)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param removePropertySetPermissionsParam317
     * @param authHeader318
     */
    public void startremovePropertySetPermissions(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.RemovePropertySetPermissionsParam removePropertySetPermissionsParam317,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader318,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getAssetCountsParam320
     * @param authHeader321
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAssetCountsReturn getAssetCounts(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAssetCountsParam getAssetCountsParam320,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader321)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getAssetCountsParam320
     * @param authHeader321
     */
    public void startgetAssetCounts(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAssetCountsParam getAssetCountsParam320,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader321,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getGroupMembershipParam323
     * @param authHeader324
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetGroupMembershipReturn getGroupMembership(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetGroupMembershipParam getGroupMembershipParam323,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader324)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getGroupMembershipParam323
     * @param authHeader324
     */
    public void startgetGroupMembership(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetGroupMembershipParam getGroupMembershipParam323,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader324,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getGenerationInfoParam326
     * @param authHeader327
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetGenerationInfoReturn getGenerationInfo(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetGenerationInfoParam getGenerationInfoParam326,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader327)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getGenerationInfoParam326
     * @param authHeader327
     */
    public void startgetGenerationInfo(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetGenerationInfoParam getGenerationInfoParam326,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader327,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getZipEntriesParam329
     * @param authHeader330
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetZipEntriesReturn getZipEntries(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetZipEntriesParam getZipEntriesParam329,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader330)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getZipEntriesParam329
     * @param authHeader330
     */
    public void startgetZipEntries(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetZipEntriesParam getZipEntriesParam329,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader330,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getImageRenderingPublishSettingsParam332
     * @param authHeader333
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetImageRenderingPublishSettingsReturn getImageRenderingPublishSettings(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetImageRenderingPublishSettingsParam getImageRenderingPublishSettingsParam332,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader333)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getImageRenderingPublishSettingsParam332
     * @param authHeader333
     */
    public void startgetImageRenderingPublishSettings(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetImageRenderingPublishSettingsParam getImageRenderingPublishSettingsParam332,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader333,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getUsersParam335
     * @param authHeader336
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetUsersReturn getUsers(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetUsersParam getUsersParam335,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader336)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getUsersParam335
     * @param authHeader336
     */
    public void startgetUsers(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetUsersParam getUsersParam335,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader336,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getCompanyInfoParam338
     * @param authHeader339
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetCompanyInfoReturn getCompanyInfo(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetCompanyInfoParam getCompanyInfoParam338,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader339)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getCompanyInfoParam338
     * @param authHeader339
     */
    public void startgetCompanyInfo(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetCompanyInfoParam getCompanyInfoParam338,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader339,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getUniqueMetadataValuesParam341
     * @param authHeader342
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetUniqueMetadataValuesReturn getUniqueMetadataValues(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetUniqueMetadataValuesParam getUniqueMetadataValuesParam341,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader342)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getUniqueMetadataValuesParam341
     * @param authHeader342
     */
    public void startgetUniqueMetadataValues(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetUniqueMetadataValuesParam getUniqueMetadataValuesParam341,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader342,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getImageSetMembersParam344
     * @param authHeader345
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetImageSetMembersReturn getImageSetMembers(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetImageSetMembersParam getImageSetMembersParam344,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader345)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getImageSetMembersParam344
     * @param authHeader345
     */
    public void startgetImageSetMembers(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetImageSetMembersParam getImageSetMembersParam344,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader345,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param updateXMPPacketParam347
     * @param authHeader348
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateXMPPacketReturn updateXMPPacket(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateXMPPacketParam updateXMPPacketParam347,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader348)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param updateXMPPacketParam347
     * @param authHeader348
     */
    public void startupdateXMPPacket(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateXMPPacketParam updateXMPPacketParam347,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader348,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param setImageRenderingPublishSettingsParam350
     * @param authHeader351
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetImageRenderingPublishSettingsReturn setImageRenderingPublishSettings(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetImageRenderingPublishSettingsParam setImageRenderingPublishSettingsParam350,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader351)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param setImageRenderingPublishSettingsParam350
     * @param authHeader351
     */
    public void startsetImageRenderingPublishSettings(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetImageRenderingPublishSettingsParam setImageRenderingPublishSettingsParam350,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader351,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getAllUsersParam353
     * @param authHeader354
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAllUsersReturn getAllUsers(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAllUsersParam getAllUsersParam353,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader354)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getAllUsersParam353
     * @param authHeader354
     */
    public void startgetAllUsers(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAllUsersParam getAllUsersParam353,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader354,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param deleteTagFieldValuesParam356
     * @param authHeader357
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteTagFieldValuesReturn deleteTagFieldValues(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteTagFieldValuesParam deleteTagFieldValuesParam356,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader357)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param deleteTagFieldValuesParam356
     * @param authHeader357
     */
    public void startdeleteTagFieldValues(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteTagFieldValuesParam deleteTagFieldValuesParam356,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader357,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getDiskUsageParam359
     * @param authHeader360
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetDiskUsageReturn getDiskUsage(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetDiskUsageParam getDiskUsageParam359,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader360)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getDiskUsageParam359
     * @param authHeader360
     */
    public void startgetDiskUsage(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetDiskUsageParam getDiskUsageParam359,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader360,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param createViewerPresetParam362
     * @param authHeader363
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateViewerPresetReturn createViewerPreset(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateViewerPresetParam createViewerPresetParam362,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader363)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param createViewerPresetParam362
     * @param authHeader363
     */
    public void startcreateViewerPreset(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateViewerPresetParam createViewerPresetParam362,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader363,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param searchAssetsParam365
     * @param authHeader366
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.SearchAssetsReturn searchAssets(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SearchAssetsParam searchAssetsParam365,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader366)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param searchAssetsParam365
     * @param authHeader366
     */
    public void startsearchAssets(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SearchAssetsParam searchAssetsParam365,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader366,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param executeJobParam368
     * @param authHeader369
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExecuteJobReturn executeJob(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExecuteJobParam executeJobParam368,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader369)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param executeJobParam368
     * @param authHeader369
     */
    public void startexecuteJob(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExecuteJobParam executeJobParam368,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader369,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param forceRepublishAssetsParam371
     * @param authHeader372
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.ForceRepublishAssetsReturn forceRepublishAssets(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.ForceRepublishAssetsParam forceRepublishAssetsParam371,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader372)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param forceRepublishAssetsParam371
     * @param authHeader372
     */
    public void startforceRepublishAssets(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.ForceRepublishAssetsParam forceRepublishAssetsParam371,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader372,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getAssociatedAssetsParam374
     * @param authHeader375
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAssociatedAssetsReturn getAssociatedAssets(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAssociatedAssetsParam getAssociatedAssetsParam374,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader375)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getAssociatedAssetsParam374
     * @param authHeader375
     */
    public void startgetAssociatedAssets(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAssociatedAssetsParam getAssociatedAssetsParam374,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader375,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param restoreAssetsFromTrashParam377
     * @param authHeader378
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.RestoreAssetsFromTrashReturn restoreAssetsFromTrash(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.RestoreAssetsFromTrashParam restoreAssetsFromTrashParam377,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader378)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param restoreAssetsFromTrashParam377
     * @param authHeader378
     */
    public void startrestoreAssetsFromTrash(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.RestoreAssetsFromTrashParam restoreAssetsFromTrashParam377,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader378,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param setUserInfoParam380
     * @param authHeader381
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetUserInfoReturn setUserInfo(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetUserInfoParam setUserInfoParam380,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader381)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param setUserInfoParam380
     * @param authHeader381
     */
    public void startsetUserInfo(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetUserInfoParam setUserInfoParam380,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader381,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getAutoCropRectParam383
     * @param authHeader384
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAutoCropRectReturn getAutoCropRect(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAutoCropRectParam getAutoCropRectParam383,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader384)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getAutoCropRectParam383
     * @param authHeader384
     */
    public void startgetAutoCropRect(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAutoCropRectParam getAutoCropRectParam383,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader384,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param setImageMapsParam386
     * @param authHeader387
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetImageMapsReturn setImageMaps(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetImageMapsParam setImageMapsParam386,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader387)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param setImageMapsParam386
     * @param authHeader387
     */
    public void startsetImageMaps(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetImageMapsParam setImageMapsParam386,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader387,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param updatePropertySetParam389
     * @param authHeader390
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdatePropertySetReturn updatePropertySet(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdatePropertySetParam updatePropertySetParam389,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader390)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param updatePropertySetParam389
     * @param authHeader390
     */
    public void startupdatePropertySet(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdatePropertySetParam updatePropertySetParam389,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader390,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param deleteVignettePublishFormatParam392
     * @param authHeader393
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteVignettePublishFormatReturn deleteVignettePublishFormat(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteVignettePublishFormatParam deleteVignettePublishFormatParam392,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader393)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param deleteVignettePublishFormatParam392
     * @param authHeader393
     */
    public void startdeleteVignettePublishFormat(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteVignettePublishFormatParam deleteVignettePublishFormatParam392,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader393,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param createDerivedAssetParam395
     * @param authHeader396
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateDerivedAssetReturn createDerivedAsset(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateDerivedAssetParam createDerivedAssetParam395,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader396)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param createDerivedAssetParam395
     * @param authHeader396
     */
    public void startcreateDerivedAsset(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateDerivedAssetParam createDerivedAssetParam395,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader396,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param setCompanyMembershipParam398
     * @param authHeader399
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetCompanyMembershipReturn setCompanyMembership(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetCompanyMembershipParam setCompanyMembershipParam398,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader399)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param setCompanyMembershipParam398
     * @param authHeader399
     */
    public void startsetCompanyMembership(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetCompanyMembershipParam setCompanyMembershipParam398,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader399,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param uploadPostParam401
     * @param authHeader402
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.UploadPostReturn uploadPost(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.UploadPostParam uploadPostParam401,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader402)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param uploadPostParam401
     * @param authHeader402
     */
    public void startuploadPost(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.UploadPostParam uploadPostParam401,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader402,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param addProjectAssetsParam404
     * @param authHeader405
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.AddProjectAssetsReturn addProjectAssets(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AddProjectAssetsParam addProjectAssetsParam404,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader405)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param addProjectAssetsParam404
     * @param authHeader405
     */
    public void startaddProjectAssets(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AddProjectAssetsParam addProjectAssetsParam404,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader405,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getJobLogsParam407
     * @param authHeader408
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetJobLogsReturn getJobLogs(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetJobLogsParam getJobLogsParam407,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader408)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getJobLogsParam407
     * @param authHeader408
     */
    public void startgetJobLogs(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetJobLogsParam getJobLogsParam407,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader408,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param resumeJobParam410
     * @param authHeader411
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.ResumeJobReturn resumeJob(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.ResumeJobParam resumeJobParam410,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader411)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param resumeJobParam410
     * @param authHeader411
     */
    public void startresumeJob(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.ResumeJobParam resumeJobParam410,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader411,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param deleteFolderParam413
     * @param authHeader414
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteFolderReturn deleteFolder(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteFolderParam deleteFolderParam413,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader414)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param deleteFolderParam413
     * @param authHeader414
     */
    public void startdeleteFolder(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteFolderParam deleteFolderParam413,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader414,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param removeMetadataSchemaParam416
     * @param authHeader417
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.RemoveMetadataSchemaReturn removeMetadataSchema(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.RemoveMetadataSchemaParam removeMetadataSchemaParam416,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader417)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param removeMetadataSchemaParam416
     * @param authHeader417
     */
    public void startremoveMetadataSchema(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.RemoveMetadataSchemaParam removeMetadataSchemaParam416,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader417,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param saveImageFormatParam419
     * @param authHeader420
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.SaveImageFormatReturn saveImageFormat(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SaveImageFormatParam saveImageFormatParam419,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader420)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param saveImageFormatParam419
     * @param authHeader420
     */
    public void startsaveImageFormat(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SaveImageFormatParam saveImageFormatParam419,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader420,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getFolderTreeParam422
     * @param authHeader423
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetFolderTreeReturn getFolderTree(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetFolderTreeParam getFolderTreeParam422,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader423)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getFolderTreeParam422
     * @param authHeader423
     */
    public void startgetFolderTree(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetFolderTreeParam getFolderTreeParam422,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader423,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param setZoomTargetsParam425
     * @param authHeader426
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetZoomTargetsReturn setZoomTargets(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetZoomTargetsParam setZoomTargetsParam425,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader426)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param setZoomTargetsParam425
     * @param authHeader426
     */
    public void startsetZoomTargets(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetZoomTargetsParam setZoomTargetsParam425,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader426,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getAssetMetadataFieldsParam428
     * @param authHeader429
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAssetMetadataFieldsReturn getAssetMetadataFields(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAssetMetadataFieldsParam getAssetMetadataFieldsParam428,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader429)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getAssetMetadataFieldsParam428
     * @param authHeader429
     */
    public void startgetAssetMetadataFields(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAssetMetadataFieldsParam getAssetMetadataFieldsParam428,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader429,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param setTagFieldValuesParam431
     * @param authHeader432
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetTagFieldValuesReturn setTagFieldValues(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetTagFieldValuesParam setTagFieldValuesParam431,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader432)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param setTagFieldValuesParam431
     * @param authHeader432
     */
    public void startsetTagFieldValues(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetTagFieldValuesParam setTagFieldValuesParam431,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader432,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param moveFolderParam434
     * @param authHeader435
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.MoveFolderReturn moveFolder(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.MoveFolderParam moveFolderParam434,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader435)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param moveFolderParam434
     * @param authHeader435
     */
    public void startmoveFolder(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.MoveFolderParam moveFolderParam434,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader435,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getViewerConfigSettingsParam437
     * @param authHeader438
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetViewerConfigSettingsReturn getViewerConfigSettings(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetViewerConfigSettingsParam getViewerConfigSettingsParam437,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader438)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getViewerConfigSettingsParam437
     * @param authHeader438
     */
    public void startgetViewerConfigSettings(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetViewerConfigSettingsParam getViewerConfigSettingsParam437,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader438,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getImageFormatsParam440
     * @param authHeader441
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetImageFormatsReturn getImageFormats(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetImageFormatsParam getImageFormatsParam440,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader441)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getImageFormatsParam440
     * @param authHeader441
     */
    public void startgetImageFormats(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetImageFormatsParam getImageFormatsParam440,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader441,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param setImageSetMembersParam443
     * @param authHeader444
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetImageSetMembersReturn setImageSetMembers(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetImageSetMembersParam setImageSetMembersParam443,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader444)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param setImageSetMembersParam443
     * @param authHeader444
     */
    public void startsetImageSetMembers(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetImageSetMembersParam setImageSetMembersParam443,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader444,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param saveZoomTargetParam446
     * @param authHeader447
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.SaveZoomTargetReturn saveZoomTarget(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SaveZoomTargetParam saveZoomTargetParam446,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader447)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param saveZoomTargetParam446
     * @param authHeader447
     */
    public void startsaveZoomTarget(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SaveZoomTargetParam saveZoomTargetParam446,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader447,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param createAssetSetParam449
     * @param authHeader450
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateAssetSetReturn createAssetSet(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateAssetSetParam createAssetSetParam449,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader450)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param createAssetSetParam449
     * @param authHeader450
     */
    public void startcreateAssetSet(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateAssetSetParam createAssetSetParam449,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader450,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param searchAssetsByMetadataParam452
     * @param authHeader453
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.SearchAssetsByMetadataReturn searchAssetsByMetadata(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SearchAssetsByMetadataParam searchAssetsByMetadataParam452,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader453)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param searchAssetsByMetadataParam452
     * @param authHeader453
     */
    public void startsearchAssetsByMetadata(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SearchAssetsByMetadataParam searchAssetsByMetadataParam452,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader453,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param cdnCacheInvalidationParam455
     * @param authHeader456
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.CdnCacheInvalidationReturn cdnCacheInvalidation(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CdnCacheInvalidationParam cdnCacheInvalidationParam455,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader456)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param cdnCacheInvalidationParam455
     * @param authHeader456
     */
    public void startcdnCacheInvalidation(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CdnCacheInvalidationParam cdnCacheInvalidationParam455,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader456,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getPhotoshopPathParam458
     * @param authHeader459
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetPhotoshopPathReturn getPhotoshopPath(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetPhotoshopPathParam getPhotoshopPathParam458,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader459)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getPhotoshopPathParam458
     * @param authHeader459
     */
    public void startgetPhotoshopPath(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetPhotoshopPathParam getPhotoshopPathParam458,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader459,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param batchGetAssetPublishContextsParam461
     * @param authHeader462
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.BatchGetAssetPublishContextsReturn batchGetAssetPublishContexts(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.BatchGetAssetPublishContextsParam batchGetAssetPublishContextsParam461,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader462)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param batchGetAssetPublishContextsParam461
     * @param authHeader462
     */
    public void startbatchGetAssetPublishContexts(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.BatchGetAssetPublishContextsParam batchGetAssetPublishContextsParam461,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader462,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param checkAssetNamesParam464
     * @param authHeader465
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.CheckAssetNamesReturn checkAssetNames(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CheckAssetNamesParam checkAssetNamesParam464,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader465)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param checkAssetNamesParam464
     * @param authHeader465
     */
    public void startcheckAssetNames(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CheckAssetNamesParam checkAssetNamesParam464,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader465,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param setUrlModifierParam467
     * @param authHeader468
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetUrlModifierReturn setUrlModifier(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetUrlModifierParam setUrlModifierParam467,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader468)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param setUrlModifierParam467
     * @param authHeader468
     */
    public void startsetUrlModifier(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetUrlModifierParam setUrlModifierParam467,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader468,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param createCompanyMetadataParam470
     * @param authHeader471
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateCompanyMetadataReturn createCompanyMetadata(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateCompanyMetadataParam createCompanyMetadataParam470,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader471)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param createCompanyMetadataParam470
     * @param authHeader471
     */
    public void startcreateCompanyMetadata(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateCompanyMetadataParam createCompanyMetadataParam470,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader471,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param setImageServingPublishSettingsParam473
     * @param authHeader474
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetImageServingPublishSettingsReturn setImageServingPublishSettings(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetImageServingPublishSettingsParam setImageServingPublishSettingsParam473,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader474)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param setImageServingPublishSettingsParam473
     * @param authHeader474
     */
    public void startsetImageServingPublishSettings(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetImageServingPublishSettingsParam setImageServingPublishSettingsParam473,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader474,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param deleteZoomTargetParam476
     * @param authHeader477
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteZoomTargetReturn deleteZoomTarget(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteZoomTargetParam deleteZoomTargetParam476,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader477)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param deleteZoomTargetParam476
     * @param authHeader477
     */
    public void startdeleteZoomTarget(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteZoomTargetParam deleteZoomTargetParam476,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader477,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param updateFolderPermissionsParam479
     * @param authHeader480
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateFolderPermissionsReturn updateFolderPermissions(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateFolderPermissionsParam updateFolderPermissionsParam479,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader480)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param updateFolderPermissionsParam479
     * @param authHeader480
     */
    public void startupdateFolderPermissions(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateFolderPermissionsParam updateFolderPermissionsParam479,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader480,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param createImageSetParam482
     * @param authHeader483
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateImageSetReturn createImageSet(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateImageSetParam createImageSetParam482,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader483)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param createImageSetParam482
     * @param authHeader483
     */
    public void startcreateImageSet(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateImageSetParam createImageSetParam482,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader483,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param deleteAssetsParam485
     * @param authHeader486
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteAssetsReturn deleteAssets(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteAssetsParam deleteAssetsParam485,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader486)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param deleteAssetsParam485
     * @param authHeader486
     */
    public void startdeleteAssets(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteAssetsParam deleteAssetsParam485,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader486,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getPropertyParam488
     * @param authHeader489
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetPropertyReturn getProperty(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetPropertyParam getPropertyParam488,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader489)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getPropertyParam488
     * @param authHeader489
     */
    public void startgetProperty(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetPropertyParam getPropertyParam488,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader489,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param saveMetadataSchemaParam491
     * @param authHeader492
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.SaveMetadataSchemaReturn saveMetadataSchema(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SaveMetadataSchemaParam saveMetadataSchemaParam491,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader492)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param saveMetadataSchemaParam491
     * @param authHeader492
     */
    public void startsaveMetadataSchema(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SaveMetadataSchemaParam saveMetadataSchemaParam491,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader492,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getPublishContextsParam494
     * @param authHeader495
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetPublishContextsReturn getPublishContexts(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetPublishContextsParam getPublishContextsParam494,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader495)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getPublishContextsParam494
     * @param authHeader495
     */
    public void startgetPublishContexts(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetPublishContextsParam getPublishContextsParam494,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader495,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getCompanyMembershipParam497
     * @param authHeader498
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetCompanyMembershipReturn getCompanyMembership(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetCompanyMembershipParam getCompanyMembershipParam497,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader498)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getCompanyMembershipParam497
     * @param authHeader498
     */
    public void startgetCompanyMembership(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetCompanyMembershipParam getCompanyMembershipParam497,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader498,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param updateMetadataFieldParam500
     * @param authHeader501
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateMetadataFieldReturn updateMetadataField(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateMetadataFieldParam updateMetadataFieldParam500,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader501)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param updateMetadataFieldParam500
     * @param authHeader501
     */
    public void startupdateMetadataField(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateMetadataFieldParam updateMetadataFieldParam500,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader501,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param renameAssetParam503
     * @param authHeader504
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.RenameAssetReturn renameAsset(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.RenameAssetParam renameAssetParam503,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader504)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param renameAssetParam503
     * @param authHeader504
     */
    public void startrenameAsset(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.RenameAssetParam renameAssetParam503,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader504,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param removeMaskParam506
     * @param authHeader507
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.RemoveMaskReturn removeMask(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.RemoveMaskParam removeMaskParam506,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader507)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param removeMaskParam506
     * @param authHeader507
     */
    public void startremoveMask(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.RemoveMaskParam removeMaskParam506,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader507,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getCompanyMetadataParam509
     * @param authHeader510
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetCompanyMetadataReturn getCompanyMetadata(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetCompanyMetadataParam getCompanyMetadataParam509,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader510)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getCompanyMetadataParam509
     * @param authHeader510
     */
    public void startgetCompanyMetadata(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetCompanyMetadataParam getCompanyMetadataParam509,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader510,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param setGroupMembersParam512
     * @param authHeader513
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetGroupMembersReturn setGroupMembers(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetGroupMembersParam setGroupMembersParam512,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader513)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param setGroupMembersParam512
     * @param authHeader513
     */
    public void startsetGroupMembers(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetGroupMembersParam setGroupMembersParam512,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader513,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param addGroupMembershipParam515
     * @param authHeader516
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.AddGroupMembershipReturn addGroupMembership(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AddGroupMembershipParam addGroupMembershipParam515,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader516)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param addGroupMembershipParam515
     * @param authHeader516
     */
    public void startaddGroupMembership(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AddGroupMembershipParam addGroupMembershipParam515,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader516,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param emptyAssetsFromTrashParam518
     * @param authHeader519
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.EmptyAssetsFromTrashReturn emptyAssetsFromTrash(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.EmptyAssetsFromTrashParam emptyAssetsFromTrashParam518,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader519)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param emptyAssetsFromTrashParam518
     * @param authHeader519
     */
    public void startemptyAssetsFromTrash(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.EmptyAssetsFromTrashParam emptyAssetsFromTrashParam518,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader519,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getCdnCacheInvalidationStatusParam521
     * @param authHeader522
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetCdnCacheInvalidationStatusReturn getCdnCacheInvalidationStatus(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetCdnCacheInvalidationStatusParam getCdnCacheInvalidationStatusParam521,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader522)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getCdnCacheInvalidationStatusParam521
     * @param authHeader522
     */
    public void startgetCdnCacheInvalidationStatus(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetCdnCacheInvalidationStatusParam getCdnCacheInvalidationStatusParam521,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader522,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param batchSetThumbAssetParam524
     * @param authHeader525
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.BatchSetThumbAssetReturn batchSetThumbAsset(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.BatchSetThumbAssetParam batchSetThumbAssetParam524,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader525)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param batchSetThumbAssetParam524
     * @param authHeader525
     */
    public void startbatchSetThumbAsset(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.BatchSetThumbAssetParam batchSetThumbAssetParam524,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader525,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getActivePublishContextsParam527
     * @param authHeader528
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetActivePublishContextsReturn getActivePublishContexts(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetActivePublishContextsParam getActivePublishContextsParam527,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader528)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getActivePublishContextsParam527
     * @param authHeader528
     */
    public void startgetActivePublishContexts(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetActivePublishContextsParam getActivePublishContextsParam527,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader528,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param stopJobParam530
     * @param authHeader531
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.StopJobReturn stopJob(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.StopJobParam stopJobParam530,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader531)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param stopJobParam530
     * @param authHeader531
     */
    public void startstopJob(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.StopJobParam stopJobParam530,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader531,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getAssetJobLogsParam533
     * @param authHeader534
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAssetJobLogsReturn getAssetJobLogs(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAssetJobLogsParam getAssetJobLogsParam533,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader534)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getAssetJobLogsParam533
     * @param authHeader534
     */
    public void startgetAssetJobLogs(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAssetJobLogsParam getAssetJobLogsParam533,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader534,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param addCompanyParam536
     * @param authHeader537
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.AddCompanyReturn addCompany(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AddCompanyParam addCompanyParam536,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader537)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param addCompanyParam536
     * @param authHeader537
     */
    public void startaddCompany(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AddCompanyParam addCompanyParam536,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader537,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param removeProjectAssetsParam539
     * @param authHeader540
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.RemoveProjectAssetsReturn removeProjectAssets(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.RemoveProjectAssetsParam removeProjectAssetsParam539,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader540)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param removeProjectAssetsParam539
     * @param authHeader540
     */
    public void startremoveProjectAssets(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.RemoveProjectAssetsParam removeProjectAssetsParam539,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader540,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param batchSetAssetMetadataParam542
     * @param authHeader543
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.BatchSetAssetMetadataReturn batchSetAssetMetadata(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.BatchSetAssetMetadataParam batchSetAssetMetadataParam542,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader543)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param batchSetAssetMetadataParam542
     * @param authHeader543
     */
    public void startbatchSetAssetMetadata(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.BatchSetAssetMetadataParam batchSetAssetMetadataParam542,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader543,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param removeFolderPermissionsParam545
     * @param authHeader546
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.RemoveFolderPermissionsReturn removeFolderPermissions(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.RemoveFolderPermissionsParam removeFolderPermissionsParam545,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader546)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param removeFolderPermissionsParam545
     * @param authHeader546
     */
    public void startremoveFolderPermissions(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.RemoveFolderPermissionsParam removeFolderPermissionsParam545,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader546,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getXMPPacketParam548
     * @param authHeader549
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetXMPPacketReturn getXMPPacket(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetXMPPacketParam getXMPPacketParam548,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader549)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getXMPPacketParam548
     * @param authHeader549
     */
    public void startgetXMPPacket(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetXMPPacketParam getXMPPacketParam548,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader549,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param listCompanyMetadataParam551
     * @param authHeader552
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.ListCompanyMetadataReturn listCompanyMetadata(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.ListCompanyMetadataParam listCompanyMetadataParam551,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader552)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param listCompanyMetadataParam551
     * @param authHeader552
     */
    public void startlistCompanyMetadata(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.ListCompanyMetadataParam listCompanyMetadataParam551,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader552,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getPhotoshopPathNamesParam554
     * @param authHeader555
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetPhotoshopPathNamesReturn getPhotoshopPathNames(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetPhotoshopPathNamesParam getPhotoshopPathNamesParam554,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader555)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getPhotoshopPathNamesParam554
     * @param authHeader555
     */
    public void startgetPhotoshopPathNames(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetPhotoshopPathNamesParam getPhotoshopPathNamesParam554,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader555,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getAssetsByNameParam557
     * @param authHeader558
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAssetsByNameReturn getAssetsByName(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAssetsByNameParam getAssetsByNameParam557,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader558)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getAssetsByNameParam557
     * @param authHeader558
     */
    public void startgetAssetsByName(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetAssetsByNameParam getAssetsByNameParam557,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader558,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param addUserParam560
     * @param authHeader561
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.AddUserReturn addUser(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AddUserParam addUserParam560,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader561)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param addUserParam560
     * @param authHeader561
     */
    public void startaddUser(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AddUserParam addUserParam560,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader561,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param setPropertySetPermissionsParam563
     * @param authHeader564
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetPropertySetPermissionsReturn setPropertySetPermissions(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetPropertySetPermissionsParam setPropertySetPermissionsParam563,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader564)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param setPropertySetPermissionsParam563
     * @param authHeader564
     */
    public void startsetPropertySetPermissions(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetPropertySetPermissionsParam setPropertySetPermissionsParam563,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader564,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param updateViewerConfigSettingsParam566
     * @param authHeader567
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateViewerConfigSettingsReturn updateViewerConfigSettings(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateViewerConfigSettingsParam updateViewerConfigSettingsParam566,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader567)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param updateViewerConfigSettingsParam566
     * @param authHeader567
     */
    public void startupdateViewerConfigSettings(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateViewerConfigSettingsParam updateViewerConfigSettingsParam566,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader567,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param createPropertySetTypeParam569
     * @param authHeader570
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreatePropertySetTypeReturn createPropertySetType(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreatePropertySetTypeParam createPropertySetTypeParam569,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader570)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param createPropertySetTypeParam569
     * @param authHeader570
     */
    public void startcreatePropertySetType(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreatePropertySetTypeParam createPropertySetTypeParam569,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader570,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param deleteImageFormatParam572
     * @param authHeader573
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteImageFormatReturn deleteImageFormat(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteImageFormatParam deleteImageFormatParam572,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader573)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param deleteImageFormatParam572
     * @param authHeader573
     */
    public void startdeleteImageFormat(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteImageFormatParam deleteImageFormatParam572,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader573,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param deleteJobParam575
     * @param authHeader576
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteJobReturn deleteJob(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteJobParam deleteJobParam575,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader576)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param deleteJobParam575
     * @param authHeader576
     */
    public void startdeleteJob(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteJobParam deleteJobParam575,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader576,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param setAssetPermissionsParam578
     * @param authHeader579
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetAssetPermissionsReturn setAssetPermissions(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetAssetPermissionsParam setAssetPermissionsParam578,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader579)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param setAssetPermissionsParam578
     * @param authHeader579
     */
    public void startsetAssetPermissions(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetAssetPermissionsParam setAssetPermissionsParam578,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader579,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param updateVignettePublishFormatParam581
     * @param authHeader582
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateVignettePublishFormatReturn updateVignettePublishFormat(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateVignettePublishFormatParam updateVignettePublishFormatParam581,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader582)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param updateVignettePublishFormatParam581
     * @param authHeader582
     */
    public void startupdateVignettePublishFormat(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateVignettePublishFormatParam updateVignettePublishFormatParam581,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader582,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param removeGroupMembersParam584
     * @param authHeader585
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.RemoveGroupMembersReturn removeGroupMembers(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.RemoveGroupMembersParam removeGroupMembersParam584,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader585)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param removeGroupMembersParam584
     * @param authHeader585
     */
    public void startremoveGroupMembers(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.RemoveGroupMembersParam removeGroupMembersParam584,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader585,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getMetadataFieldsParam587
     * @param authHeader588
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetMetadataFieldsReturn getMetadataFields(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetMetadataFieldsParam getMetadataFieldsParam587,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader588)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getMetadataFieldsParam587
     * @param authHeader588
     */
    public void startgetMetadataFields(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetMetadataFieldsParam getMetadataFieldsParam587,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader588,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getVignettePublishFormatsParam590
     * @param authHeader591
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetVignettePublishFormatsReturn getVignettePublishFormats(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetVignettePublishFormatsParam getVignettePublishFormatsParam590,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader591)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getVignettePublishFormatsParam590
     * @param authHeader591
     */
    public void startgetVignettePublishFormats(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetVignettePublishFormatsParam getVignettePublishFormatsParam590,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader591,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param saveMetadataFieldParam593
     * @param authHeader594
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.SaveMetadataFieldReturn saveMetadataField(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SaveMetadataFieldParam saveMetadataFieldParam593,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader594)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param saveMetadataFieldParam593
     * @param authHeader594
     */
    public void startsaveMetadataField(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SaveMetadataFieldParam saveMetadataFieldParam593,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader594,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param addCompanyMembershipParam596
     * @param authHeader597
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.AddCompanyMembershipReturn addCompanyMembership(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AddCompanyMembershipParam addCompanyMembershipParam596,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader597)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param addCompanyMembershipParam596
     * @param authHeader597
     */
    public void startaddCompanyMembership(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AddCompanyMembershipParam addCompanyMembershipParam596,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader597,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param setAssetMetadataParam599
     * @param authHeader600
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetAssetMetadataReturn setAssetMetadata(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetAssetMetadataParam setAssetMetadataParam599,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader600)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param setAssetMetadataParam599
     * @param authHeader600
     */
    public void startsetAssetMetadata(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetAssetMetadataParam setAssetMetadataParam599,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader600,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param moveAssetParam602
     * @param authHeader603
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.MoveAssetReturn moveAsset(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.MoveAssetParam moveAssetParam602,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader603)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param moveAssetParam602
     * @param authHeader603
     */
    public void startmoveAsset(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.MoveAssetParam moveAssetParam602,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader603,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param createMetadataFieldParam605
     * @param authHeader606
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateMetadataFieldReturn createMetadataField(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateMetadataFieldParam createMetadataFieldParam605,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader606)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param createMetadataFieldParam605
     * @param authHeader606
     */
    public void startcreateMetadataField(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateMetadataFieldParam createMetadataFieldParam605,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader606,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param createFolderParam608
     * @param authHeader609
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateFolderReturn createFolder(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateFolderParam createFolderParam608,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader609)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param createFolderParam608
     * @param authHeader609
     */
    public void startcreateFolder(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateFolderParam createFolderParam608,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader609,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getFoldersParam611
     * @param authHeader612
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetFoldersReturn getFolders(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetFoldersParam getFoldersParam611,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader612)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getFoldersParam611
     * @param authHeader612
     */
    public void startgetFolders(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetFoldersParam getFoldersParam611,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader612,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getCompanyMembersParam614
     * @param authHeader615
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetCompanyMembersReturn getCompanyMembers(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetCompanyMembersParam getCompanyMembersParam614,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader615)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getCompanyMembersParam614
     * @param authHeader615
     */
    public void startgetCompanyMembers(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetCompanyMembersParam getCompanyMembersParam614,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader615,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param generatePasswordParam617
     * @param authHeader618
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GeneratePasswordReturn generatePassword(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GeneratePasswordParam generatePasswordParam617,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader618)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param generatePasswordParam617
     * @param authHeader618
     */
    public void startgeneratePassword(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GeneratePasswordParam generatePasswordParam617,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader618,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getGroupsParam620
     * @param authHeader621
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetGroupsReturn getGroups(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetGroupsParam getGroupsParam620,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader621)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getGroupsParam620
     * @param authHeader621
     */
    public void startgetGroups(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetGroupsParam getGroupsParam620,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader621,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param deleteCompanyMetadataParam623
     * @param authHeader624
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteCompanyMetadataReturn deleteCompanyMetadata(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteCompanyMetadataParam deleteCompanyMetadataParam623,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader624)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param deleteCompanyMetadataParam623
     * @param authHeader624
     */
    public void startdeleteCompanyMetadata(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteCompanyMetadataParam deleteCompanyMetadataParam623,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader624,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param addGroupMembersParam626
     * @param authHeader627
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.AddGroupMembersReturn addGroupMembers(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AddGroupMembersParam addGroupMembersParam626,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader627)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param addGroupMembersParam626
     * @param authHeader627
     */
    public void startaddGroupMembers(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AddGroupMembersParam addGroupMembersParam626,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader627,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param updateTagFieldValuesParam629
     * @param authHeader630
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateTagFieldValuesReturn updateTagFieldValues(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateTagFieldValuesParam updateTagFieldValuesParam629,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader630)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param updateTagFieldValuesParam629
     * @param authHeader630
     */
    public void startupdateTagFieldValues(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateTagFieldValuesParam updateTagFieldValuesParam629,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader630,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getProjectsParam632
     * @param authHeader633
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetProjectsReturn getProjects(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetProjectsParam getProjectsParam632,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader633)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getProjectsParam632
     * @param authHeader633
     */
    public void startgetProjects(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetProjectsParam getProjectsParam632,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader633,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param saveGroupParam635
     * @param authHeader636
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.SaveGroupReturn saveGroup(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SaveGroupParam saveGroupParam635,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader636)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param saveGroupParam635
     * @param authHeader636
     */
    public void startsaveGroup(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SaveGroupParam saveGroupParam635,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader636,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param updateAssetSetParam638
     * @param authHeader639
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateAssetSetReturn updateAssetSet(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateAssetSetParam updateAssetSetParam638,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader639)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param updateAssetSetParam638
     * @param authHeader639
     */
    public void startupdateAssetSet(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.UpdateAssetSetParam updateAssetSetParam638,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader639,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param addMediaPortalEventParam641
     * @param authHeader642
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.AddMediaPortalEventReturn addMediaPortalEvent(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AddMediaPortalEventParam addMediaPortalEventParam641,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader642)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param addMediaPortalEventParam641
     * @param authHeader642
     */
    public void startaddMediaPortalEvent(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AddMediaPortalEventParam addMediaPortalEventParam641,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader642,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getOriginalFilePathsParam644
     * @param authHeader645
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetOriginalFilePathsReturn getOriginalFilePaths(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetOriginalFilePathsParam getOriginalFilePathsParam644,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader645)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getOriginalFilePathsParam644
     * @param authHeader645
     */
    public void startgetOriginalFilePaths(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetOriginalFilePathsParam getOriginalFilePathsParam644,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader645,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param deleteImageMapParam647
     * @param authHeader648
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteImageMapReturn deleteImageMap(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteImageMapParam deleteImageMapParam647,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader648)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param deleteImageMapParam647
     * @param authHeader648
     */
    public void startdeleteImageMap(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteImageMapParam deleteImageMapParam647,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader648,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param removeGroupMembershipParam650
     * @param authHeader651
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.RemoveGroupMembershipReturn removeGroupMembership(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.RemoveGroupMembershipParam removeGroupMembershipParam650,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader651)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param removeGroupMembershipParam650
     * @param authHeader651
     */
    public void startremoveGroupMembership(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.RemoveGroupMembershipParam removeGroupMembershipParam650,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader651,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param setProjectAssetsParam653
     * @param authHeader654
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetProjectAssetsReturn setProjectAssets(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetProjectAssetsParam setProjectAssetsParam653,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader654)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param setProjectAssetsParam653
     * @param authHeader654
     */
    public void startsetProjectAssets(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetProjectAssetsParam setProjectAssetsParam653,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader654,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getPropertySetTypesParam656
     * @param authHeader657
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetPropertySetTypesReturn getPropertySetTypes(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetPropertySetTypesParam getPropertySetTypesParam656,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader657)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getPropertySetTypesParam656
     * @param authHeader657
     */
    public void startgetPropertySetTypes(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetPropertySetTypesParam getPropertySetTypesParam656,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader657,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getSearchStringsParam659
     * @param authHeader660
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetSearchStringsReturn getSearchStrings(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetSearchStringsParam getSearchStringsParam659,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader660)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getSearchStringsParam659
     * @param authHeader660
     */
    public void startgetSearchStrings(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetSearchStringsParam getSearchStringsParam659,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader660,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getMetadataSchemaParam662
     * @param authHeader663
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetMetadataSchemaReturn getMetadataSchema(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetMetadataSchemaParam getMetadataSchemaParam662,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader663)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getMetadataSchemaParam662
     * @param authHeader663
     */
    public void startgetMetadataSchema(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetMetadataSchemaParam getMetadataSchemaParam662,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader663,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param createTemplateParam665
     * @param authHeader666
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateTemplateReturn createTemplate(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateTemplateParam createTemplateParam665,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader666)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param createTemplateParam665
     * @param authHeader666
     */
    public void startcreateTemplate(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreateTemplateParam createTemplateParam665,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader666,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getTagFieldValuesParam668
     * @param authHeader669
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetTagFieldValuesReturn getTagFieldValues(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetTagFieldValuesParam getTagFieldValuesParam668,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader669)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getTagFieldValuesParam668
     * @param authHeader669
     */
    public void startgetTagFieldValues(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetTagFieldValuesParam getTagFieldValuesParam668,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader669,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param deletePropertySetTypeParam671
     * @param authHeader672
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeletePropertySetTypeReturn deletePropertySetType(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeletePropertySetTypeParam deletePropertySetTypeParam671,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader672)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param deletePropertySetTypeParam671
     * @param authHeader672
     */
    public void startdeletePropertySetType(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeletePropertySetTypeParam deletePropertySetTypeParam671,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader672,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param renameProjectParam674
     * @param authHeader675
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.RenameProjectReturn renameProject(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.RenameProjectParam renameProjectParam674,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader675)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param renameProjectParam674
     * @param authHeader675
     */
    public void startrenameProject(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.RenameProjectParam renameProjectParam674,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader675,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param moveAssetsParam677
     * @param authHeader678
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.MoveAssetsReturn moveAssets(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.MoveAssetsParam moveAssetsParam677,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader678)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param moveAssetsParam677
     * @param authHeader678
     */
    public void startmoveAssets(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.MoveAssetsParam moveAssetsParam677,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader678,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param setGroupMembershipParam680
     * @param authHeader681
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetGroupMembershipReturn setGroupMembership(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetGroupMembershipParam setGroupMembershipParam680,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader681)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param setGroupMembershipParam680
     * @param authHeader681
     */
    public void startsetGroupMembership(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetGroupMembershipParam setGroupMembershipParam680,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader681,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param deleteProjectParam683
     * @param authHeader684
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteProjectReturn deleteProject(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteProjectParam deleteProjectParam683,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader684)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param deleteProjectParam683
     * @param authHeader684
     */
    public void startdeleteProject(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.DeleteProjectParam deleteProjectParam683,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader684,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param createPropertySetParam686
     * @param authHeader687
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreatePropertySetReturn createPropertySet(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreatePropertySetParam createPropertySetParam686,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader687)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param createPropertySetParam686
     * @param authHeader687
     */
    public void startcreatePropertySet(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.CreatePropertySetParam createPropertySetParam686,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader687,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param setAssetPublishStateParam689
     * @param authHeader690
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetAssetPublishStateReturn setAssetPublishState(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetAssetPublishStateParam setAssetPublishStateParam689,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader690)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param setAssetPublishStateParam689
     * @param authHeader690
     */
    public void startsetAssetPublishState(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.SetAssetPublishStateParam setAssetPublishStateParam689,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader690,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getGroupMembersParam692
     * @param authHeader693
     * @throws com.scene7.www.ipsapi.AuthenticationFaultException :
     * @throws com.scene7.www.ipsapi.IpsApiFaultException         :
     * @throws com.scene7.www.ipsapi.AuthorizationFaultException  :
     */

    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetGroupMembersReturn getGroupMembers(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetGroupMembersParam getGroupMembersParam692,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader693)
            throws java.rmi.RemoteException

            , com.scene7.www.ipsapi.AuthenticationFaultException
            , com.scene7.www.ipsapi.IpsApiFaultException
            , com.scene7.www.ipsapi.AuthorizationFaultException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getGroupMembersParam692
     * @param authHeader693
     */
    public void startgetGroupMembers(

            com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetGroupMembersParam getGroupMembersParam692,
            com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader authHeader693,

            final com.scene7.www.ipsapi.IpsApiServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    //
}
    