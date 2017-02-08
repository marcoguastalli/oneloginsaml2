package com.scene7.ugc.admin.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.json.JSONObject;

import com.scene7.www.ipsapi.IpsApiServiceStub;
import com.scene7.www.ipsapi.xsd._2016_01_14_beta.AuthHeader;
import com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetUserInfoParam;
import com.scene7.www.ipsapi.xsd._2016_01_14_beta.GetUserInfoReturn;
import com.scene7.www.ipsapi.xsd._2016_01_14_beta.User;

;

/**
 * Saml Login Servlet
 */
@WebServlet(name = "samllogin", displayName = "Saml Login", urlPatterns = { "/samllogin" })
public class SamlLogin extends HttpServlet {

    protected static final Logger LOG = Logger.getLogger(SamlLogin.class);

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            AuthHeader authHeader = new AuthHeader();
            authHeader.setSamlResponse(request.getParameter("SAMLResponse"));
            authHeader.setAppName("Adobe.Scene7.UGC");
            authHeader.setAppVersion("1");
            authHeader.setLocale("en");
            authHeader.setGzipResponse(true);
            URI serviceUri = new URI("http://s7geminiapi.macromedia.com/scene7/services/IpsApiService");
            IpsApiServiceStub ipsApi = new IpsApiServiceStub(serviceUri.toString());

            GetUserInfoParam getUserInfoParam = new GetUserInfoParam();
            //getUserInfoParam.setUserHandle("u|14269|ugc@scene7.com");
            getUserInfoParam.setEmail("ugc@scene7.com");

            GetUserInfoReturn getUserInfoReturn = ipsApi.getUserInfo(getUserInfoParam, authHeader);

            User user = getUserInfoReturn.getUserInfo();
            String email = user.getEmail();
            String userHandle = user.getUserHandle();

            JSONObject jsonObject = new JSONObject();
            jsonObject.put("email", email);
            jsonObject.put("userHandle", userHandle);

            response.setContentType("application/json");
            PrintWriter out = response.getWriter();
            out.println(jsonObject.toString());

        } catch (Exception e) {
            LOG.error("ERROR SamlLogin", e);
            //RequestDispatcher rd = request.getRequestDispatcher("/error.jsp");
            //rd.forward(request, response);
            printJsonError(response, e);
        }

    }

    private void printJsonError(HttpServletResponse response, Exception e) {
        try {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("ERROR", e.getMessage());
            response.setContentType("application/json");
            PrintWriter out = response.getWriter();
            out.println(jsonObject.toString());
        } catch (Exception ex) {
            LOG.error("ERROR SamlLogin", ex);
        }
    }
}
