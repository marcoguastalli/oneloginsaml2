<%@ page language="java" %>
<%
com.onelogin.saml2.settings.Saml2Settings saml2Settings = new com.onelogin.saml2.settings.SettingsBuilder().fromFile("onelogin.saml.properties").build();
com.onelogin.saml2.Auth auth = new com.onelogin.saml2.Auth(saml2Settings, request, response);
auth.login();
%>