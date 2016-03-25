package edu.psu.swe.scim.spec.protocol;

import io.swagger.annotations.Api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

//@formatter:off
/**
* From SCIM Protocol Specification, section 4, page 73
* 
* @see <a href="https://tools.ietf.org/html/rfc7644#section-4">Scim spec section 4</a>
* 
* /ServiceProviderConfig
*      An HTTP GET to this endpoint will return a JSON structure that
*      describes the SCIM specification features available on a service
*      provider.  This endpoint SHALL return responses with a JSON object
*      using a "schemas" attribute of
*      "urn:ietf:params:scim:schemas:core:2.0:ServiceProviderConfig".
*      The attributes returned in the JSON object are defined in
*      Section 5 of [RFC7643].  An example representation of SCIM service
*      provider configuration may be found in Section 8.5 of [RFC7643].
*
* @author chrisharm
*
*/
//@formatter:on

@Path("ServiceProviderConfig")
@Api("Configuration")
public interface ServiceProviderConfigResource {

  @GET
  default public Response getServiceProviderConfiguration() {
    return Response.status(Status.NOT_IMPLEMENTED).build();
  }
  
}